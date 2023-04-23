package com.development.mk.toastcraft

import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Toaster {
    companion object {
        fun makeText(context: Context, message: String, duration: Int): Toast {
            val layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout, null)
            layout.findViewById<TextView>(R.id.toast_text).text = message
            val toast = Toast(context)
            toast.duration = duration
            toast.view = layout
            return toast
        }
    }
}
