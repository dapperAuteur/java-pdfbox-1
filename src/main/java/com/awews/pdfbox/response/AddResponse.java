package com.awews.pdfbox.response;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class AddResponse {
		
	private String fileName;
	private String newFileName;
	private String fileLocation;
	private String newFileLocation;
	
	private Integer xLocation;
	private Integer yLocation;
	
	private Integer pageNumber;
	
	private String responseText;
	
	public PDDocument addTextToPdf(String fileName, String fileLocation, String newFileName, String newFileLocation, Integer xLocation, Integer yLocation, Integer pageNumber, String responseText) throws InvalidPasswordException, IOException {
		
		File file = new File(fileLocation);
		
//		PDDocument document = null;
		PDDocument doc = PDDocument.load(file);
		PDPage page = doc.getPage(pageNumber);
		PDPageContentStream contentStream = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true, true);
		
		doc.setAllSecurityToBeRemoved(true);
		
		try {
			contentStream.beginText();
			
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
			
			contentStream.newLineAtOffset(xLocation, yLocation);
						
			contentStream.showText(responseText);
			contentStream.endText();
			
			System.out.println("responseText added");
			contentStream.close();
			
			doc.save(newFileName + newFileLocation);
			
			doc.close();
			
			return doc;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}
	
	public AddResponse() {
		
		}

	/**
	 * @param fileName
	 * @param newFileName
	 * @param fileLocation
	 * @param newFileLocation
	 * @param xLocation
	 * @param yLocation
	 * @param pageNumber
	 * @param responseText
	 */
	public AddResponse(String fileName, String newFileName, String fileLocation, String newFileLocation, Integer xLocation,
			Integer yLocation, Integer pageNumber, String responseText) {
		super();
		this.fileName = fileName;
		this.newFileName = newFileName;
		this.fileLocation = fileLocation;
		this.newFileLocation = newFileLocation;
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.pageNumber = pageNumber;
		this.responseText = responseText;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddText [fileName=" + fileName + ", newFileName=" + newFileName + ", fileLocation=" + fileLocation
				+ ", newFileLocation=" + newFileLocation + ", xLocation=" + xLocation + ", yLocation=" + yLocation
				+ ", pageNumber=" + pageNumber + ", responseText=" + responseText + "]";
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the newFileName
	 */
	public String getNewFileName() {
		return newFileName;
	}

	/**
	 * @param newFileName the newFileName to set
	 */
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	/**
	 * @return the fileLocation
	 */
	public String getFileLocation() {
		return fileLocation;
	}

	/**
	 * @param fileLocation the fileLocation to set
	 */
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	/**
	 * @return the newFileLocation
	 */
	public String getNewFileLocation() {
		return newFileLocation;
	}

	/**
	 * @param newFileLocation the newFileLocation to set
	 */
	public void setNewFileLocation(String newFileLocation) {
		this.newFileLocation = newFileLocation;
	}

	/**
	 * @return the xLocation
	 */
	public Integer getxLocation() {
		return xLocation;
	}

	/**
	 * @param xLocation the xLocation to set
	 */
	public void setxLocation(Integer xLocation) {
		this.xLocation = xLocation;
	}

	/**
	 * @return the yLocation
	 */
	public Integer getyLocation() {
		return yLocation;
	}

	/**
	 * @param yLocation the yLocation to set
	 */
	public void setyLocation(Integer yLocation) {
		this.yLocation = yLocation;
	}

	/**
	 * @return the pageNumber
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}

	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * @return the responseText
	 */
	public String getResponseText() {
		return responseText;
	}

	/**
	 * @param responseText the responseText to set
	 */
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileLocation == null) ? 0 : fileLocation.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((newFileLocation == null) ? 0 : newFileLocation.hashCode());
		result = prime * result + ((newFileName == null) ? 0 : newFileName.hashCode());
		result = prime * result + ((pageNumber == null) ? 0 : pageNumber.hashCode());
		result = prime * result + ((responseText == null) ? 0 : responseText.hashCode());
		result = prime * result + ((xLocation == null) ? 0 : xLocation.hashCode());
		result = prime * result + ((yLocation == null) ? 0 : yLocation.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddResponse other = (AddResponse) obj;
		if (fileLocation == null) {
			if (other.fileLocation != null)
				return false;
		} else if (!fileLocation.equals(other.fileLocation))
			return false;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (newFileLocation == null) {
			if (other.newFileLocation != null)
				return false;
		} else if (!newFileLocation.equals(other.newFileLocation))
			return false;
		if (newFileName == null) {
			if (other.newFileName != null)
				return false;
		} else if (!newFileName.equals(other.newFileName))
			return false;
		if (pageNumber == null) {
			if (other.pageNumber != null)
				return false;
		} else if (!pageNumber.equals(other.pageNumber))
			return false;
		if (responseText == null) {
			if (other.responseText != null)
				return false;
		} else if (!responseText.equals(other.responseText))
			return false;
		if (xLocation == null) {
			if (other.xLocation != null)
				return false;
		} else if (!xLocation.equals(other.xLocation))
			return false;
		if (yLocation == null) {
			if (other.yLocation != null)
				return false;
		} else if (!yLocation.equals(other.yLocation))
			return false;
		return true;
	}

}
