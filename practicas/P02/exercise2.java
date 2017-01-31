public class exercise2 {
    static byte Uno = 0;
    static short _dos02 = 0;
    static int $tres3 = 0;
    static long cuatro = 0;
    static double $_real = 0.0;
    static char _$5 = '\u0000';
    static boolean ValVerdad = false;
    static String s6 = null;

    public static void main(String[] arrstring) {
        long Tinicial = 0, Tfinal=0;

        Tinicial = System.currentTimeMillis();
        System.out.println("Valor de tipo de dato primitivo numerico entero byte es: " + Uno);
        System.out.println("Valor de tipo de dato primitivo numerico entero short es: " + _dos02);
        System.out.println("Valor de tipo de dato primitivo numerico entero int es: " + $tres3);
        System.out.println("Valor de tipo de dato primitivo numerico entero long es: " + cuatro);
        System.out.println("Valor de tipo de dato primitivo numerico real double es: " + $_real);
        System.out.println("Valor de tipo de dato primitivo numerico entero char es: " + _$5);
        System.out.println("Valor de tipo de dato primitivo numerico entero boolean es: " + ValVerdad);
        System.out.println(" ");
        System.out.println("Valor de tipo de dato referenciado .clases string es: " + s6);
        System.out.println( );
        Tfinal = System.currentTimeMillis();
        System.out.format("Tiempo de ejecucion: %d seg. %n", Tfinal - Tinicial);
    }
}
