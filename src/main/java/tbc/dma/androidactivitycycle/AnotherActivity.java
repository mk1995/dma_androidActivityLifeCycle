package tbc.dma.androidactivitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends AppCompatActivity {
    private String TAG = "TagAnotherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.i(TAG, "==On Create State==");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "==On Start State==");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "==On Restart State==");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "==On Resume State==");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "==On Pause State==");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "==On Stop State==");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "=== On Destroy State ===");
    }
}
