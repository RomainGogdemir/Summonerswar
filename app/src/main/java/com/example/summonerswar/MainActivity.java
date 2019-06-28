package com.example.summonerswar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.summonerswar.runes.SummonRunes;

public class MainActivity extends AppCompatActivity {

    private Button m_summonButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m_summonButton = findViewById(R.id.summonButton);
        m_summonButton.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  SummonRunes sr = new SummonRunes();
                                                  ((TextView)findViewById(R.id.summonText)).setText(sr.summon());
                                              }
                                          }
        );
    }
}
