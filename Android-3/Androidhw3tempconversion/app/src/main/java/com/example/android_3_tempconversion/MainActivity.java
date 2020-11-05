package com.example.temperatureconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private Button btn1,btn2;
    private double c,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
    }

    private void findviews(){
        et1=(EditText)findViewById(R.id.ed1);
        et2=(EditText)findViewById(R.id.ed2);
        btn1=(Button)findViewById(R.id.F);
        btn2=(Button)findViewById(R.id.C);

        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }
    View.OnClickListener listener=new View.OnClickListener() {


        public void onClick(View v) {

            if(v.getId()==R.id.F){
                try{
                    c=Double.parseDouble(et1.getText().toString());
                }catch (NumberFormatException e){
                }
                f=c*9/5+32;
                et2.setText(String.valueOf(f));
            }
            else if(v.getId()==R.id.C) {

                try{
                    f=Double.parseDouble(et2.getText().toString());
                }catch (NumberFormatException e){
                }
                c=(f-32)*5/9;
                et1.setText(String.valueOf(c));
            }
        }
    };
}
