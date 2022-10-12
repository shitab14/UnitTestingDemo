package smir.shitab14.unittestingdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import smir.shitab14.unittestingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_main)
    }
}