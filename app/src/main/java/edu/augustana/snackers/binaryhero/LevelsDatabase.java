package edu.augustana.snackers.binaryhero;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

/**
 * Created by Nelly on 4/11/2016.
 */
public class LevelsDatabase {
    public final static int HIGHEST_LEVEL = 6;
    public final static int RADIUS[] = { 50,50,50,50,70,70,70};
    public final static int NUM_BALLS[] = { 4,8,16,16,32,32,32};
    public final static int BINARY_LEN[] = { 4,4,4,4,5,5,5};
    public final static int THRESHOLD[] = { 2,2,4,4,6,6,6};

    public final static int COLOR[] ={Color.BLACK,Color.RED};
    public final static int TEXT_COLOR = Color.CYAN;
    public final static DisplayMetrics METRICS = Resources.getSystem().getDisplayMetrics();
    public final static int SCREEN_WIDTH = METRICS.widthPixels;
    public final static int SCREEN_HEIGHT = METRICS.heightPixels;

    //TODO: customize the text to expalin the hint
    public final static String passwordMeaning[] = {"Congrats the password for this level is"};
    public final static String passwords[] = {"binary","bit","byte","decimal","hexadecimal","compile"};

    public static long[] hiScores = {99999,99999,99999,99999,99999,99999};

        public static void updateScore(int level, long finishTime){
            if(hiScores[level] > finishTime){
                hiScores[level] = finishTime;
            }

        }
        public static long getLevelScore(int level){
            return hiScores[level];
        }

//    public static int[] getPassword() {
//    }

        }

    //not neccessary
   // public static int[] getPassword(){
       // return passwords;
    //}
    //public static int passwordsBase10[] = {378,234,721,346,498,352};

    //}

