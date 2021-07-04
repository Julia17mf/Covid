package com.example.covid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.covid.fragment.KasusFragment;
import com.example.covid.fragment.RSFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navbar;
    private Fragment selectedFragment = new KasusFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navbar = findViewById(R.id.main_navbar);
        navbar.setOnNavigationItemSelectedListener(this);

        loadFragment(selectedFragment);
    }

    private boolean loadFragment(Fragment fragment) {
        if(selectedFragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_frame, selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_kasus:
                selectedFragment = new KasusFragment();
                loadFragment(selectedFragment);
                break;

            case R.id.ic_rs:
                selectedFragment = new RSFragment();
                loadFragment(selectedFragment);
                break;
        }
        return false;
    }
}