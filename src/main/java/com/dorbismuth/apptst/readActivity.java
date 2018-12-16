package com.dorbismuth.apptst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class readActivity extends AppCompatActivity {
    TextView _title,_description,_source;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        Intent i = getIntent();
        _title = (TextView) findViewById(R.id.title);
        _description = (TextView) findViewById(R.id.description);
        _source = (TextView) findViewById(R.id.source);

        _title.setText(i.getExtras().getString("title"));
        _description.setText(i.getExtras().getString("description"));
        _source.setText(i.getExtras().getString("source"));

    }
}
