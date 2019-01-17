package basketballManager;

/**
 * Authors: Belinda Sc. 
 * Date: 	10.01.2019
 */

public abstract class Trainer extends Person implements Trainable{

    private int trainExperience;

    Trainer(String name, int age, int trainExperience) {
        super(name, age);
        this.trainExperience = trainExperience;
    }

    public int getTrainExperience() {
        return trainExperience;
    }

    public void setTrainExperience(int trainExperience) {
        this.trainExperience = trainExperience;
    }

	/**
	 * Function to increase the Defense of the chosen Player (Used in Main)
	 */
    public void trainDefense(Player player){
        int stat = player.getDefending();
        stat += 2;
        player.setDefending(stat);
    }
    
    /**
     * Function to increase the Passing of the chosen Player (Used in Main)
     */
    public void trainPassing(Player player){
        int stat = player.getPassing();
        stat += 2;
        player.setPassing(stat);
    }
    
    /**
     * Function to increase the Shooting of the chosen Player (Used in Main)
     */
    public void trainShooting(Player player){
        int stat = player.getShooting();
        stat += 2;
        player.setShooting(stat);
    }
    
    /**
     * Function to increase the Pace of the chosen Player (Used in Main)
     */
    public void trainPace(Player player){
        int stat = player.getPace();
        stat += 2;
        player.setPace(stat);
    }
    
    /**
     * Function to increase the Dribbling of the chosen Player (Used in Main)
     */
    public void trainDribbling(Player player){
        int stat = player.getDribbling();
        stat += 2;
        player.setDribbling(stat);
    }
}

