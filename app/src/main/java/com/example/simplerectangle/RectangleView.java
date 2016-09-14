package com.example.simplerectangle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by evin on 5/5/16.
 */
public class RectangleView extends View {

    private Rect rectangle;
    private Paint paint;

    public RectangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int x = 50;
        int y = 50;
        int sideLength = 2;

        rectangle = new Rect(x, y, sideLength, sideLength);

        paint = new Paint();
        paint.setColor(Color.WHITE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
        canvas.drawRect(rectangle, paint);
    }

}