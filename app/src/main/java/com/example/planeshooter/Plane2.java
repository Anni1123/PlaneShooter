package com.example.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Plane2 extends Plane {
    Bitmap plane[]=new Bitmap[15];
    public Plane2(Context context) {
        super(context);
        plane[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        plane[1]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[2]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        plane[3]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[4]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[5]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[6]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        plane[7]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        plane[8]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[9]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[10]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[11]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[12]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish1);
        plane[13]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        plane[14]=BitmapFactory.decodeResource(context.getResources(),R.drawable.fish2);
        resetPOsition();
    }

    @Override
    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    @Override
    public int getWidth() {
        return plane[0].getWidth();
    }

    @Override
    public int getHeight() {
        return plane[0].getHeight();
    }

    @Override
    public void resetPOsition() {
        planeX= -(200+random.nextInt(1500));
        planeY=random.nextInt(400);
        velocity=5+random.nextInt(21);
    }
}
