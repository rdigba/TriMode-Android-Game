package com.example.game.models.game1.animations;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Animation interface
 */
public interface Animation {
    boolean isPlaying();

    void play(); // plays animation

    void stop(); // stops animation

    void draw(Canvas canvas, Rect rect); // draws on canvas

    void update(); // runs constantly through gameloop
}