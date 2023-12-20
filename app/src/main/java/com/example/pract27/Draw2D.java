package com.example.pract27;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {

    private Paint mPaint = new Paint();
    private Paint mPainto = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;

    public Draw2D(Context context) {
        super(context);

        // Выводим значок из ресурсов
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.cat22);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        // стиль Заливка
        mPaint.setStyle(Paint.Style.FILL);
        mPainto.setStyle(Paint.Style.FILL);
        // закрашиваем холст белым цветом
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        mPainto.setColor(Color.BLUE);
        canvas.drawRect(0, canvas.getHeight() -1000, width, 0, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-650, 300,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-650, 450,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-750, 35,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-400, 60,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-600, 70,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-300, 300,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-1000, 150,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-800, 200,20, mPainto);
        mPainto.setColor(Color.WHITE);
        canvas.drawCircle( width-500, 500,20, mPainto);

        // Рисуем луну
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.GRAY);
        canvas.drawCircle(width - 30, 30, 250, mPaint);


        mPaint.setColor(Color.CYAN);
        //  canvas.drawRect(20, 650, 950, 680, mPaint);
        canvas.drawRect(0, canvas.getHeight() - 40, width, height, mPaint);


        // Рисуем текст
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(42);
        //  canvas.drawText("Лужайка только для котов", 30, 648, mPaint);
        canvas.drawText("Ваш экран захвачен котами!", 14, height - 42, mPaint);

        // Текст под углом
        // int x = 810;
        int x = width - 220;
        int y = 350;

        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(40);
        String beam = "Луна!";

        canvas.save();
        // Создаём ограничивающий прямоугольник для наклонного текста
        // поворачиваем холст по центру текста
        canvas.rotate(-55, x + mRect.exactCenterX(), y + mRect.exactCenterY());

        // Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(beam, x, y, mPaint);

        // восстанавливаем холст
        canvas.restore();

        // Выводим изображение
        // canvas.drawBitmap(mBitmap, 450, 530, mPaint);
        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 10, mPaint);
    }
}
