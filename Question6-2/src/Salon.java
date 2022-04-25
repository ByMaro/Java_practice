public class Salon extends Store {
	private double technology;
	private double kindness;
	
	public Salon(String name, String event, double technology, double kindness, double price) {
		this.name = name;
		this.event = event;
		this.technology = technology;
		this.kindness = kindness;
		this.price = price;
	}
	
	public double grade() {
		return Math.round((technology+kindness+price)/3.0*100.0)/100.0;
	}

	public double getTechnology() {
		return technology;
	}

	public double getKindness() {
		return kindness;
	}
	
}