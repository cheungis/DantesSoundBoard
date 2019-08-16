package com.example.dantessoundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer krabs1, iya2, stopIt3, colonel4, mou5, pathetic6, camel7, yare8, toes9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        krabs1 = MediaPlayer.create(this, R.raw.krabs);
        iya2 = MediaPlayer.create(this, R.raw.iya);
        stopIt3 = MediaPlayer.create(this, R.raw.stopit);
        colonel4 = MediaPlayer.create(this, R.raw.colonel);
        mou5 = MediaPlayer.create(this, R.raw.mou);
        pathetic6 = MediaPlayer.create(this, R.raw.pathetic);
        camel7 = MediaPlayer.create(this, R.raw.camel);
        yare8 = MediaPlayer.create(this, R.raw.yare);
        toes9 = MediaPlayer.create(this, R.raw.toes);

    }

    public void krabsSound(View view) {
        krabs1.start();
    }

    public void iyaSound(View view) {
        iya2.start();
    }

    public void stopItSound(View view) {
        stopIt3.start();
    }

    public void colonelSound(View view) {
        colonel4.start();
    }

    public void mouSound(View view) {
        mou5.start();
    }

    public void patheticSound(View view) {
        pathetic6.start();
    }

    public void camelSound(View view) {
        camel7.start();
    }

    public void yareSound(View view) {
        yare8.start();
    }

    public void toesSound(View view) {
        toes9.start();
    }
}
