public class Prueba2{

public static void main(String[] args) {
	
		jugarConCelulares();
	
}
	private static void jugarConTwoWay( TwoWay celular1, TwoWay celular2) {

		if( celular1.Dial("5578725496") ) {
			celular2.AnswerCall("Bueno?");
			celular1.SendMessage("Se encuentra Han Solo");
			celular2.SendMessage("No, esta equivocado");
			celular1.SendMessage("Perdon, quien habla?");
			celular2.SendMessage("C-3PO");
			celular1.SendMessage("Bien, hablo mas tarde. Gracias");
			celular1.CallEnded();
		}
	}

	private static void encenderCelular( Mobile[] c ) {
		for ( int i = 0; i < c.length; i++ ) {
			if ( !c[i].on() ) {
				c[i].OnOff();
			}
		}
	}

	private static void jugarConCelulares() {
		Exchange e = new Exchange();
		Celular[] celulares = {
			new Celular( "IPHONE01", "5596874123", e ),
			new Celular( "IPHONE02", "5578725496", e ),
		};
		encenderCelular(celulares);
		jugarConTwoWay(celulares[0], celulares[1]);
	}
}