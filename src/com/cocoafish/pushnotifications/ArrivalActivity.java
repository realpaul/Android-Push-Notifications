package com.cocoafish.pushnotifications;

import com.cocoafish.pushnotifications.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ArrivalActivity extends Activity {
	private String message;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arrival);

		Intent intent = getIntent();
		message = intent.getExtras().getString("notification_message");
		((TextView) findViewById(R.id.message_text)).setText(message);

		final Button gobackButton = ((Button) findViewById(R.id.goback_button));
		gobackButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(getBaseContext(), PushActivity.class));
			}
		});
	}

	@Override
	protected void onResume() {
		super.onResume();
	}
}