package designtest.davidweik.votieraufgabe9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NutzerDatenEingabe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutzer_daten_eingabe);
    }

    public void nutzerDatenAnzeigen(View v) {
        TextView email = (TextView) findViewById(R.id.email);
        TextView preis_min = (TextView) findViewById(R.id.min_price);
        TextView preis_max = (TextView) findViewById(R.id.max_price);
        TextView anzahl_ew = (TextView) findViewById(R.id.number_adults);
        TextView anzahl_ki = (TextView) findViewById(R.id.number_kids);
        TextView anzahl_pt = (TextView) findViewById(R.id.number_pets);
        TextView datum_v = (TextView) findViewById(R.id.friste_date);
        TextView datum_b = (TextView) findViewById(R.id.second_date);
        TextView zielort = (TextView) findViewById(R.id.target_country);

        Intent nutzerDatenAnzeigen = new Intent(this, NutzerDatenActivity.class);
        nutzerDatenAnzeigen.putExtra("email",email.getText().toString());
        nutzerDatenAnzeigen.putExtra("zielort",zielort.getText().toString());
        nutzerDatenAnzeigen.putExtra("preis_min", preis_min.getText().toString());
        nutzerDatenAnzeigen.putExtra("preis_max", preis_max.getText().toString());
        nutzerDatenAnzeigen.putExtra("anzahl_ew", anzahl_ew.getText().toString());
        nutzerDatenAnzeigen.putExtra("anzahl_ki", anzahl_ki.getText().toString());
        nutzerDatenAnzeigen.putExtra("anzahl_pt", anzahl_pt.getText().toString());
        nutzerDatenAnzeigen.putExtra("datum_v", datum_v.getText().toString());
        nutzerDatenAnzeigen.putExtra("datum_b", datum_b.getText().toString());

        startActivity(nutzerDatenAnzeigen);
    }
}
