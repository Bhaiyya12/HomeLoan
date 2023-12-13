package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.PermanentAddress;

public interface PermanentAddressServiceI {

	public PermanentAddress savePermanentAddress(PermanentAddress pd);

	public Iterable<PermanentAddress> getAllPermanentAddress();

	public PermanentAddress updatePermanentAddress(Integer permanentAddressId, PermanentAddress add);

	public PermanentAddress getSinglePermanentAddress(Integer permanentAddressId);

	public void deletePermanentAddress(Integer permanentAddressId);

}
