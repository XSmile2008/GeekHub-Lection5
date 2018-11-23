package com.xsmile2008.geekhub4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MySuperReceiver: BroadcastReceiver() {

    companion object {
        const val ACTION = "MY_SUPER_ACTION"
    }

    override fun onReceive(context: Context, intent: Intent) {
        when(intent.action) {
            ACTION -> Toast.makeText(context, intent.getStringExtra("DATA"), Toast.LENGTH_LONG).show()
        }
    }
}