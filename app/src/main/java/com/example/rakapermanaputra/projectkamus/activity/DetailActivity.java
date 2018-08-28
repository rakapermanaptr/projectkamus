package com.example.rakapermanaputra.projectkamus.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rakapermanaputra.projectkamus.R;
import com.example.rakapermanaputra.projectkamus.model.KamusModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    public static String EXTRA_DATA = "extra_data";
    @BindView(R.id.tvDetailWord)
    TextView tvWord;
    @BindView(R.id.tvDetailTranslate)
    TextView tvTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        KamusModel kamusModel = getIntent().getParcelableExtra(EXTRA_DATA);
        String world = kamusModel.getWord();
        String translate = kamusModel.getTranslate();

        setData(world,translate);

    }

    private void setData(String word, String translate) {
        tvWord.setText(word);
        tvTranslate.setText(translate);

    }
}
