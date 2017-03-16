import java.io.*;
public class Diccionario{

    String [] palabrasEspaniol=new String[100];
    String [] palabrasIngles=new String[100];
    String palabraString;
    int contador;

  public void crearDiccionario(){

    System.out.println("Creacion de Diccionario");

    for (int i=0; i<100; i+=1){

      System.out.print("Dame la palabra en Espanol: ");
      leeCadena();

      if(palabraString.length()<=40){
        palabrasEspaniol[i]=palabraString;

        System.out.print("Dame su traduccion en ingles: ");
        leeCadena();

        if(palabraString.length()<=40){
          palabrasIngles[i]=palabraString;
        } else{
          i-=1;
          System.out.println("La longitud permitida por palabra es de 40 caracteres");
          }
      } else{
        System.out.println("La longitud permitida por palabra es de 40 caracteres");
        i-=1;
      }

      System.out.println(" ");
      System.out.print("Quieres seguir capturando? (si / no): ");
      leeCadena();

      if (palabraString.compareTo("no")==0 || palabraString.compareTo("NO")==0 ){
        contador=i+1;
        break;
      }
      System.out.println(" ");
    }
  }

  public void Traducir(){
    do{

      System.out.println(" ");
      System.out.print("Dame la palabra a traducir: ");
      leeCadena();

      for (int i=0; i<contador; i+=1){

        if(palabraString.compareTo(palabrasEspaniol[i])==0){
          System.out.print(palabrasEspaniol[i]);
          System.out.print(" ");
          System.out.print(palabrasIngles[i]);
          System.out.println(" ");
          break;
        }
      }

      //if (i==contador)
        //System.out.println("No se encontro la palabra");

      System.out.print("Quieres seguir buscando? (si / no): ");
      leeCadena();

    }while(palabraString.compareTo("no")!=0 || palabraString.compareTo("NO")!=0 );
  }

  public String leeCadena(){
    InputStreamReader isr= new InputStreamReader (System.in);
    BufferedReader flujoE=new BufferedReader(isr);
    try  {
        palabraString=flujoE.readLine();
    } catch (IOException e) {}
    return palabraString;
  }

  public static void main(String[] args) {

    Diccionario Dic01=new Diccionario();

    Dic01.crearDiccionario();
    Dic01.Traducir();

  }

}
