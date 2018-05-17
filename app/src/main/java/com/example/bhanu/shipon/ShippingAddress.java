package com.example.bhanu.shipon;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by bhanu on 3/30/2018.
 */

public class ShippingAddress extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipping_address);
        final Button button = (Button)findViewById(R.id.save_address);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShippingAddress.this, PaymentActivity.class);
                startActivity(intent);
            }});
    }
}
