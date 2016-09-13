package cn.ben.googleplaytrainingbuildingui;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "extra_message";
    private static final String TAG = "BEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a string resource from your app's Resources
        String appName = getResources().getString(R.string.app_name);
        Log.d(TAG, appName);
        // Or supply a string resource to a method that requires a string
        TextView textView = (TextView) findViewById(R.id.tv_app_name);
        textView.setText(R.string.app_name);
    }

    /**
     * Called when the user clicks the Send button
     */
    @SuppressWarnings("unused")
    public void sendMessage(@SuppressWarnings("UnusedParameters") View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /**
     * Check System Version at Runtime
     */
    @SuppressWarnings("unused")
    private void setUpActionBar() {
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                // TODO: 2016/8/31
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
        }
    }
}
