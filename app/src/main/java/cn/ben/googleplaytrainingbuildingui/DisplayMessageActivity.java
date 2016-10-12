package cn.ben.googleplaytrainingbuildingui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.RelativeLayout.ALIGN_PARENT_BOTTOM;
import static android.widget.RelativeLayout.BELOW;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(BELOW, R.id.btn_use_string_res_2);
        textView.setLayoutParams(layoutParams);
        layout.addView(textView);
    }

    @SuppressWarnings("UnusedParameters")
    public void useStringResource1(View view) {
        // Get a string resource from your app's Resources
        String hello = getResources().getString(R.string.hello_world);
        Toast.makeText(this, hello, Toast.LENGTH_SHORT).show();
    }

    @SuppressWarnings("UnusedParameters")
    public void useStringResource2(View view) {
        // Or supply a string resource to a method that requires a string
        TextView textView = new TextView(this);
        textView.setText(R.string.hello_world);
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(ALIGN_PARENT_BOTTOM);
        textView.setLayoutParams(layoutParams);
        layout.addView(textView);
    }
}
