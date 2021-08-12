/*
package com.example.soundmash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MusicAdapter extends RecyclerView.Adapter <Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<song> songs;
    public Adapter(Context ctx, List<song> songs){
        this.inflater=LayoutInflater.from(ctx);
        this.songs=songs;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item_feature_song,parent,attachToRoot: fasle );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView song_title,song_artist;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            song_title=itemView.findViewById(R.id.title);
            song_artist=itemView.findViewById(R.id.artist);
        }
    }
}
