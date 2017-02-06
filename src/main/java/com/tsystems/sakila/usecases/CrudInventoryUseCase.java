package com.tsystems.sakila.usecases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.sakila.domain.InventoryEntity;
import com.tsystems.sakila.dto.Inventory;
import com.tsystems.sakila.repositories.InventoryRepository;

@Service
public class CrudInventoryUseCase {

  private final InventoryRepository inventoryRepository;

  @Autowired
  public CrudInventoryUseCase(InventoryRepository inventoryRepository) {
    super();
    this.inventoryRepository = inventoryRepository;
  }


  public List<Integer> getStoreWithFilm(Integer filmId) {
    List<Object> source = inventoryRepository.getStoreWithFilm(filmId);
    List<Integer> result = new LinkedList<>();

    result = source.stream().map(object -> Integer.parseInt(object.toString()))
        .collect(Collectors.toList());

    // for (Object object : source) {
    // result.add(Integer.parseInt(object.toString()));
    // }

    return result;

  }



  public List<Inventory> getInventories() {
    List<InventoryEntity> source = inventoryRepository.findAll();
    List<Inventory> result = new ArrayList<>();

    for (InventoryEntity inventoryEntity : source) {
      Inventory newInventory = new Inventory();
      newInventory.setInventoryId(inventoryEntity.getInventoryId());

      result.add(newInventory);
    }

    return result;
  }

  public Inventory getInventoryById(Integer id) {
    Inventory newInventory = new Inventory();
    newInventory.setInventoryId(inventoryRepository.findOne(id).getInventoryId());

    return newInventory;
  }

  public Inventory createInventory(Inventory inventoryToCreate) {
    InventoryEntity newInventoryEntity = new InventoryEntity();
    newInventoryEntity.setInventoryId(inventoryToCreate.getInventoryId());

    inventoryRepository.save(newInventoryEntity);

    return inventoryToCreate;
  }

  public Inventory updateInventory(Integer id, Inventory inventoryToUpdate) {
    InventoryEntity newInventoryEntity = inventoryRepository.findOne(id);
    newInventoryEntity.setInventoryId(inventoryToUpdate.getInventoryId());

    inventoryRepository.save(newInventoryEntity);

    return inventoryToUpdate;
  }

  public void removeInventory(Integer id) {
    inventoryRepository.delete(id);
  }

}
