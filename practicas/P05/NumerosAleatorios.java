import java.io.*;
import java.util.Random;

public class NumerosAleatorios {

  public static void main(String[] args){

    int sizeArreglo=0;
    int sizeDigito=0;
    String numeroAlfanumericoArreglo="0";
    int [] arregloNumerosAleatorios;

    sizeArreglo=pideSizeArreglo(numeroAlfanumericoArreglo);
    sizeDigito=pideDigito(numeroAlfanumericoArreglo);
    arregloNumerosAleatorios=arrayNumeroAleatorios(sizeDigito, sizeArreglo);
    imprimeArreglo (sizeArreglo, arregloNumerosAleatorios);
    System.out.println();

  }//end_Main

public static void imprimeArreglo (int sizeArreglo, int []arregloNumerosAleatorios){

    System.out.println();
    System.out.println("Los numeros son:");
  for (int i=0; i<sizeArreglo;i+=1) {
    System.out.print(arregloNumerosAleatorios[i]+ ", ");
  }//end_for

}//end_imprimeArreglo

public static int [] arrayNumeroAleatorios (int sizeDigito, int sizeArreglo){

    int max=300, min=1, i=0, numeroAleatorio, contador=sizeArreglo, tempAleatorio;
    int [] numerosAlazar=new int [contador];
    Random rand= new Random();

    do {
      numeroAleatorio=rand.nextInt((max-min)+1)+min;
      tempAleatorio=numeroAleatorio-sizeDigito;

      if(tempAleatorio%10==0){
        numerosAlazar[i]=numeroAleatorio;
        i+=1;
      }
    } while (i!=contador);

    return numerosAlazar;

} //end_arrayNumeroAleatorios

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

public static int convierteNumero(String numeroAlfanumerico){

  int numero=0;

  try{
    numero=Integer.parseInt(numeroAlfanumerico);
    return numero;
  } catch (NumberFormatException e) {
      System.out.println("El valor ingresado es incorrecto.");
      //System.out.println(e);
      return -1;
  }// end_catch
}// end_validaTamanoArreglo

public static int pideSizeArreglo(String numeroAlfanumericoArreglo) {

  int sizeArreglo=0;

  do {
      System.out.println();
      System.out.println("Favor de introducir un numero valido de 1 a 30");
      System.out.println("De que tamano es tu arreglo?");
      numeroAlfanumericoArreglo=leeCadena();
      sizeArreglo=convierteNumero(numeroAlfanumericoArreglo);

      if (sizeArreglo<1 || sizeArreglo>30)
        sizeArreglo=-1;

  } while (sizeArreglo==-1);

  return sizeArreglo;
}//end pideSizeArreglo

public static int pideDigito(String numeroAlfanumericoArreglo) {

  int sizeDigito=0;

  do {
    System.out.println();
    System.out.println("Favor de introducir un numero valido de 0 al 9");
    numeroAlfanumericoArreglo=leeCadena();
        sizeDigito=convierteNumero(numeroAlfanumericoArreglo);
      if (sizeDigito<0 || sizeDigito>9)
        sizeDigito=-1;

  } while (sizeDigito==-1);

  return sizeDigito;
}//end_pideDigito

}//end_NumerosAleatorios
