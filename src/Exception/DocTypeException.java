package Exception;

public class DocTypeException extends Exception{
	
	private String type; 
	
	public DocTypeException(String type) {
		super("Es menor de edad");
		this.type=type;	
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
