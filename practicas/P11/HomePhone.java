public class HomePhone extends TwoWay implements Fixed {
 	
 	private String address;
 	public HomePhone( String serialNum, String num, Exchange e, String addr){
 	
 	super( serialNum, num, e );
 		SetAddress( addr );
 	}
 
 	public String toString() {
 		return super.toString()+" A:"+address;
 	}
 
 	public void SetAddress( String addr ) {
 		address = addr;
 	}
}