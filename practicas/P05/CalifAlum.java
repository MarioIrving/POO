import java.io.*;

public class CalifAlum {

    public static void main (String [] args){
      int noAlumnos=10;
      int j=1;
      double [] calificacionAlumnos=new double [noAlumnos];
      String [] nomAlumnos=new String [noAlumnos];
      String [] resPalabras=new String[noAlumnos];
      String numeroAlfanumerico="0";

      for (int i=0; i<noAlumnos; i+=1 ) {
          System.out.println();
          System.out.print("Dame el nombre del alumno " + j + ": ");
          nomAlumnos[i]=leeCadena();
          System.out.print("Dame la calificacion del alumno "+ j + " : ");
          calificacionAlumnos[i]=pideCalif(numeroAlfanumerico);
          resPalabras[i]=califPalabras(calificacionAlumnos[i]);
          //System.out.println(resPalabras[i]);
          j++;
      }//end for i
      imprimeArreglo(noAlumnos, calificacionAlumnos, nomAlumnos, resPalabras);

    }//end main

    public static void imprimeArreglo (int noAlumnos, double [] calificacionAlumnos, String [] nomAlumnos, String [] resPalabras ){

        System.out.println();
        System.out.println("Las calificaciones son:");
        for (int i=0; i<noAlumnos;i+=1) {
          System.out.print(nomAlumnos[i] + ", " + calificacionAlumnos[i] + " , " + resPalabras[i] );
          System.out.println();
        }//end_for

    }//end_imprimeArreglo

    public static String califPalabras(double calificacionAlumnos){

      String status="0";

      if (calificacionAlumnos==0 || calificacionAlumnos<5)
        status="reprobado";
      else if (calificacionAlumnos==5 || calificacionAlumnos<7)
        status="bien";
      else if (calificacionAlumnos==7 || calificacionAlumnos<9)
        status="notable";
      else if (calificacionAlumnos==9 || calificacionAlumnos<10.1)
        status="sobresaliente";
      return status;
    }// end califPalabras

    public static String leeCadena(){

            InputStreamReader isr= new InputStreamReader (System.in);
            BufferedReader flujoE=new BufferedReader(isr);
            //PrintStream flujoS= System.out;
            String sDato=null;
          try  {
            sDato=flujoE.readLine();

          } catch (IOException e) {
              System.out.println(e);
            }

          return sDato;
    }//end_leeCadena

    public static double convierteNumero(String numeroAlfanumerico){

      double numero=0;

      try{
        numero=Double.parseDouble(numeroAlfanumerico);
        return numero;
      } catch (NumberFormatException e) {
          System.out.println("El valor ingresado es incorrecto.");
          //System.out.println(e);
          return -1;
      }// end_catch
    }// end_validaTamanoArreglo

    public static double pideCalif(String numeroIntroducido) {

      double calificacion=0;

      do {
          numeroIntroducido=leeCadena();
          calificacion=convierteNumero(numeroIntroducido);

          if (calificacion<0 || calificacion>10){
            calificacion=-1;
            System.out.println("Los valores aceptables van del 0 al 10" + "\n");
            System.out.print("Ingresa nuevamente su calificacion: ");
          }//end_if

      } while (calificacion==-1);

      return calificacion;
    }//end pidecalificacion

}// end CalifAlum
