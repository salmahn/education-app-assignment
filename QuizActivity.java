package com.bootcamp.salmah.yourcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.bootcamp.salmah.yourcar.R.id.audi_country_et;
import static com.bootcamp.salmah.yourcar.R.id.audi_make_et;
import static com.bootcamp.salmah.yourcar.R.id.benz_country_et;
import static com.bootcamp.salmah.yourcar.R.id.benz_make_et;
import static com.bootcamp.salmah.yourcar.R.id.chevrolet_country_et;
import static com.bootcamp.salmah.yourcar.R.id.chevrolet_make_et;
import static com.bootcamp.salmah.yourcar.R.id.jaguar_country_et;
import static com.bootcamp.salmah.yourcar.R.id.jaguar_make_et;
import static com.bootcamp.salmah.yourcar.R.id.rollsroyce_country_et;
import static com.bootcamp.salmah.yourcar.R.id.rollsroyce_make_et;

public class QuizActivity extends AppCompatActivity {
    String audiMake;
    String audiCountry;
    String benzMake;
    String benzCountry;
    String chevroletMake;
    String chevroletCountry;
    String jaguarMake;
    String jaguarCountry;
    String rollsRoyceMake;
    String rollsRoyceCountry;

    String modelAudi;
    String modelBenz;
    String modelChevrolet;
    String modelJaguar;
    String modelRollsRoyce;


    String makeAudi;
    String makeBenz;
    String makeChevrolet;
    String makeJaguar;
    String makeRollsRoyce;

    String countryAudi;
    String countryBenz;
    String countryChevrolet;
    String countryJaguar;
    String countryRollsRoyce;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //this gets the radiogroup
        RadioGroup audiGroup = (RadioGroup) findViewById(R.id.audi_radio_group);
        RadioGroup benzGroup = (RadioGroup) findViewById(R.id.benz_radio_group);
        RadioGroup chevroletGroup = (RadioGroup) findViewById(R.id.chevrolet_radio_group);
        RadioGroup jaguarGroup = (RadioGroup) findViewById(R.id.jaguar_radio_group);
        RadioGroup rollsroyceGroup = (RadioGroup) findViewById(R.id.rollsroyce_radio_group);


