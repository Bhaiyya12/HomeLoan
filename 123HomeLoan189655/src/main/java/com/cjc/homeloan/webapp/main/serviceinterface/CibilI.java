package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.Cibil;

public interface CibilI {
	
	public Cibil saveData(Cibil c);
	public Iterable<Cibil> getAllCibilData() ;
	public Cibil getSingleData(Integer cibilId);

}
