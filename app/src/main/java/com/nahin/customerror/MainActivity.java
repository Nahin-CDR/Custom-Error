package com.nahin.customerror;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        input = (EditText)findViewById( R.id.editTextID );
        check = (Button)findViewById( R.id.buttonID );
        final String key = "01";
        final String my_input = input.getText().toString().trim();

        check.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(my_input.equals( key ))
                {
                    Toast.makeText( MainActivity.this, "good job", Toast.LENGTH_SHORT ).show();
                }
                else {
                    Toast.makeText( MainActivity.this, "Something went wrong!", Toast.LENGTH_SHORT ).show();
                   // input.setError("Oops! empty.", error_indicator);
                }
            }
        } );

    }
}
