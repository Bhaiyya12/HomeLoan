package com.cjc.homeloan.webapp.main.utility;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



import com.cjc.homeloan.webapp.main.model.CurrentLoanDetails;

import com.cjc.homeloan.webapp.main.model.SanctionLetter;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfWriter;


	public class PDF_Generator {
	
	
	public static ByteArrayInputStream genrateSanctionLatter
    (Document doc, ByteArrayOutputStream output, CurrentLoanDetails cou)
    {
		
		
		
		
		
		
		// date under title
				Date sancDate=new Date();
				DateFormat formatdate = new SimpleDateFormat("dd-MM-yyyy");
				String dateform =formatdate.format(sancDate);

		String title=" ** Swiss Bank ** ";
		
		
		
		
		
		
		
		
		String content ="To,\n"
				+ "Name: "+cou.getCustomerName()+"\n"
				+ "Email Id:"+cou.getCustomerEmail()+"\n\n"
				+ "Dear Sir / Madam, \n\n"
				+ "Subject : Home Loan Sanction Letter.\n\n\n"
				+ "         We are pleased to inform you that your loan application submitted on "+dateform+" for the purpose of HOME LOAN has been thoroughly reviewed and approved by SWISS BANK. The details of the sanctioned loan are as follows:\n\n"
				+ "Loan Amount: "+cou.getCustomerTotalLoanRequired()+"\r\n"
				+ "Interest Rate:"+cou.getRateOfInterest()+"\r\n"
//				+ "payable Ammount: "+sa.getPayableAmmount()+"\r\n"
//				+ "Monthly EMI: "+sa.getMonthlyEmi()+"\n"
//				+ "Tenure : "+sa.getSanTenure()+"\n\n"
				+ "Other Terms and Conditions:-\n\n"
				+ "Please take note of the terms and conditions mentioned above:\n The disbursal of the loan amount will be processed upon the fulfillment of any outstanding documentation and the completion of any remaining formalities."
				+ ""
				+ "Kindly ensure that you adhere to the repayment schedule outlined in this letter. Failure to comply with the terms and conditions may result in penalties and affect your credit standing."
				+ ""
				+ "If you have any questions or require further clarification, please feel free to contact our loan department at +41-58-631-00-00 or  communications@snb.ch ."
				+ ""
				+ "Congratulations on the approval of your loan. We appreciate your trust in SWISS BANK, and we look forward to assisting you in achieving your financial goals.\r\n"
				+ "\n"
				+ "Sincerely,\r\n"
				+ ""
				+ " Name:Sam Wade,\r\n"
				+ "Loan Officer\r\n"
				+ "Swiss Bank\r\n"
				+ "+41-58-631-00-00"
				;
		
		
		
		// getInstance :- any data added in doc they convert into byte array output stream
		PdfWriter.getInstance(doc, output);
		doc.open();
		
		
		
		//font class for font
		Font fon=FontFactory.getFont(FontFactory.TIMES_ROMAN,35,CMYKColor.red);

		
		//1.
		Paragraph titlePara=new Paragraph(title,fon);
		// for alignment call paragraph method 
		titlePara.setAlignment("center");
		doc.add(titlePara);
		
		
		
		//2.
		Font fondate=FontFactory.getFont(FontFactory.TIMES_ROMAN);
		Paragraph datepara=new Paragraph("Date : "+dateform,fondate);
		// gap between title and date
		datepara.setSpacingBefore(30);
		datepara.setAlignment("right");
		doc.add(datepara);
		
		
		
		
		//3.
		Font fon1=FontFactory.getFont(FontFactory.TIMES_ROMAN);
	Paragraph content1=new Paragraph(content, fon1);
	doc.add(content1);
		
	
	
	doc.close();

		ByteArrayInputStream input=new	ByteArrayInputStream(output.toByteArray());
		return input;
    }


}