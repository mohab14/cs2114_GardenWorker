package CS2114.gardernmanger;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * This class tests all the methods present in the Plant class.
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version 2014.11.30
 */
public class testPlant
    extends TestCase
{

    /**
     * An apple tree object of type plant
     */
    private Plant appleTree;


    /**
     * Sets up the appleTree with default fruit of 12 for testing purposes
     */
    public void setUp()
    {
        appleTree = new Plant(12);
    }


    // ----------------------------------------------------------
    /**
     * Tests getWater method
     */
    public void testGetWater()
    {
        assertEquals(0, appleTree.getWater());
    }


    // ----------------------------------------------------------
    /**
     * Tests getFruit method
     */
    public void testGetFruit()
    {
        assertEquals(12, appleTree.getFruit());
    }


    // ----------------------------------------------------------
    /**
     * Tests getWeed method
     */
    public void testGetWeed()
    {
        assertEquals(0, appleTree.getWeed());
    }


    // ----------------------------------------------------------
    /**
     * Tests getFertilizer method
     */
    public void testGetFertilizer()
    {
        assertEquals(0, appleTree.getFertilizer());
    }


    // ----------------------------------------------------------
    /**
     * Tests getGrowth method
     */
    public void testGetGrowth()
    {
        assertEquals(GrowthStage.Seeding, appleTree.getGrowth());
    }


    // ----------------------------------------------------------
    /**
     * Tests getQuality method
     */
    public void testGetQuality()
    {
        assertEquals(Quality.Perfect, appleTree.getQuality());
    }


    // ----------------------------------------------------------
    /**
     * Tests setWater method
     */
    public void testSetWater()
    {
        appleTree.setWater(5);
        assertEquals(5, appleTree.getWater());
    }


    // ----------------------------------------------------------
    /**
     * Tests setFruit method
     */
    public void testSetFruit()
    {
        appleTree.setFruit(8);
        assertEquals(8, appleTree.getFruit());
    }


    // ----------------------------------------------------------
    /**
     * Tests setWeed method
     */
    public void testSetWeed()
    {
        appleTree.setWeed(5);
        assertEquals(5, appleTree.getWeed());
    }


    // ----------------------------------------------------------
    /**
     * Tests setFertilizer method
     */
    public void testSetFertilizer()
    {
        appleTree.setFertilizer(5);
        assertEquals(5, appleTree.getFertilizer());
    }


    // ----------------------------------------------------------
    /**
     * Tests setGrowth method
     */
    public void testSetGrowth()
    {
        appleTree.setGrowth(GrowthStage.Transplanting);
        assertEquals(GrowthStage.Transplanting, appleTree.getGrowth());
    }


    // ----------------------------------------------------------
    /**
     * Tests setQuality method
     */
    public void testSetQuality()
    {
        appleTree.setGrowth(GrowthStage.Transplanting);
        assertEquals(GrowthStage.Transplanting, appleTree.getGrowth());
    }


    // ----------------------------------------------------------
    /**
     * Tests addWater method
     */
    public void testAddWater()
    {
        assertEquals(GrowthStage.Seeding, appleTree.getGrowth());
        assertEquals(0, appleTree.getWater());

        appleTree.addWater();
        assertEquals(5, appleTree.getWater());

        appleTree.addWater();
        assertEquals(10, appleTree.getWater());

        appleTree.addWater();
        assertEquals(15, appleTree.getWater());

        appleTree.addWater();
        assertEquals(20, appleTree.getWater());

        appleTree.addWater();
        assertEquals(25, appleTree.getWater());

        appleTree.addWater();
        assertFalse(appleTree.getWater() == 30);

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Transplanting, appleTree.getGrowth());

        appleTree.addWater();
        assertEquals(30, appleTree.getWater());

        appleTree.addWater();
        assertEquals(35, appleTree.getWater());

        appleTree.addWater();
        assertEquals(40, appleTree.getWater());

        appleTree.addWater();
        assertEquals(45, appleTree.getWater());

        appleTree.addWater();
        assertEquals(50, appleTree.getWater());

        // extra
        appleTree.addWater();
        assertFalse(appleTree.getWater() == 55);

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Vegetation, appleTree.getGrowth());

        appleTree.addWater();
        assertEquals(55, appleTree.getWater());

        appleTree.addWater();
        assertEquals(60, appleTree.getWater());

        appleTree.addWater();
        assertEquals(65, appleTree.getWater());

        appleTree.addWater();
        assertEquals(70, appleTree.getWater());

        appleTree.addWater();
        assertEquals(75, appleTree.getWater());

        // extra
        appleTree.addWater();
        assertFalse(appleTree.getWater() == 80);
        assertEquals(75, appleTree.getWater());

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());
        assertEquals(75, appleTree.getWater());

        appleTree.addWater();
        assertFalse(appleTree.getWater() == 80);
        assertEquals(75, appleTree.getWater());
    }


    // ----------------------------------------------------------
    /**
     * Tests addFertilizer method
     */
    public void testAddFertilizer()
    {
        assertEquals(GrowthStage.Seeding, appleTree.getGrowth());
        assertEquals(0, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(5, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(10, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(15, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(20, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(25, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertFalse(appleTree.getFertilizer() == 30);

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Transplanting, appleTree.getGrowth());

        appleTree.addFertilizer();
        assertEquals(30, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(35, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(40, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(45, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(50, appleTree.getFertilizer());

        // extra
        appleTree.addFertilizer();
        assertFalse(appleTree.getFertilizer() == 55);

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Vegetation, appleTree.getGrowth());

        appleTree.addFertilizer();
        assertEquals(55, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(60, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(65, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(70, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertEquals(75, appleTree.getFertilizer());

        // extra
        appleTree.addFertilizer();
        assertFalse(appleTree.getFertilizer() == 80);
        assertEquals(75, appleTree.getFertilizer());

        // //-------------------------------------------

        appleTree.addGrowth();
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());
        assertEquals(75, appleTree.getFertilizer());

        appleTree.addFertilizer();
        assertFalse(appleTree.getFertilizer() == 80);
        assertEquals(75, appleTree.getFertilizer());
    }


    // ----------------------------------------------------------
    /**
     * Tests addWeed method
     */

    // test it later
    public void testAddWeed()
    {
        // ------->> test condition 1: weed < 5 [y], !Flowering [y]
        assertEquals(appleTree.getWeed(), 0);

        for (int i = 0; i < 5; i++)
        {
            appleTree.addWeed();
        }

        assertEquals(appleTree.getWeed(), 5);

        // ------->> test condition 2: weed < 5 [n], !Flowering [y]

        appleTree.addWeed();
        assertFalse(appleTree.getWeed() == 6);
        assertEquals(appleTree.getWeed(), 5);

        // ------->> test condition 3: weed < 5 [n], !Flowering [n]

        appleTree.removeWeed();// remove one weed and make it to 4
        assertEquals(appleTree.getWeed(), 4);

        appleTree.addGrowth();
        appleTree.addGrowth();
        appleTree.addGrowth();
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());

        // adding weed in flowering stage is
        appleTree.addWeed();
        assertFalse(appleTree.getWeed() == 5);
        assertEquals(appleTree.getWeed(), 4);

    }


    // ----------------------------------------------------------
    /**
     * Tests removeWeed method
     */

    // test it later
    public void testRemoveWeed()
    {
        appleTree.addWeed();
        appleTree.addWeed();
        appleTree.addWeed();
        appleTree.addWeed();
        appleTree.addWeed();

        assertEquals(appleTree.getWeed(), 5);

        appleTree.removeWeed();
        assertEquals(appleTree.getWeed(), 4);

        appleTree.removeWeed();
        assertEquals(appleTree.getWeed(), 3);

        appleTree.removeWeed();
        assertEquals(appleTree.getWeed(), 2);

        appleTree.removeWeed();
        assertEquals(appleTree.getWeed(), 1);

        appleTree.removeWeed();
        assertEquals(appleTree.getWeed(), 0);

        appleTree.removeWeed();
        assertFalse(appleTree.getWeed() == -1);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.addWeed();// remove one weed and make it to 4
        assertEquals(appleTree.getWeed(), 1);

        // testing the method in flowering growth stage
        appleTree.addGrowth();
        appleTree.addGrowth();
        appleTree.addGrowth();
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());

        // adding weed in flowering stage is
        appleTree.removeWeed();
        assertFalse(appleTree.getWeed() == 0);
        assertEquals(appleTree.getWeed(), 1);
    }


    // ----------------------------------------------------------
    /**
     * Tests addGrowth method
     */
    public void testAddGrowth()
    {
        assertEquals(GrowthStage.Seeding, appleTree.getGrowth());

        appleTree.addGrowth();
        assertEquals(GrowthStage.Transplanting, appleTree.getGrowth());

        appleTree.addGrowth();
        assertEquals(GrowthStage.Vegetation, appleTree.getGrowth());

        appleTree.addGrowth();
        assertEquals(4, appleTree.getGrowthSize());
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());

        appleTree.addGrowth();
        assertFalse(appleTree.getGrowthSize() == 5);
        assertEquals(4, appleTree.getGrowthSize());
        assertEquals(GrowthStage.Flowering, appleTree.getGrowth());
    }


    // ----------------------------------------------------------
    /**
     * Tests addGrowth method
     */
    public void testAddQuality()
    {
        // assertEquals(Quality.Perfect, appleTree.getQuality());
        appleTree.dropQuality();// drop perfect
        appleTree.dropQuality();// drop good
        appleTree.dropQuality();// drop normal
        appleTree.dropQuality();// drop bad
        appleTree.dropQuality();// drop putrid

        assertEquals(0, appleTree.getQualitySize());

        appleTree.dropQuality();// drop nothing
        assertEquals(0, appleTree.getQualitySize());

        appleTree.setQuality(Quality.Putrid);
        appleTree.addQuality();
        assertEquals(Quality.Bad, appleTree.getQuality());

        appleTree.addQuality();
        assertEquals(Quality.Normal, appleTree.getQuality());

        appleTree.addQuality();
        assertEquals(Quality.Good, appleTree.getQuality());

        appleTree.addQuality();
        assertEquals(5, appleTree.getQualitySize());
        assertEquals(Quality.Perfect, appleTree.getQuality());

        appleTree.addQuality();
        assertFalse(appleTree.getQualitySize() == 6);
        assertEquals(5, appleTree.getQualitySize());
        assertEquals(Quality.Perfect, appleTree.getQuality());
    }


    // ----------------------------------------------------------
    /**
     * Tests addGrowth method
     */
    public void testDropQuality()
    {
        // assertEquals(Quality.Perfect, appleTree.getQuality());
        assertEquals(5, appleTree.getQualitySize());
        appleTree.dropQuality();// drop perfect
        assertEquals(4, appleTree.getQualitySize());
        appleTree.dropQuality();// drop good
        assertEquals(3, appleTree.getQualitySize());
        appleTree.dropQuality();// drop normal
        assertEquals(2, appleTree.getQualitySize());
        appleTree.dropQuality();// drop bad
        assertEquals(1, appleTree.getQualitySize());
        appleTree.dropQuality();// drop putrid
        assertEquals(0, appleTree.getQualitySize());

        appleTree.dropQuality();// drop nothing
        assertEquals(0, appleTree.getQualitySize());
    }


    // ----------------------------------------------------------
    /**
     * Generally test the checkGrowth method in 3 growth stages. This test grows
     * the tree from first to last growth stages.
     */
    public void testCheckGrowthGenerl()
    {
        // ------------------------------>> initial test

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ------------------------------>> test stage 1

        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();

        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();

        assertEquals(appleTree.getWater(), 25);
        assertEquals(appleTree.getFertilizer(), 25);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ------------------------------>> test stage 2

        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();

        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();

        assertEquals(appleTree.getWater(), 50);
        assertEquals(appleTree.getFertilizer(), 50);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ------------------------------>> test stage 3

        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();
        appleTree.addWater();

        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();
        appleTree.addFertilizer();

        assertEquals(appleTree.getWater(), 75);
        assertEquals(appleTree.getFertilizer(), 75);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Flowering);
    }


    // ----------------------------------------------------------
    /**
     * Tests checkGrowth method by growing the plant from seeding (1st) stage to
     * Transplanting (2nd) stage. It also checks the method in all possible
     * conditions. [y] stands for "yes" which means the specified condition is
     * met [n] stands for "no" which means the specified condition is not met
     */
    public void testCheckGrowthStage1()
    {
        // ---------------->> test stage 1: water[n], fertilizer[n], weed[n]

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[y], fertilizer[n], weed[n]

        // add 5 units of water for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addWater();
        }

        assertEquals(appleTree.getWater(), 25);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[n], fertilizer[y], weed[n]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 25);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[n], fertilizer[n], weed[y]

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[y], fertilizer[y], weed[n]

        // add 5 units of water for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 25);
        assertEquals(appleTree.getFertilizer(), 25);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[y], fertilizer[n], weed[y]

        // add 5 units of water for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addWater();
        }

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 25);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[n], fertilizer[y], weed[y]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 25);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Seeding);

        // ---------------->> test stage 1: water[y], fertilizer[y], weed[y]

        // add 5 units of water for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 5 times
        for (int i = 0; i < 5; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 25);
        assertEquals(appleTree.getFertilizer(), 25);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);
    }


    // ----------------------------------------------------------
    /**
     * Tests checkGrowth method by growing the plant from Transplanting (2nd)
     * stage to Vegetation (3rd) stage. It also checks the method in all
     * possible conditions. [y] stands for "yes" which means the specified
     * condition is met [n] stands for "no" which means the specified condition
     * is not met
     */
    public void testCheckGrowthStage2()
    {
        // ---------------->> set up stage 2

        appleTree.setGrowth(GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[n], fertilizer[n], weed[n]

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[y], fertilizer[n], weed[n]

        // add 5 units of water for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addWater();
        }

        assertEquals(appleTree.getWater(), 50);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[n], fertilizer[y], weed[n]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 50);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[n], fertilizer[n], weed[y]

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[y], fertilizer[y], weed[n]

        // add 5 units of water for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 50);
        assertEquals(appleTree.getFertilizer(), 50);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[y], fertilizer[n], weed[y]

        // add 5 units of water for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addWater();
        }

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 50);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[n], fertilizer[y], weed[y]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 50);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Transplanting);

        // ---------------->> test stage 2: water[y], fertilizer[y], weed[y]

        // add 5 units of water for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 10 times
        for (int i = 0; i < 10; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 50);
        assertEquals(appleTree.getFertilizer(), 50);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);
    }


    // ----------------------------------------------------------
    /**
     * Tests checkGrowth method by growing the plant from Vegetation (3rd) stage
     * to Flowering (4th) stage. It also checks the method in all possible
     * conditions. [y] stands for "yes" which means the specified condition is
     * met [n] stands for "no" which means the specified condition is not met
     */
    public void testCheckGrowthStage3()
    {
        // ---------------->> set up stage 3

        appleTree.setGrowth(GrowthStage.Transplanting);
        appleTree.setGrowth(GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[n], fertilizer[n], weed[n]

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[y], fertilizer[n], weed[n]

        // add 5 units of water for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addWater();
        }

        assertEquals(appleTree.getWater(), 75);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[n], fertilizer[y], weed[n]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 75);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[n], fertilizer[n], weed[y]

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[y], fertilizer[y], weed[n]

        // add 5 units of water for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.addWeed();

        assertEquals(appleTree.getWater(), 75);
        assertEquals(appleTree.getFertilizer(), 75);
        assertEquals(appleTree.getWeed(), 1);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[y], fertilizer[n], weed[y]

        // add 5 units of water for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addWater();
        }

        appleTree.setFertilizer(0);

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 75);
        assertEquals(appleTree.getFertilizer(), 0);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[n], fertilizer[y], weed[y]

        appleTree.setWater(0);

        // add 5 units of fertilizer for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addFertilizer();
        }

        appleTree.removeWeed();

        assertEquals(appleTree.getWater(), 0);
        assertEquals(appleTree.getFertilizer(), 75);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Vegetation);

        // ---------------->> test stage 3: water[y], fertilizer[y], weed[y]

        // add 5 units of water for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addWater();
        }

        // add 5 units of fertilizer for 15 times
        for (int i = 0; i < 15; i++)
        {
            appleTree.addFertilizer();
        }

        assertEquals(appleTree.getWater(), 75);
        assertEquals(appleTree.getFertilizer(), 75);
        assertEquals(appleTree.getWeed(), 0);

        appleTree.checkGrowth();

        assertEquals(appleTree.getGrowth(), GrowthStage.Flowering);
    }


    // ----------------------------------------------------------
    /**
     * Tests isPlantDead method
     */
    public void testIsPlantDead()
    {
        assertEquals(appleTree.isPlantDead(), false);

        appleTree.dropQuality();// drop perfect
        appleTree.dropQuality();// drop good
        appleTree.dropQuality();// drop normal
        appleTree.dropQuality();// drop bad
        appleTree.dropQuality();// drop putrid

        assertEquals(appleTree.isPlantDead(), true);
    }


    // ----------------------------------------------------------
    /**
     * Tests restToVegetation method
     */
    public void testRestToVegetation()
    {
        appleTree.addGrowth();// from seeding to transplanting
        appleTree.addGrowth();// from transplanting to vegetation
        appleTree.addGrowth();// from vegetation to flowering

        appleTree.setWater(75);
        appleTree.setFertilizer(75);

        appleTree.resetToVegetation();
        assertEquals(GrowthStage.Vegetation, appleTree.getGrowth());
        assertEquals(50, appleTree.getWater());
        assertEquals(50, appleTree.getFertilizer());
    }
}
