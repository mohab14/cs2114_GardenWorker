package CS2114.gardernmanger;

/**
 * GrowthStage class is a type enum class which defines the 4 stages of growth
 * for a plant. This is the trend of how growth stages changes:
 * Seeding -> Transplanting -> Vegetation <--> Flowering
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version 2014.11.15
 */
public enum GrowthStage
{
    /**
     * The basic and the start stage of growth in a plant
     */
    Seeding,

    /**
     * The second stage of growth in a plant
     */
    Transplanting,

    /**
     * The third stage of growth in a plant
     */
    Vegetation,

    /**
     * The forth and the final stage of growth in a plant
     */
    Flowering;
}