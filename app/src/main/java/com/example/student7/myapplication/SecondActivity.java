package com.example.student7.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.student7.myapplication.R;

public class SecondActivity extends ActionBarActivity {
    private EditText wprowadzNumerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle intentExtras = getIntent().getExtras();
        String username = intentExtras.getString("username");
        TextView helloView = (TextView)findViewById(R.id.hello);
        helloView.setText("Witaj " + username + "!");
        wprowadzNumerView = (EditText) findViewById(R.id.wprowadzNumer);
    }
    public void zadzwonClicked(View view) {
        String wprowadzNumer = wprowadzNumerView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + wprowadzNumer));
        startActivity(intent);

    }
}