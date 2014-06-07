package com.example.xoapp;

import java.util.Random;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class old extends Activity {

	int click = 0;
	Button btn, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn1;
				Press(v);
			}
		});
		btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn2;
				Press(v);
			}
		});
		btn3 = (Button) findViewById(R.id.button3);
		btn3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn3;
				Press(v);
			}
		});
		btn4 = (Button) findViewById(R.id.button4);
		btn4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn4;
				Press(v);
			}
		});
		btn5 = (Button) findViewById(R.id.button5);
		btn5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn5;
				Press(v);
			}
		});
		btn6 = (Button) findViewById(R.id.button6);
		btn6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn6;
				Press(v);
			}
		});
		btn7 = (Button) findViewById(R.id.button7);
		btn7.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn7;
				Press(v);
			}
		});
		btn8 = (Button) findViewById(R.id.button8);
		btn8.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn8;
				Press(v);
			}
		});
		btn9 = (Button) findViewById(R.id.button9);
		btn9.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn = btn9;
				Press(v);
			}
		});
		btn0 = (Button) findViewById(R.id.button0);
		btn0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
//				btn1.setBackgroundColor(Color.GRAY);
//				btn2.setBackgroundColor(Color.GRAY);
//				btn3.setBackgroundColor(Color.GRAY);
//				btn4.setBackgroundColor(Color.GRAY);
//				btn5.setBackgroundColor(Color.GRAY);
//				btn6.setBackgroundColor(Color.GRAY);
//				btn7.setBackgroundColor(Color.GRAY);
//				btn8.setBackgroundColor(Color.GRAY);
//				btn9.setBackgroundColor(Color.GRAY);
				click=0;
				clickable();
				Toast.makeText(getApplicationContext(), "Successfull Reset",
						Toast.LENGTH_LONG).show();

			}
		});
	}

	public void Press(View v) {
		if (btn.getText().equals("")) {
			if (click == 0) {
				btn.setText("X");
				//btn.setBackgroundColor(Color.CYAN);
				check();
				click = 1;
			} else {
				btn.setText("O");
			//	btn.setBackgroundColor(Color.MAGENTA);
				check();
				click = 0;
			}
		}
		
	}

	public void check() {

		if (btn1.getText().equals("X") && btn2.getText().equals("X")
				&& btn3.getText().equals("X") || btn1.getText().equals("X")
				&& btn4.getText().equals("X") && btn7.getText().equals("X")
				|| btn2.getText().equals("X") && btn5.getText().equals("X")
				&& btn8.getText().equals("X") || btn3.getText().equals("X")
				&& btn6.getText().equals("X") && btn9.getText().equals("X")
				|| btn4.getText().equals("X") && btn5.getText().equals("X")
				&& btn6.getText().equals("X") || btn7.getText().equals("X")
				&& btn8.getText().equals("X") && btn9.getText().equals("X")
				|| btn3.getText().equals("X") && btn5.getText().equals("X")
				&& btn9.getText().equals("X")) {
			if (click == 0) {
				Toast.makeText(getApplicationContext(), "player 1 is winner",
						Toast.LENGTH_LONG).show();
				notClickable();
			} else {
				Toast.makeText(getApplicationContext(), "player 2 is winner",
						Toast.LENGTH_LONG).show();
				notClickable();
			}
		} else if (btn1.getText().equals("O") && btn2.getText().equals("O")
				&& btn3.getText().equals("O") || btn1.getText().equals("O")
				&& btn4.getText().equals("O") && btn7.getText().equals("O")
				|| btn2.getText().equals("O") && btn5.getText().equals("O")
				&& btn8.getText().equals("O") || btn3.getText().equals("O")
				&& btn6.getText().equals("O") && btn9.getText().equals("O")
				|| btn4.getText().equals("O") && btn5.getText().equals("O")
				&& btn6.getText().equals("O") || btn7.getText().equals("O")
				&& btn8.getText().equals("O") && btn9.getText().equals("O")
				|| btn3.getText().equals("O") && btn5.getText().equals("O")
				&& btn7.getText().equals("O")) {
			if (click == 0) {
				Toast.makeText(getApplicationContext(), "player 1 is winner",
						Toast.LENGTH_LONG).show();
				notClickable();
			} else {
				Toast.makeText(getApplicationContext(), "player 2 is winner",
						Toast.LENGTH_LONG).show();
				notClickable();
			}
		}

	}
	public void notClickable()
	{
		btn1.setClickable(false);
		btn2.setClickable(false);
		btn3.setClickable(false);
		btn4.setClickable(false);
		btn5.setClickable(false);
		btn6.setClickable(false);
		btn7.setClickable(false);
		btn8.setClickable(false);
		btn9.setClickable(false);
	}
	
	public void clickable()
	{
		btn1.setClickable(true);
		btn2.setClickable(true);
		btn3.setClickable(true);
		btn4.setClickable(true);
		btn5.setClickable(true);
		btn6.setClickable(true);
		btn7.setClickable(true);
		btn8.setClickable(true);
		btn9.setClickable(true);
	}
}
