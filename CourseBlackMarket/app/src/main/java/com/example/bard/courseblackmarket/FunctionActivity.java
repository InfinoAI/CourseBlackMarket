package com.example.bard.courseblackmarket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        Button button = (Button) findViewById(R.id.addcourse);
        button.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(FunctionActivity.this, FakePage.class);
                        startActivity(intent);
                    }
                });

        button = (Button) findViewById(R.id.mycourse);
        button.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(FunctionActivity.this, OwnedClass.class);
                        startActivity(intent);
                    }
                });

        button = (Button) findViewById(R.id.exchange);
        button.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(FunctionActivity.this, NewApplicationActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
