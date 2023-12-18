package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.LocalAddress;

public interface LocalAddressServiceI  {

	public LocalAddress saveLocalAddress(LocalAddress ld);

	public Iterable<LocalAddress> getAllLocalAddress();

	public LocalAddress updateLocalAddress(Integer localAddressId, LocalAddress add);

	public LocalAddress getSingleLocalAddress(Integer localAddressId);

	public void deleteLocalAddress(Integer localAddressId);

}
