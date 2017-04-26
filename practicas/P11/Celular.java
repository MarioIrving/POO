public class Celular extends TwoWay implements Mobile {

	private Boolean on;

	public Celular (String serialNum,String num, Exchange e ){
		super(serialNum, num, e);
		on =false;
	}

	public	Boolean Dial (String n){
		if (!on())
			return false;
		return super.Dial(n);
	}

	public Boolean ReceiveMessage (Intercomunicador sender, String m){

		if(!on)
			return false;
		return super.ReceiveMessage(sender, m);
	}

	public void Ring(){
		if(!on)
			return;
		super.Ring(this);
	}

	public Boolean OnOff(){
		on=!on;
		if (!on)
			EndCall();
		return on;

	}

	public Boolean on (){
		return on;
	}

	public String toString(){
		return super.toString()+"on: "+on;
	}
}
