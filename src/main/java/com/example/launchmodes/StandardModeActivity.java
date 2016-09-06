package com.example.launchmodes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class StandardModeActivity extends Activity implements OnClickListener{

	String TAG = this.getClass().getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.e(TAG, "onCreate");

		TextView tvMode = (TextView) findViewById(R.id.tvMode);

		tvMode.setText(this.getClass().getSimpleName());
	}

	@Override
	public void onClick(View v) {
		int viewId = v.getId();
		switch (viewId) {
		case R.id.standardMode:
			startActivity(new Intent(this, StandardModeActivity.class));
			break;

		case R.id.singleTop:
			startActivity(new Intent(this, SingleTopActivity.class));
			break;

		case R.id.singleInstance:
			startActivity(new Intent(this, SingleInstanceActivity.class));
			break;

		case R.id.singleTask:
			startActivity(new Intent(this, SingleTaskActivity.class));
			break;
		}
		// SM STO STO
		// SM SM SM SI

	}

	@Override
	protected void onNewIntent( Intent intent )
	{
		super.onNewIntent(intent);
		Log.e(TAG, "onNewIntent Called");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.e(TAG, "onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.e(TAG, "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.e(TAG, "onDestroy");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.e(TAG, "onResume");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.e(TAG, "onReStart");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.e(TAG, "onPause");
	}

}
