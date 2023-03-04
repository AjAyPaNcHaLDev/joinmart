package com.qtc.joinmart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.widget.Toast;

public class NetworkState extends Activity {

     NetworkState(){


     }
     boolean getState(Context context){
         final ConnectivityManager conMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
         final NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();
         if (activeNetwork != null && activeNetwork.isConnected()) {
             return true;
         } else {
             Toast.makeText(context,"Please turn on your Internet.",Toast.LENGTH_SHORT).show();

         }
         return false;
     }
}
