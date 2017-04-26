import java.util.*;
public abstract class OneWay extends Intercomunicador {
 	
 	static final Integer LISTEN=0;
 	static final Integer TALK=1;
 	private Integer state;
 	protected LinkedList<OneWay> listeners;
 	Integer identity;
 
 	public OneWay( String serialNum, Integer id ){
		super( serialNum );
 		identity = id;
 		state = LISTEN;
 		listeners = new LinkedList<OneWay>();
 	}

 	public void Push(){
		state = TALK;
 	}

 	public void Release(){
 		state = LISTEN;
 	}

	protected Boolean AddListener( OneWay listener ){
 		return listeners.add( listener );
 	}

 	protected void RemoveListener( OneWay x ){
		listeners.remove(x);
 	}

 	public Boolean SendMessage( String m ){
 		Boolean success=true;
 		for( Integer i=0; i<listeners.size(); i++ )
 		success = success && listeners.get( i ).ReceiveMessage( this, m );
 			return success;
 	}

 	protected Boolean ReceiveMessage( Intercomunicador sender, String m ){
 		if( state != LISTEN ) return false;
 		System.out.println(
		 "\ns:" + sender.toString() +
 		"\nr:" + this.toString() + "\nm:" + m );
 		return true;
 	}

 	public String toString(){
 		String [] s = {"LISTEN","TALK"};
 		return super.toString()+" id:"+identity + " s:" + s[state];
 	}
}



