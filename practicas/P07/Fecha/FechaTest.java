import java.util.*;
public class FechaTest {

	public static void main(String[] args) {

		FechaManual date01 = new FechaManual();
    	FechaSistema date02= new FechaSistema();

        System.out.println("*****Ejercicio 1*****");
        System.out.println(" ");
        
        date01.asignarFecha();
        date01.obtenerFecha();
		
		System.out.println(" ");
     	System.out.println("*****Ejercicio 2*****");
     	System.out.println(" ");

        date02.asignarFecha();
        date02.obtenerFecha();

        date02.asignarFecha(Calendar.DAY_OF_MONTH);
        date02.obtenerFecha();

        date02.asignarFecha(Calendar.DAY_OF_MONTH, Calendar.MONTH);
        date02.obtenerFecha();

        date02.asignarFecha(Calendar.DAY_OF_MONTH, Calendar.MONTH, Calendar.YEAR);
        date02.obtenerFecha();
	}

}