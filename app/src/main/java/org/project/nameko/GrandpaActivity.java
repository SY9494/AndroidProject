package org.project.nameko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class GrandpaActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_FARM = 301;
    public static final int REQUEST_CODE_BOOK = 302;
    public static final int REQUEST_CODE_EXPLAIN = 303;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grandpa);

        ImageView farmImageView = findViewById(R.id.menuFarmSelectedImage);
        farmImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), FarmActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent, REQUEST_CODE_FARM);
        });

        ImageView bookImageView = findViewById(R.id.menuBookImage);
        bookImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), BookActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent, REQUEST_CODE_BOOK);
        });

        ImageView explainImageView = findViewById(R.id.menuExplainImage);
        explainImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), ExplainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent, REQUEST_CODE_EXPLAIN);
        });

        Toast.makeText(this,"팜 액티비티 create",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this,"할아버지 액티비티 onNewIntent",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "할아버지 액티비티 destroy", Toast.LENGTH_LONG).show();
    }

}