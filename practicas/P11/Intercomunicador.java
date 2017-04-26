public abstract class Intercomunicador {
 	
 	private String serialNum;
 	public Intercomunicador( String n ){
 	serialNum = new String( n );
	}
 	protected abstract Boolean SendMessage( String m );
 	protected abstract Boolean ReceiveMessage( Intercomunicador sender,
	String m );
 	public String toString(){
 		return serialNum;
 	}
 	public String serialNum(){
 		return serialNum;
 	}
}