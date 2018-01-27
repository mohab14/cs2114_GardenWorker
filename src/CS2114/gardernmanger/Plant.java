package CS2114.gardernmanger;

import java.util.EmptyStackException;
import java.util.Stack;

// -------------------------------------------------------------------------
/**
 * Plant is a class in which the object has 6 properties (data fields): water,
 * fertilizer, weed, fruit, growthStack, and qualityStack. You will be able to
 * water the plant, add fertilizer to it, remove its weeds, and harvest its
 * fruits. As the player plays with the plant, he or she must growth the plant
 * and make it reach its 4 and final growth stage, which is Flowering, so the
 * user would be able the harvest the fruits. In order to reach to a higher
 * level of growth stage, you must completely grow the plant in its lower level.
 * These are the growth stages, in which a plant must pass: Seeding -->
 * Transplanting --> Vegetation --> Flowering The plant also has a quality stack
 * in which it shows the well being of the plant. If the plant has a lot of
 * weeds, therefore its quality is very bad. These are the quality stages for a
 * plant: Putrid --> Bad --> Normal --> Good --> VeryGood --> Perfect If the
 * plants quality is at Putrid and the number of its weeds increases, the plant
 * would be dead and the game is over.
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version 2014.11.15
 */
public class Plant
{
    /**
     * A plant needs water
     */
    public int                water;

    /**
     * A plant needs fertilizer
     */
    public int                fertilizer;

    /**
     * Weeds always grow which stops the growth of plant
     */
    public int                weed;

    /**
     * A plant produces fruits
     */
    public int                fruit;

    /**
     * A plants grows from one stage to another, this growth is done in a stack
     * mechanism.
     */
    public Stack<GrowthStage> growthStack;

    /**
     * A plant has a quality in which this quality is running in a stack
     * mechanism.
     */
    public Stack<Quality>     qualityStack;


    /**
     * A constructor that creates a new plant object with all field set to 0.
     * Also growth is set to seeding level and quality is setup to perfect
     * level. It also gets the default number of fruits the plant can produce.
     *
     * @param defaultFruit
     *            the default number of fruit it produces
     */
    public Plant(int defaultFruit)
    {
        this.water = 0;
        this.fertilizer = 0;
        this.weed = 0;
        this.fruit = defaultFruit;
        this.growthStack = new Stack<GrowthStage>();
        this.qualityStack = new Stack<Quality>();

        // the plant initially growth from Seeding level
        this.growthStack.push(GrowthStage.Seeding);

        // Fill out the quality stack with all 6 quality levels, so the plant is
        // started with "perfect" quality.
        this.qualityStack.push(Quality.Putrid);
        this.qualityStack.push(Quality.Bad);
        this.qualityStack.push(Quality.Normal);
        this.qualityStack.push(Quality.Good);
        this.qualityStack.push(Quality.Perfect);

    }


    // ----------------------------------------------------------
    /**
     * Gets water level of the plant
     *
     * @return
     */
    public int getWater()
    {
        return this.water;

    }


    // ----------------------------------------------------------
    /**
     * Gets default number of fruits from the plant
     *
     * @return
     */
    public int getFruit()
    {
        return this.fruit;
    }


    // ----------------------------------------------------------
    /**
     * Gets weed level of the plant
     *
     * @return this.weed the value of weed
     */
    public int getWeed()
    {
        return this.weed;
    }


    // ----------------------------------------------------------
    /**
     * Gets weed fertilizer level of the plant
     *
     * @return this.fertilizer the value of fertilizer
     */
    public int getFertilizer()
    {
        return this.fertilizer;
    }


    // ----------------------------------------------------------
    /**
     * Gets growth level of the plant
     *
     * @return this.growthStack.peek the item at the peek of the growth stack
     */
    public GrowthStage getGrowth()
    {
        return this.growthStack.peek();
    }


