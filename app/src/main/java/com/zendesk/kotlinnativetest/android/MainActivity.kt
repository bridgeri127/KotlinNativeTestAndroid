package com.zendesk.kotlinnativetest.android

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.zendesk.TestObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testObject = TestObject("This is the test object's name")

        findViewById<Button>(R.id.button).setOnClickListener {
            AlertDialog.Builder(this)
                    .setTitle(testObject.returnString("Test Object"))
                    .setMessage(testObject.name)
                    .show()
        }


    }
}
