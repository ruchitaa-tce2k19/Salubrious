package com.design_thinking.video_player_manager.ui;

import android.media.MediaPlayer;

public class MediaPlayerWrapperImpl extends MediaPlayerWrapper{

    public MediaPlayerWrapperImpl() {
        super(new MediaPlayer());
    }
}
