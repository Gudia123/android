package com.example.bhanu.shipon;

/**
 * Created by bhanu on 3/25/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class SplashscreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Start home activity
        startActivity(new Intent(SplashscreenActivity.this, LoginActivity.class));
        // close splash activity
        finish();
    }
}
