public class Exercise1 {

	public static boolean incorrectPasscodeAttempts(String passcode, String[] attempts){

		int contador=0;
		boolean resultado=false;

		for (int i=0;i<attempts.length; i+=1) {

				if (contador<10) {
					if (passcode==attempts[i])
						contador=0;
					else
						contador +=1;
				resultado= false;
				} else
					resultado= true;
   		}
		return resultado;
	}
}
