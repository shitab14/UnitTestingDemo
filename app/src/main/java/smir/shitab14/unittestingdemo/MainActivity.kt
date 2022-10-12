package smir.shitab14.unittestingdemo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import smir.shitab14.unittestingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
//        setContentView(R.layout.activity_main)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.btnToast.setOnClickListener {
            val toast = getReturnSomethingObject().returnsAToast( "Button Clicked")
            toast.show()
        }
        binding.btnSnackBar.setOnClickListener {
            Snackbar.make(binding.clRootLayout, "This is a Snack Bar", Snackbar.LENGTH_LONG).show()
        }
        binding.btnOpenDialog.setOnClickListener {
//            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }
        binding.btnBottomSheet.setOnClickListener {
//            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }
        binding.btnAPICall.setOnClickListener {
//            Toast.makeText(this, "This is a Toast", Toast.LENGTH_LONG).show()
        }
    }

    private fun getReturnSomethingObject(): ReturnsSomethingRequiresContext {
        return ReturnsSomethingRequiresContext(this)
    }

}