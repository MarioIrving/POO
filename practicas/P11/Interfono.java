public class Interfono extends OneWay implements Fixed {
 	
 	private String address;
 	
 	public Interfono( String serialNum, Integer id ){
 		super( serialNum, id );
 	}
 
 	public void ConnectTo( Interfono x ){
 		super.AddListener( x );
 		x.AddListener( this );
 	}

 	public void SetAddress( String addr ) {
 		address = addr;
	}
 
 	public String toString(){
 		return super.toString() + " A: " + address;
 	}
}