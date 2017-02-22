import java.io.*;

public class Mediana {

  public static void main (String [] args){

    int tamanoArreglo=0;
    int mediana=0;
    String alfaNum="0";
    int [] cantidades;

    System.out.println();
    System.out.println("El siguiente programa calcula la mediana de numeros impares.");

    tamanoArreglo=pideNumeroImpar(alfaNum);
    cantidades=llenaArreglo(alfaNum, tamanoArreglo);
    ordenaNumeros(cantidades,tamanoArreglo);
    mediana=calculaMediana(cantidades, tamanoArreglo);
    imprimePantalla(cantidades, tamanoArreglo, mediana);

  }//endMain

  public static int [] llenaArreglo(String numeroIntroducido, int numeros) {

    int numeroArreglo=0, i=0, j=0, contador=numeros;
    int [] arregloNumerosMediana= new int [contador];

    System.out.println();
    do {
        System.out.print("Favor de introducir el numero "+ (j+1) + " : " );
        numeroArreglo=convierteNumero(leeCadena());
        if(numeroArreglo!=-1){
          arregloNumerosMediana[i]=numeroArreglo;
          i+=1;
          j+=1;
        }

    } while (i!=contador);

    return arregloNumerosMediana;
  }//end pideNumeroImpar

  public static int pideNumeroImpar(String numeroIntroducido) {

    int numeroImpar=0;

    do {
        System.out.println();
        System.out.println("Favor de introducir un numero impar");
        numeroIntroducido=leeCadena();
        numeroImpar=convierteNumero(numeroIntroducido);

        if (numeroImpar%2==0 || numeroImpar<0){
          numeroImpar=-1;
          System.out.println("Solo calcula la mediana para valores impares positivos" + "\n");
        }//end_if

    } while (numeroImpar==-1);

    return numeroImpar;
  }//end pideNumeroImpar

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


  public static int [] ordenaNumeros (int []valores, int cantidad){

    int mayor=0;
    for (int i=0; i<(cantidad-1) ;i+=1 ) {
      for (int j=0; j<(cantidad-1);j+=1 ) {
          if (valores[j]>valores[j+1]) {
            mayor=valores[j];
            valores[j]=valores[j+1];
            valores[j+1]=mayor;
          }//endif
      }//endforj
    }//endfori
  return valores;
  }//endordenaNumeros

  public static int calculaMediana (int[] valores, int cantidad){

    return valores[(cantidad-1)/2];

  }//endcalculaMediana

  public static void imprimePantalla (int [] valores, int cantidad, int mediana) {
    System.out.println();
    for (int i=0;i<cantidad ; i+=1 ) {
      System.out.print(valores[i] + ", ");
    }//endfor
    System.out.println();
    System.out.print("La mediana es: " + mediana+ "\n");
  }//endimprimePantalla

}//endMediana
