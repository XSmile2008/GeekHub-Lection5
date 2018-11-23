package com.xsmile2008.geekhub4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class InternetConnectionReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "InternetConnection changed", Toast.LENGTH_LONG).show()
    }
}