
public class Bus extends Vehicle {

	private String busType;
	private int passengerCapacity;
	private String comfort;
	private boolean occupied;

	public Bus(String model, String licensePlate, String busType, int passengerCapacity, String comfort, boolean occupied) {
		super(model, licensePlate);
		this.occupied = occupied;
		this.busType = busType;
		this.passengerCapacity = passengerCapacity;
		this.comfort = comfort;
	}
	
	public void print() {
		System.out.println("----- BUS INFO -----");
		System.out.println("Passenger Capacity: " + passengerCapacity);
		System.out.println("Comfort: " + comfort);
		super.print();
	}
	
	public void printNotOccupied(int number) {
		if(occupied == false) {
			System.out.println("BUS [" + number + "] ;");
			System.out.println("Bus type: " + busType);
			System.out.println("Passenger Capacity: " + passengerCapacity);
			System.out.println("Comfort: " + comfort);
			super.print();
		}
	}
	
	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public String getComfort() {
		return comfort;
	}

	public void setComfort(String comfort) {
		this.comfort = comfort;
	}

	public boolean getOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
}
