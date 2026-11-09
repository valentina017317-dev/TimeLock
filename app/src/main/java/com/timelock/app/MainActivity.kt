
package com.timelock.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.rgb(245, 240, 255))
            setPadding(32, 32, 32, 32)
        }

        val title = TextView(this).apply {
            text = "🔒 TimeLock"
            textSize = 32f
            setTextColor(Color.rgb(90, 60, 140))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Kendalikan waktumu, kendalikan pengeluaranmu."
            textSize = 15f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 20, 0, 0)
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
