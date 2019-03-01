package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultText(View view) {

        TextView text = findViewById(R.id.text_result);
        String[] frases = {
                "Cuidado com as voltas que o mundo dá. Hoje você lança as palavras, amanhã sente o efeito delas.",
                "O tempo deixa perguntas, mostra respostas, esclarece dúvidas, mas, acima de tudo, o tempo traz verdades.",
                "Cada cicatriz que temos é a confirmação de que uma ferida sara. Cicatrizes são marcas de superação que só um verdadeiro guerreiro possui.",
                "Da vida não quero muito. Quero apenas saber que tentei tudo o que quis, tive tudo o que pude, amei tudo o que valia e perdi apenas o que, no fundo, nunca foi meu."
        };
        int numSort = new Random().nextInt(frases.length);

        text.setText(frases[numSort]);

    }
}
