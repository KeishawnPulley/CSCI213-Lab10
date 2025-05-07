// Car.java
// 
// Author: Keishawn Pulley
// Date: May 7th, 2025
//
//

public Car extends Vehicle {
	private int doors;
	private int passengers;
	
	public Car(String make, String model, String plate, String doors, String passengers) {
		super(make, model, plate);
		this.doors = doors;
		this.passengers = passengers;
	}
		
	public int getDoors() {
		return doors;
	}
		
	public int getPassengers() {
		return passengers;
	}
		
	public String toString() {
		return doors + "-door" + getMake() + " " + getModel() + "with license" + getPlate();
		
	public boolean equals(Object obj) {
		if(!(obj instanceof Car))
			return false;
	}
		Car other = (Car) obj
		return this.doors == other.doors &&
			   this.passengers == other.passengers &&
			   super.equals(other);
	}
	
	public Car copy() {
		return new Car(getMake(), getModel(), getPlate(), getDoors(), get.Passsengers());
	}
}
			   

		
