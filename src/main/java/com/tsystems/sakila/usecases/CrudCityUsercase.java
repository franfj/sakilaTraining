package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.sakila.domain.CityEntity;
import com.tsystems.sakila.dto.City;
import com.tsystems.sakila.dto.create.CreateCity;
import com.tsystems.sakila.dto.update.UpdateCity;
import com.tsystems.sakila.repositories.CityRepository;

@Service
public class CrudCityUsercase {

  private final CityRepository cityRepository;

  @Autowired
  public CrudCityUsercase(CityRepository cityRepository) {
    super();
    this.cityRepository = cityRepository;
  }


  public City getCityById(Integer cityId) {

    CityEntity cityToReturn = new CityEntity();
    City target = new City();

    cityToReturn = cityRepository.findOne(cityId);
    target.setId(cityId);
    target.setCity(cityToReturn.getCity());
    target.setCountryId(cityToReturn.getCountryId());

    return target;
  }


  public City createNewCity(CreateCity createCity) {

    CityEntity cityToCreate = new CityEntity();
    City city = new City();

    cityToCreate.setCity(createCity.getCity());
    cityToCreate.setCountryId(createCity.getCountryId());
    cityRepository.save(cityToCreate);

    city.setCity(cityToCreate.getCity());
    city.setCountryId(cityToCreate.getCountryId());

    return city;

  }

  public City updateCity(UpdateCity updateCity, Integer idCity) {

    CityEntity cityToUpdate = cityRepository.findOne(idCity);
    City cityToReturn = new City();

    cityToUpdate.setCity(updateCity.getCity());
    cityToUpdate.setCountryId(updateCity.getCountryId());

    cityToReturn.setCity(cityToUpdate.getCity());
    cityToReturn.setCountryId(cityToUpdate.getCountryId());

    return cityToReturn;
  }

  public List<City> findAll() {
    List<CityEntity> citiesList = cityRepository.findAll();
    List<City> citiesToReturn = new LinkedList<>();
    for (CityEntity city : citiesList) {
      City cityToAdd = new City();
      cityToAdd.setId(city.getId());
      cityToAdd.setCity(city.getCity());
      cityToAdd.setCountryId(city.getCountryId());
      citiesToReturn.add(cityToAdd);
    }
    return citiesToReturn;
  }

  public void delete(Integer cityId) {
    cityRepository.delete(cityId);
  }
}
