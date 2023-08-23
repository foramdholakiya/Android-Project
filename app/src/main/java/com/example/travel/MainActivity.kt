package com.example.travel


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val showDialogButton=findViewById<Button>(R.id.show)
        showDialogButton.setOnClickListener {
            showCustomDialog()
        }
    }

    private fun showCustomDialog() {
        val customDialog = CustomDialog(this, "Custom Dialog", "This is a custom dialog.")

        customDialog.setButton1ClickListener(View.OnClickListener {
            // Button 1 action
            Toast.makeText(this, "Button 1 Clicked", Toast.LENGTH_SHORT).show()
        })

        customDialog.setButton2ClickListener(View.OnClickListener {
            // Button 2 action
            Toast.makeText(this, "Button 2 Clicked", Toast.LENGTH_SHORT).show()
        })

        customDialog.show()
    }
}
