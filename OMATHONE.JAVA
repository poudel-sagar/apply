package com.example.last.blesolution;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class omathOne extends AppCompatActivity {
    ListView listtt;
    String titlesss[]={"Relations","Polynomials","Surds","Measurement of Angles","Trigonometry","Coordinate Geometry","Statistics","Matrixs","Vectors","Transformations","Sequence and Series"};
    String descriptionsss[]={"Relations","Polynomials","Surds","Measurement of Angles","Trigonometry","Coordinate Geometry","Statistics","Matrixs","Vectors","Transformations","Sequence and Series"};
    int imgsss[]={R.drawable.unit_one,R.drawable.unit_two,R.drawable.unit_three,R.drawable.unit_four,R.drawable.unit_five,R.drawable.unit_six,R.drawable.unit_seven,R.drawable.unit_eight,R.drawable.unit_nine,R.drawable.unit_ten,R.drawable.unit_eleven};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omath_one);

        listtt=findViewById(R.id.omath_list1);
        //create custom adapter
        MyAdapter adapterrr=new MyAdapter(this,titlesss,imgsss,descriptionsss);
        listtt.setAdapter(adapterrr);

        listtt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(omathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(omathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(omathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Toast.makeText(omathOne.this, "position four clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==4){
                    Toast.makeText(omathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==5){
                    Toast.makeText(omathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==6){
                    Toast.makeText(omathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==7){
                    Toast.makeText(omathOne.this, "position four clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==8){
                    Toast.makeText(omathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==9){
                    Toast.makeText(omathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==10){
                    Toast.makeText(omathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==11){
                    Toast.makeText(omathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
    class MyAdapter extends ArrayAdapter<String> {
        Context contexttt;
        String myTitlesss[];
        String myDescriptionsss[];
        int[] imgsss;

        MyAdapter(Context ccc, String[] titlesss,int[] imgsss, String[] descriptionsss){
            super(ccc,R.layout.omath_row, R.id.omath_text1,titlesss);
            this.contexttt=ccc;
            this.imgsss=imgsss;
            this.myTitlesss=titlesss;
            this.myDescriptionsss=descriptionsss;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View omath_row=layoutInflater.inflate(R.layout.omath_row, parent,false);
            ImageView imagesss=omath_row.findViewById(R.id.omath_logo);
            TextView myTitlesss=omath_row.findViewById(R.id.omath_text1);
            TextView myDescriptionsss=omath_row.findViewById(R.id.omath_text2);
            imagesss.setImageResource(imgsss[position]);
            myTitlesss.setText(titlesss[position]);
            myDescriptionsss.setText(descriptionsss[position]);
            return omath_row;
        }
    }
}
