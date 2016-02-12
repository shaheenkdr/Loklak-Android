package com.fossasia.loklak.Activities;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fossasia.loklak.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        /*
         ** To hide the status bar
         */
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);



        /*
        ** Setting custom font to loklak text
         */
        TextView name = (TextView)findViewById(R.id.loklak_text_view);
        Typeface face= Typeface.createFromAsset(getAssets(), "fonts/Consolas.ttf");
        name.setTypeface(face);


        /*
        ** Splash for few seconds and go to main Activity
         */
        int secondsDelayed = 1;
        new Handler().postDelayed(new Runnable() {
            public void run() {



                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();


            }
        }, secondsDelayed * 2000);


    }
}
