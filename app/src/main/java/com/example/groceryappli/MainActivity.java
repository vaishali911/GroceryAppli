package com.example.groceryappli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    ImageView cart_icon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav=(NavigationView)findViewById(R.id.navmenu);
         drawerLayout = (DrawerLayout)findViewById(R.id.drawer);

         toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
         drawerLayout.addDrawerListener(toggle);
         toggle.syncState();
         cart_icon =(ImageView) findViewById(R.id.card);
         cart_icon.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 startActivity(new Intent( MainActivity.this,CartActivity.class));

             }
         });

         nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 switch (item.getItemId()) {
                     case R.id.home:
                         Toast.makeText(getApplicationContext(), "Home Panel is Open", Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.Dfruits:
                         Toast.makeText(getApplicationContext(), "Dry Fruits Page is Open", Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.household:
                         Toast.makeText(getApplicationContext(), " Household page is Open", Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.readyEat:
                         Toast.makeText(getApplicationContext(), "Read To Eat Page is Open", Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;

                     case R.id.patanjali:
                         Toast.makeText(getApplicationContext(), "Patanjali Page is Open", Toast.LENGTH_LONG).show();
                         drawerLayout.closeDrawer(GravityCompat.START);
                         break;
                 }
                 return true;
             }
         });



    }
}