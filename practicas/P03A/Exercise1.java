import java.util.Scanner;

public class Exercise1{

  public static void main(String[] args) {

    Scanner lee= new Scanner(System.in);
    byte n=0;
    float driveDistances[], currentGasLevel=0, avgMileage=0, distanciaTotal=0;
    boolean gasprediction;

    //distancia de millas
    do {

      System.out.print("Cuantos viajes realizo el Uber, en estas 12 horas (maximo 10 viajes)?");
      n=lee.nextByte();
      System.out.println();

        if (n>0 && n<11) {
          driveDistances= new float [n];

            for (int i=0; i<n; i+=1) {

              do{

                System.out.print("Cual fue la distancia del viaje " + i + " (minimo 4.0 maximo 120.0 millas) :");
                driveDistances[i]=lee.nextFloat();
                distanciaTotal+=driveDistances[i];

              } while(driveDistances[i]<4.0 || driveDistances[i]>120.0);

            }
        }
    } while (n<1 || n>10);

    System.out.println();
    //Nivel de gasolina

    do {

      System.out.print("El nivel actual de gasolina es: (valores de 0.25 a 10 galones)?");
      currentGasLevel=lee.nextFloat();
      System.out.println();

    } while (currentGasLevel<0.25 || currentGasLevel>10);

    //promedio de millas

    do {

      System.out.print("Cual es el promedio de millas del vehiculo: (valores de 1.0 a 60.0 millas por galon)?");
      avgMileage=lee.nextFloat();

      System.out.println();

    } while (avgMileage<1 || avgMileage>60);

    gasprediction=(currentGasLevel< (distanciaTotal/avgMileage)/12);
    System.out.print("Se debe recargar gasolina: "+ gasprediction);
    System.out.println();

  }

}
