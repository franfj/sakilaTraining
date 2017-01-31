package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsystems.sakila.dto.StoreWithAddressAndCity;
import com.tsystems.sakila.repositories.StoreRepository;

@Component
public class StoreCaseUses {

  private final StoreRepository repo;

  @Autowired
  public StoreCaseUses(StoreRepository repo) {
    super();
    this.repo = repo;
  }

  public List<StoreWithAddressAndCity> getStoreWithAddressAndCity() {

    List<Object[]> queryResult = repo.getStoreWithAddressAndCity();
    List<StoreWithAddressAndCity> result = new LinkedList<>();

    for (Object[] objects : queryResult) {

      StoreWithAddressAndCity storeWithStuff = new StoreWithAddressAndCity();

      storeWithStuff.setStoreId(Integer.parseInt(objects[0].toString()));
      storeWithStuff.setAddressId(Integer.parseInt(objects[1].toString()));
      storeWithStuff.setAddress((String) objects[2]);
      storeWithStuff.setCityId(Integer.parseInt(objects[3].toString()));
      storeWithStuff.setCity((String) objects[4]);

      result.add(storeWithStuff);
    }


    return result;
  }



}
