package edu.augustana.snackers.binaryhero;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

/**
 * Created by Nelly on 4/11/2016.
 */
public class LevelsDatabase {
public static int radius[] = { 50,50,50,50,60,60,60};
    public static int numBalls[] = { 4,8,16,16,32,32,32};
    public static int binaryLen[] = { 4,4,4,4,5,5,5};
    public static int threshhold[] = { 2,2,4,4,6,6,6};
    public static int color[] ={Color.BLACK,Color.RED};
    public static int textColor = Color.CYAN;
    public static DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
    public static int screenWidth = metrics.widthPixels;
    public static int screenHeight = metrics.heightPixels;

   public static int passwords[] = {1234,1235,1236};
    }

