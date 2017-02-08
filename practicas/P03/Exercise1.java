public class Exercise1 {

  public static void main (String[] args){

    byte  result=0;

    // compund assignments
    System.out.println("result vale ahora: " + (result+=3));
    System.out.println("result vale ahora: " + (result-=1));
    System.out.println("result vale ahora: " + (result*=2));
    System.out.println("result vale ahora: " + (result/=2));
    System.out.println("result vale ahora: " + (result*=5));
    System.out.println("result vale ahora: " + (result%=7));
  }

}
