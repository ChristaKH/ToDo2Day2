package chatch.cs134.miracosta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

import chatch.cs134.miracosta.Model.DBHelper;
import chatch.cs134.miracosta.Model.Task;

public class MainActivity extends AppCompatActivity {

    private DBHelper mDb;
    private List<Task> mAllTasks;
    private EditText mTaskEditText;
    private ListView mTaskListView;
    private TaskListAdapter mTaskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instantiate (create) the database
        mDb = new DBHelper(this);

        // FIll list with data from the database
        mAllTasks = mDb.getAllTasks();

        // Connect controller with view
        mTaskEditText = findViewById(R.id.taskEditText);
        mTaskListView = findViewById(R.id.taskListView);

        // Associate the TaskListAdapter with the ListView
        mTaskListAdapter = new TaskListAdapter(this, R.layout.task_item, mAllTasks);
        mTaskListView.setAdapter(mTaskListAdapter);
    }

    // addTask
    public void addTask(View v){
        String description = mTaskEditText.getText().toString();
        Task newTask = new Task(description);

        // Put the new task in the database
        mDb.addTask(newTask);

        // Notify the list adapter that it's changed
        mTaskListAdapter.notifyDataSetChanged();
    }

    // Ctrl + o => overrides

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mDb.close();
    }
}
