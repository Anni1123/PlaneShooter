package com.example.planeshooter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

public class GameView extends View {
    Bitmap background;
    Rect rect;
    int dwidth,dheight;
    Bitmap plane[]=new Bitmap[15];
    public GameView(Context context) {
        super(context);
        background= BitmapFactory.decodeResource(getResources(),R.drawable.background);
        Display display=((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point size=new Point();
        display.getSize(size);
        dheight=size.y;
        dwidth=size.x;
        rect=new Rect(0,0,dwidth,dheight);
        plane[0]=BitmapFactory.decodeResource(getResources(),R.drawable.download1);
        plane[1]=BitmapFactory.decodeResource(getResources(),R.drawable.download2);
        plane[2]=BitmapFactory.decodeResource(getResources(),R.drawable.download3);
        plane[3]=BitmapFactory.decodeResource(getResources(),R.drawable.download4);
        plane[4]=BitmapFactory.decodeResource(getResources(),R.drawable.download5);
        plane[5]=BitmapFactory.decodeResource(getResources(),R.drawable.download6);
        plane[6]=BitmapFactory.decodeResource(getResources(),R.drawable.download7);
        plane[7]=BitmapFactory.decodeResource(getResources(),R.drawable.download8);
        plane[8]=BitmapFactory.decodeResource(getResources(),R.drawable.download9);
        plane[9]=BitmapFactory.decodeResource(getResources(),R.drawable.download10);
        plane[10]=BitmapFactory.decodeResource(getResources(),R.drawable.download11);
        plane[11]=BitmapFactory.decodeResource(getResources(),R.drawable.download12);
        plane[12]=BitmapFactory.decodeResource(getResources(),R.drawable.download13);
        plane[13]=BitmapFactory.decodeResource(getResources(),R.drawable.download14);
        plane[14]=BitmapFactory.decodeResource(getResources(),R.drawable.download15);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(background,null,rect,null);
    }
}
