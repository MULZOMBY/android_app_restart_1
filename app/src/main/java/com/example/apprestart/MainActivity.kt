package com.example.apprestart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRestart=findViewById<Button>(R.id.btnRestart)
        btnRestart.setOnClickListener(View.OnClickListener {
            val packageManager = packageManager
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            val componentName = intent!!.component
            val mainIntent = Intent.makeRestartActivityTask(componentName)
            startActivity(mainIntent)
            System.exit(0)
        })

        Toast.makeText(this,"APP START",Toast.LENGTH_SHORT).show()

    }
}