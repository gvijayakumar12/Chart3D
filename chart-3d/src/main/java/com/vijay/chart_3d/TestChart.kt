package com.vijay.chart_3d

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.util.AttributeSet
import android.view.View

class TestChart @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.apply {
            drawColor(Color.LTGRAY)
        }
    }
}