package com.example.lanayusuf.remimemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by LanaYusuf on 10/19/2016.
 */
public class HighPriority extends AppCompatActivity implements View.OnClickListener{

    //TODO: populate a list with events from database
    //When user clicks on event, bring to view event details page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.priority);

        TextView priority = (TextView)findViewById(R.id.txtViewPriority);
        priority.setText("High Priority");

        Button btnBack = (Button)findViewById(R.id.btnBackPriority);
        btnBack.setOnClickListener(this);

        Button btnAddEvent = (Button)findViewById(R.id.btnAddEvent);
        btnAddEvent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnAddEvent:
                //bring to edit event screen
                startActivity(new Intent(this, EditEvent.class));
                break;

            case R.id.btnBackPriority:
                //bring to Main Options screen
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }

}
