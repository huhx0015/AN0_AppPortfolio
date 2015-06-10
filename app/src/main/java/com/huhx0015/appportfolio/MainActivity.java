package com.huhx0015.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import appportfolio.huhx0015.com.appportfolio.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        setUpButtons(); // Sets up the buttons for the activity.
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish(); // Finishes the activity when app is paused.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // setUpButtons(): Sets up the button and button listeners for the activity.
    private void setUpButtons() {

        Button spotifyButton = (Button) findViewById(R.id.spotify_app_button);
        Button footballButton = (Button) findViewById(R.id.football_app_button);
        Button libraryButton = (Button) findViewById(R.id.library_app_button);
        Button biggerButton = (Button) findViewById(R.id.bigger_app_button);
        Button xyzButton = (Button) findViewById(R.id.xyz_app_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        // SPOTIFY APP Button Listener:
        spotifyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Spotify app!", Toast.LENGTH_SHORT).show();
            }
        });

        // FOOTBALL APP Button Listener:
        footballButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Football Scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        // LIBRARY APP Button Listener:
        libraryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        // BIGGER APP Button Listener:
        biggerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
            }
        });

        // XYZ APP Button Listener:
        xyzButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        // CAPSTONE APP Button Listener:
        capstoneButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
