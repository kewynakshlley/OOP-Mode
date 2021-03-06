package decorator;

import decorator.coffeeTypes.TraditionalCoffee;
import decorator.decorators.ChocolateDecorator;
import decorator.decorators.MilkDecorator;

public class Test {

	public static void main(String[] args) {
		Drink traditionalCoffee = new TraditionalCoffee();
		traditionalCoffee = new ChocolateDecorator(traditionalCoffee);
		traditionalCoffee = new MilkDecorator(traditionalCoffee);
		System.out.println("Description: " + traditionalCoffee.getDescription());
		System.out.println("Cost: " + traditionalCoffee.getCost());
		

	}

}
