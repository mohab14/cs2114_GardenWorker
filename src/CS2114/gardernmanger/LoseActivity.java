package CS2114.gardernmanger;

import android.content.Intent;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

// -------------------------------------------------------------------------
/**
 * // -------------------------------------------------------------------------
 * /** This is a screen Activity for Lose condition.
 *
 * @author Zhizheng Chen, Jung Choi, Mohammad Ali S. Beheshti
 * @version Dec 1, 2014
 */
public class LoseActivity
    extends Activity
{

    private Button restart;
   


    /**
     * Created by the system.
     */
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
        restart = (Button)findViewById(R.id.restart_lose);
       

        restart.setOnClickListener(new View.OnClickListener() {

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


    }


    /**
     * Created by the system.
     */

    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lose, menu);
        return true;
    }


    /**
     * Created by the system.
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
}
