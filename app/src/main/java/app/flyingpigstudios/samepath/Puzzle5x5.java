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

public class Puzzle5x5 extends AppCompatActivity {


    ImageView
            tile01, tile02, tile03, tile04,tile05,
            tile06, tile07, tile08, tile09,tile10,
            tile11, tile12, tile13, tile14,tile15,
            tile16, tile17, tile18, tile19,tile20,
            tile21, tile22, tile23, tile24,tile25
            ;

    ImageView
            path01, path02, path03, path04, path05,
            path06, path07, path08, path09, path10,
            path11, path12, path13, path14, path15,
            path16, path17, path18, path19, path20,
            path21, path22, path23, path24, path25
            ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puzzle5x5);


        path01 = findViewById(R.id.imageview_path01);
        path02 = findViewById(R.id.imageview_path02);
        path03 = findViewById(R.id.imageview_path03);
        path04 = findViewById(R.id.imageview_path04);
        path05 = findViewById(R.id.imageview_path05);
        path06 = findViewById(R.id.imageview_path06);
        path07 = findViewById(R.id.imageview_path07);
        path08 = findViewById(R.id.imageview_path08);
        path09 = findViewById(R.id.imageview_path09);
        path10 = findViewById(R.id.imageview_path10);
        path11 = findViewById(R.id.imageview_path11);
        path12 = findViewById(R.id.imageview_path12);
        path13 = findViewById(R.id.imageview_path13);
        path14 = findViewById(R.id.imageview_path14);
        path15 = findViewById(R.id.imageview_path15);
        path16 = findViewById(R.id.imageview_path16);
        path17 = findViewById(R.id.imageview_path17);
        path18 = findViewById(R.id.imageview_path18);
        path19 = findViewById(R.id.imageview_path19);
        path20 = findViewById(R.id.imageview_path20);
        path21 = findViewById(R.id.imageview_path21);
        path22 = findViewById(R.id.imageview_path22);
        path23 = findViewById(R.id.imageview_path23);
        path24 = findViewById(R.id.imageview_path24);
        path25 = findViewById(R.id.imageview_path25);


        tile01 = findViewById(R.id.imageview_tile01);
        tile02 = findViewById(R.id.imageview_tile02);
        tile03 = findViewById(R.id.imageview_tile03);
        tile04 = findViewById(R.id.imageview_tile04);
        tile05 = findViewById(R.id.imageview_tile05);
        tile06 = findViewById(R.id.imageview_tile06);
        tile07 = findViewById(R.id.imageview_tile07);
        tile08 = findViewById(R.id.imageview_tile08);
        tile09 = findViewById(R.id.imageview_tile09);
        tile10 = findViewById(R.id.imageview_tile10);
        tile11 = findViewById(R.id.imageview_tile11);
        tile12 = findViewById(R.id.imageview_tile12);
        tile13 = findViewById(R.id.imageview_tile13);
        tile14 = findViewById(R.id.imageview_tile14);
        tile15 = findViewById(R.id.imageview_tile15);
        tile16 = findViewById(R.id.imageview_tile16);
        tile17 = findViewById(R.id.imageview_tile17);
        tile18 = findViewById(R.id.imageview_tile18);
        tile19 = findViewById(R.id.imageview_tile19);
        tile20 = findViewById(R.id.imageview_tile20);
        tile21 = findViewById(R.id.imageview_tile21);
        tile22 = findViewById(R.id.imageview_tile22);
        tile23 = findViewById(R.id.imageview_tile23);
        tile24 = findViewById(R.id.imageview_tile24);
        tile25 = findViewById(R.id.imageview_tile25);



        Button btnPlay = findViewById(R.id.button_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomNumbersArray.clear();

                tile01.setImageResource(R.drawable.ic_placeholder_0);
                tile02.setImageResource(R.drawable.ic_placeholder_0);
                tile03.setImageResource(R.drawable.ic_placeholder_0);
                tile04.setImageResource(R.drawable.ic_placeholder_0);
                tile05.setImageResource(R.drawable.ic_placeholder_0);
                tile06.setImageResource(R.drawable.ic_placeholder_0);
                tile07.setImageResource(R.drawable.ic_placeholder_0);
                tile08.setImageResource(R.drawable.ic_placeholder_0);
                tile09.setImageResource(R.drawable.ic_placeholder_0);
                tile10.setImageResource(R.drawable.ic_placeholder_0);
                tile11.setImageResource(R.drawable.ic_placeholder_0);
                tile12.setImageResource(R.drawable.ic_placeholder_0);
                tile13.setImageResource(R.drawable.ic_placeholder_0);
                tile14.setImageResource(R.drawable.ic_placeholder_0);
                tile15.setImageResource(R.drawable.ic_placeholder_0);
                tile16.setImageResource(R.drawable.ic_placeholder_0);
                tile17.setImageResource(R.drawable.ic_placeholder_0);
                tile18.setImageResource(R.drawable.ic_placeholder_0);
                tile19.setImageResource(R.drawable.ic_placeholder_0);
                tile20.setImageResource(R.drawable.ic_placeholder_0);
                tile21.setImageResource(R.drawable.ic_placeholder_0);
                tile22.setImageResource(R.drawable.ic_placeholder_0);
                tile23.setImageResource(R.drawable.ic_placeholder_0);
                tile24.setImageResource(R.drawable.ic_placeholder_0);
                tile25.setImageResource(R.drawable.ic_placeholder_0);

                path01.setImageResource(R.drawable.ic_placeholder_0);
                path02.setImageResource(R.drawable.ic_placeholder_0);
                path03.setImageResource(R.drawable.ic_placeholder_0);
                path04.setImageResource(R.drawable.ic_placeholder_0);
                path05.setImageResource(R.drawable.ic_placeholder_0);
                path06.setImageResource(R.drawable.ic_placeholder_0);
                path07.setImageResource(R.drawable.ic_placeholder_0);
                path08.setImageResource(R.drawable.ic_placeholder_0);
                path09.setImageResource(R.drawable.ic_placeholder_0);
                path10.setImageResource(R.drawable.ic_placeholder_0);
                path11.setImageResource(R.drawable.ic_placeholder_0);
                path12.setImageResource(R.drawable.ic_placeholder_0);
                path13.setImageResource(R.drawable.ic_placeholder_0);
                path14.setImageResource(R.drawable.ic_placeholder_0);
                path15.setImageResource(R.drawable.ic_placeholder_0);
                path16.setImageResource(R.drawable.ic_placeholder_0);
                path17.setImageResource(R.drawable.ic_placeholder_0);
                path18.setImageResource(R.drawable.ic_placeholder_0);
                path19.setImageResource(R.drawable.ic_placeholder_0);
                path20.setImageResource(R.drawable.ic_placeholder_0);
                path21.setImageResource(R.drawable.ic_placeholder_0);
                path22.setImageResource(R.drawable.ic_placeholder_0);
                path23.setImageResource(R.drawable.ic_placeholder_0);
                path24.setImageResource(R.drawable.ic_placeholder_0);
                path25.setImageResource(R.drawable.ic_placeholder_0);


//                rassalSayiUret();
//                rassalSayiUret();

                for (int i = 0; i < 3; i++) {
                    rassalSayiUret();
                }



                for (int i = 0; i < randomNumbersArray.size(); i++) {
                    Log.i("array", randomNumbersArray.get(i).toString());
                }


                if (randomNumbersArray.get(0) == 1) {
                    tile01.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 2) {
                    tile02.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 3) {
                    tile03.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 4) {
                    tile04.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 5) {
                    tile05.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 6) {
                    tile06.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 7) {
                    tile07.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 8) {
                    tile08.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 9) {
                    tile09.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 10) {
                    tile10.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 11) {
                    tile11.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 12) {
                    tile12.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 13) {
                    tile13.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 14) {
                    tile14.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 15) {
                    tile15.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 16) {
                    tile16.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 17) {
                    tile17.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 18) {
                    tile18.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 19) {
                    tile19.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 20) {
                    tile20.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 21) {
                    tile21.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 22) {
                    tile22.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 23) {
                    tile23.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 24) {
                    tile24.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 25) {
                    tile25.setImageResource(R.drawable.ic_placeholder_1);
                }






                if (randomNumbersArray.get(1) == 1) {
                    tile01.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 2) {
                    tile02.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 3) {
                    tile03.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 4) {
                    tile04.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 5) {
                    tile05.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 6) {
                    tile06.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 7) {
                    tile07.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 8) {
                    tile08.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 9) {
                    tile09.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 10) {
                    tile10.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 11) {
                    tile11.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 12) {
                    tile12.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 13) {
                    tile13.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 14) {
                    tile14.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 15) {
                    tile15.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 16) {
                    tile16.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 17) {
                    tile17.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 18) {
                    tile18.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 19) {
                    tile19.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 20) {
                    tile20.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 21) {
                    tile21.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 22) {
                    tile22.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 23) {
                    tile23.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 24) {
                    tile24.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 25) {
                    tile25.setImageResource(R.drawable.ic_placeholder_1);
                }





























//                if (randomNumbersArray.get(1) == 1) {
//                    tile01.setImageResource(R.drawable.ic_placeholder_1);
//                }
//
//                if (randomNumbersArray.get(1) == 2) {
//                    tile02.setImageResource(R.drawable.ic_placeholder_1);
//                }
//
//                if (randomNumbersArray.get(1) == 3) {
//                    tile03.setImageResource(R.drawable.ic_placeholder_1);
//                }
//
//                if (randomNumbersArray.get(1) == 4) {
//                    tile04.setImageResource(R.drawable.ic_placeholder_1);
//                }


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tile01.setImageResource(R.drawable.ic_placeholder_0);
                        tile02.setImageResource(R.drawable.ic_placeholder_0);
                        tile03.setImageResource(R.drawable.ic_placeholder_0);
                        tile04.setImageResource(R.drawable.ic_placeholder_0);
                        tile05.setImageResource(R.drawable.ic_placeholder_0);
                        tile06.setImageResource(R.drawable.ic_placeholder_0);
                        tile07.setImageResource(R.drawable.ic_placeholder_0);
                        tile08.setImageResource(R.drawable.ic_placeholder_0);
                        tile09.setImageResource(R.drawable.ic_placeholder_0);
                        tile10.setImageResource(R.drawable.ic_placeholder_0);
                        tile11.setImageResource(R.drawable.ic_placeholder_0);
                        tile12.setImageResource(R.drawable.ic_placeholder_0);
                        tile13.setImageResource(R.drawable.ic_placeholder_0);
                        tile14.setImageResource(R.drawable.ic_placeholder_0);
                        tile15.setImageResource(R.drawable.ic_placeholder_0);
                        tile16.setImageResource(R.drawable.ic_placeholder_0);
                        tile17.setImageResource(R.drawable.ic_placeholder_0);
                        tile18.setImageResource(R.drawable.ic_placeholder_0);
                        tile19.setImageResource(R.drawable.ic_placeholder_0);
                        tile20.setImageResource(R.drawable.ic_placeholder_0);
                        tile21.setImageResource(R.drawable.ic_placeholder_0);
                        tile22.setImageResource(R.drawable.ic_placeholder_0);
                        tile23.setImageResource(R.drawable.ic_placeholder_0);
                        tile24.setImageResource(R.drawable.ic_placeholder_0);
                        tile25.setImageResource(R.drawable.ic_placeholder_0);
                    }
                }, 1000);

                Toast.makeText(Puzzle5x5.this, "Start Playing Now", Toast.LENGTH_SHORT).show();


            }
        });



        Button btnHint = findViewById(R.id.button_hint);
        btnHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (randomNumbersArray.get(0) == 1) {
                    tile01.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 2) {
                    tile02.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 3) {
                    tile03.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(0) == 4) {
                    tile04.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 5) {
                    tile05.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 6) {
                    tile06.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 7) {
                    tile07.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 8) {
                    tile08.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 9) {
                    tile09.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 10) {
                    tile10.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 11) {
                    tile11.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 12) {
                    tile12.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 13) {
                    tile13.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 14) {
                    tile14.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 15) {
                    tile15.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 16) {
                    tile16.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 17) {
                    tile17.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 18) {
                    tile18.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 19) {
                    tile19.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 20) {
                    tile20.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 21) {
                    tile21.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 22) {
                    tile22.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 23) {
                    tile23.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 24) {
                    tile24.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(0) == 25) {
                    tile25.setImageResource(R.drawable.ic_placeholder_1);
                }






                if (randomNumbersArray.get(1) == 1) {
                    tile01.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 2) {
                    tile02.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 3) {
                    tile03.setImageResource(R.drawable.ic_placeholder_1);
                }

                if (randomNumbersArray.get(1) == 4) {
                    tile04.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 5) {
                    tile05.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 6) {
                    tile06.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 7) {
                    tile07.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 8) {
                    tile08.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 9) {
                    tile09.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 10) {
                    tile10.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 11) {
                    tile11.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 12) {
                    tile12.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 13) {
                    tile13.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 14) {
                    tile14.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 15) {
                    tile15.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 16) {
                    tile16.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 17) {
                    tile17.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 18) {
                    tile18.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 19) {
                    tile19.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 20) {
                    tile20.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 21) {
                    tile21.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 22) {
                    tile22.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 23) {
                    tile23.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 24) {
                    tile24.setImageResource(R.drawable.ic_placeholder_1);
                }
                if (randomNumbersArray.get(1) == 25) {
                    tile25.setImageResource(R.drawable.ic_placeholder_1);
                }


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tile01.setImageResource(R.drawable.ic_placeholder_0);
                        tile02.setImageResource(R.drawable.ic_placeholder_0);
                        tile03.setImageResource(R.drawable.ic_placeholder_0);
                        tile04.setImageResource(R.drawable.ic_placeholder_0);
                        tile05.setImageResource(R.drawable.ic_placeholder_0);
                        tile06.setImageResource(R.drawable.ic_placeholder_0);
                        tile07.setImageResource(R.drawable.ic_placeholder_0);
                        tile08.setImageResource(R.drawable.ic_placeholder_0);
                        tile09.setImageResource(R.drawable.ic_placeholder_0);
                        tile10.setImageResource(R.drawable.ic_placeholder_0);
                        tile11.setImageResource(R.drawable.ic_placeholder_0);
                        tile12.setImageResource(R.drawable.ic_placeholder_0);
                        tile13.setImageResource(R.drawable.ic_placeholder_0);
                        tile14.setImageResource(R.drawable.ic_placeholder_0);
                        tile15.setImageResource(R.drawable.ic_placeholder_0);
                        tile16.setImageResource(R.drawable.ic_placeholder_0);
                        tile17.setImageResource(R.drawable.ic_placeholder_0);
                        tile18.setImageResource(R.drawable.ic_placeholder_0);
                        tile19.setImageResource(R.drawable.ic_placeholder_0);
                        tile20.setImageResource(R.drawable.ic_placeholder_0);
                        tile21.setImageResource(R.drawable.ic_placeholder_0);
                        tile22.setImageResource(R.drawable.ic_placeholder_0);
                        tile23.setImageResource(R.drawable.ic_placeholder_0);
                        tile24.setImageResource(R.drawable.ic_placeholder_0);
                        tile25.setImageResource(R.drawable.ic_placeholder_0);
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

        path05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(5)){
                    path05.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(6)){
                    path06.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(7)){
                    path07.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(8)){
                    path08.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(9)){
                    path09.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(10)){
                    path10.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(11)){
                    path11.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(12)){
                    path12.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(13)){
                    path13.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(14)){
                    path14.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(15)){
                    path15.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(16)){
                    path16.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(17)){
                    path17.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(18)){
                    path18.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(19)){
                    path19.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(20)){
                    path20.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(21)){
                    path21.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });
        path22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(22)){
                    path22.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(23)){
                    path23.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(24)){
                    path24.setImageResource(R.drawable.ic_placeholder_1);
                }
            }
        });

        path25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(randomNumbersArray.contains(25)){
                    path25.setImageResource(R.drawable.ic_placeholder_1);
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
        randomNumber = r.nextInt(25) + 1;

        if (randomNumbersArray.contains(randomNumber)) {
            rassalSayiUret();
            Log.i("tureme", "yeniden turetildi");
        } else {
            randomNumbersArray.add(randomNumber);
        }
    }


}
