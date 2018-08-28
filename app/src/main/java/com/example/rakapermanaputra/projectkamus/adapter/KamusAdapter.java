package com.example.rakapermanaputra.projectkamus.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rakapermanaputra.projectkamus.R;
import com.example.rakapermanaputra.projectkamus.activity.DetailActivity;
import com.example.rakapermanaputra.projectkamus.model.KamusModel;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KamusAdapter extends RecyclerView.Adapter<KamusAdapter.ViewHolder> {
    private ArrayList<KamusModel> listKamus;
    private Context context;


    public KamusAdapter(Context context) {
        this.context = context;
    }

    public void change(ArrayList<KamusModel> item) {
        listKamus = item;
        notifyDataSetChanged();
    }


    @Override
    public KamusAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_kamus,viewGroup,false);
        return new KamusAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KamusAdapter.ViewHolder holder, final int position) {
        holder.tv_translate.setText(listKamus.get(position).getTranslate());
        holder.tv_word.setText(listKamus.get(position).getWord());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KamusModel model = new KamusModel();
                model.setWord(listKamus.get(position).getWord());
                model.setTranslate(listKamus.get(position).getTranslate());
                Intent intent = new Intent(context, DetailActivity.class);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listKamus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_kata)
        TextView tv_word;
        @BindView(R.id.tv_terjemahan)
        TextView tv_translate;
        @BindView(R.id.cardView)
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }

}
