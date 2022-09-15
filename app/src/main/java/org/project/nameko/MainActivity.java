package org.project.nameko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_FARM= 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.startImage);
        imageView.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FarmActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivityForResult(intent,REQUEST_CODE_FARM);
        });
        Toast.makeText(this, "메인 액티비티 create", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "메인 액티비티 destroy", Toast.LENGTH_LONG).show();
    }
}