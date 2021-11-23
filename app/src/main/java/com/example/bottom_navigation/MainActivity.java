package com.example.bottom_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * This activity contains a Bottom Navigation using the class BottomNavigationView.
 * The result is an easy to use menu for navigating through an app.
 * Interacting with the navigation sends the user to different Fragments.
 *
 * Layout File for the activity: activity_main.xml
 * Layout File for the menu: bottom_navigation.xml
 *
 * @author Lukas Plenk
 */
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    /**
     * This method references the menu and a listener for clicks on the menu items.
     * It also displays the HomeFragment at the start of the app.
     * @param savedInstanceState is a standard parameter.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        if(savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        }
    }

    /**
     * Method for handling the clicks on menu items.
     * A switch case checks which item was selected and calls the suited Fragment.
     * The selected Fragment should be displayed afterwards.
     *
     * @param item is the MenuItem that the user clicked on.
     * @return true closes the method successfully.
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment selectedFragment = null;

        switch(item.getItemId()) {

            case R.id.nav_home:
                selectedFragment = new HomeFragment();
                break;
            case R.id.nav_add:
                selectedFragment = new AddFragment();
                break;
            case R.id.nav_trends:
                selectedFragment = new TrendsFragment();
                break;
            case R.id.nav_social:
                selectedFragment = new SocialFragment();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

        return true;
    }
}