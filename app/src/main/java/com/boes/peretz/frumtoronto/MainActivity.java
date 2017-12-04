package com.boes.peretz.frumtoronto;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showTorontoWeather(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.theweathernetwork.com/ca/weather/ontario/toronto?wbRef=www.frumtoronto.com&link=cityPage&switchto=c&ref=wxbtn150x50_image_city"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "You need to install a web browser for this feature to work", Toast.LENGTH_LONG).show();
        }
    }

    public void showWeatherNetworkWebsite(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.theweathernetwork.com/ca"));
        if (intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }else {
            Toast.makeText(getApplicationContext(),"You need to install a web browser for this feature to work",Toast.LENGTH_LONG).show();
        }
    }

    public void showAlertsActiviy(View view){
        Intent intent=new Intent(MainActivity.this,AlertsActivity.class);
        startActivity(intent);
    }

    public void showCalendarActivity(View view){
        Intent intent=new Intent(MainActivity.this,CalendarActivity.class);
        startActivity(intent);
    }

    public void showClassifiedActivity(View view){
        Intent intent=new Intent(MainActivity.this,ClassifiedActivity.class);
        startActivity(intent);
    }

    public void showContactUsActivity(View view){
        Intent intent=new Intent(MainActivity.this,ContactUsActivity.class);
        startActivity(intent);
    }

    public void showDirectoryActivity(View view){
        Intent intent=new Intent(MainActivity.this,DirectoryActivity.class);
        startActivity(intent);
    }

    public void showShulsAndTefillosActivity(View view){
        Intent intent=new Intent(MainActivity.this,ShulsAndTefillosActivity.class);
        startActivity(intent);
    }

}
