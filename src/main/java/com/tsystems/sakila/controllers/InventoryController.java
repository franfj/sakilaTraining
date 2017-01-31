package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tsystems.sakila.dto.Inventory;
import com.tsystems.sakila.usecases.CrudInventoryUseCase;

@RestController
@RequestMapping(value = "/inventories")
public class InventoryController {

  private final CrudInventoryUseCase crudInventoryUseCase;

  @Autowired
  public InventoryController(CrudInventoryUseCase crudInventoryUseCase) {
    super();
    this.crudInventoryUseCase = crudInventoryUseCase;
  }

  @RequestMapping(value = "/film/{id}", method = RequestMethod.GET)
  public List<Integer> getStoreWithFilm(@PathVariable("id") Integer filmId) {
    return crudInventoryUseCase.getStoreWithFilm(filmId);
  }



  public void getInventories() {
    System.out.println(crudInventoryUseCase.getInventories());
  }

  public void getInventoryById(Integer id) {
    System.out.println(crudInventoryUseCase.getInventoryById(id));
  }

  public void createInventory(Inventory inventoryToCreate) {
    System.out
        .println("Creado inventory: " + crudInventoryUseCase.createInventory(inventoryToCreate));
  }

  public void updateInventory(Integer id, Inventory inventoryToUpdate) {
    System.out.println(
        "Modificado inventory: " + crudInventoryUseCase.updateInventory(id, inventoryToUpdate));
  }

  public void removeInventory(Integer id) {
    System.out.println("Eliminado inventory: " + id);
  }

}
