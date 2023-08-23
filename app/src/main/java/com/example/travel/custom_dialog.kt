package com.example.travel

import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class CustomDialog(context: Context, private val title: String, private val message: String) : Dialog(context) {

    private var button1ClickListener: View.OnClickListener? = null
    private var button2ClickListener: View.OnClickListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_dialog)

        val dialogTitle = findViewById<TextView>(R.id.dialogTitle)
        val dialogMessage = findViewById<TextView>(R.id.dialogMessage)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        dialogTitle.text = title
        dialogMessage.text = message

        button1ClickListener?.let { listener ->
            button1.setOnClickListener {
                listener.onClick(it)
                dismiss()
            }
        }

        button2ClickListener?.let { listener ->
            button2.setOnClickListener {
                listener.onClick(it)
                dismiss()
            }
        }
    }

    fun setButton1ClickListener(listener: View.OnClickListener) {
        button1ClickListener = listener
    }

    fun setButton2ClickListener(listener: View.OnClickListener) {
        button2ClickListener = listener
    }
}