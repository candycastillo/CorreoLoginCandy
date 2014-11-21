package com.cut.login3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	EditText usua;
	EditText pass;
	Button entrar;
	Button stop;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		usua = (EditText)findViewById(R.id.editUser);
		pass = (EditText)findViewById(R.id.editPass);
		entrar = (Button)findViewById(R.id.btnLogin);
		stop = (Button)findViewById(R.id.btnCancel);
		entrar.setOnClickListener(this);
		stop.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String na = usua.getText().toString();
		String pa = pass.getText().toString();
		
		switch (v.getId()) {
		case R.id.btnLogin:
			
				if (na.equals("candy") && pa.equals("fonseca")){
					Intent i=new Intent(this,Second.class);
					startActivity(i);
               Second a = new Second(); 				
				a.enviarMail();
				}
			
			break;
			
		case R.id.btnCancel:
			
				usua.setText(" ");
				pass.setText(" ");
			
			break;
		default:
			
			break;
			
		
		}
		
	}
}
