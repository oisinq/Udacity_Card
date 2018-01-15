package io.oisin.udacity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void address(View v) {
        TextView t = (TextView) findViewById(R.id.address);
        Intent geoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+t.getText().toString()));
        startActivity(geoIntent);
    }
}
