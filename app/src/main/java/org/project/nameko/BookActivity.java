package org.project.nameko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_GRANDPA= 401;
    public static final int REQUEST_CODE_FARM= 402;
    public static final int REQUEST_CODE_EXPLAIN= 403;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ImageView grandpaImageView = findViewById(R.id.menuGrandpaImage);
        grandpaImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), GrandpaActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent,REQUEST_CODE_GRANDPA);
        });

        ImageView farmImageView = findViewById(R.id.menuFarmSelectedImage);
        farmImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), FarmActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent,REQUEST_CODE_FARM);
        });

        ImageView explainImageView = findViewById(R.id.menuExplainImage);
        explainImageView.setOnClickListener(v ->  {
            Intent intent = new Intent(getApplicationContext(), ExplainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivityForResult(intent,REQUEST_CODE_EXPLAIN);
        });

        Toast.makeText(this,"팜 액티비티 create",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Toast.makeText(this,"북 액티비티 onNewIntent",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "북 액티비티 destroy", Toast.LENGTH_LONG).show();
    }

}