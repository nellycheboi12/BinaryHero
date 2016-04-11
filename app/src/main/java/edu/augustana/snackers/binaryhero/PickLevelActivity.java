package edu.augustana.snackers.binaryhero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.com.example.nelly.binaryhero.R;

/**
 * And activity class for the pick level. Passes in the right values depending on the level
 */

public class PickLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_level);
        Button level000Btn = (Button) findViewById(R.id.btn000);
        level000Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 4);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level001Btn = (Button) findViewById(R.id.btn001);
        level001Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 8);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level011Btn = (Button) findViewById(R.id.btn011);
        level011Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 8);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level100Btn = (Button) findViewById(R.id.btn100);
        level100Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 16);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level101Btn = (Button) findViewById(R.id.btn101);
        level101Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 16);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level110Btn = (Button) findViewById(R.id.btn110);
        level110Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 50);
                extras.putInt("BINARY_LEN", 4);
                extras.putInt("NUMBER_BALLS", 16);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });

        Button level111Btn = (Button) findViewById(R.id.btn111);
        level111Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View btn) {
                Intent intent = new Intent(getApplicationContext(), GameArenaActivity.class);
                Bundle extras = new Bundle();
                extras.putInt("RADIUS", 60);
                extras.putInt("BINARY_LEN", 5);
                extras.putInt("NUMBER_BALLS", 32);
                extras.putInt("THRESHOLD", 5); //HOW MANY TIMES DO THE BALL FALL OUT AND IN THE SCREEN BEFORE WE CALL GAME OVER
                intent.putExtras(extras);
                startActivity(intent);
                startActivity(intent);
            }
        });
    }


}