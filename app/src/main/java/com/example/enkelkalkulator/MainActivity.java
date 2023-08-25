package com.example.enkelkalkulator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Hvis noen variabler skal eksistere utenfor onCreate()-metoden, må de deklareres her:
    // EditText tekst1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText tekst1 = (EditText) findViewById(R.id.temp1);
        EditText tekst2 = (EditText) findViewById(R.id.temp2);
        TextView resultat = (TextView) findViewById(R.id.temp3);
        Button addisjonKnapp = (Button) findViewById(R.id.tilAddisjon);
        // Button subtraksjonKnapp = (Button) findViewById(R.id.tilSubtraksjon);
        // Button multiplikasjonKnapp = (Button) findViewById(R.id.tilAddisjon);
        // Button divisjonKnapp = (Button) findViewById(R.id.tilSubtraksjon);

        addisjonKnapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float innverdi1 = Float.parseFloat(tekst1.getText().toString());
                float innverdi2 = Float.parseFloat(tekst2.getText().toString());
                resultat.setText(String.valueOf(convertAddisjon(innverdi1, innverdi2)));
            }
        });
    }
    float convertAddisjon(float innverdi1, float innverdi2) {
        return (innverdi1 + innverdi2);
    }

}