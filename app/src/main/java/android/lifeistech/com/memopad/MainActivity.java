package android.lifeistech.com.memopad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = getSharedPreferences("explain", MODE_PRIVATE);
        boolean key = pref.getBoolean("key_tutorial", false);

        if (!key) {
            Intent intent = new Intent(this, ExplainActivity.class);
            startActivity(intent);
        }


    }

    public void memo (View v) {

        Intent intent = new Intent(this, MemoActivity.class);
        startActivity(intent);

    }
}
