package com.cjc.homeloan.webapp.main.serviceimplementation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cjc.homeloan.webapp.main.exception.ValueNotValidException;
import com.cjc.homeloan.webapp.main.model.Customer;
import com.cjc.homeloan.webapp.main.repository.CustomerRepository;
import com.cjc.homeloan.webapp.main.serviceinterface.CustomerServiceinterface;


@Service
public class CustomerServiceimpl implements CustomerServiceinterface {
	
	@Autowired
	CustomerRepository  custoRepository;

	@Override
	public Customer saveCustomer(Customer customer) {
		      
		return custoRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomer() {
		    
		return custoRepository.findAll();
	}

	@Override
	public Customer getSingleCustomer(Integer customerId) {
		   
		Customer cust= custoRepository.findById(customerId).get();
		return cust;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		
		custoRepository.deleteById(customerId);
		    
		
	}

	@Override
	public Customer updateCustomer(Customer customer, Integer customerId) {
		
		
		Customer customerData=getSingleCustomer(customerId);
		customer.getAllpersonalDoc().setDocumentID(customerData.getAllpersonalDoc().getDocumentID());
		customer.getMortgageDetails().setMortageId(customerData.getMortgageDetails().getMortageId());
		customer.getProfession().setProfessionId(customerData.getProfession().getProfessionId());
		customer.getPropertyinfo().setPropertyId(customerData.getPropertyinfo().getPropertyId());
		      customer.setCustomerId(customerId);      
		return custoRepository.save(customer);
	}

	@Override
	public ResponseEntity<Customer> sanctionLoan(Customer customer, Integer customerId) {
		
		Double loanamount=customer.getCurrentloandetails().getCustomerTotalLoanRequired();
		Integer tenure = customer.getCurrentloandetails().getTenure();
		Double rateofInterest= customer.getCurrentloandetails().getRateOfInterest();
		Double roi=rateofInterest;
		
		
		if(loanamount>=1 && tenure>=1 && roi>=1)
		{
		System.out.println("Loan Ammount ****************"+loanamount);
		System.out.println("tenure "+tenure);
		System.out.println("rate of Interest "+roi);
				
		double totalAmountpaid;
		double totalInterest;
		double emiAmount;
		
	
		
//		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = new Date();  
		String sanctionDate=formatter.format(date);
		
		rateofInterest=rateofInterest/(12*100);
		
		emiAmount=  (loanamount*rateofInterest*Math.pow(1+rateofInterest, tenure))/(Math.pow(1+rateofInterest,tenure)-1)  ;
		System.out.println("Emi Amount"+emiAmount);
		
		
		totalAmountpaid=  emiAmount*tenure ;
		System.out.println("Total Amount Paid"+totalAmountpaid);
		
		totalInterest= totalAmountpaid-loanamount ;
		System.out.println("total Interest"+totalInterest);
		
		
		
		
		
		customer.setCustomerId(customerId);
		customer.getCurrentloandetails().setRateOfInterest(roi);
//		customer.getCurrentloandetails().setCustomerTotalLoanRequired(totalAmountpaid);
//		customer.getCurrentloandetails().getEmidetails().setEmiAmountMonthly(emiAmount);
		
		
		
//				customer.getSanctionletter().set(customer.getCustomerName());
//				customer.getSanctionletter().setSanctionDate(sanctionDate);
				customer.getSanctionletter().setPayableAmmount(loanamount);
//				customer.getSanctionletter().setInterestType("fixed");
				customer.getSanctionletter().setInterestRate(0);
				customer.getSanctionletter().setSanTenure(tenure);;
				customer.getSanctionletter().setMonthlyEmi(emiAmount);

		

				Customer cust=custoRepository.save(customer);
				
				return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);
		}
		else {
			throw new ValueNotValidException("Value For Loan Calculation not Valid");
		}
	}

	@Override
	public Customer loanDisbursement(Customer customer, Integer customerId) {
		customer.setCustomerId(customerId);
		
//		set Ledger Details
		
 
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
	    Date date = new Date();  
		String ledgerDate=formatter.format(date);
		
		customer.getLoandisbursement().setAmountPaidDate(ledgerDate);
		
		customer.getLedger().setLedgerCreatedDate(ledgerDate);
		customer.getLedger().setTotalLoanAmount(customer.getSanctionletter().getLoanRequired());
//		customer.getLedger().setPayableAmountwithInterest(customer.getCurrentloandetails().get);
		customer.getLedger().setTenure(customer.getSanctionletter().getSanTenure());
		customer.getLedger().setMonthlyEMI(customer.getSanctionletter().getMonthlyEmi());
		
		
		
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		int loanTenure=customer.getSanctionletter().getSanTenure();
		Calendar cal = Calendar.getInstance(); 
		cal.add(Calendar.MONTH, loanTenure);
		System.out.println("************************Date :"+cal.get(Calendar.DATE)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
		
//		customer.getLedger().setLoanEndDate(cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR));
		customer.getLedger().setLoanEndDate(cal.get(Calendar.YEAR)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.DATE));
		
		return custoRepository.save(customer);
	}

	@Override
	public Customer sactionletteraccepted(Customer customer, Integer customerId) {
		customer.setCustomerId(customerId);
		return custoRepository.save(customer);
	}

	@Override
	public Customer defaultCounter(Customer customer, Integer customerId) {
		customer.setCustomerId(customerId);
		return custoRepository.save(customer);
	}
	
	

	

}
