package kr.ac.kpu.ce2016150018.smsreceivesavetodb;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class smstodb extends AppCompatActivity {
    private static final String TAG = "smstodb";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Intent passedIntent = getIntent();
        //processIntent(passedIntent);
        Log.d(TAG, "smstodb에서 받음");
    }

    private void processIntent(Intent intent) {
        if(intent != null){
            String contents = intent.getStringExtra("contents");
            String receivedDate = intent.getStringExtra("receivedDate");
            Log.d(TAG, "(smstodb) main content : " + contents);
            Log.d(TAG, "(smstodb) receivedDate : " + receivedDate);
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        processIntent(intent);
        super.onNewIntent(intent);
    }
}

