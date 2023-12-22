package com.cjc.homeloan.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeloan.webapp.main.model.DependentInfo;
import com.cjc.homeloan.webapp.main.serviceinterface.DependentInfoServiceI;





// Mandar baporikar






@RestController
public class DependentInfoController {
	
	
	@Autowired
	DependentInfoServiceI dsi;
	
	@PostMapping("/saveDependent")
	public  void saveData(@RequestBody DependentInfo dfo)
	{
		dsi.saveDepInfo(dfo);
	}
	
	@GetMapping("/getAllData")
	public ResponseEntity<Iterable<DependentInfo>>  getAll()
	{
		Iterable<DependentInfo> allDepenInfo = dsi.getAllDepenInfo();
		return new ResponseEntity<Iterable<DependentInfo>>(allDepenInfo,HttpStatus.OK);
	}
	
	
	@PutMapping("/updateData")
	public ResponseEntity<DependentInfo> updateData(@RequestBody DependentInfo updateDepen)
	{
		 DependentInfo dep = dsi.updateDepeninfo(updateDepen);
		 return new ResponseEntity<DependentInfo>(dep,HttpStatus.OK );
	}
	
	
	@DeleteMapping("/deleteData")
	public String deleteDepenInfo(int dependentinfoid)
	{
		String deleteDepenInfo = dsi.deleteDepenInfo(dependentinfoid);
		return deleteDepenInfo;
	}
			
	
	

}
