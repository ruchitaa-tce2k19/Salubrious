package com.design_thinking.video_list_demo.adapter.holders;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.design_thinking.video_player_manager.ui.VideoPlayerView;
import com.design_thinking.salubrious.R;


public class VideoViewHolder extends RecyclerView.ViewHolder{

    public final VideoPlayerView mPlayer;
    public final TextView mTitle;
    public final ImageView mCover;
    public final TextView mVisibilityPercents;

    public VideoViewHolder(View view) {
        super(view);
        mPlayer = view.findViewById(R.id.player);
        mTitle = view.findViewById(R.id.title);
        mCover = view.findViewById(R.id.cover);
        mVisibilityPercents = view.findViewById(R.id.visibility_percents);
    }
}
