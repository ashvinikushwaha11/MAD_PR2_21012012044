package com.example.mad_pr2_21012021044

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
showMessage("onCreate method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("OnStart method is called.")
    }
    override fun onPause(){
        super.onPause()
        showMessage("on Pause method is called.")
    }

    override fun onStop() {
        super.onStop()
        showMessage("on Stop method is called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("on Destroy method is called.")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("on Restart method is called.")
    }

    override fun onResume() {
        super.onResume()
        showMessage("on resume method is called.")
    }
    fun showMessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        val obj:ConstraintLayout?=findViewById(R.id.mainConstraint)
        if(obj!=null){
            Snackbar.make(obj,msg,Snackbar.LENGTH_SHORT).show()
        }
    }
}
