public class TestFecha{
	
	public static void main(String[] args) {
	
		FechaSistema fecha1=new FechaSistema();
		fecha1.obtenerFecha();

		FechaSistema fecha2=new FechaSistema(12);
		fecha2.obtenerFecha();		

		FechaSistema fecha3=new FechaSistema(12,8);
		fecha3.obtenerFecha();

	}
	
}