package com.cjc.homeloan.webapp.main.serviceinterface;

import com.cjc.homeloan.webapp.main.model.DependentInfo;

public interface DependentInfoInterface {
	
	
	public DependentInfo saveDependentInfoData(DependentInfo d);
	
	public Iterable<DependentInfo> getAlldependentInfoData();
	
	public DependentInfo updateDependentInfoData(DependentInfo dependentInfoId);
	public String deleteDependentInfoData(Integer dependentInfoId);

}
