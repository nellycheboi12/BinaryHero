package edu.augustana.snackers.binaryhero;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.com.example.nelly.binaryhero.R;


public class GameArenaActivity extends AppCompatActivity {

    public static final String PLAYER_LEVEL_EXTRA = "PLAYER_LEVEL";
    public static final String GAME_MODE_EXTRA = "GAME_MODE";

    private MediaPlayer mediaPlayer;
    private SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_arena);


        // REFERENCE THE FRAMELAYOUT ELEMENT
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        final GameArena gameArena = new GameArena(extras.getInt(PLAYER_LEVEL_EXTRA, 0), extras.getBoolean(GAME_MODE_EXTRA, true), this);
        // INSTANTIATE A CUSTOM SURFACE VIEW
        // ADD IT TO THE FRAMELAYOUT

        GameSurfaceView bounceSurfaceView = new GameSurfaceView(this, gameArena, null);
        frameLayout.addView(bounceSurfaceView);

        createSoundPool();
        final int soundIdDestroyedBall = soundPool.load(this, R.raw.balldestroy, 1);
        final int soundIdWrongBall = soundPool.load(this, R.raw.wrongball, 1);
        frameLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX();
                float y = event.getY();
                if (gameArena.findBall(x, y)) {
                    soundPool.play(soundIdDestroyedBall, 0.85f, 0.85f, 1, 0, 1f);
                } else {
                    gameArena.increaseWrongGuessCount();
                    soundPool.play(soundIdWrongBall, 0.5f, 0.5f, 1, 0, 1f);
                    if (gameArena.increaseBallVelocity()) {
                        // TODO: Play a 'whoosh' or siren or alarm sound effect to indicate speed increase
                    }
                }
                return false;
            }
        });
        mediaPlayer = MediaPlayer.create(this, R.raw.binaryheroingame);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }

    // user3833732
    // http://stackoverflow.com/questions/17069955/play-sound-using-soundpool-example

    /**
     * makes music for game
     */
    protected void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        soundPool = new SoundPool.Builder()
                .setAudioAttributes(attributes)
                .build();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        soundPool = new SoundPool(5,AudioManager.STREAM_MUSIC,0);
    }


    @Override
    protected void onDestroy() {
        if (mediaPlayer.isPlaying() || mediaPlayer.isLooping()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        super.onDestroy();
    }


}




