public abstract class TwoWay extends Intercomunicador {
 	
 	public static final Integer IDLE=0;
 	public static final Integer BUSY=1;
 	public static final Integer RINGING=2;
 	private Integer state;
 	private String number;
 	private Exchange ownExchange;
 	private TwoWay other;
 
 	public TwoWay( String serialNum, String num, Exchange e ){
 
 		super( serialNum );
 		state = IDLE;
 		number = num;
 		ownExchange = e;
 		other = null;
 		ownExchange.add( this );
	 }

	public Boolean Dial( String num ){
 		if( state != IDLE ) 
 			return false;
 		other = ownExchange.find( num );
 		if( other == null ) 
 			return false;
 		if( !other.Ring( this ) ) 
 			return false;
 		state = BUSY;
 		
 		return true;
 	}

 	public void EndCall(){
 		other.CallEnded();
 		CallEnded();
 	}

 	public void CallEnded(){
 		state = IDLE;
 		other = null;
 	}

	public Boolean Ring( TwoWay sender ){
 		if( sender == this ) return false;
 		if( state != IDLE ) return false;
 			state = RINGING;
 			other = sender;
 		return true;
 	}

 	public void AnswerCall( String m ){
 		if( state != RINGING ) return;
 		state = BUSY;
 		SendMessage( m );
 	}

	public String number(){
 		return number;
 	}

 	public Boolean SendMessage( String m ){
 		if( state != BUSY ) return false;
 		if( other == null ) return false;
 		return other.ReceiveMessage( this, m );
 	}

 	protected Boolean ReceiveMessage( Intercomunicador sender, String m ){
 		if( state != BUSY ) return false;
 			System.out.println(
		"\nr:" + this.toString() +
		"\ns:" + sender.toString() +
		"\nm:" + m );
 		return true;
 	}

 	public String toString(){
 		String [] s = {"IDLE","BUSY","RINGING"};
 		return super.toString()+" #:"+number + " s:" + s[state];
 	}
}