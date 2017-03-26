public class PruebaClases {

	public static void main(String[] args) {
		
	float tarifaPensionadoMes;
    float tarifaPensionadoDia;
    float tarifaPensionadoSemana;
    float tarifaHora;
    float tarifaQuinceMin;
    float ingresaDinero;
    float retiraDinero;
    float dineroTotal;
    
    Lee lectura=new Lee ();
    Tarifa tarifa=new Tarifa();
    Caja cajita=new Caja();

    System.out.print("Dame la tarifa del mes para pensionados: ");
    tarifaPensionadoMes=lectura.leeFloat();
    tarifa.setTarifaPensionadoMes(tarifaPensionadoMes);
    System.out.println(tarifa.getTarifaPensionadoMes());

    System.out.print("Dame la tarifa del dia para pensionados: ");
    tarifaPensionadoDia=lectura.leeFloat();
    tarifa.setTarifaPensionadoDia(tarifaPensionadoDia);
    System.out.println(tarifa.getTarifaPensionadoDia());

    System.out.print("Dame la tarifa del semana para pensionados: ");
    tarifaPensionadoSemana=lectura.leeFloat();
    tarifa.setTarifaPensionadoSemana(tarifaPensionadoSemana);
    System.out.println(tarifa.getTarifaPensionadoSemana());

    System.out.print("Dame la tarifa hora: ");
    tarifaHora=lectura.leeFloat();
    tarifa.setTarifaHora(tarifaHora);
    System.out.println(tarifa.getTarifaHora());

    System.out.print("Dame la tarifa fraccion de quince minutos: ");
    tarifaQuinceMin=lectura.leeFloat();
    tarifa.setTarifaQuinceMin(tarifaQuinceMin);
    System.out.println(tarifa.getTarifaQuinceMin());

    System.out.print("Cuanto dinero ingresaras a la caja: ");
    ingresaDinero=lectura.leeFloat();
    cajita.setIngresaDinero(ingresaDinero);

    System.out.print("Cuanto dinero retiras de la caja: ");
    retiraDinero=lectura.leeFloat();
    cajita.setRetiraDinero(retiraDinero);

    System.out.print("En la caja hay: ");
    System.out.print(cajita.getDineroTotalCaja());


	}


}