package com.test.ndk_enter

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("hello_jni")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv1).text="nativeTest：${nativeTest()}"
    }

    private external fun nativeTest(): Int
}