package com.khandelwal.library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.khandelwal.library.R;
import com.khandelwal.library.drawable.BorderDrawable;

public class BorderFrameLayout extends FrameLayout {

	private BorderDrawable borderDrawable;
	
	public BorderFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		if(borderDrawable == null)
			borderDrawable = new BorderDrawable();
		
		if(attrs != null)
		{
			TypedArray a = getResources().obtainAttributes(attrs, R.styleable.BorderFrameLayout);
			
			int width, color;
			
			width = (int) a.getDimension(R.styleable.BorderFrameLayout_leftBorderWidth, 0);
			color = a.getColor(R.styleable.BorderFrameLayout_leftBorderColor, Color.BLACK);
			borderDrawable.setLeftBorder(width, color);
			
			width = (int) a.getDimension(R.styleable.BorderFrameLayout_topBorderWidth, 0);
			color = a.getColor(R.styleable.BorderFrameLayout_topBorderColor, Color.BLACK);
			borderDrawable.setTopBorder(width, color);
			
			width = (int) a.getDimension(R.styleable.BorderFrameLayout_rightBorderWidth, 0);
			color = a.getColor(R.styleable.BorderFrameLayout_rightBorderColor, Color.BLACK);
			borderDrawable.setRightBorder(width, color);
			
			width = (int) a.getDimension(R.styleable.BorderFrameLayout_bottomBorderWidth, 0);
			color = a.getColor(R.styleable.BorderFrameLayout_bottomBorderColor, Color.BLACK);
			borderDrawable.setBottomBorder(width, color);
		}
		
		if(getBackground() != null)
		{
			borderDrawable.setBackground(borderDrawable);
		}
		
		setBackgroundDrawable(borderDrawable);
	}
	
	@Override
	public void setBackgroundDrawable(Drawable d) {
		if(d == borderDrawable)
			super.setBackgroundDrawable(d);
		else
		{
			if(borderDrawable == null)
				borderDrawable = new BorderDrawable();
			borderDrawable.setBackground(d);
		}
	}
	
	public BorderFrameLayout(Context context) {
		this(context, null);
	}

	
	
}
