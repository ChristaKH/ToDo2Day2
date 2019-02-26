package chatch.cs134.miracosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import chatch.cs134.miracosta.Model.DBHelper;

public class MainActivity extends AppCompatActivity {

    private DBHelper mDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate (create) the database
        mDb = new DBHelper(this);
    }

    // Ctrl + o => overrides

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDb.close();
    }
}
