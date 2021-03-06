package model;

import Exception.DocTypeException;
import Exception.NumException;

public class Customer {

	private String id;
	private DocumentType docType;
	
	public Customer() {
		super();
	}
	
	public Customer(String id, String documentType) {
		this.id=id;
		this.docType=DocumentType.valueOf(documentType);
	}
	
	public DocumentType getDocumentType() {
		return docType;
	}
	
	public void setDocumentType(DocumentType documentType) {
		this.docType = documentType;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Boolean addPerson( String id,  String documentType, int date) throws DocTypeException, NumException{
		boolean able=false;
		int temp=Character.getNumericValue(id.charAt(id.length()-2));
		if(!documentType.equals("TI")) {
			if((date%2==0 && temp%2!=0)||(date%2!=0 && temp%2==0)) {
				able = true;
				System.out.println("El Cliente puede ingresar");
			}else {
				throw new NumException(date);
			}
		}
		else {
			
			throw new DocTypeException(documentType);
			
		}
		return able;
	}
}
