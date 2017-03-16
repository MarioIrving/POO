import java.io.*;

public class Calculadora{

     private float operando1, operando2, total, numeroFloat;
     private String numeroString;
     private int numeroInt;

    public void ImprimeMenu(){
      System.out.println("1.- sumar");
      System.out.println("2.- restar");
      System.out.println("3.- multiplicar");
      System.out.println("4.- dividir");
      System.out.println("5.- salir");
    }

    public void PreguntaOpcion (){
      if(numeroInt!=5){
        System.out.print("Seleccione la opcion deseada: ");
        numeroString=leeCadena();
        convierteInt();
      }
    }

    public void convierteFloat(){
        try{
          numeroFloat=Float.parseFloat(numeroString);
        } catch (NumberFormatException e) {}
    }

    public void EvaluaFloat(){
      do {
        System.out.println("Favor de ingresar solo numeros");
        System.out.print("Dame el dato nuevamente: ");
        leeCadena();
        numeroFloat=Float.parseFloat(numeroString);
      } while (Float.isNaN(numeroFloat));
    }

    public void convierteInt(){
        try{
          numeroInt=Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {}
    }


    public void PreguntaDatos(){
      if(numeroInt!=5){
        System.out.print("Dato 1: ");
        leeCadena();
        convierteFloat();
        //EvaluaFloat();
        operando1=numeroFloat;
        System.out.print("Dato 2: ");
        leeCadena();
        convierteFloat();
        //EvaluaFloat();
        operando2=numeroFloat;
      }
    }

    public void HacerOperaciones(){
      if (numeroInt==1)
        Sumar();
      else if(numeroInt==2)
        Resta();
      else if(numeroInt==3)
        Multiplica();
      else if(numeroInt==4)
        Divide();
    }

    public void Sumar(){
        total=operando1+operando2;
    }
    public void Resta(){
      total=operando1-operando2;
    }
    public void Multiplica(){
      total=operando1*operando2;
    }

    public void Divide(){
      if(operando2!=0)
        total=operando1/operando2;
      else{
          System.out.println("Error");
          numeroInt=5;
      }
  }

    public void ImprimeResultado(){
      if(numeroInt!=5){
        System.out.print("Resultado: ");
        System.out.println(total);
      }
    }
    public String leeCadena(){
        InputStreamReader isr= new InputStreamReader (System.in);
        BufferedReader flujoE=new BufferedReader(isr);
        try  {
            numeroString=flujoE.readLine();
        } catch (IOException e) {}
        return numeroString;
    }
}
