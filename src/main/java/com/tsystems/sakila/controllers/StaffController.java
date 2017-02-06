package com.tsystems.sakila.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsystems.sakila.dto.Staff;
import com.tsystems.sakila.dto.create.CreateStaff;
import com.tsystems.sakila.dto.update.UpdateStaff;
import com.tsystems.sakila.usecases.CrudStaffUseCase;

public class StaffController {

	private final CrudStaffUseCase crudStaffUseCase;

	@Autowired
	public StaffController(CrudStaffUseCase crudStaffUseCase) {
		super();
		this.crudStaffUseCase = crudStaffUseCase;
	}

	public void createStaff(CreateStaff staffToCreate) {
		System.out.println("Creando Staff");
		crudStaffUseCase.createStaff(staffToCreate);
	}

	public List<Staff> getAllStaffs() {
		System.out.println("Esta es la lista de todos los Staff:");
		return crudStaffUseCase.getStaffs();
	}

	public Staff getStaffById(Integer id) {
		System.out.println("El Staff con el id:" + id + "es el siguiente: ");
		return crudStaffUseCase.getStaffById(id);

	}

	public void updateStaff(UpdateStaff staffToUpdate, Integer id) {
		System.out.println("Se procede a actualizar el Staff con id: " + id);
		crudStaffUseCase.updateStaff(staffToUpdate, id);
	}

	public void deleteCustomer(Integer id) {
		System.out.println("Se procede a borrar el Staff con id: " + id);
		crudStaffUseCase.removeStaff(id);
	}

}
