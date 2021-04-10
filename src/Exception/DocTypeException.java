package Exception;

public class DocTypeException extends Exception{
	
	private String type; 
	
	public DocTypeException(String type) {
		super("El cliente es menor de edad");
		this.type=type;	
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
