/**
 * 
 */
package Example2;


public class MTLog implements ILog {

	@Override
	public String toString() {
		
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLog))
		return false;
		return true;
	}
	
	

}
