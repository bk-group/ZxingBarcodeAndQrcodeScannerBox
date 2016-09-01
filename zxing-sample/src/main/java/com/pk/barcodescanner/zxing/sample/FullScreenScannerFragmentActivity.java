package com.pk.barcodescanner.zxing.sample;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.dm7.barcodescanner.zxing.sample.R;

public class FullScreenScannerFragmentActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_full_screen_scanner_fragment);
    }
}
