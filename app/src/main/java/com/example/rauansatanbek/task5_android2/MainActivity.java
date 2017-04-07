package com.example.rauansatanbek.task5_android2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView(this));
    }

    class DrawView extends View {

        Paint p;
        Rect rect;

        public DrawView(Context context) {
            super(context);
            p = new Paint();
            rect = new Rect();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            // заливка канвы цветом
            canvas.drawColor(Color.parseColor("#444444"));

            // настройка кисти
            // красный цвет
            // толщина линии = 10
            p.setStrokeWidth(10);

            // рисуем точку (50,50)

            // рисуем линию от (100,100) до (500,50)
            p.setColor(Color.GREEN);
            //top left
            canvas.drawLine(275, 150, 325, 300,p);
            //top right
            canvas.drawLine(475, 150, 425, 300,p);

            // рисуем круг с центром в (100,200), радиус = 50
            canvas.drawCircle(375, 300, 125, p);

            // рисуем прямоугольник
            // левая верхняя точка (200,150), нижняя правая (400,200)
            // настройка объекта Rect
            // левая верхняя точка (250,300), нижняя правая (350,500)
            rect.set(250, 300, 500, 550);
            // рисуем прямоугольник из объекта rect
            canvas.drawRect(rect, p);
            //left
            canvas.drawRect(175, 310, 225, 475, p);
            //right
            canvas.drawRect(525, 310, 575, 475, p);
            //bottom
            canvas.drawRect(300, 550, 350, 650, p);
            canvas.drawRect(400, 550, 450, 650, p);
            p.setColor(Color.parseColor("#444444"));
            canvas.drawLine(250,300,500,300,p);

            p.setStrokeWidth(20);
            canvas.drawPoint(325, 250, p);
            canvas.drawPoint(425, 250, p);

            p.setTextSize(25);
            p.setColor(Color.parseColor("#ffffff"));
            canvas.drawText("by RaOne Satanbek", 275, 1000, p);
        }

    }
}
