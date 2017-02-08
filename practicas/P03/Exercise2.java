import java.util.Scanner;
/*The java.util.Scanner class is a simple text scanner
*which can parse primitive types and strings using regular expressions.
*/
public class Exercise2{
  public static void main(String[] args) {

      short numero;
      Scanner lee = new Scanner(System.in);

      do {
          System.out.print("Dame un numero entre 1 y 1000: " );
          numero=lee.nextShort();
          if (numero>0 && numero<1001)
              System.out.println("El numero "+ numero +" es: "+ ((numero%2==0)?"par (even)":"impar (odd)") +'\n' );
      } while (numero<1 || numero>1000);
  }
}