    // ----------------------------------------------------------
    /**
     * Gets size of growth stack
     *
     * @return this.growthStack.size the size of the growth stack
     */
    public int getGrowthSize()
    {
        return this.growthStack.size();
    }


    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @return this.qualityStack.peek the item at the peek of the quality stack
     */
    public Quality getQuality()
    {
        return this.qualityStack.peek();
    }


    // ----------------------------------------------------------
    /**
     * Gets size of quality stack
     *
     * @return this.quality.size() the size of the quality stack
     */
    public int getQualitySize()
    {
        return this.qualityStack.size();
    }


    // ----------------------------------------------------------
    /**
     * Sets water to a value.
     *
     * @param a
     */
    public void setWater(int a)
    {
        this.water = a;
    }


    // ----------------------------------------------------------
    /**
     * Sets fruit to a value.
     *
     * @param a
     */
    public void setFruit(int a)
    {
        this.fruit = a;
    }


    // ----------------------------------------------------------
    /**
     * Sets weed to a value.
     *
     * @param a
     */
    public void setWeed(int a)
    {
        this.weed = a;
    }


    // ----------------------------------------------------------
    /**
     * Sets fertilizer to a value.
     *
     * @param a
     */
    public void setFertilizer(int a)
    {
        this.fertilizer = a;
    }


    // ----------------------------------------------------------
    /**
     * Sets growth stage to a value of type GrowthStage.
     *
     * @param nGrowthStage
     */

    public void setGrowth(GrowthStage nGrowthStage)
    {
        this.growthStack.push(nGrowthStage);
    }


    // ----------------------------------------------------------
    /**
     * Sets quality to a value of type Quality.
     *
     * @param nQuality
     */
    public void setQuality(Quality nQuality)
    {
        this.qualityStack.push(nQuality);
    }


