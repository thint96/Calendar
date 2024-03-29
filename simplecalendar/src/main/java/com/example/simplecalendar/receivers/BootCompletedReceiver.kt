package com.example.simplecalendar.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.simplecalendar.extensions.recheckCalDAVCalendars
import com.simplemobiletools.commons.helpers.ensureBackgroundThread

class BootCompletedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        ensureBackgroundThread {
            context.apply {
                recheckCalDAVCalendars {}
            }
        }
    }
}
