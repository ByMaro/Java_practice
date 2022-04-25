
public class Restaurant extends Store {
	private double service;
	private double flavor;
	private double clean;
	
	public Restaurant(String name, String event, double service, double flavor, double clean, double price) {
		this.name = name;
		this.event = event;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
		this.price = price;
	}
	
	public double grade() {	
		return Math.round((service+flavor+clean+price)/4.0*100.0)/100.0;
	}

	public double getService() {
		return service;
	}

	public double getFlavor() {
		return flavor;
	}

	public double getClean() {
		return clean;
	}
	
}