package com.awews.pdfbox;

public class Working {
	
//	package com.awews.pdfbox;
//
//	import java.io.File;
//	import java.io.IOException;
//
//	import org.apache.pdfbox.pdmodel.PDDocument;
//	import org.apache.pdfbox.pdmodel.PDPage;
//	import org.apache.pdfbox.pdmodel.PDPageContentStream;
//	import org.apache.pdfbox.pdmodel.font.PDType1Font;
//	import org.springframework.boot.SpringApplication;
//	import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//	@SpringBootApplication
//	public class Pdfbox1Application {
//
//		public static void main(String[] args) throws IOException {
//			SpringApplication.run(Pdfbox1Application.class, args);
//			
//			File file = new File("./i-90.pdf");
//			
//			PDDocument document = null;
//			PDDocument doc = document .load(file);
//			PDPage page = doc.getPage(0);
//			PDPageContentStream.AppendMode appendContent;
//			PDPageContentStream contentStream = new PDPageContentStream(doc, page, true, true);
//					
//			doc.setAllSecurityToBeRemoved(true);
//			
//			
//			
//			try {
//				contentStream.beginText();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
////				text placement for last name on page 0 of i-90
//				contentStream.newLineAtOffset(130, 380);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			String text = "McDonald";
//			
//			
//			
////			try {
////				contentStream = new PDPageContentStream(doc, page);
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//			
//			
//			
//			
//			
//			try {
//				contentStream.showText(text);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				contentStream.endText();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			System.out.println("content added");
//			
//			try {
//				contentStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				doc.save("./newi-90.pdf");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//			try {
//				doc.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}


}
