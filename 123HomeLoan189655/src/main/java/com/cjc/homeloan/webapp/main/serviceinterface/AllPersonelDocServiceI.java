package com.cjc.homeloan.webapp.main.serviceinterface;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.cjc.homeloan.webapp.main.model.AllPersonelDoc;
import com.cjc.homeloan.webapp.main.model.Customer;

public interface AllPersonelDocServiceI {
	

	List<AllPersonelDoc> savedoc(AllPersonelDoc d);

	List<AllPersonelDoc> getDoc();

	List<AllPersonelDoc> getAlld();

	List<AllPersonelDoc> update(AllPersonelDoc ld);


}
