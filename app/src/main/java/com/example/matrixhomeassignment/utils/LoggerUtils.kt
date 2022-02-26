package com.example.matrixhomeassignment.utils

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.matrixhomeassignment.R
import com.google.android.material.snackbar.Snackbar

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
// Object to handle logs and toasts
object LoggerUtils {
    private val TAG = this::class.simpleName.toString()

    fun info(tag: String, msg: String) {
        Log.i(tag, msg)
    }

    fun error(tag: String, msg: String) {
        Log.e(tag, msg)
    }

    fun shortToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun snackBar(context: Context, view: View, msg: String) {
        val snackbar: Snackbar = Snackbar.make(view, msg, Snackbar.LENGTH_LONG)
        snackbar.setBackgroundTint(ContextCompat.getColor(context, R.color.text_color))
        snackbar.setTextColor(ContextCompat.getColor(context, R.color.bg_main_color))
        snackbar.show()
    }
}