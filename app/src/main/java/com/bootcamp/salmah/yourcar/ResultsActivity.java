package com.bootcamp.salmah.yourcar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView makeOne = (TextView) findViewById(R.id.make_audi_textview);
        TextView modelOne = (TextView) findViewById(R.id.model_audi_textview);
        TextView countryOne = (TextView) findViewById(R.id.country_audi_textview);

        TextView makeTwo = (TextView) findViewById(R.id.make_benz_textview);
        TextView modelTwo = (TextView) findViewById(R.id.model_benz_textview);
        TextView countryTwo = (TextView) findViewById(R.id.country_benz_textview);

        TextView makeThree = (TextView) findViewById(R.id.make_chevrolet_textview);
        TextView modelThree = (TextView) findViewById(R.id.model_chevrolet_textview);
        TextView countryThree = (TextView) findViewById(R.id.country_chevrolet_textview);

        TextView makeFour = (TextView) findViewById(R.id.make_jaguar_textview);
        TextView modelFour = (TextView) findViewById(R.id.model_jaguar_textview);
        TextView countryFour = (TextView) findViewById(R.id.country_jaguar_textview);

        TextView makeFive = (TextView) findViewById(R.id.make_rollsroyce_textview);
        TextView modelFive = (TextView) findViewById(R.id.model_rollsroyce_textview);
        TextView countryFive = (TextView) findViewById(R.id.country_rollsroyce_textview);

        //getting intent that started this activity
        Intent intent = getIntent();

        //getting bundle that stored data of this activity
        Bundle bundle = intent.getExtras();

        //getting data from bundle and showing it to layout
        String audiMake = bundle.getString("audiMake");
        makeOne.setText(audiMake);
        String audiCountry = bundle.getString("audiCountry");
        countryOne.setText(audiCountry);
        String audiModel = bundle.getString("audiModel");
        modelOne.setText(audiModel);

        String benzMake = bundle.getString("benzMake");
        makeTwo.setText(benzMake);
        String benzCountry = bundle.getString("benzCountry");
        countryTwo.setText(benzCountry);
        String benzModel = bundle.getString("benzModel");
        modelTwo.setText(benzModel);

        String chevroletMake = bundle.getString("chevroletMake");
        makeThree.setText(chevroletMake);
        String chevroletCountry = bundle.getString("chevroletCountry");
        countryThree.setText(chevroletCountry);
        String chevroletModel = bundle.getString("chevroletModel");
        modelThree.setText(chevroletModel);

        String jaguarMake = bundle.getString("jaguarMake");
        makeFour.setText(jaguarMake);
        String jaguarCountry = bundle.getString("jaguarCountry");
        countryFour.setText(jaguarCountry);
        String jaguarModel = bundle.getString("jaguarModel");
        modelFour.setText(jaguarModel);

        String rollsRoyceMake = bundle.getString("rollsRoyceMake");
        makeFive.setText(rollsRoyceMake);
        String rollsRoyceCountry = bundle.getString("rollsRoyceCountry");
        countryFive.setText(rollsRoyceCountry);
        String rollsRoyceModel = bundle.getString("rollsRoyceModel");
        modelFive.setText(rollsRoyceModel);
    }


    public void finish(View view) {
        Intent secondIntent = new Intent(this, MainActivity.class);
        startActivity(secondIntent);
    }
}
