package dev.atharvakulkarni.harvest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity
{
    Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(getResources().getColor(R.color.orange,getTheme()));

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Harvest");

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.mark:
                        //startActivity(new Intent(AboutActivity.this, DiscoverActivity.class));
                        Toast.makeText(MainActivity.this, "Mark Attendance", Toast.LENGTH_SHORT).show();

                        fragment = new History();
                        switchfragment(fragment);

                        return true;

                    case R.id.history:
                        Toast.makeText(MainActivity.this, "History", Toast.LENGTH_SHORT).show();

                        fragment = new Mark_attendance();
                        switchfragment(fragment);



                        break;
                    case R.id.add_student:
                        Toast.makeText(MainActivity.this, "Add Students", Toast.LENGTH_SHORT).show();

                        fragment = new Add_students();
                        switchfragment(fragment);

                        break;
                }
                return true;
            }
        });

        if (savedInstanceState == null)
        {
            bottomNavigationView.setSelectedItemId(R.id.mark); // change to whichever id should be default
        }

    }

    void switchfragment(Fragment fragment)
    {
        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.fragment, fragment).commit();
    }
}

/*

    app:defaultNavHost="true"
    app:navGraph="@navigation/mobile_navigation"

 */