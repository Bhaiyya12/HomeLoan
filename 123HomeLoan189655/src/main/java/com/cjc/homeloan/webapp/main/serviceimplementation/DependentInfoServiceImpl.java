package com.cjc.homeloan.webapp.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.model.DependentInfo;
import com.cjc.homeloan.webapp.main.repository.DependentInfoRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.DependentInfoServiceI;

@Service
public class DependentInfoServiceImpl implements DependentInfoServiceI {

	@Autowired
	DependentInfoRepository drp;
	
	
	
	@Override
	public void saveDepInfo(DependentInfo dfo) {
		drp.save(dfo);
		
		
	}



	@Override
	public Iterable<DependentInfo> getAllDepenInfo() {
		Iterable<DependentInfo> dp=drp.findAll();
		
		return dp;
	}



	@Override
	public DependentInfo updateDepeninfo(DependentInfo updateDepen) {
		DependentInfo savedata = drp.save(updateDepen);
		return savedata;
	}



	@Override
	public String deleteDepenInfo(int dependentinfoid) {
		drp.deleteById(dependentinfoid);
		return "Dependent info Delete Successfully......!";
	}

}
