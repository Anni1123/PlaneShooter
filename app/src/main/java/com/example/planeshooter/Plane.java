package com.example.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class Plane {
    Bitmap plane[]=new Bitmap[15];
    int planeX,planeY,velocity,planeFrame;
    Random random;
    public Plane(Context context) {
        plane[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.download1);
        plane[1]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download2);
        plane[2]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download3);
        plane[3]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download4);
        plane[4]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download5);
        plane[5]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download6);
        plane[6]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download7);
        plane[7]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download8);
        plane[8]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download9);
        plane[9]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download10);
        plane[10]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download11);
        plane[11]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download12);
        plane[12]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download13);
        plane[13]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download14);
        plane[14]=BitmapFactory.decodeResource(context.getResources(),R.drawable.download15);
        random=new Random();
        resetPOsition();

    }
    public Bitmap getBitmap(){
        return plane[planeFrame];
    }
    public int getWidth(){
        return plane[0].getWidth();
    }
    public int getHeight(){
        return plane[0].getHeight();
    }
    public void resetPOsition(){
        planeX=GameView.dwidth+random.nextInt(1200);
        planeY=random.nextInt(300);
        velocity=8+random.nextInt(13);
        planeFrame=0;
    }
}
