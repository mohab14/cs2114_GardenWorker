package CS2114.gardernmanger;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * This is test method for the WorkBehind.
 *
 *@author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version Dec 1, 2014
 */
public class testWorkBehind
    extends TestCase
{

    private WorkBehind testGame;


    public void setUp()
    {
        testGame = new WorkBehind();
    }


    /**
     * This si a test method to test the glovesClicked
     */
    public void testglovesClicked()
    {
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        assertEquals(testGame.choosePlant.isPlantDead(), true);
        assertEquals(testGame.getAppleBasket(), 0);

        testGame = new WorkBehind();
        testGame.choosePlant.addGrowth();
        testGame.glovesClicked();
        assertEquals(testGame.getAppleBasket(), 0);
        testGame.choosePlant.addGrowth();
        testGame.choosePlant.addGrowth();
        testGame.glovesClicked();
        assertEquals(testGame.getAppleBasket(), 12);

    }


    public void testwaterClicked()
    {
        // Test the plant dead case.

        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        assertEquals(testGame.choosePlant.isPlantDead(), true);
        testGame.waterClicked();
        assertEquals(testGame.choosePlant.getWater(), 0);

        // Test the not dead case.

        assertEquals(GrowthStage.Seeding, testGame.choosePlant.getGrowth());
        assertEquals(0, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertEquals(5, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertEquals(10, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertEquals(15, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertEquals(20, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertEquals(25, testGame.choosePlant.getWater());

        testGame.choosePlant.addWater();
        assertFalse(testGame.choosePlant.getWater() == 30);

    }


    /**
     * This is a test method for the fertilizer Clicked.
     */
    public void testfertilizerClicked()
    {
        // Test the plant dead case.

        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        assertEquals(testGame.choosePlant.isPlantDead(), true);
        testGame.fertilizerClicked();
        assertEquals(testGame.choosePlant.getFertilizer(), 0);

        // Test the alive plant case.
        assertEquals(GrowthStage.Seeding, testGame.choosePlant.getGrowth());
        assertEquals(0, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertEquals(5, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertEquals(10, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertEquals(15, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertEquals(20, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertEquals(25, testGame.choosePlant.getFertilizer());

        testGame.choosePlant.addFertilizer();
        assertFalse(testGame.choosePlant.getFertilizer() == 30);

        // //-------------------------------------------

    }


    /**
     * This is a test method about the scissor clicked.
     */
    public void testscissorClicked()
    {
        // Test the plant
        testGame.choosePlant.addWeed();
        testGame.choosePlant.addWeed();
        testGame.choosePlant.addWeed();
        testGame.scissorClicked();
        assertEquals(testGame.choosePlant.getWeed(), 2);

        // Test the plant dead case.

        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        testGame.choosePlant.dropQuality();
        assertEquals(testGame.choosePlant.isPlantDead(), true);

        testGame.scissorClicked();
        assertEquals(testGame.choosePlant.getWeed(), 2);

    }


    /**
     * This is a method to get test get the basket.
     */
    public void testgetBasket()
    {

        assertEquals(testGame.getAppleBasket(), 0);
        testGame.choosePlant.addGrowth();
        testGame.glovesClicked();
        assertEquals(testGame.getAppleBasket(), 0);
        testGame.choosePlant.addGrowth();
        testGame.choosePlant.addGrowth();
        testGame.glovesClicked();
        assertEquals(testGame.getAppleBasket(), 12);
    }
    public void testGame()
    {
        testGame.appleTree.addWeed();
        testGame.rose.addWeed();
        testGame.appleTree.addWeed();
        testGame.rose.addWeed();
        testGame.chooseRose();
        testGame.scissorClicked();
        assertEquals(testGame.rose.getWeed(),1);
        assertEquals(testGame.appleTree.getWeed(),2);
        testGame.chooseAppleTree();
        testGame.scissorClicked();
        assertEquals(testGame.appleTree.getWeed(),1);


    }
}
