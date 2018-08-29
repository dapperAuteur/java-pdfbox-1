package com.awews.pdfbox;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pdfbox1Application2 {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Pdfbox1Application2.class, args);
		
		File file = new File("./i-90.pdf");
		
		PDDocument document = null;
		PDDocument doc = document.load(file);
		PDPage page = doc.getPage(6);
		PDPageContentStream contentStream = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true, true);
		
		Integer x1 = 343; // yes
		Integer y1 = 121; //
		
		Integer x2 = 343; // no
		Integer y2 = 105; //
		
		Integer x3 = 343; // 1a
		Integer y3 = 90; //
// 6d 75
		doc.setAllSecurityToBeRemoved(true);
		
//		String text = "McDonald";
//		String name = "Anthony";
		String yes = "XY";
		String no = "XY";
		String notApplicable = "XY";
		
		
		try {
			contentStream.beginText();
		
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
//			text placement for last name on page 0 of i-90
			contentStream.newLineAtOffset(x1, y1);
		
		
		
		
		
//		try {
//			contentStream = new PDPageContentStream(doc, page);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
			contentStream.showText(yes);
			
			
			contentStream.endText();
			
			contentStream.beginText();
			
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
			
			
			contentStream.newLineAtOffset(x2, y2);
			
			contentStream.showText(no);
			
			contentStream.endText();
			
			contentStream.beginText();
			
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
			
			
			contentStream.newLineAtOffset(x3, y3);
			
			contentStream.showText(notApplicable);
			
			contentStream.endText();
		
		
			
		
		
		System.out.println("content added");
		
			contentStream.close();
		
		
			doc.save("./89-i-90.pdf");
		
		
		
		
			doc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
