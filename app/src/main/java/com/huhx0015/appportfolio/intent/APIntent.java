package com.huhx0015.appportfolio.intent;

import android.content.Context;
import android.content.Intent;

/** -----------------------------------------------------------------------------------------------
 *  [APMainActivity] CLASS
 *  DEVELOPER: Michael Yoon Huh
 *  DESCRIPTION: APIntent is a class that contains methods for launching intents to activities and
 *  external applications.
 *  -----------------------------------------------------------------------------------------------
 */

public class APIntent {

    // launchExternalIntent(): Launches an Intent to an external application.
    public static void launchExternalIntent(String packageName, Context context) {

        // Searches for the application in the package manager.
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(packageName);

        // If the application is found, the proper flag is set and the application is launched.
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}