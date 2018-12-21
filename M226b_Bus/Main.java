import java.util.Scanner;

public class Main {

	static BusTerminal busTerminal = new BusTerminal("terminalname");
	
	private static void generateNewTrip(int buschoice, int platformToPlan) {
		
		Bus placeHolderBus = busTerminal.getNotOccupiedBus(buschoice);
		Platform placeHolderPlatform = busTerminal.getNotOccupiedPlatform(platformToPlan);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What destination will this trip go to?");
		String destination = scanner.nextLine();
		System.out.println("What time will the bus depart?");
		String departuretime = scanner.nextLine();
		System.out.println("What time should the bus arrive");
		String arrivaltime = scanner.nextLine();
		System.out.println("Bus service? [national/international]");
		String busservice = scanner.nextLine();
		placeHolderBus.setOccupied(true);
		placeHolderPlatform.setTravel(destination, departuretime, arrivaltime, busservice);
		placeHolderPlatform.setOccupied(true);
		placeHolderPlatform.setBus(placeHolderBus);
        scanner.close();
		
		
	}
	
	public static void main(String[] args) {
		
		Bus bus1 = new Bus("model1", "lp1", "bustype1", 1, "comfort1", false);
		Bus bus2 = new Bus("model2", "lp2", "bustype2", 2, "comfort2", false);
		Bus bus3 = new Bus("model3", "lp3", "bustype3", 3, "comfort3", false);
		Bus bus4 = new Bus("model4", "lp4", "bustype4", 4, "comfort4", false);
		
		Platform platform1 = new Platform("dest1", "dest1", "dest1", "dest1", 1, 1.0, true, bus1);
		Platform platform2 = new Platform("dest2", "dest2", "dest2", "dest2", 2, 2.0, true, bus2);
		Platform platform3 = new Platform(null, null, null, null, 3, 3.0, false, null);
		Platform platform4 = new Platform(null, null, null, null, 4, 4.0, false, null);
		
		bus1.setOccupied(true);
		bus2.setOccupied(true);
		
		busTerminal.addBus(bus1);
		busTerminal.addBus(bus2);
		busTerminal.addBus(bus3);
		busTerminal.addBus(bus4);
		busTerminal.addPlatform(platform1);
		busTerminal.addPlatform(platform2);
		busTerminal.addPlatform(platform3);
		busTerminal.addPlatform(platform4);
	
//		busTerminal.printBus();
//		busTerminal.printPlatform();
		
		boolean continueprogram = true;
		
		while(continueprogram == true) {
			System.out.println("Check time [1], generate new trip [2], quit [3]");
			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();
			
			if(option == 1) {
				System.out.println("Checking time");
				System.out.println("---------------------------\n");
				busTerminal.printOccupiedPlatforms();
			} else if (option == 2) {
				System.out.println("Generating new trip");
				System.out.println("---------------------------\n");
				System.out.println("----- ALL AVAILABLE BUSES -----");
				busTerminal.printNotOccupiedBus();
				System.out.println("Which bus will you choose?");
				int buschoice = scanner.nextInt();
				System.out.println("----- ALL AVAILABLE PLATFORMS -----");
				busTerminal.printNotOccupiedPlatforms();
				System.out.println("Which platform will you choose?");
				int platformToPlan = scanner.nextInt();
				generateNewTrip(buschoice, platformToPlan);
			} else if (option == 3) {
				continueprogram = false;
			}
			
		}

		
	}
	
}
