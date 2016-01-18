package com.example.usuario.menu;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.usuario.menu.fragment.AccederContainFragment;


public class AccederActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        AccederContainFragment fragment = new AccederContainFragment();
        transaction.replace(R.id.sample_content_fragment, fragment);
        transaction.commit();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       //  Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_acceder, menu);
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
}
