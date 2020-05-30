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

public class cmathOne extends AppCompatActivity {
    ListView listt;
    String titless[]={"Relations","Polynomials","Surds","Measurement of Angles","Trigonometry","Coordinate Geometry","Statistics","Matrixs","Vectors","Transformations","Sequence and Series","abcd"};
    String descriptionss[]={"Relations","Polynomials","Surds","Measurement of Angles","Trigonometry","Coordinate Geometry","Statistics","Matrixs","Vectors","Transformations","Sequence and Series","abcd"};
    int imgss[]={R.drawable.unit_one,R.drawable.unit_two,R.drawable.unit_three,R.drawable.unit_four,R.drawable.unit_five,R.drawable.unit_six,R.drawable.unit_seven,R.drawable.unit_eight,R.drawable.unit_nine,R.drawable.unit_ten,R.drawable.unit_eleven,R.drawable.unit_twelve};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmath_one);

        listt=findViewById(R.id.cmath_list1);
        //create custom adapter
        MyAdapter adapter=new MyAdapter(this,titless,imgss,descriptionss);
        listt.setAdapter(adapter);
        listt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(cmathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(cmathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(cmathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==3){
                    Toast.makeText(cmathOne.this, "position four clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==4){
                    Toast.makeText(cmathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==5){
                    Toast.makeText(cmathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==6){
                    Toast.makeText(cmathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==7){
                    Toast.makeText(cmathOne.this, "position four clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==8){
                    Toast.makeText(cmathOne.this, "position one clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==9){
                    Toast.makeText(cmathOne.this, "position two clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==10){
                    Toast.makeText(cmathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
                if(position==11){
                    Toast.makeText(cmathOne.this, "position three clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    class MyAdapter extends ArrayAdapter<String> {
        Context contextt;
        String myTitless[];
        String myDescriptionss[];
        int[] imgss;

        MyAdapter(Context cc, String[] titless,int[] imgss, String[] descriptionss){
            super(cc,R.layout.cmath_row, R.id.cmath_text1,titless);
            this.contextt=cc;
            this.imgss=imgss;
            this.myTitless=titless;
            this.myDescriptionss=descriptionss;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View cmath_row=layoutInflater.inflate(R.layout.cmath_row, parent,false);
            ImageView imagess=cmath_row.findViewById(R.id.cmath_logo);
            TextView myTitless=cmath_row.findViewById(R.id.cmath_text1);
            TextView myDescriptionss=cmath_row.findViewById(R.id.cmath_text2);
            imagess.setImageResource(imgss[position]);
            myTitless.setText(titless[position]);
            myDescriptionss.setText(descriptionss[position]);
            return cmath_row;
        }
    }
}
