package com.example.bhanu.shipon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by bhanu on 3/30/2018.
 */

public class ProductDetails extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    final Bitmap bm =  Global.bitmap;
    final String name = Global.name;
    final String desc = Global.desc;

    final int price = Global.price;
    ShopProduct products = null;
    Controller ct = new Controller();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);

        ImageView imageView = (ImageView)findViewById(R.id.product_img);
        imageView.setImageBitmap(bm);
        System.out.println("printing descripotion" + desc);

        final Button button = (Button) findViewById(R.id.buy_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(button.getText().toString().equals("Checkout")){
                    Intent intent = new Intent(ProductDetails.this, Cart.class);
                    System.out.println("@@@@@@@checkout clicked@@@@@@@@@@print controller in pd" + ct);
                    intent.putExtra("products", ct);
                    startActivity(intent);
                } else{
                    products = new ShopProduct(name, desc, price, bm);
                    ct.setProducts(products);
                    Toast.makeText(ProductDetails.this, "Item has been added to cart", Toast.LENGTH_LONG).show();
                    button.setText("Checkout");
                }
            }
        });

        Spinner spinner = (Spinner) findViewById(R.id.colors_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.product_colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       // parent.getItemAtPosition(pos)
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
