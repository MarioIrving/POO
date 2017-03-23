import java.io.*;


public class FechaManual {


    private int dia;
    private int mes;
    private int anio;
    private boolean bisiesto;
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader flujoE = new BufferedReader(isr);

    public void asignarFecha() {

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
        
        if (this.mes<1 || this.mes>12){
            System.out.println("Mes incorrecto");
            x=-1;
        }  
        
        if (this.anio<1582){
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
