public class exercise1 {

  public static void main(String[] args){

      byte Uno=127;
      short _dos02= 32767;
      int $tres3= 2147483647;
      long cuatro=9223372036854775807l;
      char _$5='2';

      String s6="null";
      String siete= "hola java";

      long Tinicio=0, Tfinal=0;

      Tinicio=System.currentTimeMillis();

      System.out.println("Valor de tipo de dato primitivo numerico entero byte es: " + Uno);
      System.out.println("Valor de tipo de dato primitivo numerico entero short es: " + _dos02);
      System.out.println("Valor de tipo de dato primitivo numerico entero int es: " + $tres3);
      System.out.println("Valor de tipo de dato primitivo numerico entero long es: " + cuatro);
      System.out.println("Valor de tipo de dato primitivo numerico entero char es: " + _$5);
      System.out.println( );
      System.out.println("Valor de tipo de dato referenciado .clases string es: " + s6);
      System.out.println("Valor de tipo de dato referenciado .clases string es: " + siete);

      Tfinal=System.currentTimeMillis();

      System.out.format("Tiempo de ejecucion: %d ms %n", Tfinal-Tinicio);
  }


}
