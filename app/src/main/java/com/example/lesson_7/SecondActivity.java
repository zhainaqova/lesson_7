package com.example.lesson_7;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    ImageView image;
    TextView title,desc;
    String data1,data2;
    int imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_second );

        image = findViewById ( R.id.image );
        title = findViewById ( R.id.title );
        desc = findViewById ( R.id.desc );
        getData ();
        setData ();
    }

    private void getData(){
        if (getIntent ().hasExtra ( "imageView" ) && getIntent ().hasExtra ( "data1" )&&
        getIntent ().hasExtra ( "data2" )){
            data1 = getIntent ().getStringExtra ( "data1" );
            data2 = getIntent ().getStringExtra ( "data2" );
            imageView = getIntent ().getIntExtra ( "imageView",1 );

        }else {
            Toast.makeText ( this,"No data.",Toast.LENGTH_SHORT ).show ();
        }
    }


    private void setData(){
        title.setText ( data1 );
        desc.setText ( data2 );
        image.setImageResource ( imageView );

    }
}