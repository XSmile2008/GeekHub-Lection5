package com.xsmile2008.geekhub4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TimeChangedReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when(intent.action) {
            Intent.ACTION_TIME_CHANGED -> {
                Toast.makeText(context, "time changed", Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_TIMEZONE_CHANGED -> {
                Toast.makeText(context, "time zone changed", Toast.LENGTH_LONG).show()
            }
        }
    }
}