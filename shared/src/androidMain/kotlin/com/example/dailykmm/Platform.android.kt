package com.example.dailykmm

import android.content.res.Resources
import android.os.Build
import android.util.Log

actual class Platform () {
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = "${Build.VERSION.SDK_INT}"
    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL }"
    actual val density: Int
        get() = Resources.getSystem().displayMetrics.density.toInt()

    actual fun getDeviceInfo() {
        Log.d("Daily KMM",
            "$osName $osVersion $deviceModel $density")
    }
}