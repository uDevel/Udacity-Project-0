package com.udevel.appportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupViews() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_spotify_streamer).setOnClickListener(this);
        findViewById(R.id.btn_scores_app).setOnClickListener(this);
        findViewById(R.id.btn_library_app).setOnClickListener(this);
        findViewById(R.id.btn_build_it_bigger).setOnClickListener(this);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(this);
        findViewById(R.id.btn_capstone).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_spotify_streamer:
                showToastLaunchApp(getString(R.string.app_name_spotify_streamer));
                break;
            case R.id.btn_scores_app:
                showToastLaunchApp(getString(R.string.app_name_scores_app));
                break;
            case R.id.btn_library_app:
                showToastLaunchApp(getString(R.string.app_name_library_app));
                break;
            case R.id.btn_build_it_bigger:
                showToastLaunchApp(getString(R.string.app_name_build_it_bigger));
                break;
            case R.id.btn_xyz_reader:
                showToastLaunchApp(getString(R.string.app_name_xyz_reader));
                break;
            case R.id.btn_capstone:
                showToastLaunchApp(getString(R.string.app_name_capstone));
                break;
        }
    }

    private void showToastLaunchApp(String app_name) {
        Toast.makeText(this, getString(R.string.msg_launch_app) + app_name, Toast.LENGTH_SHORT).show();
    }
}
