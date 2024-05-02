package bookpublication;

import java.io.Serializable;

public class Car implements Display,Serializable{
    private String colour;
    private int horsepower;
    private double weight;

    public Car(String colour, int horsepower, double weight) {
        this.colour = colour;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    public Car() {
		// TODO Auto-generated constructor stub
	}

	public void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Weight: " + weight);
    }

    public void print() {
        display();
    }
}
