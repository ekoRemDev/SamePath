package app.flyingpigstudios.samepath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity{

    // Benzersiz rassal sayi uretmek icin
    Random r;
    List<Integer> randomNumbersArray = new ArrayList<Integer>();
    int randomNumber;

    private void rassalSayiUret() {
        r = new Random();
        // sayi uret
        randomNumber = r.nextInt(25) + 1;

        if (randomNumbersArray.contains(randomNumber)) {
            rassalSayiUret();
            Log.i("tureme", "yeniden turetildi");
        } else {
            randomNumbersArray.add(randomNumber);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("array", "array uzunlugu " + String.valueOf(randomNumbersArray.size()));

                rassalSayiUret();

                for(int i=0;i<randomNumbersArray.size();i++){
                    Log.i("array", randomNumbersArray.get(i).toString());
                }

            }
        });


        Button btn2x2 = findViewById(R.id.button_2x2);
        btn2x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Puzzle2x2.class);
                startActivity(i);
//                finish();

            }
        });


        Button btn5x5 = findViewById(R.id.button_5x5);
        btn5x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Puzzle5x5.class);
                startActivity(i);
//                finish();

            }
        });




    }

}


