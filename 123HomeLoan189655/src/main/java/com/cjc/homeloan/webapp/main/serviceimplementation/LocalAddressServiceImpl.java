package com.cjc.homeloan.webapp.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.LocalAddress;
import com.cjc.homeloan.webapp.main.repository.LocalAddressRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.LocalAddressServiceI;

@Service
public class LocalAddressServiceImpl implements LocalAddressServiceI 
{
  @Autowired
  LocalAddressRepository lar;

@Override
public LocalAddress saveLocalAddress(LocalAddress ld)
{
	LocalAddress la=lar.save(ld);	
	return la;
}

@Override
public Iterable<LocalAddress> getAllLocalAddress() {
	Iterable<LocalAddress> list=lar.findAll();
	return list;
}

@Override
public LocalAddress updateLocalAddress(Integer localAddressId, LocalAddress add) {
	add.setLocalAddressId(localAddressId);
	LocalAddress localadd=lar.save(add);
	return localadd;
}

@Override
public LocalAddress getSingleLocalAddress(Integer localAddressId) {
	
	return lar.findById(localAddressId).get();
}

@Override
public void deleteLocalAddress(Integer localAddressId) {
	lar.deleteById(localAddressId);
	
}
  
  
}
