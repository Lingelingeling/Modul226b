package basketballManager;

/**
 * Author: 	Belinda St.
 * Date: 	10.01.2019
 */

public class ShootingGuard extends Player {

	ShootingGuard(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age, number, defending, passing, shooting, pace, dribbling);
    }

    @Override
    /**
     * Function to show the information of the ShootingGuards (Used in Main)
     */
    public String toString() {
        return "======== ShootingGuard =========\n" +
                this.getName() + ", " + this.getAge() + " Year(s)\n" +
                "Player Number: " + this.getNumber() + "\n\n" +
                "Shooting: " + this.getShooting() + "\tPassing: " + this.getPassing() + "\t" +
                "Dribbling: " + this.getDribbling() +
                "\nPace: " + this.getPace() + "\tDefending: " + this.getDefending() + "\n" +
                
                "\n==================================================="
                ;
    }
}
