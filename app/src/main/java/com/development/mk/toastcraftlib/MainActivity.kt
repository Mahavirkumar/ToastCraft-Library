package com.development.mk.toastcraftlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.development.mk.toastcraft.Toaster
import com.development.mk.toastcraftlib.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.makeText(this,"helo my testing toast",Toast.LENGTH_LONG).show()
//        Toast.makeText(this,"hi helo",Toast.LENGTH_LONG).show()
    }
}