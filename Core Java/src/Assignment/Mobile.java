package Assignment;

public class Mobile{

		String brand;
		int price;
		int ram;
		Mobile(String brand, int price, int ram)
		{
			this.brand=brand;
			this.price=price;
			this.ram=ram;
		}
		@Override
		public String toString() {
		
			return "{ Brand = "+brand+", price = "+price+", Ram = "+ram+" }";
		}
	}

