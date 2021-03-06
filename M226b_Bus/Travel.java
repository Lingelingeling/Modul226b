
public class Travel {

	private String destination;
	private String departureTime;
	private String arrivalTime;
	private String busService;
	
	public Travel(String destination, String departureTime, String arrivalTime, String busService) {
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.busService = busService;
	}
	
	public void print() {
		System.out.println("----- TRAVEL INFO -----");
		System.out.println("Destination: " + destination);
		System.out.println("Departure time: " + departureTime);
		System.out.println("Bus service: " + busService);
		System.out.print("\n");
	}
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getBusService() {
		return busService;
	}
	public void setBusService(String busService) {
		this.busService = busService;
	}
	
}
