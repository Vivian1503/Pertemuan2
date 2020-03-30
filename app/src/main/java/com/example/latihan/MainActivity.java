package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edName, edPass;
    //TextView tHasil;
    Button bKirim;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.editUN);
        edPass = findViewById(R.id.editPass);
        bKirim = findViewById(R.id.btnok);

        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Membaca input dari edittext
                user = edName.getText().toString();
                pass = edPass.getText().toString();

                //Menampilkan string ke TextView
                //tHasil.setText(user + " " + pass);

                if (pass.equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, Menu1Activity.class));
        }else if (item.getItemId()==R.id.menu2){
            startActivity(new Intent(this, Menu2Activity.class));
        }else if (item.getItemId()==R.id.menu3){
            startActivity(new Intent(this, Menu3Activity.class));
        }
        return true;
    }
}
