package basketballManager;

/**
 * Author: 	Belinda St.
 * Date: 	10.01.2019
 */

public class CenterPlayer extends Player {
    CenterPlayer(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age, number, defending, passing, shooting, pace, dribbling);
    }

    @Override
    public String toString() {
        return "======== CenterPlayer =========\n" +
                this.getName() + ", " + this.getAge() + " Jahre\n" +
                "Player Number: " + this.getNumber() + "\n" +
                "Shooting: " + this.getShooting() + "\tPassing: " + this.getPassing() + "\n" +
                "Pace: " + this.getPace() + "\t\tDefending: " + this.getDefending() + "\n" +
                "Dribbling: " + this.getDribbling() +
                "\n============================="
                ;
    }
}
