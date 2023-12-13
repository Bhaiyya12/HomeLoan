package com.bank.serviceI;

import java.util.List;

import com.bank.model.AllPersonelDoc;

public interface AllPersonelDocServiceI {
	public AllPersonelDoc saveAllPersonalDocuments(AllPersonelDoc documents);
	public List<AllPersonelDoc> getAllPersonalDocuments();
	public AllPersonelDoc getSinglePersonalDocuments(Integer documentID);
	public void deleteAllPersonalDocuments(Integer documentID);
	public AllPersonelDoc updateAllPersonalDocuments(AllPersonelDoc documents);
	
	
	
	
}
