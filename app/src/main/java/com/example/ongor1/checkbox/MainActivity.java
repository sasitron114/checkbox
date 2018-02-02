package com.example.ongor1.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox momcheckBox;
    private CheckBox dadcheckBox;
    private CheckBox grandpacheckBox;
    private Button Showbutton;
    private TextView ShowTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momcheckBox = (CheckBox)findViewById(R.id.momcheckBoxID);
        dadcheckBox = (CheckBox)findViewById(R.id.dadID);
        grandpacheckBox = (CheckBox)findViewById(R.id.GrandpaID);
        ShowTextView = (TextView)findViewById(R.id.resultID);
        Showbutton = (Button)findViewById(R.id.showbuttonID);

        Showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder StringBuilder = new StringBuilder();
                StringBuilder.append(momcheckBox.getText().toString()+"satus is:"+
                        momcheckBox.isChecked()+ "\n");
                StringBuilder.append(dadcheckBox.getText().toString()+"satus is:"+
                        dadcheckBox.isChecked()+ "\n");
                StringBuilder.append(grandpacheckBox.getText().toString()+"satus is:"+
                       grandpacheckBox.isChecked()+ "\n");

                ShowTextView.setText(StringBuilder);
            }
        });
    }
}
