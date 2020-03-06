package tbc.dma.androidactivitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button nextActivityButton;
    private String TAG = "TagMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "==On Create State==");
        nextActivityButton = findViewById(R.id.buttonNextActivity);
        nextActivityButton.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonNextActivity){
            startActivity(new Intent(MainActivity.this, AnotherActivity.class));
        }
    }
}
