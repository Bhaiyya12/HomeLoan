package com.cjc.homeloan.webapp.main.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.cjc.homeloan.webapp.main.model.PropertyAddress;


public interface PropertyAddressServiceInterface {

	public PropertyAddress savePropertyAddress(PropertyAddress pd);

	public List<PropertyAddress> getAllPropertyAddress();

	public Optional<PropertyAddress> getSinglePropertyAddress(PropertyAddress pd, Integer propertyAddressId);

	public void deletePropertyAddress(Integer propertyAddressId);

	public PropertyAddress updatePropertyAddress(Integer propertyAddressId, PropertyAddress pa);

}
