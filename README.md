kLib-android
============

This library contain BorderDrawable and BorderFrameLayout.

Since as of now Android does not easily support custom inflated xml drawable, So we need to set the drawable from Java source.

So easy use one can wrap his layout in BorderFrameLayout and can be used from Layout XML directly.

        <com.khandelwal.library.view.BorderFrameLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                app:leftBorderColor="#00F0F0"
                app:leftBorderWidth="10dp"
                app:topBorderColor="#F0F000"
                app:topBorderWidth="15dp"
                app:rightBorderColor="#F000F0"
                app:rightBorderWidth="20dp"
                app:bottomBorderColor="#000000"
                app:bottomBorderWidth="25dp" >
        </com.khandelwal.library.view.BorderFrameLayout>

The above layout xml will give us four sided border with different color with different width.
