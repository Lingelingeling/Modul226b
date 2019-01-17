package basketballManager;

/**
 * Author: 	Belinda Sc. 
 * Date: 	10.01.2019
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainManagerSimulator {

	public static void main(String[] args) {

		List<Player> playersPistons = generatePlayerPistons();
		List<Player> playersRaptors = generatePlayerRaptors();
		CoTrainer johannes = generateCoTrainer("Johannes", 36, 59);
		CoTrainer antonio = generateCoTrainer("Antonio", 29, 50);
		MainTrainer rui = generateMainTrainer("Rui", 39, 77, 50);
		MainTrainer patrick = generateMainTrainer("Patrick", 45, 85, 70);
		Team pistons = generateTeam("Detroit Pistons", "Premier League");
		Team raptors = generateTeam("Toronto Raptors", "Premier League");

		pistons.setPlayers(playersPistons);
		pistons.setCoTrainer(johannes);
		pistons.setMainTrainer(rui);

		raptors.setPlayers(playersRaptors);
		raptors.setCoTrainer(antonio);
		raptors.setMainTrainer(patrick);

		Scanner scanTeamSelection;
		boolean validResponse = true;
		String teamSelection = "";

		do {
			scanTeamSelection = new Scanner(System.in);
			System.out.println("====================================");
			System.out.println("Welcome to the Basketball Manager 2019");
			System.out.println("====================================");
			System.out.println(
					"Choose your team!\n[1] " + pistons.getName() + "\n[2] " + raptors.getName() + "\n[x] End Program");

			teamSelection = scanTeamSelection.nextLine();
			switch (teamSelection) {
			case "1":
				selectionInTeam(pistons);
				break;
			case "2":
				selectionInTeam(raptors);
				break;
			case "x":
				System.out.println("Bye Bye");
				validResponse = false;
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				validResponse = true;
				break;
			}
		} while (validResponse);
	}

	private static Team generateTeam(String name, String league) {
		return new Team(name, league);
	}

	public static List<Player> generatePlayerPistons() {
		List<Player> playerList = new ArrayList<>();

		playerList.add(new ShootingGuard("Albert", 27, 1, 76, 78, 70, 68, 55));
		playerList.add(new Defender("Hendrik", 25, 2, 87, 71, 66, 73, 69));
		playerList.add(new Defender("Jonas", 25, 19, 87, 71, 66, 73, 69));
		playerList.add(new Defender("Torben", 23, 3, 84, 74, 72, 78, 83));
		playerList.add(new Defender("Damjan", 31, 4, 86, 76, 65, 81, 74));
		playerList.add(new CenterPlayer("Digo", 18, 69, 65, 89, 79, 44, 33));
		playerList.add(new PowerForward("Silvio", 23, 15, 43, 91, 91, 91, 95));
		playerList.add(new PowerForward("Dino", 39, 11, 29, 81, 85, 88, 89));
		playerList.add(new PowerForward("Reggie", 27, 18, 21, 79, 86, 85, 80));
		return playerList;
	}

	public static List<Player> generatePlayerRaptors() {
		List<Player> playerList = new ArrayList<>();

		playerList.add(new ShootingGuard("Jimmy", 35, 99, 46, 67, 63, 56, 49));
		playerList.add(new Defender("Yannick", 24, 5, 91, 67, 56, 86, 76));
		playerList.add(new Defender("Cris", 17, 16, 81, 79, 47, 75, 87));
		playerList.add(new Defender("Mark", 25, 31, 82, 81, 43, 79, 77));
		playerList.add(new CenterPlayer("Andreas", 23, 24, 78, 89, 83, 71, 85));
		playerList.add(new PowerForward("Ali", 26, 12, 37, 82, 93, 83, 91));
		playerList.add(new PowerForward("Sebastian", 22, 13, 41, 86, 88, 92, 93));
		playerList.add(new PowerForward("Stefan", 22, 45, 41, 86, 88, 92, 93));
		return playerList;
	}

	private static CoTrainer generateCoTrainer(String name, int age, int trainExperience) {
		return new CoTrainer(name, age, trainExperience);
	}

	private static MainTrainer generateMainTrainer(String name, int age, int trainExperience, int manageExperience) {
		return new MainTrainer(name, age, trainExperience, manageExperience);
	}

	private static void selectionInTeam(Team team) {
		boolean tryAgain = true;
		Scanner scanTeamOptions = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("============= " + team + " ===============");
			System.out.println("[1] View Team");
			System.out.println("[2] Co-Trainer");
			System.out.println("[3] Main Trainer");
			System.out.println("[b] Back to Team Selection");
			String response = scanTeamOptions.nextLine();

			switch (response) {
			case "1":
				enteringTeam(team);
				break;
			case "2":
				enteringCoTrainer(team);
				break;
			case "3":
				enteringMainTrainer(team);
				break;
			case "b":
				tryAgain = false;
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				tryAgain = true;
				break;
			}
		}
	}

	private static void enteringTeam(Team team) {
		boolean tryAgain = true;
		Scanner scanViewTeam = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("========== Players ==========");
			System.out.println("[1] View whole Team");
			System.out.println("[2] View ShootingGuards");
			System.out.println("[3] View Defenders");
			System.out.println("[4] View CenterPlayers");
			System.out.println("[5] View PowerForwards");
			System.out.println("[b] Back");
			String response = scanViewTeam.nextLine();

			switch (response) {
			case "1":
				for (Player player : team.getPlayers()) {
					System.out.println(player.toString());
				}
				break;
			case "2":
				for (Player player : team.getPlayers()) {
					if (player instanceof ShootingGuard) {
						System.out.println(player.toString());
					}
				}
				break;
			case "3":
				for (Player player : team.getPlayers()) {
					if (player instanceof Defender) {
						System.out.println(player.toString());
					}
				}
				break;
			case "4":
				for (Player player : team.getPlayers()) {
					if (player instanceof CenterPlayer) {
						System.out.println(player.toString());
					}
				}
				break;
			case "5":
				for (Player player : team.getPlayers()) {
					if (player instanceof PowerForward) {
						System.out.println(player.toString());
					}
				}
				break;
			case "b":
				tryAgain = false;
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				tryAgain = true;
				break;
			}
		}
	}

	private static void enteringCoTrainer(Team team) {
		boolean tryAgain = true;
		Scanner scanViewCoTrainer = new Scanner(System.in);

		while (tryAgain) {
			System.out.println("============ Co-Trainer ============");
			System.out.println("[1] View Co-Trainer Info");
			System.out.println("[2] Train Player");
			System.out.println("[b] Back");
			String response = scanViewCoTrainer.nextLine();

			switch (response) {
			case "1":
				System.out.println(team.getCoTrainer().toString());
				break;
			case "2":
				getPlayerByNumber(team, team.getCoTrainer());
				break;
			case "b":
				tryAgain = false;
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				tryAgain = true;
				break;
			}
		}
	}

	private static void enteringMainTrainer(Team team) {
		boolean tryAgain = true;
		Scanner scanViewMainTrainer = new Scanner(System.in);

		while (tryAgain) {
			System.out.println("============ Main-Trainer ============");
			System.out.println("[1] View Main-Trainer Info");
			System.out.println("[2] Train Player");
			System.out.println("[b] Back");

			String response = scanViewMainTrainer.nextLine();

			switch (response) {
			case "1":
				System.out.println(team.getMainTrainer().toString());
				break;
			case "2":
				getPlayerByNumber(team, team.getMainTrainer());
				break;
			case "b":
				tryAgain = false;
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				tryAgain = true;
				break;
			}
		}
	}

	private static Player getPlayerByNumber(Team team, Trainer trainer) {
		Scanner scanPlayerNumber = new Scanner(System.in);
		// showAllPlayers(team.getPlayers());
		Player selectedPlayer = null;
		System.out.println("Which Player do you want to train? Type his Player Number");
		int playerNumber = Integer.valueOf(scanPlayerNumber.nextLine());
		for (Player player : team.getPlayers()) {
			if (player.getNumber() == playerNumber)
				trainSelectedPlayer(player, trainer);

			selectedPlayer = player;
		}
		return selectedPlayer;

	}

	private static void trainSelectedPlayer(Player player, Trainer trainer) {
		boolean tryAgain = true;
		String response = null;
		Scanner scanTrainingOptions = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("Which Attribute do you want to train?");
			System.out.println("[1] Train defending (+2)");
			System.out.println("[2] Train shooting (+2)");
			System.out.println("[3] Train pace (+2)");
			System.out.println("[4] Train passing (+2)");
			System.out.println("[5] Train dribbling (+2)");
			System.out.println("[b] Back");
			response = scanTrainingOptions.nextLine();

			tryAgain = false;
			switch (response) {
			case "1":
				trainer.trainDefense(player);
				System.out.println("Player trained his defense");
				break;
			case "2":
				trainer.trainShooting(player);
				System.out.println("Player trained his Shooting");
				break;
			case "3":
				trainer.trainPace(player);
				System.out.println("Player trained his Pace");
				break;
			case "4":
				trainer.trainPassing(player);
				System.out.println("Player trained his passing");
				break;
			case "5":
				trainer.trainDribbling(player);
				System.out.println("Player trained his dribbling");
				break;
			case "b":
				break;
			default:
				System.out.println("Please enter a valid Option, try again\n");
				tryAgain = true;
			}
		}
	}

}

