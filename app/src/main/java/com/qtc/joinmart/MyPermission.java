package com.qtc.joinmart;

import android.app.Activity;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MyPermission extends Activity {
    public MyPermission(final Activity activity, String permission){
        Dexter.withContext(activity)
                .withPermission(permission)
                .withListener(new PermissionListener() {
                    @Override public void onPermissionGranted(PermissionGrantedResponse response) {
                    }
                    @Override public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(activity,"Please allow permission from  Setting ",Toast.LENGTH_SHORT).show();
                    }
                    @Override public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

                        token.continuePermissionRequest();
                    }
                }).check();

    }


    public static boolean getStatus(String permission) {
        return  true;
    }
}





