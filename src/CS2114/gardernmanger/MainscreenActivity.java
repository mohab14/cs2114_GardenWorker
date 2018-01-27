package CS2114.gardernmanger;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import java.util.Random;
import android.widget.RatingBar;
import android.widget.LinearLayout;
import java.util.TimerTask;
import java.util.Timer;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.format.Time;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

// -------------------------------------------------------------------------
/**
 * This is the main screen class relates to the GUI.
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version Dec 1, 2014
 */
public class MainscreenActivity
    extends Activity
    implements OnClickListener
{
    private boolean     isWin;
    private TextView    appleTreeText;
    private TextView    RoseText;
    private TextView    remainApple;
    private TextView    remainRose;
    private ImageView   temp;
    private Time        theTime;

    private long        StartTime;
    private long        CurrentTime;

    private ImageButton scissor;
    private ImageButton fertilizer;
    private ImageButton gloves;
    private ImageButton wateringCan;

    private RatingBar   appleRate;
    private TextView    appleLabel;
    private TextView    appleDead;
    private ImageView   appleTreeFlowering;
    private ImageView   appleTreeSeeding;
    private ImageView   appleTreeTransplant;
    private ImageView   appleTreeVegetation;
    private ImageView   appleTreeSeedingDead;
    private ImageView   appleTreeTransplantDead;
    private ImageView   appleTreeVegetationDead;

    private TextView    roseLabel;
    private RatingBar   roseRate;
    private ImageView   roseFlowering;
    private ImageView   roseVegetation;
    private ImageView   roseTransplant;
    private ImageView   roseSeeding;
    private ImageView   roseSeedingDead;
    private ImageView   roseTransplantDead;
    private ImageView   roseVegetationDead;

    private ImageView   exit;
    private ImageView   reset;
    private ImageView   help;
    private ImageView   instruction;

    private int         weedNumber;
    private String      number;
    public WorkBehind   gameWork;


    /**
     * Initialize the screen by creating what's visible in the beginning. Then
     * as the game goes on, some images will disappear depending on the
     * condition or the health.
     */
    protected void onCreate(Bundle savedInstanceState)
    {
        super
            .setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreen);

        isWin = false;
        remainApple = (TextView)findViewById(R.id.remainapple);

        remainRose = (TextView)findViewById(R.id.remainflower);

        appleTreeText = (TextView)findViewById(R.id.textViewappleTree);
        RoseText = (TextView)findViewById(R.id.TextViewRose);

        exit = (ImageView)findViewById(R.id.exit_icon);
        reset = (ImageView)findViewById(R.id.reset_icon);
        help = (ImageView)findViewById(R.id.help);
        instruction = (ImageView)findViewById(R.id.instruction);

        appleRate = (RatingBar)findViewById(R.id.appleRating);
        appleRate.setRating(5);

        // error scissor is not ImageButton yet.
        scissor = (ImageButton)findViewById(R.id.scissors);
        fertilizer = (ImageButton)findViewById(R.id.fertilizer);
        gloves = (ImageButton)findViewById(R.id.glove);
        wateringCan = (ImageButton)findViewById(R.id.waterCan);
        appleLabel = (TextView)findViewById(R.id.appleLabel);
        appleTreeFlowering = (ImageView)findViewById(R.id.appleTree);
        appleTreeFlowering.setVisibility(View.INVISIBLE);
        appleTreeTransplant = (ImageView)findViewById(R.id.treeTransplant);
        appleTreeTransplant.setVisibility(View.INVISIBLE);
        appleTreeVegetation = (ImageView)findViewById(R.id.TreeVegetation);
        appleTreeVegetation.setVisibility(View.INVISIBLE);
        appleTreeSeeding = (ImageView)findViewById(R.id.TreeSeeding);
        appleTreeSeedingDead = (ImageView)findViewById(R.id.appleSeedDead);
        appleTreeSeedingDead.setVisibility(View.INVISIBLE);
        appleTreeTransplantDead =
            (ImageView)findViewById(R.id.appleTransplantDead);
        appleTreeTransplantDead.setVisibility(View.INVISIBLE);
        appleTreeVegetationDead =
            (ImageView)findViewById(R.id.appleVegtationDead);
        appleTreeVegetationDead.setVisibility(View.INVISIBLE);
        appleDead = (TextView)findViewById(R.id.DeadApple);
        appleDead.setVisibility(View.INVISIBLE);
        // ------------------------------------------------
        roseLabel = (TextView)findViewById(R.id.flowerLabel);
        roseRate = (RatingBar)findViewById(R.id.roseRate);

        roseFlowering = (ImageView)findViewById(R.id.flower_flowering);
        roseFlowering.setVisibility(View.INVISIBLE);
        roseVegetation =
            (ImageView)findViewById(R.id.flower_vegetation_healthy);
        roseVegetation.setVisibility(View.INVISIBLE);
        roseTransplant =
            (ImageView)findViewById(R.id.flower_transplanting_healthy);
        roseTransplant.setVisibility(View.INVISIBLE);
        roseSeeding = (ImageView)findViewById(R.id.flower_seeding_healthy);
        roseSeedingDead = (ImageView)findViewById(R.id.flower_seeding_bad);
        roseSeedingDead.setVisibility(View.INVISIBLE);
        roseTransplantDead =
            (ImageView)findViewById(R.id.flower_transplanting_bad);
        roseTransplantDead.setVisibility(View.INVISIBLE);
        roseVegetationDead =
            (ImageView)findViewById(R.id.flower_vegetation_bad);
        roseVegetationDead.setVisibility(View.INVISIBLE);

        // appleTreeSeeding.setVisibility(View.INVISIBLE);
        // -----------------------------------------------------------------------------
        // This part initialize all the values
        gameWork = new WorkBehind();

        // ------------------------------------------------------------------------------

        // This part add all the ClickListeners.

        RoseText.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                if (gameWork.choosePlant.isPlantDead() == false)
                {
                    gameWork.chooseRose();
                }
            }
        });
        // Click about appleTree.
        appleTreeText.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                if (gameWork.choosePlant.isPlantDead() == false)
                {
                    gameWork.chooseAppleTree();
                }

            }
        });

        // Click about the Fertilizer.
        fertilizer.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                gameWork.fertilizerClicked();
                gameWork.choosePlant.checkGrowth();
                changePlant();
                checkDead();
                if (gameWork.appleTree.isPlantDead() == true
                    || gameWork.rose.isPlantDead() == true)
                {
                    startActivity(new Intent(
                        MainscreenActivity.this,
                        LoseActivity.class));
                }

            }
        });

        // Click about the Gloves.
        gloves.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                gameWork.glovesClicked();
                if (gameWork.getAppleBasket() >= 24
                    && gameWork.getRoseBasket() >= 1)
                {
                    isWin = true;
                    startActivity(new Intent(
                        MainscreenActivity.this,
                        WinActivity.class));
                }
                String appleNum = "" + gameWork.getAppleBasket();
                appleLabel.setText(appleNum);
                String appleRemain = "" + (24 - gameWork.getAppleBasket());
                remainApple.setText(appleRemain);

                String roseNum = "" + gameWork.getRoseBasket();
                roseLabel.setText(roseNum);
                String RoseRemain = "" + (1 - gameWork.getRoseBasket());
                remainRose.setText(RoseRemain);
                changePlant();
                checkDead();
                if (gameWork.appleTree.isPlantDead() == true
                    || gameWork.rose.isPlantDead() == true)
                {
                    startActivity(new Intent(
                        MainscreenActivity.this,
                        LoseActivity.class));
                }

            }
        });

        // Click about the WateringCan.
        wateringCan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                gameWork.waterClicked();
                gameWork.choosePlant.checkGrowth();
                changePlant();
                checkDead();
                if (gameWork.appleTree.isPlantDead() == true
                    || gameWork.rose.isPlantDead() == true)
                {
                    startActivity(new Intent(
                        MainscreenActivity.this,
                        LoseActivity.class));
                }
            }
        });
        // Click about the scissor.
        scissor.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                gameWork.scissorClicked();
                appleRate.setRating(gameWork.appleTree.getQualitySize());
                roseRate.setRating(gameWork.rose.getQualitySize());
                gameWork.choosePlant.checkGrowth();
                changePlant();
                checkDead();
                if (gameWork.appleTree.isPlantDead() == true
                    || gameWork.rose.isPlantDead() == true)
                {
                    startActivity(new Intent(
                        MainscreenActivity.this,
                        LoseActivity.class));
                }
            }
        });
        // Click about the exit.
        exit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                System.exit(0);

            }
        });
        // Click about the reset
        reset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent i =
                    getBaseContext().getPackageManager()
                        .getLaunchIntentForPackage(
                            getBaseContext().getPackageName());
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
        /**
         * This is listener for the help button.
         */
        help.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(new Intent(
                    MainscreenActivity.this,
                    HelpActivity.class));
            }
        });
        /**
         * This is a listener for the instruction button.
         */
        instruction.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                startActivity(new Intent(
                    MainscreenActivity.this,
                    IntroActivity.class));
            }
        });

        Timer appleWeed = new Timer();
        AddWeedToApple kk1 = new AddWeedToApple();
        appleWeed.schedule(kk1, 0, 1000);

        Timer roseWeed = new Timer();
        AddWeedToRose kk2 = new AddWeedToRose();
        roseWeed.schedule(kk2, 0, 1000);

    }


    /**
     * RunTimeTask class.
     */
    private class AddWeedToApple
        extends TimerTask
    {

        public void run()
        {
            if (isWin == false)
            {
                if (!(gameWork.appleTree.isPlantDead() || gameWork.rose
                    .isPlantDead()))
                {

                    Random rand = new Random();
                    int ranNum = rand.nextInt(50);
                    if (ranNum < 15)
                    {
                        gameWork.appleTree.addWeed();
                    }

                    appleRate.setRating(gameWork.appleTree.getQualitySize());

                }
            }

        }

    }


    /**
     * RunTimeTask class.
     */
    private class AddWeedToRose
        extends TimerTask
    {

        public void run()
        {
            if (isWin == false)
            {
                if (!(gameWork.appleTree.isPlantDead() || gameWork.rose
                    .isPlantDead()))
                {

                    Random rand = new Random();
                    int ranNum = rand.nextInt(50);
                    if (ranNum < 15)
                    {
                        gameWork.rose.addWeed();
                    }

                    roseRate.setRating(gameWork.rose.getQualitySize());

                }
            }

        }

    }


    /**
     * Created by abstract class.
     */

    public boolean onCreateOptionsMenu(Menu menu)
    {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainscreen, menu);
        return true;
    }


    /**
     * Created by abstract class.
     */
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * Created by abstract class.
     */
    public void onClick(DialogInterface dialog, int which)
    {
        // does nothing.
    }


    /**
     * This is checks whether the plant is dead by the condition. For instance,
     * apple tree from the GUI have condition color red meaning dead, condition
     * dark green meaning normal and condition bright green meaning healthy.
     * Each plant will have stages of growthsize containing number that
     * indicates the condition.
     */
    public void checkDead()
    {
        if (gameWork.appleTree.isPlantDead())
        {
            if (gameWork.appleTree.getGrowthSize() == 1)
            {
                appleTreeSeeding.setVisibility(View.INVISIBLE);
                appleTreeSeedingDead.setVisibility(View.VISIBLE);
            }
            else if (gameWork.appleTree.getGrowthSize() == 2)
            {
                appleTreeTransplant.setVisibility(View.INVISIBLE);
                appleTreeTransplantDead.setVisibility(View.VISIBLE);
            }
            else if (gameWork.appleTree.getGrowthSize() == 3)
            {
                appleTreeVegetation.setVisibility(View.INVISIBLE);
                appleTreeVegetationDead.setVisibility(View.VISIBLE);
            }

        }

        if (gameWork.rose.isPlantDead())
        {
            if (gameWork.rose.getGrowthSize() == 1)
            {
                roseSeeding.setVisibility(View.INVISIBLE);
                roseSeedingDead.setVisibility(View.VISIBLE);
            }
            else if (gameWork.rose.getGrowthSize() == 2)
            {
                roseTransplant.setVisibility(View.INVISIBLE);
                roseTransplantDead.setVisibility(View.VISIBLE);
            }
            else if (gameWork.rose.getGrowthSize() == 3)
            {
                roseVegetation.setVisibility(View.INVISIBLE);
                roseVegetationDead.setVisibility(View.VISIBLE);
            }

        }
    }


    /**
     * This is the import method that makes the images in the GUI what needs to
     * be visible and what needs to be invisible. All the images will be set on
     * top of each other and this method will organize.
     */
    public void changePlant()
    {

        if (!gameWork.appleTree.isPlantDead() && !gameWork.rose.isPlantDead())
        {
            if (gameWork.choosePlant == gameWork.appleTree)
            {
                if (gameWork.appleTree.getGrowthSize() == 1)
                {
                    appleTreeFlowering.setVisibility(View.INVISIBLE);
                    appleTreeSeeding.setVisibility(View.VISIBLE);
                    appleTreeTransplant.setVisibility(View.INVISIBLE);
                    appleTreeVegetation.setVisibility(View.INVISIBLE);
                }
                else if (gameWork.appleTree.getGrowthSize() == 2)
                {
                    appleTreeFlowering.setVisibility(View.INVISIBLE);
                    appleTreeSeeding.setVisibility(View.INVISIBLE);
                    appleTreeTransplant.setVisibility(View.VISIBLE);
                    appleTreeVegetation.setVisibility(View.INVISIBLE);
                }
                else if (gameWork.appleTree.getGrowthSize() == 3)
                {
                    appleTreeFlowering.setVisibility(View.INVISIBLE);
                    appleTreeSeeding.setVisibility(View.INVISIBLE);
                    appleTreeTransplant.setVisibility(View.INVISIBLE);
                    appleTreeVegetation.setVisibility(View.VISIBLE);
                }
                else if (gameWork.appleTree.getGrowthSize() == 4)
                {
                    appleTreeFlowering.setVisibility(View.VISIBLE);
                    appleTreeSeeding.setVisibility(View.INVISIBLE);
                    appleTreeTransplant.setVisibility(View.INVISIBLE);
                    appleTreeVegetation.setVisibility(View.INVISIBLE);
                }
            }

            if (gameWork.choosePlant == gameWork.rose)
            {
                if (gameWork.rose.getGrowthSize() == 1)
                {
                    roseFlowering.setVisibility(View.INVISIBLE);
                    roseSeeding.setVisibility(View.VISIBLE);
                    roseTransplant.setVisibility(View.INVISIBLE);
                    roseVegetation.setVisibility(View.INVISIBLE);
                }
                else if (gameWork.rose.getGrowthSize() == 2)
                {
                    roseFlowering.setVisibility(View.INVISIBLE);
                    roseSeeding.setVisibility(View.INVISIBLE);
                    roseTransplant.setVisibility(View.VISIBLE);
                    roseVegetation.setVisibility(View.INVISIBLE);
                }
                else if (gameWork.rose.getGrowthSize() == 3)
                {
                    roseFlowering.setVisibility(View.INVISIBLE);
                    roseSeeding.setVisibility(View.INVISIBLE);
                    roseTransplant.setVisibility(View.INVISIBLE);
                    roseVegetation.setVisibility(View.VISIBLE);
                }
                else if (gameWork.rose.getGrowthSize() == 4)
                {
                    roseFlowering.setVisibility(View.VISIBLE);
                    roseSeeding.setVisibility(View.INVISIBLE);
                    roseTransplant.setVisibility(View.INVISIBLE);
                    roseVegetation.setVisibility(View.INVISIBLE);
                }
            }

        }

    }
}
