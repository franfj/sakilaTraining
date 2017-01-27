package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tsystems.sakila.domain.CountryEntity;
import com.tsystems.sakila.dto.Country;
import com.tsystems.sakila.dto.create.CreateCountry;
import com.tsystems.sakila.dto.update.UpdateCountry;
import com.tsystems.sakila.repositories.CountryRepository;

@Service
public class CrudCountryUsercase {

  private final CountryRepository countryRepository;

  public CrudCountryUsercase(CountryRepository countryRepository) {
    super();
    this.countryRepository = countryRepository;
  }

  public Country getCountryById(Integer countryId) {

    CountryEntity countryToReturn = new CountryEntity();
    Country target = new Country();

    countryToReturn = countryRepository.findOne(countryId);
    target.setCountry(countryToReturn.getCountry());

    return target;
  }

  public Country createNewCountry(CreateCountry createCountry) {

    CountryEntity countryToCreate = new CountryEntity();
    Country country = new Country();

    countryToCreate.setCountry(createCountry.getCountry());
    countryRepository.save(countryToCreate);

    country.setCountry(countryToCreate.getCountry());

    return country;

  }

  public Country updateCity(UpdateCountry updateCountry, Integer idCountry) {

    CountryEntity countryToUpdate = countryRepository.findOne(idCountry);
    Country countryToReturn = new Country();

    countryToUpdate.setCountry(updateCountry.getCountry());

    countryToReturn.setCountry(countryToUpdate.getCountry());

    return countryToReturn;
  }

  public List<Country> findAll() {
    List<CountryEntity> countryList = countryRepository.findAll();
    List<Country> countriesToReturn = new LinkedList<>();
    for (CountryEntity country : countryList) {
      Country countryToAdd = new Country();
      countryToAdd.setCountry(country.getCountry());
      countriesToReturn.add(countryToAdd);
    }
    return countriesToReturn;
  }

  public void delete(Integer countryId) {
    countryRepository.delete(countryId);
  }
}
