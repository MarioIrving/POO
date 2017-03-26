import java.util.*;
import java.io.*;

public class FechaSistema2 {

    private int dia;
    private int mes;
    private int anio;
    private boolean bisiesto;
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader flujoE = new BufferedReader(isr);
    private Calendar fecha = new GregorianCalendar();
    
    public FechaSistema2 () {
        asignarFecha();
    }

    public FechaSistema2 (int dia_param) {
        asignarFecha(dia_param);
    }

    public FechaSistema2 (int dia_param, int mes_param) {
        asignarFecha(dia_param, mes_param);
    }

    protected void finalize () {
        
        System.out.print("Se borro el objeto de la fecha: ");
        obtenerFecha();
    }

    public void asignarFecha() {
        int x=0;
        this.dia = fecha.get(Calendar.DAY_OF_MONTH);
        this.mes = fecha.get(Calendar.MONTH)+1;
        this.anio = fecha.get(Calendar.YEAR);
        x=fechaCorrecta();
    }
 
    public void asignarFecha(int dia_param) {

        int x=0;
        this.dia = dia_param;
        this.mes = fecha.get(Calendar.MONTH)+1;
        this.anio = fecha.get(Calendar.YEAR);
        x=fechaCorrecta();
    }
    
    public void asignarFecha(int dia_param, int mes_param) {

        int x=0;
        this.dia = dia_param;
        this.mes = mes_param;
        this.anio = fecha.get(Calendar.YEAR);
        x=fechaCorrecta();
    }

    public void asignarFechaManual() {
        
        int x=0;
        do{
            System.out.println("Dame el dia");
            this.dia=leeCadena();
            System.out.println("Dame el mes");
            this.mes=leeCadena();
            System.out.println("Dame el anio");
            this.anio=leeCadena();
            x=fechaCorrecta();

        }while(x==-1);
    }

    public void obtenerFecha() {
        System.out.println(dia + "/" + mes + "/" + anio);
    }
    
    private int fechaCorrecta() {  

        int x=0;

        metodoBisiesto();

        if (dia<1 || dia>31){
            System.out.println("Dia incorrecto");
            x=-1;   
        }  
        
        if (mes<1 || mes>12){
            System.out.println("Mes incorrecto");
            x=-1;
        }  
        
        if (anio<1582){
            System.out.println("Anio incorrecto");
            x=-1;
        }  
        
         if ((mes==4 || mes== 6 || mes==9 || mes==11) && dia==31){
            System.out.println("El mes solo tiene 30 dias");
            x=-1;
        }
        
        if(mes==2 && dia>29){
            System.out.println("Febrero solo tiene menos dias");
            x=-1;
        }

        if(mes==2 && dia==29 && bisiesto==false){
                 System.out.println("No es anio bisiesto");
                 x=-1;
        }      
         
        if(x==-1)
            System.out.println("Fecha incorrecta, vuelve a introducir la fecha");
            System.out.println(" ");

        return x;
    
    }

    private void metodoBisiesto() {

        bisiesto=false;

        if(anio%4==0 && anio%100!=0) 
            bisiesto=true;
        else if (anio%400==0)
            bisiesto=true;
    }

    private int leeCadena() {

        String sDato;
        int numero=0;
        
        try {
            sDato = flujoE.readLine();
            numero = Integer.parseInt(sDato);
        } catch(NumberFormatException e){
            System.out.println("El caracter ingresado no es correcto");
            return -1;
        }catch (IOException e) {}
        return numero;
    }
}