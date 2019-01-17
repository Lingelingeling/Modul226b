package basketballManager;

/**
 * Author: 	Belinda St.
 * Date: 	10.01.2019
 */

public abstract class Player extends Person{

    private int number;
    private int defending;
    private int passing;
    private int shooting;
    private int pace;
    private int dribbling;

    Player(String name, int age, int number, int defending, int passing, int shooting, int pace, int dribbling) {
        super(name, age);
        this.number = number;
        this.defending = defending;
        this.passing = passing;
        this.shooting = shooting;
        this.pace = pace;
        this.dribbling = dribbling;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getDribbling() {
        return dribbling;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    @Override
    /**
     * Function to show the information of all Players in the chosen team
     */
    public String toString() {
        return "=============================\n" +
                this.getName() + ", " + this.getAge() + " Year(s)\n" +
                "Player Number: " + this.getNumber() + "\n\n" +
                "Shooting: " + this.getShooting() + "\tPassing: " + this.getPassing() + "\t" +
                "Dribbling: " + this.getDribbling() +
                "\nPace: " + this.getPace() + "\tDefending: " + this.getDefending() + "\n" +
                
                "\n==================================================="
                ;
    }
}
