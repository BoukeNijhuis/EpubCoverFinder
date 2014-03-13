package com.boombird.epubcoverfinder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		this.setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		this.getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle presses on the action bar items
		switch (item.getItemId())
		{
		case R.id.action_settings:
			this.showNotYetImplementedMessage();
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void findBooks(View view)
	{
		this.showNotYetImplementedMessage();
	}

	public void selectBook(View view)
	{
		this.showNotYetImplementedMessage();
	}

	public void exampleBook(View view)
	{
		this.showNotYetImplementedMessage();
	}

	private void showNotYetImplementedMessage()
	{
		Toast.makeText(this.getApplicationContext(),
				"Will be implemented soon!", Toast.LENGTH_LONG).show();
	}
}
