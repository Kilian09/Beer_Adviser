package com.example.beer_adviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    BeerExpert beerExpert = new BeerExpert();

    //Called when the button gets clicked
    public void onClickFindBeer(View view ){
        //Get a reference to the TextView
        TextView brands = findViewById(R.id.brands);
        //Get a reference to the Spinner
        Spinner color = findViewById(R.id.color);
        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //Display the selected item
       List beer = beerExpert.getBrands(beerType);
      brands.setText(beer.toString());
    }
}
