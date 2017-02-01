public class exercise2 {
    static byte Uno;
    static short _dos02;
    static int $tres3;
    static long cuatro;
    static double $_real;
    static char _$5;
    static boolean ValVerdad;
    static String s6;

    public static void main(String[] args) {
        long Tinicial = 0, Tfinal=0;

        Tinicial = System.currentTimeMillis();
        System.out.println("Valor de tipo de dato primitivo numerico entero byte es: " + Uno);
        System.out.println("Valor de tipo de dato primitivo numerico entero short es: " + _dos02);
        System.out.println("Valor de tipo de dato primitivo numerico entero int es: " + $tres3);
        System.out.println("Valor de tipo de dato primitivo numerico entero long es: " + cuatro);
        System.out.println("Valor de tipo de dato primitivo numerico real double es: " + $_real);
        System.out.println("Valor de tipo de dato primitivo numerico entero char es:" + _$5);
        System.out.println("Valor de tipo de dato primitivo numerico entero boolean es: " + ValVerdad);
        System.out.println(" ");
        System.out.println("Valor de tipo de dato referenciado .clases string es: " + s6);  
        System.out.println( );
        Tfinal = System.currentTimeMillis();
        System.out.format("Tiempo de ejecucion: %d ms %n", Tfinal - Tinicial);
    }
}
