package enm;

public enum RoomType {
	
	GENERAL(1000), SPECIAL(2000), SEMISPECIAL(3000), ICU(5000);
	
	private double cost;

	private RoomType(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

}
