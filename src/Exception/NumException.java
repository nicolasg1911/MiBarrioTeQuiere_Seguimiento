package Exception;
 
public class NumException extends Exception{
	
	private int day;
	
	public NumException(int day) {
		super("No puede ingresar hoy, numero de cedula incorrecto");
		this.day=day;	
	}
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	

}
