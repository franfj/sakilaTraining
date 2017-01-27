package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import com.tsystems.sakila.domain.StaffEntity;
import com.tsystems.sakila.dto.Staff;
import com.tsystems.sakila.dto.create.CreateStaff;
import com.tsystems.sakila.dto.update.UpdateStaff;
import com.tsystems.sakila.repositories.StaffRepository;

public class CrudStaffUseCase {

	private final StaffRepository staffRepository;

	public CrudStaffUseCase(StaffRepository staffRepository) {
		super();
		this.staffRepository = staffRepository;
	}

	public List<Staff> getStaffs() {
		List<StaffEntity> source = staffRepository.findAll();
		List<Staff> result = new LinkedList<>();

		for (StaffEntity staffEntityIterator : source) {
			Staff newStaff = new Staff();
			newStaff.setStaffId(staffEntityIterator.getStaffId());
			result.add(newStaff);
		}
		return result;
	}

	public Staff getStaffById(Integer id) {

		Staff newStaff = new Staff();
		newStaff.setStaffId(staffRepository.findByStaffId(id).getStaffId());
		return newStaff;
	}

	public void createStaff(CreateStaff staffToCreate) {

		StaffEntity staffentityToCreate = new StaffEntity();
		staffentityToCreate.setStaffId(staffToCreate.getStaffId());

		staffRepository.save(staffentityToCreate);
	}

	public void updateStaff(UpdateStaff staffToUpdate, Integer id) {

		StaffEntity newStaffEntity = staffRepository.findByStaffId(id);
		newStaffEntity.setStaffId(staffToUpdate.getStaffId());

		staffRepository.save(newStaffEntity);

	}

	public void removeStaff(Integer id) {
		staffRepository.delete(id);
	}
}