    // ----------------------------------------------------------
    /**
     * A helper method to add 5 units of water to the plant
     */
    public void addWater()
    {
        // If the plant is at seeding stage and the value of water is less
        // than 25, add 5 more units to water
        if (this.getGrowth().equals(GrowthStage.Seeding)
            && this.getWater() < 25)
        {
            this.setWater(this.getWater() + 1);
        }

        // If the plant is at transplanting stage and the value of water is
        // less than 50, add 5 more units to water
        else if (this.getGrowth().equals(GrowthStage.Transplanting)
            && this.getWater() < 50)
        {
            this.setWater(this.getWater() + 1);
        }

        // If the plant is at vegetation stage and the value of water is
        // less than 75, add 5 more units to water
        else if (this.getGrowth().equals(GrowthStage.Vegetation)
            && this.getWater() < 75)
        {
            this.setWater(this.getWater() + 1);
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method to add 5 unit of fertilizer to the plant
     */
    public void addFertilizer() // TOTEST
    {
        // If the plant is at seeding stage and the value of fertilizer is less
        // than 25, add 5 more units to fertilizer
        if (this.getGrowth().equals(GrowthStage.Seeding)
            && this.getFertilizer() < 25)
        {
            this.setFertilizer(this.getFertilizer() + 1);
        }

        // If the plant is at transplanting stage and the value of fertilizer is
        // less than 50, add 5 more units to fertilizer
        else if (this.getGrowth().equals(GrowthStage.Transplanting)
            && this.getFertilizer() < 50)
        {
            this.setFertilizer(this.getFertilizer() + 1);
        }

        // If the plant is at vegetation stage and the value of fertilizer is
        // less than 75, add 5 more units to fertilizer
        else if (this.getGrowth().equals(GrowthStage.Vegetation)
            && this.getFertilizer() < 75)
        {
            this.setFertilizer(this.getFertilizer() + 1);
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method to remove one unit of weed from the plant
     */
    public void removeWeed()
    { // if the plant is not at flowering stage and the weed value is more
      // than 0, decrement the weed value for one unit.
        if (!this.getGrowth().equals(GrowthStage.Flowering) && this.weed > 0)
        {
            --this.weed;
            addQuality();
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method to add one unit to the weed
     */
    public void addWeed()
    {
        // if the plant is not at flowering stage and the weed value is less
        // than 5, increment the weed value for one unit.
        if (!this.getGrowth().equals(GrowthStage.Flowering) && getWeed() < 5)
        {
            ++this.weed;
            dropQuality();
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method in which it
     */
    public void addGrowth()
    {
        if (growthStack.size() == 1
            && growthStack.peek() == GrowthStage.Seeding)
        {
            setGrowth(GrowthStage.Transplanting);
        }

        else if (growthStack.size() == 2
            && growthStack.peek() == GrowthStage.Transplanting)
        {
            setGrowth(GrowthStage.Vegetation);
        }

        else if (growthStack.size() == 3
            && growthStack.peek() == GrowthStage.Vegetation)
        {
            setGrowth(GrowthStage.Flowering);
        }
    }


    // ----------------------------------------------------------
    // ----------------------------------------------------------
    /**
     * A helper method in which add a quality state to the quality stack
     * depending on the size of the stack and state of quality. An order is
     * defined between each quality state.
     */
    public void addQuality()
    {

        // if the stack size is 1 and the quality is putrid, set quality to bad.
        if (qualityStack.size() == 1 && qualityStack.peek() == Quality.Putrid)
        {
            setQuality(Quality.Bad);
        }

        // if the stack size is 2 and the quality is bad, set quality to normal.
        else if (qualityStack.size() == 2 && qualityStack.peek() == Quality.Bad)
        {
            setQuality(Quality.Normal);
        }

        // if the stack size is 3 and the quality is normal, set quality to
        // good.
        else if (qualityStack.size() == 3
            && qualityStack.peek() == Quality.Normal)
        {
            setQuality(Quality.Good);
        }

        // if the stack size is 4 and quality is good, set quality to perfect.
        else if (qualityStack.size() == 4
            && qualityStack.peek() == Quality.Good)
        {
            setQuality(Quality.Perfect);
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method
     */
    public void dropQuality()
    {
        // if the quality size is not zero, then drop the quality one level down
        if (qualityStack.size() != 0)
        {
            this.qualityStack.pop();
        }

    }


    // ----------------------------------------------------------
    /**
     * A helper method to reset the plant to vegetation. When we harvest the
     * fruits of a plant, the plant turns back to its vegetation stage. The
     * water and fertilizer level should be set to 50 units.
     */
    public void resetToVegetation()
    {
        // if the plant is at flowering stage ...
        if (getGrowth() == GrowthStage.Flowering)
        {
            // set growth stack to Vegetation by popping out Flowering
            growthStack.pop();

            // water and fertilizer start from 50 and weed reset to 0.
            setWater(50);
            setFertilizer(50);
            setWeed(0);
        }
    }


    // ----------------------------------------------------------
    /**
     * A helper method to figure out if the plant is dead or not
     *
     * @return true is the quality stack is empty or false otherwise
     */
    public boolean isPlantDead()
    {
        return qualityStack.size() == 0;
    }


    // ----------------------------------------------------------
    // ----------------------------------------------------------
    /**
     * A helper method to check the growth level of the plant. This method
     * automatically grows the plant to its upper stage if the plant meets
     * specific conditions of each growth level.
     */
    public void checkGrowth()
    {
        // if the water and fertilizer are equal
        // to 25 units and the weed equal zero, grow up to transplanting.
        if (getWater() == 25 && getFertilizer() == 25 && getWeed() == 0
            && getGrowth() == GrowthStage.Seeding)
        {
            addGrowth();
        }

        // if the water and fertilizer are
        // equal to 50 units and the weed equal zero, grow up to vegetation.
        else if (getWater() == 50 && getFertilizer() == 50 && getWeed() == 0
            && getGrowth() == GrowthStage.Transplanting)
        {
            addGrowth();
        }

        // if the water and fertilizer are
        // equal to 75 units and the weed equal zero, grow up to flowering.
        else if (getWater() == 75 && getFertilizer() == 75 && getWeed() == 0
            && getGrowth() == GrowthStage.Vegetation)
        {
            addGrowth();
        }

    }

}
