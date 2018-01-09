package com.ariflr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String NIS = "200101010";
    String Nama = "Roy Simbiring";
    String Alamat = "Jl Kijang No 2 , Pesanggarahan, Jawa Barat";
    String Email = " roy@sembiring.com";
    String HP = "0812811111";
    String Tlp = "29990010101";
    String Pos = "16830";

    TextView dNis , dNama , dAlm , dEml , dHp , dPos , dTlp , dKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dNis = (TextView) findViewById(R.id.dNis);
        dNama = (TextView) findViewById(R.id.dNama);
        dAlm = (TextView) findViewById(R.id.dAlm);
        dKota = (TextView) findViewById(R.id.dKota);
        dPos = (TextView) findViewById(R.id.dPos);
        dHp = (TextView) findViewById(R.id.dHp);
        dEml = (TextView) findViewById(R.id.dEml);
        dTlp = (TextView) findViewById(R.id.dTlp);

        dNis.setText(NIS);
        dNama.setText(Nama);
        dAlm.setText(Alamat);
        dEml.setText(Email);
        dHp.setText(HP);
        dTlp.setText(Tlp);
        dPos.setText(Pos);
    }

}
