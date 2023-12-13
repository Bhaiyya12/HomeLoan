package com.bank.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.AllPersonelDoc;
import com.bank.repo.AllPersonelDocRepo;
import com.bank.serviceI.AllPersonelDocServiceI;


@Service
public class AllPersonelDocServiceImpl implements AllPersonelDocServiceI {

	
	
	@Autowired
	AllPersonelDocRepo allDocumentsRepository;
	
	
	
	@Override
	public AllPersonelDoc saveAllPersonalDocuments(AllPersonelDoc documents) {
		AllPersonelDoc doc=allDocumentsRepository.save(documents);
		return doc;
	}

	@Override
	public List<AllPersonelDoc> getAllPersonalDocuments() {
		return allDocumentsRepository.findAll();
	}

	@Override
	public AllPersonelDoc getSinglePersonalDocuments(Integer documentID) {
		return allDocumentsRepository.findById(documentID).get();
	}

	@Override
	public void deleteAllPersonalDocuments(Integer documentID) {
		allDocumentsRepository.deleteById(documentID);
		
	}

	@Override
	public AllPersonelDoc updateAllPersonalDocuments(AllPersonelDoc documents) {
		return allDocumentsRepository.save(documents); 
	}

}
