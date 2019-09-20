package app.flyingpigstudios.samepath;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Puzzle2x2 extends AppCompatActivity {


    ImageView tile1, tile2, tile3, tile4;

    ImageView path01, path02, path03, path04;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzle2x2);


        path01 = findViewById(R.id.imageview_path01);
        path02 = findViewById(R.id.imageview_path02);
        path03 = findViewById(R.id.imageview_path03);
        path04 = findViewById(R.id.imageview_path04);


        Button btnPlay = findViewById(R.id.button_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumbersArray.clear();

                tile1 = findViewById(R.id.imageview_tile01);
                tile2 = findViewById(R.id.imageview_tile02);
                tile3 = findViewById(R.id.imageview_tile03);
                tile4 = findViewById(R.id.imageview_tile04);


                tile1.setImageResource(R.drawable.ic_placeholder_0);
                tile2.setImageResource(R.drawable.ic_placeholder_0);
                tile3.setImageResource(R.drawable.ic_placeholder_0);
                tile4.setImageResource(R.drawable.ic_placeholder_0);


                path01.setImageResource(R.drawable.ic_placeholder_0);
                path02.setImageResource(R.drawable.ic_placeholder_0);
                path03.setImageResource(R.drawable.ic_placeholder_0);
                path04.setImageResource(R.drawable.ic_placeholder_0);





                rassalSayiUret();
                rassalSayiUret();


                for (int i = 0; i < randomNumbersArray.size(); i++) {
                    Log.i("array", randomNumbersArray.get(i).toString());
                }


                if (randomNumbersArray.get(0) == 1) {
                    tile1.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 2) {
                    tile2.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 3) {
                    tile3.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 4) {
                    tile4.setImageResource(R.drawable.ic_placeholder_1);
                }


                if (randomNumbersArray.get(1) == 1) {
                    tile1.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 2) {
                    tile2.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 3) {
                    tile3.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 4) {
                    tile4.setImageResource(R.drawable.ic_placeholder_1);
                }


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tile1.setImageResource(R.drawable.ic_placeholder_0);
                        tile2.setImageResource(R.drawable.ic_placeholder_0);
                        tile3.setImageResource(R.drawable.ic_placeholder_0);
                        tile4.setImageResource(R.drawable.ic_placeholder_0);
                    }
                }, 1000);

                Toast.makeText(Puzzle2x2.this, "Start Playing Now", Toast.LENGTH_SHORT).show();


            }
        });



        Button btnHint = findViewById(R.id.button_hint);
        btnHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomNumbersArray.get(0) == 1) {
                    tile1.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 2) {
                    tile2.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 3) {
                    tile3.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 4) {
                    tile4.setImageResource(R.drawable.ic_placeholder_1);
                }


                if (randomNumbersArray.get(1) == 1) {
                    tile1.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 2) {
                    tile2.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 3) {
                    tile3.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 4) {
                    tile4.setImageResource(R.drawable.ic_placeholder_1);
                }


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tile1.setImageResource(R.drawable.ic_placeholder_0);
                        tile2.setImageResource(R.drawable.ic_placeholder_0);
                        tile3.setImageResource(R.drawable.ic_placeholder_0);
                        tile4.setImageResource(R.drawable.ic_placeholder_0);
                    }
                }, 100);
            }
        });

        path01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(1)){
                    path01.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(2)){
                    path02.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(3)){
                    path03.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(4)){
                    path04.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });


    }


    // Benzersiz rassal sayi uretmek icin
    Random r;
    List<Integer> randomNumbersArray = new ArrayList<Integer>();
    int randomNumber;

    private void rassalSayiUret() {
        r = new Random();
        // sayi uret
        randomNumber = r.nextInt(4) + 1;

        if (randomNumbersArray.contains(randomNumber)) {
            rassalSayiUret();
            Log.i("tureme", "yeniden turetildi");
        } else {
            randomNumbersArray.add(randomNumber);
        }
    }


}
