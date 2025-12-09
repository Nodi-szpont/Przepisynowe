package com.example.swieta;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PrzepisActivity extends AppCompatActivity {
    TextView textViewPrzepisu, textViewSkladniki, textViewOpis;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_przepis);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        int idPrzepisuDoWyswietlenia = getIntent().getIntExtra("ID", 0);
        Przepis przepis = RepozytoriumPrzepisow.zwrocPrzepisoId(idPrzepisuDoWyswietlenia);
        textViewPrzepisu = findViewById(R.id.textView);
        textViewSkladniki = findViewById(R.id.textViewSkladniki);
        textViewOpis = findViewById(R.id.textViewOpis);
        wyswietlPrzepis(przepis);
    }

    private void wyswietlPrzepis(Przepis przepis) {
        textViewPrzepisu.setText(przepis.getNazwaPrzepisu());
    }
}