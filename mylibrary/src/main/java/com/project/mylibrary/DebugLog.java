package com.project.mylibrary;

import android.content.Context;
import android.util.Log;

/**
 * Created by ${WIN} on ${08/10/2017
 * }.
 */

public class DebugLog {
    public static void e(Context context, String msg) {
        Log.e(context.getClass().getSimpleName(), msg);
    }
}
