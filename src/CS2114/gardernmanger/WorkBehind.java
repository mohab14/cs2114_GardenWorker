package CS2114.gardernmanger;

import java.util.Stack;

/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version 2014.11.15
 */
public class WorkBehind
{
    public Plant choosePlant;

    public Plant appleTree;
    public Plant rose;

    private int  appleBasket;
    private int  roseBasket;


    // private int FruitBasket

    // we need a place to store the fruit we collected from each plant
    // ----------------------------------------------------------
    /**
     * Create a new WorkBehind object.
     */
    public WorkBehind()
    {
        // cherry = new Plant(20);
        appleTree = new Plant(12);
        appleBasket = 0;
        rose = new Plant(1);
        roseBasket = 0;
        choosePlant = new Plant(0);
        this.chooseAppleTree();
        // must be able to change the picture for apple tree in each stage.
        // may need to create an apple tree class that
        // extends plant.
        // how to load the harvested apples in the appleBasket (need a method)
    }


    /**
     * This method is harvests the fruit when they are available.
     */
    public void glovesClicked()

    {
        if (!choosePlant.isPlantDead())
        {
            if (choosePlant.getGrowthSize() == 4)
            {
                if (choosePlant == appleTree)
                {
                    appleBasket += choosePlant.getFruit();
                }

                else if (choosePlant == rose)
                {
                    roseBasket += choosePlant.getFruit();
                }

                choosePlant.resetToVegetation();
            }
        }
    }


    /**
     * Water adds to the designated plant. It's part of the game requirement to
     * grow the plant.
     */
    public void waterClicked()
    {
        if (!choosePlant.isPlantDead())
        {
            choosePlant.addWater();
        }

    }


    /**
     * Fertilizer adds to the designated plant. It's also part of the game
     * requirement to grow the plant.
     */
    public void fertilizerClicked()
    {
        if (!choosePlant.isPlantDead())
        {
            choosePlant.addFertilizer();
        }

    }


    /**
     * When scissors icon is clicked will remove weed from the plant. Or else,
     * the plant dies.
     */
    public void scissorClicked()
    {
        if (!choosePlant.isPlantDead())
        {
            choosePlant.removeWeed();
        }

    }


    /**
     * This method is for the apple tree which will system point current plant
     * as the apple tree.
     */
    public void chooseAppleTree()
    {
        choosePlant = appleTree;

    }


    /**
     * This method is for the apple tree which will system point current plant
     * as the apple tree.
     */
    public void chooseRose()
    {
        choosePlant = rose;

    }


    /**
     * This is get basket method which will contain whatever is harvested.
     */
    public int getAppleBasket()
    {

        return appleBasket;

    }


    /**
     * This is get basket method which will contain whatever is harvested.
     */
    public int getRoseBasket()
    {

        return roseBasket;

    }

}
