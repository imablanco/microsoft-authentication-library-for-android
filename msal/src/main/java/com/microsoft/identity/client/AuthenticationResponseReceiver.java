package com.microsoft.identity.client;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Álvaro Blanco Cabrero on 08/02/2018.
 * microsoft-authentication-library-for-android.
 */

public class AuthenticationResponseReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        InteractiveRequest.onAuthenticationResult(getResultCode(), intent);
    }
}
