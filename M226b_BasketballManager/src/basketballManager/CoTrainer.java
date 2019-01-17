package basketballManager;

/**
 * Author: 	Belinda Sc. 
 * Date: 	10.01.2019
 */

public class CoTrainer extends Trainer {

    CoTrainer(String name, int age, int trainExperience) {
        super(name, age, trainExperience);
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

    @Override
    public String toString() {
        return "=============================\n" +
                "Name: " + this.getName() + "\n" +
                "Age: " + this.getAge() + "\n" +
                "Train-Experience: " + this.getTrainExperience() + "\n" +
                "=============================\n";
    }
}
