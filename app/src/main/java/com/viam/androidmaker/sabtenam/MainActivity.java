package com.viam.androidmaker.sabtenam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

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

        tv.setText(sb.toString());
    }
}
