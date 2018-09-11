package com.example.studentadmin.telephone;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1 = findViewById(R.id.Phone);
        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        String IMEINumber = tm.getDeviceId();
        String subscriber = tm.getDeviceId();
        String SIMSerialNumber = tm.getSimSerialNumber();
        String networkCountryISO = tm.getNetworkCountryIso();
        String SIMCountryISO = tm.getSimCountryIso();
        String softwareversion = tm.getDeviceSoftwareVersion();
        String voiceMailNumber = tm.getVoiceMailNumber();

        String strphoneType = "";

        int phoneType = tm.getPhoneType();
        switch (phoneType){
            case (TelephonyManager.PHONE_TYPE_CDMA):
                strphoneType = "CDMA";
                break;
            case (TelephonyManager.PHONE_TYPE_GSM):
                strphoneType = "GSM";
                break;
            case (TelephonyManager.PHONE_TYPE_NONE):
                strphoneType = "None";
                break;
        }

        boolean isRoaming = tm.isNetworkRoaming();

        String info="Phone Details:\n";
        info+="\n IMEI Number: "+IMEINumber;
        info+="\n Subscriber: "+subscriber;
        info+="\n SIMSeraialNumber: "+SIMSerialNumber;
        info+="\n networkCountryISO: "+networkCountryISO;
        info+="\n SIMCountryISO: "+SIMCountryISO;
        info+="\n softwareVersion: "+softwareversion;
        info+="\n voiceMailNumber: "+voiceMailNumber;
        info+="\n PhoneNetworkType: "+strphoneType;
        info+="\n In Roaming?: "+isRoaming;

        t1.setText(info);
    }
}
