package cufoon.face.android

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var keep = true
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { keep }
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                Intent().apply {
                    flags = Intent.FLAG_ACTIVITY_NO_ANIMATION or Intent.FLAG_ACTIVITY_TASK_ON_HOME
                    component = ComponentName(
                        "com.miui.gallery", "com.miui.gallery.activity.PeoplePageActivity"
                    )
                    startActivity(this)
                }
            }, 277
        )
        Handler(Looper.getMainLooper()).postDelayed(
            {
                keep = false
                finish()
            }, 423
        )
    }
}