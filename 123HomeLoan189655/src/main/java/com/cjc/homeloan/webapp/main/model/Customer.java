package com.cjc.homeloan.webapp.main.model;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String customerDateOfBirth;
	private int customerAge;
	private String customerGender;
	private String customerEmail;
	private double customerMobileNumber;
	private double customerAdditionalMobileNumber;
	private double customerAmountPaidForHome;
	private double customerTotalLoanRequired;
	
	@OneToOne(cascade = CascadeType.ALL)
	private EducationalInfo educationalInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonelDoc allpersonalDoc;
	
	@OneToOne(cascade = CascadeType.ALL)
    private DependentInfo familydependentInfo;
	
	@OneToOne(cascade = CascadeType.ALL)
    private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
    private MortgageDetails mortgageDetails;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Profession profession;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Cibil cibilscore;
	
	@OneToOne(cascade = CascadeType.ALL)
    private CurrentLoanDetails currentloandetails;
	
	@OneToOne(cascade = CascadeType.ALL)
    private PreviousLoan previousloan;
	
	@OneToOne(cascade = CascadeType.ALL)
    private AccountDetails accountdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
    private PropertyInfo propertyinfo;
	
	@OneToOne(cascade = CascadeType.ALL)
    private GuarantorDetails gurantordetails;
	
	@OneToOne(cascade = CascadeType.ALL)
    private LoanDisbursement loandisbursement;
	
	@OneToOne(cascade = CascadeType.ALL)
    private Ledger ledger;
	
	@OneToOne(cascade = CascadeType.ALL)
    private SanctionLetter sanctionletter;
	
	@OneToOne(cascade = CascadeType.ALL)
    private CustomerVerification customerverification;
    


}
