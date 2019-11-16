package com.example.itay.colorsitayelbaz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Itay Elbaz
 * @version alpha
 * @since 6.7.2003
 *
 * in this activity you choose a colo out of four colors and the background changes its color, and you can move to the next activity
 *
 *
 */

public class nextActivity extends AppCompatActivity {
        LinearLayout ll;

    /**
     *
     * ll is the linearlayout object
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ll=(LinearLayout)findViewById(R.id.l2);
    }

    /**
     *
     * this method creates a menu
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"yellow");
        return true;
    }

    /**
     *
     * @param item the option that has been chosen
     * this method changes the color of the background, depends on the color you choose.
     *
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (R.id.black == id) {
            ll.setBackgroundColor(Color.BLACK);
        } else {
            if (id == R.id.red) {
                ll.setBackgroundColor(Color.RED);
            }else {
                if (id == R.id.gray) {
                    ll.setBackgroundColor(Color.GRAY);
                } else ll.setBackgroundColor(Color.YELLOW);
            }
        }
        return true;
    }

    /**
     *
     * here you move to the previous activity
     */
    public void back(View view) {
        finish();
    }
}