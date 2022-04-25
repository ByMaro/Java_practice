
public abstract class Store {
		protected String name;
		protected String event;
		protected double price;
		
		public abstract double grade();
		
		public String getName() {
			return name;
		}
		
		public String getEvent(){
			return event;
		}
		
		public double getPrice() {
			return price;
		}
	}
