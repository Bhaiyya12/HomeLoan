package com.bank.serviceI;

import com.bank.model.EMIDetails;

public interface EMIDetailsServiceI {
	public EMIDetails saveEMIDetails(EMIDetails ed);
	public Iterable<EMIDetails> getAllEMIDetails();
	public EMIDetails updateEMIDetails(Integer emiID, EMIDetails ed);
	public EMIDetails getSingleEMIDetails(Integer emiID);
	public void deleteEMIDetails(Integer emiID);

}
