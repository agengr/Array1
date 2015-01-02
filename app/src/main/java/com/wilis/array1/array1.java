package com.wilis.array1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class array1 extends Activity {
	almag r=new almag();
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button save=(Button)findViewById(R.id.save);
		
		save.setOnClickListener(onSave);
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			EditText nama=(EditText)findViewById(R.id.nama);
			EditText alamat=(EditText)findViewById(R.id.alamat);
			
			r.setNama(nama.getText().toString());
			r.setAlamat(alamat.getText().toString());
			
			RadioGroup jekel=(RadioGroup)findViewById(R.id.jekel);
			
			switch (jekel.getCheckedRadioButtonId()) {
				case R.id.pria:
					r.setJekel("Pria");
					break;
					
				case R.id.perempuan:
					r.setJekel("Perempuan");
					break;
			}
		}
	};
}
