package com.example.planeshooter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Display;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class GameView extends View {
    Bitmap background,tank;
    Rect rect;
    static int dwidth,dheight;
    ArrayList<Plane> planes,planes2;
    Handler handler;
    Runnable runnable;
    final long UPDATE_MILLS=30;
    int tankWidth,tankHeight;
    public GameView(Context context) {
        super(context);
        background= BitmapFactory.decodeResource(getResources(),R.drawable.background);
        tank=BitmapFactory.decodeResource(getResources(),R.drawable.images);
        Display display=((Activity)getContext()).getWindowManager().getDefaultDisplay();
        Point size=new Point();
        display.getSize(size);
        dheight=size.y;
        dwidth=size.x;
        rect=new Rect(0,0,dwidth,dheight);
        planes=new ArrayList<>();
        planes2=new ArrayList<>();

        for (int i=0;i<2;i++) {
            Plane plane = new Plane(context);
            planes.add(plane);
            Plane2 plane2 = new Plane2(context);
            planes2.add(plane2);
        }
        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
        tankWidth=tank.getWidth();
        tankHeight=tank.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(background,null,rect,null);
        for(int i=0;i<planes.size();i++){
            canvas.drawBitmap(planes.get(i).getBitmap(),planes.get(i).planeX,planes.get(i).planeY,null);
            planes.get(i).planeFrame++;
            if(planes.get(i).planeFrame>14){
                planes.get(i).planeFrame=0;
            }
            planes.get(i).planeX-=planes.get(i).velocity;
            if(planes.get(i).planeX<-planes.get(i).getWidth()){
                planes.get(i).resetPOsition();
            }
            canvas.drawBitmap(planes2.get(i).getBitmap(),planes2.get(i).planeX,planes2.get(i).planeY,null);
            planes2.get(i).planeFrame++;
            if(planes2.get(i).planeFrame>14){
                planes2.get(i).planeFrame=0;
            }
            planes2.get(i).planeX+=planes.get(i).velocity;
            if(planes2.get(i).planeX>(dwidth+planes2.get(i).getWidth())){
                planes2.get(i).resetPOsition();
            }
        }
        canvas.drawBitmap(tank,(dwidth/2-tankWidth/2),dheight-tankHeight,null);
        handler.postDelayed(runnable,UPDATE_MILLS);
    }
}
