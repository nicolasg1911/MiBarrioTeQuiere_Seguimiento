package ui;
import model.*;

import java.util.Scanner;
import Exception.DocTypeException;
import Exception.NumException;
import java.time.LocalDate;

public class Main {

	private Scanner sc;
	public Customer customer;
	
	
	private int counter;
	
	public Main(){
		
		customer= new Customer();
		sc=new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		Main ppal= new Main();
		    int option=0;
		        do{
		            option= ppal.showMenu();
		            ppal.executeOperation(option);

		        }while (option!=0);
		    }
		
		public int showMenu() {
		        int option;

		        System.out.println(
		                "Seleccione una opcion para continuar\n" +
		                "(1) Registrar nuevo cliente \n" +
		                "(2) Consultar numero de clientes administrados\n" +
		                "(0) Salir \n"
		                );
		        option= sc.nextInt();
		        sc.nextLine();
		        return option;
		    }
		
		public void executeOperation(int operation) {
		        switch(operation) {
		        case 0:
		            System.out.println("Adios!");
		            break;
		        case 1:
		        	customerRegister();
		            break;
		        case 2:
		        	System.out.println("han intentado ingresar "+counter+" clientes");
		            break;
		        default:
		            System.out.println("opcion incorrecta");
		        }
		    }
		
		public void customerRegister() {
		try {
		int date;
		int option=0;
		String id="";
		counter++;
		String type="";
		System.out.println(
				"seleccione un tipo de documento del cliente \n"+
				"(1) Para Tarjeta de Identidad \n"+
				"(2) Para Cedula de Ciudadania \n"+
				"(3) Para Pasaporte \n"+
				"(4) Cedula de Extranjeria \n"
		);
		option= sc.nextInt();
		sc.nextLine();
		switch(option) {
        case 1:
        	type="TI";
            break;
        case 2:
        	type="CC";
            break;
        case 3:
        	type="PP";
            break;
        case 4:
        	type="CE";
            break;
        default:
        	System.out.println("opcion incorrecta");
		}
		
		System.out.println("ingrese Nro de documento");
		id=sc.nextLine();
		date=LocalDate.now().getDayOfMonth();
			customer.addPerson(id, type, date);
		} catch (DocTypeException e) {
			
			e.printStackTrace();
		}catch (NumException i) {

			i.printStackTrace();
		}
		

		}
		
}