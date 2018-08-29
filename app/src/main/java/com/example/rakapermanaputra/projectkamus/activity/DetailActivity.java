package com.example.rakapermanaputra.projectkamus.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rakapermanaputra.projectkamus.R;
import com.example.rakapermanaputra.projectkamus.model.KamusModel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
    public static String EXTRA_WORD = "extra_word";
    public static String EXTRA_TRANSLATE = "translate";
    @BindView(R.id.tvDetailWord)
    TextView tvWord;
    @BindView(R.id.tvDetailTranslate)
    TextView tvTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ButterKnife.bind(this);

        setDataIntent();

    }

    private void setDataIntent() {
        String word = getIntent().getStringExtra(EXTRA_WORD);
        tvWord.setText(word);
        String translate = getIntent().getStringExtra(EXTRA_TRANSLATE);
        tvTranslate.setText(translate);
    }
}
