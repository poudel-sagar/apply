package com.example.last.classeight;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class omathone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omathone);

        Button relations1= (Button)findViewById(R.id.relations);
        relations1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int31=new Intent(omathone.this,omathchapter_one.class);
                startActivity(int31);

            }
        });
        Button polynomials1= (Button)findViewById(R.id.polynomials);
        polynomials1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int32=new Intent(omathone.this,omathchapter_two.class);
                startActivity(int32);

            }
        });
        Button surds1= (Button)findViewById(R.id.surdss);

        surds1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int33=new Intent(omathone.this,omathchapter_three.class);
                startActivity(int33);

            }
        });
        Button measurement_of_angles3= (Button)findViewById(R.id.measurement_of_angles);

        measurement_of_angles3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int34=new Intent(omathone.this,omathchapter_four.class);
                startActivity(int34);

            }
        });
        Button trigonometry1= (Button)findViewById(R.id.trigonometry);

        trigonometry1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int35=new Intent(omathone.this,omathchapter_five.class);
                startActivity(int35);

            }
        });
        Button coordinate_geometryy1= (Button)findViewById(R.id.coordinate_geometryy);

        coordinate_geometryy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int36=new Intent(omathone.this,omathchapter_six.class);
                startActivity(int36);

            }
        });
        Button statisticss1= (Button)findViewById(R.id.statisticss);

        statisticss1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int37=new Intent(omathone.this,omathchapter_seven.class);
                startActivity(int37);

            }
        });
        Button matrices1= (Button)findViewById(R.id.matrices);

        matrices1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int38=new Intent(omathone.this,omathchapter_eight.class);
                startActivity(int38);

            }
        });
        Button vectors1= (Button)findViewById(R.id.vectors);

        vectors1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int39=new Intent(omathone.this,omathchapter_nine.class);
                startActivity(int39);

            }
        });
        Button transformationn1= (Button)findViewById(R.id.transformationn);

        transformationn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int40=new Intent(omathone.this,omathchapter_ten.class);
                startActivity(int40);

            }
        });
        Button sequence_and_series1= (Button)findViewById(R.id.sequence_and_series);

        sequence_and_series1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int41=new Intent(omathone.this,omathchapter_eleven.class);
                startActivity(int41);

            }
        });
    }
}
