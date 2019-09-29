package com;
import java.io.File;

import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;  
public class GenratePdf {
	public static void main(String args[]) throws Exception 
	{              
	      // Creating a PdfWriter   
		  String fileName ="/travel"+System.currentTimeMillis()+".pdf";
		  String print_destination = System.getProperty("user.home")+File.separator+"Desktop"+fileName;
		 
		  System.out.println(print_destination);
	      PdfWriter writer = new PdfWriter(print_destination);           
	     
	      // Creating a PdfDocument object      
	      PdfDocument pdf = new PdfDocument(writer);                  
	      
	      // Creating a Document object       
	      Document doc = new Document(pdf);                       
	         
	      String para1 = "Mr Chandrasekhar Yadav  Initiated Travel Request and his Travelling Pospose is Online Exam Cordination At New Delhi";
	      // Creating Paragraphs       
	      Paragraph paragraph1 = new Paragraph(para1); 
	      
	      doc.add(paragraph1);
	      
	      // Creating a table       
	      float [] pointColumnWidths = {150F, 150F, 150F,150F};   
	      Table table = new Table(pointColumnWidths);    
	      
	      // Adding cells to the table       
	      table.addCell(new Cell().add("Travel Request ID"));       
	      table.addCell(new Cell().add("100")); 
	      
	      table.addCell(new Cell().add("Amtron Employee ID"));       
	      table.addCell(new Cell().add("1001"));       
	      
	      table.addCell(new Cell().add("Applicant Name"));       
	      table.addCell(new Cell().add("Chandrasekhar Yadav")); 
	      
	      table.addCell(new Cell().add("Apply Date"));       
	      table.addCell(new Cell().add("26-09-2019"));    
	      
	      table.addCell(new Cell().add("Travel From Date"));       
	      table.addCell(new Cell().add("26-09-2019"));  
	      
	      table.addCell(new Cell().add("Travel To Date"));       
	      table.addCell(new Cell().add("26-09-2019"));  
	      
	      
	      table.addCell(new Cell().add("Travel From Location"));       
	      table.addCell(new Cell().add("Guwahati"));  
	      
	      table.addCell(new Cell().add("Travel To Location"));       
	      table.addCell(new Cell().add("New Delhi"));  
	      
	      table.addCell(new Cell().add("Traveling Expenses(TA) Amount"));       
	      table.addCell(new Cell().add("200"));  
	      
	      table.addCell(new Cell().add("Daily Allowance(DA) Amount"));       
	      table.addCell(new Cell().add("300")); 
	      
	      
	      table.addCell(new Cell().add("Accommodation Amoun"));       
	      table.addCell(new Cell().add("500")); 
	      
	      table.addCell(new Cell().add("Miscellaneous Amount"));       
	      table.addCell(new Cell().add("500")); 
	      
	      table.addCell(new Cell().add("Total Amount"));       
	      table.addCell(new Cell().add("1000")); 
	     
	      table.addCell(new Cell().add("Number of Days"));       
	      table.addCell(new Cell().add("1")); 
	   
	      doc.add(table);                  
	      doc.close();
	      System.out.println("pdf created successfully..");   
	   }  
	}
