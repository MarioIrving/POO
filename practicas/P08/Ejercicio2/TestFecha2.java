public class TestFecha2{
	
	public static void main(String[] args) {
	
		FechaSistema2 fecha1=new FechaSistema2();
		FechaSistema2 fecha2=new FechaSistema2(10);
		
		fecha1.obtenerFecha();
		fecha2.obtenerFecha();

		fecha1=null;

			System.gc();
		
		fecha2.obtenerFecha();

	}
	
}