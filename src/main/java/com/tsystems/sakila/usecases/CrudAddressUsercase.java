package com.tsystems.sakila.usecases;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsystems.sakila.domain.AddressEntity;
import com.tsystems.sakila.dto.Address;
import com.tsystems.sakila.dto.create.CreateAddress;
import com.tsystems.sakila.dto.update.UpdateAddress;
import com.tsystems.sakila.repositories.AddressRepository;

@Service
public class CrudAddressUsercase {

  private final AddressRepository addressRepository;

  @Autowired
  public CrudAddressUsercase(AddressRepository addressRepository) {
    super();
    this.addressRepository = addressRepository;
  }

  public Address getAddressById(Integer addressId) {

    AddressEntity addressToReturn = new AddressEntity();
    Address target = new Address();

    addressToReturn = addressRepository.findOne(addressId);
    target.setId(addressToReturn.getId());
    target.setAddress(addressToReturn.getAddress());
    target.setAddress2(addressToReturn.getAddress2());
    target.setCityId(addressToReturn.getCityId());
    target.setDistrict(addressToReturn.getDistrict());
    target.setPhone(addressToReturn.getPhone());
    target.setPostalCode(addressToReturn.getPostalCode());

    return target;
  }

  public Address createNewAddress(CreateAddress createAddress) {

    AddressEntity addressToCreate = new AddressEntity();
    Address target = new Address();

    addressToCreate.setAddress(createAddress.getAddress());
    addressToCreate.setAddress2(createAddress.getAddress2());
    addressToCreate.setCityId(createAddress.getCityId());
    addressToCreate.setDistrict(createAddress.getDistrict());
    addressToCreate.setPhone(createAddress.getPhone());
    addressToCreate.setPostalCode(createAddress.getPostalCode());
    addressRepository.save(addressToCreate);

    target.setAddress(addressToCreate.getAddress());
    target.setAddress2(addressToCreate.getAddress2());
    target.setCityId(addressToCreate.getCityId());
    target.setDistrict(addressToCreate.getDistrict());
    target.setPhone(addressToCreate.getPhone());
    target.setPostalCode(addressToCreate.getPostalCode());

    return target;
  }

  public Address updateAddress(UpdateAddress updateAddress, Integer addressId) {

    AddressEntity addressToUpdate = addressRepository.findOne(addressId);
    Address target = new Address();

    addressToUpdate.setAddress(updateAddress.getAddress());
    addressToUpdate.setAddress2(updateAddress.getAddress2());
    addressToUpdate.setCityId(updateAddress.getCityId());
    addressToUpdate.setDistrict(updateAddress.getDistrict());
    addressToUpdate.setPhone(updateAddress.getPhone());
    addressToUpdate.setPostalCode(updateAddress.getPostalCode());

    target.setAddress(addressToUpdate.getAddress());
    target.setAddress2(addressToUpdate.getAddress2());
    target.setCityId(addressToUpdate.getCityId());
    target.setDistrict(addressToUpdate.getDistrict());
    target.setPhone(addressToUpdate.getPhone());
    target.setPostalCode(addressToUpdate.getPostalCode());

    return target;
  }

  public List<Address> findAll() {

    List<AddressEntity> addressList = addressRepository.findAll();
    List<Address> addressesToReturn = new LinkedList<>();
    for (AddressEntity address : addressList) {
      Address addressToAdd = new Address();
      addressToAdd.setId(address.getId());
      addressToAdd.setAddress(address.getAddress());
      addressToAdd.setAddress2(address.getAddress2());
      addressToAdd.setCityId(address.getCityId());
      addressToAdd.setDistrict(address.getDistrict());
      addressToAdd.setPhone(address.getPhone());
      addressToAdd.setPostalCode(address.getPostalCode());
      addressesToReturn.add(addressToAdd);
    }
    return addressesToReturn;
  }

  public void delete(Integer addressId) {
    addressRepository.delete(addressId);
  }



}
