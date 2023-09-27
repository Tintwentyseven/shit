package Example3;

public class MTRestaurants implements IRestaurants {

	@Override
	public String toString() {
		return "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || ! (obj instanceof MTRestaurants))
		return false;
		return true;
	}
	
	

}
