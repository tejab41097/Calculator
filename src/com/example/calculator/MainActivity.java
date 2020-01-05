package com.example.calculator;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText a, b;
	Button c, d, e, f;
	String s1, s2;
	int n1, n2, n3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		a = (EditText) findViewById(R.id.editText1);
		b = (EditText) findViewById(R.id.editText2);
		c = (Button) findViewById(R.id.button1);
		d = (Button) findViewById(R.id.button2);
		e = (Button) findViewById(R.id.button4);
		f = (Button) findViewById(R.id.button3);

		c.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1 = a.getText().toString();
				s2 = b.getText().toString();
				n1 = Integer.parseInt(s1);
				n2 = Integer.parseInt(s2);
				n3 = n1 + n2;
				Toast.makeText(getApplicationContext(),
						"Result Of Addition is:-" + n3, 10000).show();
			}
		});

		d.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1 = a.getText().toString();
				s2 = b.getText().toString();
				n1 = Integer.parseInt(s1);
				n2 = Integer.parseInt(s2);
				n3 = n1 - n2;
				Toast.makeText(getApplicationContext(),
						"Result Of Subtraction is:-" + n3, 10000).show();
			}
		});

		e.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1 = a.getText().toString();
				s2 = b.getText().toString();
				n1 = Integer.parseInt(s1);
				n2 = Integer.parseInt(s2);
				n3 = n1 * n2;
				Toast.makeText(getApplicationContext(),
						"Result Of Multiply is:-" + n3, 10000).show();
			}
		});

		f.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s1 = a.getText().toString();
				s2 = b.getText().toString();
				n1 = Integer.parseInt(s1);
				n2 = Integer.parseInt(s2);
				n3 = n1 / n2;
				Toast.makeText(getApplicationContext(),
						"Result Of Divide is:-" + n3, 10000).show();
			}
		});
	}

}
