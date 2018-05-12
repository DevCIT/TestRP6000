package com.cit.testprint;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


import com.huiyi.ypos.usdk.MyService;
import com.huiyi.ypos.usdk.aidl.AidlDeviceService;
import com.huiyi.ypos.usdk.aidl.AidlNFCCard;
import com.huiyi.ypos.usdk.aidl.AidlPrinter;
import com.huiyi.ypos.usdk.aidl.AidlPrinterListener;
import com.huiyi.ypos.usdk.data.PrinterPara;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_ok;
    TextView txt_nfc;
    AidlPrinter printer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_ok = (Button) findViewById(R.id.btn_ok);
        txt_nfc = (TextView) findViewById(R.id.txt_nfc);
        btn_ok.setOnClickListener(this);







    }




    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    public void onClick(View view) {
        if (view == btn_ok) {
            try {
                printer.printBottomFeedLine(10);
            } catch (RemoteException e) {
                e.printStackTrace();
            }





        }
    }


}
