package com.example.onder.altaltayazma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button buton;
    EditText isim;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton = (Button) findViewById(R.id.buton);
        isim = (EditText) findViewById(R.id.edit);
        text = (TextView) findViewById(R.id.tv);
    }


    public void tikla(View v){
        text.setText("");
        String ismiAl = isim.getText().toString();

        for(int i = 0;i<ismiAl.length();i++){
          String  varOlan = text.getText().toString();
            text.setText(varOlan + "\n" + ismiAl.charAt(i));


        }

    }


}
