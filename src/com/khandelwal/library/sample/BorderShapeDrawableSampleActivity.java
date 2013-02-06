package com.khandelwal.library.sample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

import com.khandelwal.library.R;
import com.khandelwal.library.drawable.BorderDrawable;

public class BorderShapeDrawableSampleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/*View view = new View(this);
		
		int oneDP = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
		
		BorderDrawable drawable = new BorderDrawable();
		
		drawable.setLeftBorder(oneDP, Color.CYAN);
		drawable.setTopBorder(2 * oneDP, Color.MAGENTA);
		drawable.setRightBorder(3 * oneDP, Color.YELLOW);
		drawable.setBottomBorder(4 * oneDP, Color.BLUE);
		
		view.setBackgroundDrawable(drawable);
		
		setContentView(view);*/
		
		setContentView(R.layout.border_frame_layout_sample);
	}
	
}
