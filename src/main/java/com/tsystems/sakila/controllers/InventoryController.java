package com.tsystems.sakila.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsystems.sakila.dto.Inventory;
import com.tsystems.sakila.usecases.CrudInventoryUseCase;

public class InventoryController {

  private final CrudInventoryUseCase crudInventoryUseCase;

  @Autowired
  public InventoryController(CrudInventoryUseCase crudInventoryUseCase) {
    super();
    this.crudInventoryUseCase = crudInventoryUseCase;
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
