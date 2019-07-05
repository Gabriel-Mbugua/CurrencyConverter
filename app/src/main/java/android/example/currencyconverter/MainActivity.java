package android.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }

    public void convertCurrency(View view) {
        EditText textInput = findViewById(R.id.dollarNumber);
        double number = Double.parseDouble(textInput.getText().toString());
        double numberKsh = number * 101.85;

        Toast.makeText(MainActivity.this,"Kenya shillings: " + numberKsh,Toast.LENGTH_SHORT).show();
    }
}

