package com.example.ryusungho.myactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        intent.putExtra("title","김다혜");
        startActivityForResult(intent,1001);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data != null){
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(),"전달받은 값 : " + name, Toast.LENGTH_LONG).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
