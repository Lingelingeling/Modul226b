
public class Platform {
	
	private Bus bus;
	private Travel travel;
	private int number;
	private double size;
	private boolean occupied;

	public Platform(String destination, String departureTime, String arrivalTime, String busService, int number, double size, boolean occupied, Bus bus){
		travel = new Travel(destination, departureTime, arrivalTime, busService);
		this.bus = bus;
		this.number = number;
		this.size = size;
		this.occupied = occupied;
	}

	public void print() {
		System.out.println("Platform number: " + number);
		System.out.println("Size: " + size);
		System.out.println("Occupied: " + occupied);
		System.out.println("----------------------------------\n");
	}
	
	public void printOccupied() {
		bus.print();
		travel.print();
		System.out.println("----------------------------------\n");
	}
	
	public void printNotOccupied(int numberr) {
		System.out.println("PLATFORM [" + numberr + "] ;");
		System.out.println("Platform number: " + number);
		System.out.println("Size: " + size);
		System.out.println("Occupied: " + occupied);
		System.out.println("----------------------------------\n");
	}
	
	public void setTravel(String destination, String departureTime, String arrivalTime, String busService) {
		travel = new Travel(destination, departureTime, arrivalTime, busService);
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public boolean getOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
