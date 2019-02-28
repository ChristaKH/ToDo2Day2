package chatch.cs134.miracosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import chatch.cs134.miracosta.Model.DBHelper;
import chatch.cs134.miracosta.Model.Task;

public class MainActivity extends AppCompatActivity {

    private DBHelper mDb;
    private List<Task> mAllTasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate (create) the database
        mDb = new DBHelper(this);

        // FIll list with data from the database
        mAllTasks = mDb.getAllTasks();
    }

    // Ctrl + o => overrides

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDb.close();
    }
}
