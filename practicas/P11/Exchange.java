import java.util.*;

public class Exchange extends LinkedList<TwoWay> {
	public TwoWay find( String num ) {
 		for ( int i = 0; i < size(); i++ ) {
 			if ( get(i).number().equalsIgnoreCase( num ) ) {
 				return get( i );
 			}
 		}
 		return null;
 	}
}
