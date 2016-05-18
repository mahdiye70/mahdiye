package com.viam.androidmaker.sabtenam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.longText);

        StringBuffer sb = new StringBuffer();
        sb.append(getString(R.string.ghavanin));
        sb.append(getString(R.string.ghavanin));
        sb.append(getString(R.string.ghavanin));
        sb.append(getString(R.string.ghavanin));

        //added line 1
        //added line 2
        tv.setText(sb.toString());


    }

    public void itemClicked(View v) {


            //code to check if this checkbox is checked!

        CheckBox checkBox = (CheckBox)v;

        if (((CheckBox) v).isChecked()) {
            Toast.makeText(MainActivity.this,
                    "accept rules", Toast.LENGTH_LONG).show();

            Button btn = (Button) findViewById(R.id.button);

            btn.setVisibility(View.VISIBLE);


        }
    }

    public void register(View view) {


        setContentView(R.layout.register);


    }
}
