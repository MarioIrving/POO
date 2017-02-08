import java.util.Scanner;
public class Exercise4 {

  public static void main(String[] args) {

      Scanner lee = new Scanner(System.in);
      String  mes= "\u0000";

      System.out.print("Dame un mes del ano en minusculas: ");
      mes=lee.nextLine();

      switch (mes) {

        case "enero":
            System.out.println("Al mes " + mes + " le corresponde el numero 1.");
            break;
        case "febrero":
            System.out.println("Al mes " + mes + " le corresponde el numero 2.");
            break;
        case "marzo":
            System.out.println("Al mes " + mes + " le corresponde el numero 3.");
            break;
        case "abril":
            System.out.println("Al mes " + mes + " le corresponde el numero 4.");
            break;
        case "mayo":
            System.out.println("Al mes " + mes + " le corresponde el numero 5.");
            break;
        case "junio":
            System.out.println("Al mes " + mes + " le corresponde el numero 6.");
            break;
        case "julio":
            System.out.println("Al mes " + mes + " le corresponde el numero 7.");
            break;
        case "agosto":
            System.out.println("Al mes " + mes + " le corresponde el numero 8.");
            break;
        case "septiembre":
            System.out.println("Al mes " + mes + " le corresponde el numero 9.");
            break;
        case "octubre":
            System.out.println("Al mes " + mes + " le corresponde el numero 10.");
            break;
        case "noviembre":
            System.out.println("Al mes " + mes + " le corresponde el numero 11.");
            break;
        case "diciembre":
            System.out.println("Al mes " + mes + " le corresponde el numero 12.");
            break;
        default:
            System.out.println("Gracias, pero lo introducido no es un valor valido.");
            break;
      }
  }
}
