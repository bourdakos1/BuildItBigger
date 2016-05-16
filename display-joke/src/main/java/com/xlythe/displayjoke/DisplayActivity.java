package com.xlythe.displayjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    public static String JOKE_EXTRA = "joke_extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView text = (TextView) findViewById(R.id.joke);

        String joke = getIntent().getStringExtra(JOKE_EXTRA);
        text.setText(joke);
    }
}
