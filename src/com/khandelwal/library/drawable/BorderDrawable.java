package com.khandelwal.library.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

public class BorderDrawable extends Drawable {

	private int mLeftBorderWidth = 0;
	private int mRightBorderWidth = 0;
	private int mLeftBorderColor = Color.BLACK;
	private int mRightBorderColor = Color.BLACK;
	
	private int mTopBorderWidth = 0;
	private int mBottomBorderWidth = 0;
	private int mTopBorderColor = Color.BLACK;
	private int mBottomBorderColor = Color.BLACK;
	
	private Paint paint;
	private Rect rect;
	private Path path;
	private Rect tRect;
	private Drawable background;
	
	public BorderDrawable(Drawable background) {
		paint = new Paint();
		rect = new Rect();
		path = new Path();
		this.background = background;
	}
	
	public BorderDrawable() {
		this(null);
	}
	
	public void setBackground(Drawable background) {
		this.background = background;
	}
	
	public Drawable getBackground() {
		return background;
	}
	
	@Override
	public void draw(Canvas canvas) {
		
		rect = copyBounds();
		
		tRect = copyBounds();
		
		tRect.left += mLeftBorderWidth;
		tRect.right -= mRightBorderWidth;
		tRect.top += mTopBorderWidth;
		tRect.bottom -= mBottomBorderWidth;
		
		setBounds(tRect);
		
		if(background != null)
		{
			background.setBounds(tRect);
			background.draw(canvas);
		}
		
		setBounds(rect);
		
		paint.setPathEffect(null);
		paint.setStyle(Style.FILL_AND_STROKE);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(0);
		
		canvas.save();
		
		if(mLeftBorderWidth > 0)
		{
			path.reset();
			paint.setColor(mLeftBorderColor);
			path.moveTo(rect.left, rect.top);
			path.lineTo(rect.left + mLeftBorderWidth, rect.top + mTopBorderWidth);
			path.lineTo(rect.left + mLeftBorderWidth, rect.bottom - mBottomBorderWidth);
			path.lineTo(rect.left, rect.bottom);
			path.close();
			canvas.drawPath(path, paint);
		}
		
		if(mRightBorderWidth > 0)
		{
			path.reset();
			paint.setColor(mRightBorderColor);
			path.moveTo(rect.right, rect.top);
			path.lineTo(rect.right - mRightBorderWidth, rect.top + mTopBorderWidth);
			path.lineTo(rect.right - mRightBorderWidth, rect.bottom - mBottomBorderWidth);
			path.lineTo(rect.right, rect.bottom);
			path.close();
			canvas.drawPath(path, paint);
		}
		
		if(mTopBorderWidth > 0)
		{
			path.reset();
			paint.setColor(mTopBorderColor);
			path.moveTo(rect.left, rect.top);
			path.lineTo(rect.left + mLeftBorderWidth, rect.top + mTopBorderWidth);
			path.lineTo(rect.right - mRightBorderWidth, rect.top + mTopBorderWidth);
			path.lineTo(rect.right, rect.top);
			path.close();
			canvas.drawPath(path, paint);
		}
		
		if(mBottomBorderWidth > 0)
		{
			path.reset();
			paint.setColor(mBottomBorderColor);
			path.moveTo(rect.left, rect.bottom);
			path.lineTo(rect.left + mLeftBorderWidth, rect.bottom - mBottomBorderWidth);
			path.lineTo(rect.right - mRightBorderWidth, rect.bottom - mBottomBorderWidth);
			path.lineTo(rect.right, rect.bottom);
			path.close();
			canvas.drawPath(path, paint);
		}
		
		canvas.restore();
	}

	public int getLeftBorderWidth() {
		return mLeftBorderWidth;
	}

	public void setLeftBorderWidth(int mLeftBorderWidth) {
		this.mLeftBorderWidth = mLeftBorderWidth;
	}

	public int getRightBorderWidth() {
		return mRightBorderWidth;
	}

	public void setRightBorderWidth(int mRightBorderWidth) {
		this.mRightBorderWidth = mRightBorderWidth;
	}

	public int getLeftBorderColor() {
		return mLeftBorderColor;
	}

	public void setLeftBorderColor(int mLeftBorderColor) {
		this.mLeftBorderColor = mLeftBorderColor;
	}

	public int getRightBorderColor() {
		return mRightBorderColor;
	}

	public void setRightBorderColor(int mRightBorderColor) {
		this.mRightBorderColor = mRightBorderColor;
	}

	public int getTopBorderWidth() {
		return mTopBorderWidth;
	}

	public void setTopBorderWidth(int mTopBorderWidth) {
		this.mTopBorderWidth = mTopBorderWidth;
	}

	public int getBottomBorderWidth() {
		return mBottomBorderWidth;
	}

	public void setBottomBorderWidth(int mBottomBorderWidth) {
		this.mBottomBorderWidth = mBottomBorderWidth;
	}

	public int getTopBorderColor() {
		return mTopBorderColor;
	}

	public void setTopBorderColor(int mTopBorderColor) {
		this.mTopBorderColor = mTopBorderColor;
	}

	public int getBottomBorderColor() {
		return mBottomBorderColor;
	}

	public void setBottomBorderColor(int mBottomBorderColor) {
		this.mBottomBorderColor = mBottomBorderColor;
	}
	
	public void setLeftBorder(int width, int color)
	{
		setLeftBorderWidth(width);
		setLeftBorderColor(color);
	}
	
	public void setTopBorder(int width, int color)
	{
		setTopBorderWidth(width);
		setTopBorderColor(color);
	}

	public void setRightBorder(int width, int color)
	{
		setRightBorderWidth(width);
		setRightBorderColor(color);
	}
	
	public void setBottomBorder(int width, int color)
	{
		setBottomBorderWidth(width);
		setBottomBorderColor(color);
	}

	@Override
	public void setAlpha(int alpha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColorFilter(ColorFilter cf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getOpacity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
