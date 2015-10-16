package designtest.davidweik.votieraufgabe9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NutzerDatenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutzer_daten);

        String email = getIntent().getStringExtra("email");
        String datum_v = getIntent().getStringExtra("datum_v");
        String datum_b = getIntent().getStringExtra("datum_b");
        String preis_min = getIntent().getStringExtra("preis_min");
        String preis_max = getIntent().getStringExtra("preis_max");
        String anzahl_ew = getIntent().getStringExtra("anzahl_ew");
        String anzahl_ki = getIntent().getStringExtra("anzahl_ki");
        String anzahl_pt = getIntent().getStringExtra("anzahl_pt");
        String zielort = getIntent().getStringExtra("zielort");

        TextView datenAnzeigen = (TextView) findViewById(R.id.ihre_angaben);
        datenAnzeigen.setText("Datum von: " +datum_v + " bis: " +datum_b +"\nZielort: " +zielort +"\nAnzahl Erwachsene: " +anzahl_ew +"\nAnzahl Kinder: " +"\nAnzahl Tiere: " +anzahl_pt +"\nPreis von: " +preis_min +" bis: " +preis_max +"\nE-Mail: " +email);
    }


}
