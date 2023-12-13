package com.cjc.homeloan.webapp.main.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.PropertyAddress;
import com.cjc.homeloan.webapp.main.repository.PropertyAddressRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.PropertyAddressServiceInterface;

@Service
public class PropertyAddressServiceImpl implements  PropertyAddressServiceInterface{
	
	@Autowired
	PropertyAddressRepository propertyAddressRepository;

	@Override
	public PropertyAddress savePropertyAddress(PropertyAddress pd) {
		    PropertyAddress propertyAddress=propertyAddressRepository.save(pd);
		return propertyAddress;
	}

	@Override
	public List<PropertyAddress> getAllPropertyAddress() {
		
		return propertyAddressRepository.findAll();
	}

	@Override
	public Optional<PropertyAddress> getSinglePropertyAddress(PropertyAddress pd, Integer propertyAddressId) {
		 Optional<PropertyAddress> property= propertyAddressRepository.findById(propertyAddressId);
		return property;
	}

	@Override
	public void deletePropertyAddress(Integer propertyAddressId) {
		            propertyAddressRepository.deleteById(propertyAddressId);
		
	}

	@Override
	public PropertyAddress updatePropertyAddress(Integer propertyAddressId, PropertyAddress pa) {
		               pa.setPropertyAddressId(propertyAddressId);
		               
		return propertyAddressRepository.save(pa);
	}

}

