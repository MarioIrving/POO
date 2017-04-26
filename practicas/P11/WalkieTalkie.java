public class WalkieTalkie extends OneWay implements Mobile {
 	
 	private Boolean on;
 	public WalkieTalkie( String serialNum, Integer id ){
 	
 	super( serialNum, id );
 		on = false;
 	}
 
 	public void Push(){
 		if( !on ) return;
 		super.Push();
 	}

 	public void Release(){
 		if( !on ) return;
 		super.Release();
 	}

 	public Boolean SendMessage( String m ){
 		if( !on ) return false;
 		return super.SendMessage( m );
 	}

 	protected Boolean ReceiveMessage( Intercomunicador sender, String m ){
 		if( !on ) return false;
 		return super.ReceiveMessage(sender, m);
 	}

 	public Boolean OnOff(){
 		on = !on;
 		return on;
 	}

 	public Boolean on() {
 		return on;
 	}

  	public String toString(){
 		return super.toString() + " on:" + on;
 	}
 }