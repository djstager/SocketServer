package com.example.androidserversocket;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	Button serverButton;
	Button clientButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        serverButton = (Button) findViewById(R.id.HostGameButton);
		clientButton = (Button) findViewById(R.id.ClientGameButton);
	}

	public void hostButtonOnClick(View v){
		serverButton=(Button) v;
		startActivity(new Intent(getApplicationContext(), ServerActivity.class));
	}

	public void clientButtonOnClick(View v){
		clientButton = (Button) v;
		startActivity(new Intent(getApplicationContext(), ClientActivity.class));
	}

}
