import java.util.ArrayList;

public class BusTerminal {

	private ArrayList<Bus> buslist;
	private ArrayList<Platform> platformlist;
	private String terminalName;
	
	public BusTerminal(String terminalName) {
		this.terminalName = terminalName;
		buslist = new ArrayList<Bus>();
		platformlist = new ArrayList<Platform>();
	}
	
	public void addBus(Bus bus) {
		buslist.add(bus);
	}
	
	public void addPlatform(Platform platform) {
		platformlist.add(platform);
	}
	
	public void printBus() {
		for(Bus bus : buslist) {
			bus.print();
		}
	}
	
	public void printPlatform() {
		for(Platform platform : platformlist) {
			platform.print();
		}
	}
	
	public void printOccupiedPlatforms() {
		for(Platform platform : platformlist) {
			if(platform.getBus() != null) {
				platform.printOccupied();
			}
		}
	}
	
	public void printNotOccupiedBus() {
		int number = 1;
		for(Bus bus : buslist) {
			if(bus.getOccupied() == false) {
				bus.printNotOccupied(number);
				number++;
			}
		}
	}
	
	public void printNotOccupiedPlatforms() {
		int number = 1;
		for(Platform platform : platformlist) {
			if(platform.getBus() == null) {
				platform.printNotOccupied(number);
				number++;
			}
		}
	}
	
	public Bus getNotOccupiedBus(int number) {
		int i = 1;
		for(Bus bus : buslist) {
			if(bus.getOccupied() == false) {
				if(i == number) {
					return bus;
				}
				i++;
			}
		}
		return null;
	}
	
	public Platform getNotOccupiedPlatform(int number) {
		int i = 1;
		for(Platform platform : platformlist) {
			if(platform.getBus() == null) {
				if(i == number) {
					return platform;
				}
				i++;
			}
		}
		return null;
	}
	
	public void setPlatform(ArrayList<Platform> platform) {
		this.platformlist = platform;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	
}
