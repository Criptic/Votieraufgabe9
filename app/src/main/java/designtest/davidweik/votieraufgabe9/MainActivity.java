package designtest.davidweik.votieraufgabe9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nutzerDatenActivityAufruf(View v) {
        Intent nutzerDatenActivityAufruf = new Intent(this, NutzerDatenEingabe.class);
        startActivity(nutzerDatenActivityAufruf);
    }
}
