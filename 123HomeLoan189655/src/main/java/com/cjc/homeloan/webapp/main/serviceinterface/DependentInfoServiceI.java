package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.DependentInfo;

public interface DependentInfoServiceI {

	public void saveDepInfo(DependentInfo dfo);
	public Iterable<DependentInfo> getAllDepenInfo();
	public DependentInfo updateDepeninfo(DependentInfo updateDepen);
	public String deleteDepenInfo(int dependentinfoid);
}