        //this overrides the radio group onCheckListener for AUDI
        audiGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup groupOne, int checkedIdOne) {
                switch (checkedIdOne){
                    case R.id.audi_slr:
                        modelAudi = "Incorrect answer! It is an Audi RS6.";
                        break;

                    case R.id.audi_rs6:
                        modelAudi = "Incorrect answer! It is an Audi RS6.";
                        break;

                    case R.id.audi_nissan:
                        modelAudi = "You got it right! It is an Audi RS6!";
                        break;
                }
           }
        });

        //this overrides the radio group onCheckListener for BENZ
        benzGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup groupTwo, int checkedIdTwo) {
                switch (checkedIdTwo){
                    case R.id.benz_prado:
                        modelBenz = "Incorrect answer! It is a Mercedes Benz 300SL.";
                        break;

                    case R.id.benz_sl300:
                        modelBenz = "You got it right! It is a Mercedes Benz 300SL!";
                        break;

                    case R.id.benz_phantom:
                        modelBenz = "Incorrect answer! It is a Mercedes Benz 300SL.";
                        break;
                }
            }
        });

        //this overrides the radio group onCheckListener for CHEVROLET
        chevroletGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup groupThree, int checkedIdThree) {
                switch (checkedIdThree){
                    case R.id.chevrolet_r8:
                        modelChevrolet = "Incorrect answer! It is a Chevrolet Tahoe.";
                        break;

                    case R.id.chevrolet_s5:
                        modelChevrolet = "Incorrect answer! It is a Chevrolet Tahoe.";
                        break;

                    case R.id.chevrolet_tahoe:
                        modelChevrolet = "You got it right! It is a Chevrolet Tahoe!";
                        break;
                }
            }
        });

        //this overrides the radio group onCheckListener for JAGUAR
        jaguarGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup groupFour, int checkedIdFour) {
                switch (checkedIdFour){
                    case R.id.jaguar_stingray:
                        modelJaguar = "Incorrect answer! It is a Jaguar XK";
                        break;

                    case R.id.jaguar_volt:
                        modelJaguar = "Incorrect answer! It is a Jaguar XK";
                        break;

                    case R.id.jaguar_xk:
                        modelJaguar = "Correct! It is a Jaguar XK.";
                        break;
                }
            }
        });

        //this overrides the radio group onCheckListener for ROLLSROYCE
        rollsroyceGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup groupFive, int checkedIdFive) {
                switch (checkedIdFive){
                    case R.id.rollsroyce_camaro:
                        modelRollsRoyce = "Incorrect answer! It is a RollsRoyce Silver Shadow.";
                        break;

                    case R.id.rollsroyce_phantom:
                        modelRollsRoyce = "Incorrect answer! It is a RollsRoyce Silver Shadow.";
                        break;

                    case R.id.rollsroyce_silvershadow:
                        modelRollsRoyce = "Correct! It is a RollsRoyce Silver Shadow!";
                        break;
                }
            }
        });


    }

    public void submitAnswers(View view) {
        EditText audiMakeEditText = (EditText) findViewById(audi_make_et);
        Editable audiMakeEditable = audiMakeEditText.getText();
        audiMake = audiMakeEditable.toString().trim().toLowerCase();

        EditText audiCountryEditText = (EditText) findViewById(audi_country_et);
        Editable audiCountryEditable = audiCountryEditText.getText();
        audiCountry = audiCountryEditable.toString().trim().toLowerCase();

        EditText benzMakeEditText = (EditText) findViewById(benz_make_et);
        Editable benzMakeEditable = benzMakeEditText.getText();
        benzMake = benzMakeEditable.toString().trim().toLowerCase();

        EditText benzCountryEditText = (EditText) findViewById(benz_country_et);
        Editable benzCountryEditable = benzCountryEditText.getText();
        benzCountry = benzCountryEditable.toString().trim().toLowerCase();

        EditText chevroletMakeEditText = (EditText) findViewById(chevrolet_make_et);
        Editable chevroletMakeEditable = chevroletMakeEditText.getText();
        chevroletMake = chevroletMakeEditable.toString().trim().toLowerCase();

        EditText chevroletCountryEditText = (EditText) findViewById(chevrolet_country_et);
        Editable chevroletCountryEditable = chevroletCountryEditText.getText();
        chevroletCountry = chevroletCountryEditable.toString().trim().toLowerCase();

        EditText jaguarMakeEditText = (EditText) findViewById(jaguar_make_et);
        Editable jaguarMakeEditable = jaguarMakeEditText.getText();
        jaguarMake = jaguarMakeEditable.toString().trim().toLowerCase();

        EditText jaguarCountryEditText = (EditText) findViewById(jaguar_country_et);
        Editable jaguarCountryEditable = jaguarCountryEditText.getText();
        jaguarCountry = jaguarCountryEditable.toString().trim().toLowerCase();

        EditText rollsroyceMakeEditText = (EditText) findViewById(rollsroyce_make_et);
        Editable rollsroyceMakeEditable = rollsroyceMakeEditText.getText();
        rollsRoyceMake = rollsroyceMakeEditable.toString().trim().toLowerCase();

        EditText rollsroyceCountryEditText = (EditText) findViewById(rollsroyce_country_et);
        Editable rollsroyceCountryEditable = rollsroyceCountryEditText.getText();
        rollsRoyceCountry = rollsroyceCountryEditable.toString().trim().toLowerCase();

        if (audiMake.length() == 0 || audiCountry.length() == 0 || benzMake.length() == 0
                || benzCountry.length() == 0 || chevroletMake.length() == 0
                || chevroletCountry.length() == 0 || jaguarMake.length() == 0 || jaguarCountry.length() == 0
                || rollsRoyceMake.length() == 0 || rollsRoyceCountry.length() == 0) {

            Toast.makeText(getApplicationContext(), "Please fill in the missing fields",
                    Toast.LENGTH_SHORT).show();
        } else {

            String audiModel = modelAudi;
            String audiMake = getMakeAudi(makeAudi);
            String audiCountry = getCountryAudi(countryAudi);

            String benzModel = modelBenz;
            String benzMake = getMakeBenz(makeBenz);
            String benzCountry = getCountryBenz(countryBenz);

            String chevroletModel = modelChevrolet;
            String chevroletMake = getMakeChevrolet(makeChevrolet);
            String chevroletCountry = getCountryChevrolet(countryChevrolet);

            String jaguarModel = modelJaguar;
            String jaguarMake = getMakeJaguar(makeJaguar);
            String jaguarCountry = getCountryJaguar(countryJaguar);

            String rollsRoyceModel = modelRollsRoyce;
            String rollsRoyceMake = getMakeRollsRoyce(makeRollsRoyce);
            String rollsRoyceCountry = getCountryRollsRoyce(countryRollsRoyce);

            Intent intent = new Intent(this, ResultsActivity.class);

            //creating and storing data into bundle
            Bundle bundle = new Bundle();
            bundle.putString("audiMake", audiMake);
            bundle.putString("audiCountry", audiCountry);
            bundle.putString("audiModel", audiModel);

            bundle.putString("benzMake", benzMake);
            bundle.putString("benzCountry", benzCountry);
            bundle.putString("benzModel", benzModel);

            bundle.putString("chevroletMake", chevroletMake);
            bundle.putString("chevroletCountry", chevroletCountry);
            bundle.putString("chevroletModel", chevroletModel);

            bundle.putString("jaguarMake", jaguarMake);
            bundle.putString("jaguarCountry", jaguarCountry);
            bundle.putString("jaguarModel", jaguarModel);

            bundle.putString("rollsRoyceMake", rollsRoyceMake);
            bundle.putString("rollsRoyceCountry", rollsRoyceCountry);
            bundle.putString("rollsRoyceModel", rollsRoyceModel);

            intent.putExtras(bundle);
            startActivity(intent);
        }

    }

    public String getMakeAudi(String makeOne){
        if ((makeOne != "audi")){
            makeAudi = "Incorrect answer! Logo 1 is the Audi logo.";
        } else{
            makeAudi = "Correct! Logo 1 is an Audi logo!";
        }
        return makeAudi;
    }

    public String getCountryAudi(String countryOne){
        if (countryOne != "germany"){
            countryAudi = "Incorrect answer! The Audi originates from Germany.";
        } else{
            countryAudi = "Correct! Germany is the mother of Audi!";
        }
        return countryAudi;
    }

    public String getMakeBenz(String makeTwo){
        if ((makeTwo != "mercedesbenz")){
            makeBenz = "Incorrect answer! Logo 2 is the Mercedes Benz logo!";
        } else{
            makeBenz = "Correct! Logo 2 is for the Mercedes Benz.";
        }
        return makeBenz;
    }

    public String getCountryBenz(String countryTwo){
        if (countryTwo != "germany"){
            countryBenz = "Incorrect answer! The Mercedes Benz is a German car.";
        } else{
            countryBenz = "Correct! The Mercedes Benz is of German origin.";
        }
        return countryBenz;
    }

    public String getMakeChevrolet(String makeThree){
        if ((makeThree != "chevrolet")){
            makeChevrolet = "Incorrect answer! Logo 3 is for the Chevrolet car make.";
        } else{
            makeChevrolet = "Correct! Logo 3 is the Chevrolet logo.";
        }
        return makeChevrolet;
    }

    public String getCountryChevrolet(String countryThree){
        if (countryThree != "usa"  || countryThree != "unitedstatesofamerica"){
            countryChevrolet = "Incorrect answer! The Chevrolet is manufactured from USA.";
        } else{
            countryChevrolet = "Your answer was right! The Chevrolet is manufactured from the USA.";
        }
        return countryChevrolet;
    }

    public String getMakeJaguar(String makeFour){
        if ((makeFour != "jaguar")){
            makeJaguar = "Incorrect answer! Logo 4 corresponds to the Jaguar make.";
        } else{
            makeJaguar = "Correct! Logo 4 is the Jaguar car logo";

        }
        return makeJaguar;
    }

    public String getCountryJaguar(String countryFour){
        if (countryFour != "uk" || countryFour != "unitedkingdom"){
            countryJaguar = "Incorrect answer! The Jaguar is manufactured from the UK!";
        } else{
            countryJaguar = "Your answer was right. Jaguar originates from the UK.";
        }
        return countryJaguar;
    }

    public String getMakeRollsRoyce(String makeFive){
        if ((makeFive != "rollsroyce")){
            makeRollsRoyce = "Incorrect answer! Logo 5 is RollsRoyce!";
        } else{
            makeRollsRoyce = "Right answer! Logo 5 is a RollsRoyce.";
        }
        return makeRollsRoyce;
    }

    public String getCountryRollsRoyce(String countryFive){
        if (countryFive != "uk" || countryFive != "britain"){
            countryRollsRoyce = "Incorrect answer. Britain is home to the RollsRoyce.";
        } else{
            countryRollsRoyce = "Right answer! The RollsRoyce is of Britain make.";
        }
        return countryRollsRoyce;
    }

}