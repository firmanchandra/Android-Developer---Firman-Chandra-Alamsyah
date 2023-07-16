package mobile.atask.androiddeveloper_firmanchandraalamsyah;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nilaiPertama, nilaiKedua;
    Button btnTambah,btnKurang,btnKali,btnBagi, btnAddInput;
    TextView textHasil;

    String path;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilaiPertama = (EditText) findViewById(R.id.NilaiPertama);
        nilaiKedua = (EditText) findViewById(R.id.NilaiKedua);
        textHasil = (TextView) findViewById(R.id.Hasil);
        btnTambah = (Button) findViewById(R.id.Tambah);
        btnKurang = (Button) findViewById(R.id.Kurang);
        btnKali = (Button) findViewById(R.id.Kali);
        btnBagi = (Button) findViewById(R.id.Bagi);
        btnAddInput = (Button) findViewById(R.id.AddInput);
        btnAddInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(intent);
            }
        });


        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(nilaiPertama.getText().toString());
                int nilai2 = Integer.parseInt(nilaiKedua.getText().toString());
                int hasil = nilai1+nilai2;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(nilaiPertama.getText().toString());
                int nilai2 = Integer.parseInt(nilaiKedua.getText().toString());
                int hasil = nilai1-nilai2;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilai1 = Integer.parseInt(nilaiPertama.getText().toString());
                int nilai2 = Integer.parseInt(nilaiKedua.getText().toString());
                int hasil = nilai1*nilai2;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float nilai1 = Float.parseFloat(nilaiPertama.getText().toString());
                float nilai2 = Float.parseFloat(nilaiKedua.getText().toString());
                float hasil = nilai1/nilai2;
                textHasil.setText(String.valueOf(hasil));
            }
        });

    }
}

