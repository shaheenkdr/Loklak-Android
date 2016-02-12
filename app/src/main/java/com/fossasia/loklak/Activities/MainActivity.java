package com.fossasia.loklak.Activities;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.fossasia.loklak.R;

public class MainActivity extends AppCompatActivity
{
    private EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#FFFFFF'>Loklak</font>"));
       // getSupportActionBar().setDisplayShowTitleEnabled(false);

        search = (EditText)findViewById(R.id.info_text);


        ImageView wall = (ImageView)findViewById(R.id.loklak_big);
        wall.setScaleType(ImageView.ScaleType.FIT_XY);

    }

    public void launch_engine(View view)
    {
        String temp = search.getText().toString();
        final String transmit = temp.replaceAll("\\s+","");

        if (transmit.matches(""))
        {
            Snackbar.make(this.findViewById(android.R.id.content), "No input entered", Snackbar.LENGTH_LONG).show();

        }
        else
        {


            Intent pass = new Intent(MainActivity.this,SearchList.class);
            pass.putExtra("SEARCH",transmit);
            startActivity(pass);
        }

    }

}
