public class PruebaClases{
	
	public static void main(String[] args) {
		
		Interfono [] intersec={
			new Interfono("2096XA", 2),
			new Interfono("2097XA", 3),
		};
		Exchange e =new Exchange();
		Celular [] celulares={
			new Celular("XEADE3232", "5596874123", e),
			new Celular("XEQWE9572", "5578725496", e),
		};

	 	intersec[0].ConnectTo( intersec[1]);
		intersec[1].ConnectTo( intersec[0]);
	 	intersec[0].SetAddress( "PATIO" );
	 	intersec[1].SetAddress( "COCINA" );
	 	System.out.println(intersec[0].toString());
	 	System.out.println(intersec[1].toString());

		celulares[0].Dial ("5578725496");
		celulares[1].Ring();
		celulares[0].OnOff();
		celulares[1].OnOff();
		System.out.println(celulares[0].toString());
		System.out.println(celulares[1].toString());

	}

}