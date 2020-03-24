package com.example.kotlinrecyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : SingleFragmentActivity() {
    override fun createFragment() = MainFragment.newInstance()
}

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
