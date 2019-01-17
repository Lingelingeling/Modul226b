package basketballManager;
/**
 * Author: 	Belinda St.
 * Date: 	10.01.2019
 */

import org.junit.Assert;
import org.junit.Test;

public class BasketballManagerTesting {

    @Test
    public void testShootingGuardInitializationWithS() {
        //Arrange
        Player shootingGuard = new ShootingGuard("Torben", 25, 1, 77, 56, 66, 45, 88);

        //Act
        Assert.assertEquals("Torben", shootingGuard.getName());
        Assert.assertEquals(25, shootingGuard.getAge());
        Assert.assertEquals(1, shootingGuard.getNumber());
        Assert.assertEquals(77, shootingGuard.getDefending());
        Assert.assertEquals(66, shootingGuard.getShooting());
        Assert.assertEquals(45, shootingGuard.getPace());
        Assert.assertEquals(56, shootingGuard.getPassing());
        Assert.assertEquals(88, shootingGuard.getDribbling());
    }

    @Test
    public void testPowerForwardInitialization() {
        //Arrange
        PowerForward powerForward = new PowerForward("Juaanson", 27, 11, 78, 76, 67, 91, 87);
        //Act
        Assert.assertEquals("Juaanson", powerForward.getName());
        Assert.assertEquals(27, powerForward.getAge());
        Assert.assertEquals(11, powerForward.getNumber());
        Assert.assertEquals(78, powerForward.getDefending());
        Assert.assertEquals(67, powerForward.getShooting());
        Assert.assertEquals(91, powerForward.getPace());
        Assert.assertEquals(76, powerForward.getPassing());
        Assert.assertEquals(87, powerForward.getDribbling());
    }

    @Test
    public void testCenterPlayerInitialization() {
        CenterPlayer centerPlayer = new CenterPlayer("Don", 33, 15, 83, 94, 74, 78, 76);
        Assert.assertEquals("Don", centerPlayer.getName());
        Assert.assertEquals(33, centerPlayer.getAge());
        Assert.assertEquals(15, centerPlayer.getNumber());
        Assert.assertEquals(83, centerPlayer.getDefending());
        Assert.assertEquals(74, centerPlayer.getShooting());
        Assert.assertEquals(78, centerPlayer.getPace());
        Assert.assertEquals(94, centerPlayer.getPassing());
        Assert.assertEquals(76, centerPlayer.getDribbling());
    }

    @Test
    public void testDefenderInitialization() {
        Defender defender = new Defender("Gilbert", 23, 77, 98, 65, 54, 88, 48);
        Assert.assertEquals("Gilbert", defender.getName());
        Assert.assertEquals(23, defender.getAge());
        Assert.assertEquals(77, defender.getNumber());
        Assert.assertEquals(98, defender.getDefending());
        Assert.assertEquals(65, defender.getShooting());
        Assert.assertEquals(88, defender.getPace());
        Assert.assertEquals(65, defender.getPassing());
        Assert.assertEquals(48, defender.getDribbling());
    }
}
