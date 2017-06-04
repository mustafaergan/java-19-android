package com.example.vektorel.loginornek;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class UserMenu extends AppCompatActivity {

    TextView tVHosgeldin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);

        tVHosgeldin = (TextView)findViewById(R.id.tVHosgeldin);

        String veri = this.getIntent().getStringExtra("etLoginName");

        tVHosgeldin.setText(veri + " Hoş Geldin");
    }

    public void toastMesaj(View view){

        Toast.makeText(UserMenu.this, "Calisti", Toast.LENGTH_SHORT).show();


        AlertDialog.Builder dlg = new AlertDialog.Builder(this,
                android.R.style.Theme_Holo_Dialog);

        dlg.setTitle("Merhaba");
        dlg.setMessage("Bugun sıcak mı?");
        dlg.setIcon(R.drawable.a);

        dlg.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(UserMenu.this, "Klima Aç", Toast.LENGTH_SHORT).show();
                Intent inIntent = new Intent(UserMenu.this,KlimaTuslari.class);
                startActivity(inIntent);
            }
        });

        dlg.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(UserMenu.this, "Klima Kapat", Toast.LENGTH_SHORT).show();
            }
        });

        dlg.show();

    }
}
