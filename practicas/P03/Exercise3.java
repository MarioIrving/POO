import java.util.Scanner;

public class Exercise3 {

  public static void main(String[] args) {

    Scanner lee = new Scanner(System.in);
    byte numero=0;

      System.out.print("Dame un numero del 1 al 12 y te dire que mes le corresponde: ");
      numero=lee.nextByte();

      if (numero==1)
        System.out.println("El numero " + numero + " le corresponde el mes de enero");
        else if (numero==2)
          System.out.println("El numero " + numero + " le corresponde el mes de febrero");
        else if (numero==3)
          System.out.println("El numero " + numero + " le corresponde el mes de marzo");
        else if (numero==4)
          System.out.println("El numero " + numero + " le corresponde el mes de abril");
        else if (numero==5)
          System.out.println("El numero " + numero + " le corresponde el mes de mayo");
        else if (numero==6)
          System.out.println("El numero " + numero + " le corresponde el mes de junio");
        else if (numero==7)
          System.out.println("El numero " + numero + " le corresponde el mes de julio");
        else if (numero==8)
          System.out.println("El numero " + numero + " le corresponde el mes de agosto");
        else if (numero==9)
          System.out.println("El numero " + numero + " le corresponde el mes de septiembre");
        else if (numero==10)
          System.out.println("El numero " + numero + " le corresponde el mes de octubre");
        else if (numero==11)
          System.out.println("El numero " + numero + " le corresponde el mes de noviembre");
        else if (numero==12)
          System.out.println("El numero " + numero + " le corresponde el mes de diciembre");
        else
          System.out.println("Lo siento, no es un numero valido");
  }

}
