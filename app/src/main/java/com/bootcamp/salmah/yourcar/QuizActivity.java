package com.bootcamp.salmah.yourcar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    String modelAudi;
    String modelBenz;
    String modelChevrolet;
    String modelJaguar;
    String modelRollsRoyce;

    String audiCar;
    String benzCar;
    String chevroletCar;
    String jaguarCar;
    String rollsRoyceCar;

    String audiHome;
    String benzHome;
    String chevroletHome;
    String jaguarHome;
    String rollsRoyceHome;



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
        audiCar = audiMakeEditable.toString().trim();

        EditText audiCountryEditText = (EditText) findViewById(audi_country_et);
        Editable audiCountryEditable = audiCountryEditText.getText();
        audiHome = audiCountryEditable.toString().trim();

        EditText benzMakeEditText = (EditText) findViewById(benz_make_et);
        Editable benzMakeEditable = benzMakeEditText.getText();
        benzCar = benzMakeEditable.toString().trim();

        EditText benzCountryEditText = (EditText) findViewById(benz_country_et);
        Editable benzCountryEditable = benzCountryEditText.getText();
        benzHome = benzCountryEditable.toString().trim();

        EditText chevroletMakeEditText = (EditText) findViewById(chevrolet_make_et);
        Editable chevroletMakeEditable = chevroletMakeEditText.getText();
        chevroletCar = chevroletMakeEditable.toString().trim();

        EditText chevroletCountryEditText = (EditText) findViewById(chevrolet_country_et);
        Editable chevroletCountryEditable = chevroletCountryEditText.getText();
        chevroletHome = chevroletCountryEditable.toString().trim();

        EditText jaguarMakeEditText = (EditText) findViewById(jaguar_make_et);
        Editable jaguarMakeEditable = jaguarMakeEditText.getText();
        jaguarCar = jaguarMakeEditable.toString().trim();

        EditText jaguarCountryEditText = (EditText) findViewById(jaguar_country_et);
        Editable jaguarCountryEditable = jaguarCountryEditText.getText();
        jaguarHome = jaguarCountryEditable.toString().trim();

        EditText rollsroyceMakeEditText = (EditText) findViewById(rollsroyce_make_et);
        Editable rollsroyceMakeEditable = rollsroyceMakeEditText.getText();
        rollsRoyceCar = rollsroyceMakeEditable.toString().trim();

        EditText rollsroyceCountryEditText = (EditText) findViewById(rollsroyce_country_et);
        Editable rollsroyceCountryEditable = rollsroyceCountryEditText.getText();
        rollsRoyceHome = rollsroyceCountryEditable.toString().trim();

        if (audiCar.length() == 0 || audiHome.length() == 0 || benzCar.length() == 0
                || benzHome.length() == 0 || chevroletCar.length() == 0
                || chevroletHome.length() == 0 || jaguarCar.length() == 0 || jaguarHome.length() == 0
                || rollsRoyceCar.length() == 0 || rollsRoyceHome.length() == 0) {

            Toast.makeText(getApplicationContext(), "Please fill in the missing fields",
                    Toast.LENGTH_SHORT).show();
        } else {

            String audiModel = modelAudi;
            String audiMake = getMakeAudi(audiCar);
            String audiCountry = getCountryAudi(audiHome);

            String benzModel = modelBenz;
            String benzMake = getMakeBenz(benzCar);
            String benzCountry = getCountryBenz(benzHome);

            String chevroletModel = modelChevrolet;
            String chevroletMake = getMakeChevrolet(chevroletCar);
            String chevroletCountry = getCountryChevrolet(chevroletHome);

            String jaguarModel = modelJaguar;
            String jaguarMake = getMakeJaguar(jaguarCar);
            String jaguarCountry = getCountryJaguar(jaguarHome);

            String rollsRoyceModel = modelRollsRoyce;
            String rollsRoyceMake = getMakeRollsRoyce(rollsRoyceCar);
            String rollsRoyceCountry = getCountryRollsRoyce(rollsRoyceHome);

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

    public String getMakeAudi(String oneMake){
        String makeAudi;
        if (oneMake.equalsIgnoreCase("audi")){
            makeAudi = "Correct! Logo 1 is an Audi logo!";
            return makeAudi;

        } else{
            makeAudi = "Incorrect answer! Logo 1 is the Audi logo.";
            return makeAudi;
        }

    }

    public String getCountryAudi(String oneCountry){
        String countryAudi;
        if (oneCountry.equalsIgnoreCase("germany")){
            countryAudi = "Correct! Germany is the mother of Audi!";
            return countryAudi;
        } else{
            countryAudi = "Incorrect answer! The Audi originates from Germany.";
            return countryAudi;
        }

    }

    public String getMakeBenz(String twoMake){
        String makeBenz;
        if (twoMake.equalsIgnoreCase("mercedes benz") || twoMake.equalsIgnoreCase("benz")){
            makeBenz = "Correct! Logo 2 is for the Mercedes Benz.";
            return makeBenz;
        } else{
            makeBenz = "Incorrect answer! Logo 2 is the Mercedes Benz logo!";
            return makeBenz;
        }

    }

    public String getCountryBenz(String twoCountry){
        String countryBenz;
        if (twoCountry.equalsIgnoreCase("germany")){
            countryBenz = "Correct! The Mercedes Benz is of German origin.";
            return countryBenz;
        } else{
            countryBenz = "Incorrect answer! The Mercedes Benz is a German car.";
            return countryBenz;
        }

    }

    public String getMakeChevrolet(String threeMake){
        String makeChevrolet;
        if (threeMake.equalsIgnoreCase("chevrolet")){
            makeChevrolet = "Correct! Logo 3 is the Chevrolet logo.";
            return makeChevrolet;
        } else{
            makeChevrolet = "Incorrect answer! Logo 3 is for the Chevrolet car make.";
            return makeChevrolet;
        }
    }

    public String getCountryChevrolet(String threeCountry){
        String countryChevrolet;
        if (threeCountry.equalsIgnoreCase("usa") || threeCountry.equalsIgnoreCase("united states of america")){
            countryChevrolet = "Your answer was right! The Chevrolet is manufactured from the USA.";
            return countryChevrolet;
        } else{
            countryChevrolet = "Incorrect answer! The Chevrolet is manufactured from USA.";
            return countryChevrolet;
        }

    }

    public String getMakeJaguar(String fourMake){
        String makeJaguar;
        if (fourMake.equalsIgnoreCase("jaguar")){
            makeJaguar = "Correct! Logo 4 is the Jaguar car logo";
            return makeJaguar;
        } else{
            makeJaguar = "Incorrect answer! Logo 4 corresponds to the Jaguar make.";
            return makeJaguar;
        }

    }

    public String getCountryJaguar(String fourCountry){
        String countryJaguar;
        if (fourCountry.equalsIgnoreCase("uk") || fourCountry.equalsIgnoreCase("united kingdom")){
            countryJaguar = "Your answer was right. Jaguar originates from the UK.";
            return countryJaguar;
        } else{
            countryJaguar = "Incorrect answer! The Jaguar is manufactured from the UK!";
            return countryJaguar;
        }

    }

    public String getMakeRollsRoyce(String fiveMake){
        String makeRollsRoyce;
        if (fiveMake.equalsIgnoreCase("rollsroyce")){
            makeRollsRoyce = "Right answer! Logo 5 is a RollsRoyce.";
            return makeRollsRoyce;
        } else{

            makeRollsRoyce = "Incorrect answer! Logo 5 is RollsRoyce!";
            return makeRollsRoyce;
        }

    }

    public String getCountryRollsRoyce(String fiveCountry){
        String countryRollsRoyce;
        if (fiveCountry.equalsIgnoreCase("uk") || fiveCountry.equalsIgnoreCase("britain")){
            countryRollsRoyce = "Right answer! The RollsRoyce is of Britain make.";
            return countryRollsRoyce;
        } else{
            countryRollsRoyce = "Incorrect answer. Britain is home to the RollsRoyce.";
            return countryRollsRoyce;
        }

    }

}