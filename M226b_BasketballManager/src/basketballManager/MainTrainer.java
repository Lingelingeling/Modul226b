package basketballManager;

/**
 * Author: 	Belinda St.
 * Date: 	10.01.2019
 */

import java.util.List;

public class MainTrainer extends Trainer implements Managable{

    private int manageExperience;

    MainTrainer(String name, int age, int trainExperience, int manageExperience) {
        super(name, age, trainExperience);
        this.manageExperience = manageExperience;
    }

    public int getManageExperience() {
        return manageExperience;
    }

    public void setManageExperience(int manageExperience) {
        this.manageExperience = manageExperience;
    }

    /*
    public Player addPlayer(Player player, Team team){

    }
    */
    public void removePlayer(Player player, Team team){
        List<Player> playerList = team.getPlayers();
        playerList.remove(player);
    }

    @Override
    public void trainDefense() {

    }

    @Override
    public void trainPassing() {

    }

    @Override
    public void trainShooting() {

    }

    @Override
    public void trainPace() {

    }

    @Override
    public void trainDribbling() {

    }
}
