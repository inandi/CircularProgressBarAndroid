package com.inandi.circleprogressbarsample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat

class CircularProgressBar(context: Context, attrs: AttributeSet?) : View(context, attrs) {

    private var progress = 0f // Progress percentage (0.0 to 1.0)
    private val strokeWidth = 20f // Thickness of the progress bar

    private val backgroundPaint = Paint().apply {
        color = ContextCompat.getColor(context, android.R.color.darker_gray)
        style = Paint.Style.STROKE
        strokeWidth = this@CircularProgressBar.strokeWidth
        isAntiAlias = true
    }

    private val progressPaint = Paint().apply {
        color = ContextCompat.getColor(context, android.R.color.holo_blue_light)
        style = Paint.Style.STROKE
        strokeWidth = this@CircularProgressBar.strokeWidth
        isAntiAlias = true
        strokeCap = Paint.Cap.ROUND
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val size = width.coerceAtMost(height).toFloat()
        val padding = strokeWidth / 2
        val rect = RectF(padding, padding, size - padding, size - padding)

        // Draw background circle
        canvas.drawArc(rect, 0f, 360f, false, backgroundPaint)

        // Draw progress arc
        canvas.drawArc(rect, -90f, progress * 360f, false, progressPaint)
    }

    fun setProgress(value: Float) {
        progress = value.coerceIn(0f, 1f) // Keep progress between 0 and 1
        invalidate() // Redraw the view
    }
}
