package com.shvmsaini.xylophone;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SoundPool mSoundPool;
   int mCSoundId,mESoundId,mASoundId,mDSoundId,mFSoundId,mGSoundId,mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int NR_OF_SIMULTANEOUS_SOUNDS = 7;
        mSoundPool = new SoundPool.Builder().setMaxStreams(NR_OF_SIMULTANEOUS_SOUNDS).build();
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    public void playC(View v){
        mSoundPool.play(mCSoundId,1,1,0,0,1);
    }
    public void playD(View v){
        mSoundPool.play(mDSoundId,1,1,0,0,1);
    }
    public void playE(View v) {
        mSoundPool.play(mESoundId,1,1,0,0,1);
    }
    public void playF(View v){
        mSoundPool.play(mFSoundId,1,1,0,0,1);
    }
    public void playG(View v){
        mSoundPool.play(mGSoundId,1,1,0,0,1);
    }
    public void playA(View v){
        mSoundPool.play(mASoundId,1,1,0,0,1);
    }
    public void playB(View v){
        mSoundPool.play(mBSoundId,1,1,0,0,1);
    }
}
