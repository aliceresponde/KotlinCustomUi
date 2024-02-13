package com.jwplayer.customui;

import androidx.appcompat.app.AppCompatActivity;

import com.jwplayer.pub.api.JWPlayer;
import com.jwplayer.pub.api.background.MediaServiceController;

public class MediaServiceWorkAround {


    private AppCompatActivity activity;
    private JWPlayer player;
    private MediaServiceController mMediaServiceController;

    public MediaServiceWorkAround(AppCompatActivity activity, JWPlayer player) {
        this.activity = activity;
        this.player = player;
    }

    void initializeServiceController() {
        mMediaServiceController = new MediaServiceController
                .Builder(this.activity, this.player)
                .build();
    }

    public MediaServiceController getMediaServiceController() {
        return mMediaServiceController;
    }
}
