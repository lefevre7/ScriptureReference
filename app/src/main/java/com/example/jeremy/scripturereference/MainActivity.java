package com.example.jeremy.scripturereference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void handleButtonClick(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.Book);
        EditText editText2 = (EditText) findViewById(R.id.Chapter);
        EditText editText3 = (EditText) findViewById(R.id.Verse);

        String book = editText1.getText().toString();
        String chapter = editText2.getText().toString();
        String verse = editText3.getText().toString();

        intent.putExtra("theBook", book);
        intent.putExtra("theChapter", chapter);
        intent.putExtra("theVerse", verse);
        startActivity(intent);

        //System.out.println(verse);



    }


    //public class MyActivity extends ActionBarActivity {
      //  public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
        //...
    //}
}
