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

public class MainActivity extends Activity {

	int player = 1;
	int row = 3;
	int column = 3;
	Button[][] arr = new Button[row][column];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		arr[0][0] = (Button) findViewById(R.id.button1);
		arr[0][1] = (Button) findViewById(R.id.button2);
		arr[0][2] = (Button) findViewById(R.id.button3);
		arr[1][0] = (Button) findViewById(R.id.button4);
		arr[1][1] = (Button) findViewById(R.id.button5);
		arr[1][2] = (Button) findViewById(R.id.button6);
		arr[2][0] = (Button) findViewById(R.id.button7);
		arr[2][1] = (Button) findViewById(R.id.button8);
		arr[2][2] = (Button) findViewById(R.id.button9);

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				arr[r][c].setOnClickListener(btnClickListener);
			}

		}
		
	}

	View.OnClickListener btnClickListener = new OnClickListener() {

		public void onClick(View v) {
			Button btn = (Button) v;
			if (btn.getText().equals("")) {
				if (player == 1) {
					btn.setText("X");
				} else {
					btn.setText("O");
				}
				player = -player;
			} else {
			}
		}

	};

	public void check() {
		Toast.makeText(getApplicationContext(),
				" winner", Toast.LENGTH_SHORT).show();
		for (int r = 0; r < row; r++) {
			if (arr[r][0].getText().equals(arr[r][1].getText().equals(arr[r][2].getText())));
			{
				if (player == 1) {
					Toast.makeText(getApplicationContext(),
							"player 1 is winner", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(),
							"player 2 is winner", Toast.LENGTH_SHORT).show();	
				}

			}
		}
	}
}
