package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button selectbtn;
   RadioButton gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectbtn=findViewById(R.id.selectbtn);
        radioGroup=findViewById(R.id.radiogroup);

      selectbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             int selectid= radioGroup.getCheckedRadioButtonId();
             gender=findViewById(selectid);
             String value=gender.getText().toString();
              Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();
          }
      });
    }
}