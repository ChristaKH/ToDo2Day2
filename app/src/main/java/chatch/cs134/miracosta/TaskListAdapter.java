package chatch.cs134.miracosta;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;

import chatch.cs134.miracosta.Model.Task;

public class TaskListAdapter extends ArrayAdapter<Task> {
    private Context mContext;
    private int mResourceId;
    private List<Task> mAllTasks;

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // For each task in the list, inflate its view
        Task focusedTask = mAllTasks.get(position);

        // Create a layout inflater
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(mResourceId, null);
        CheckBox isDoneCheckBox = view.findViewById(R.id.isDoneCheckBox);
        isDoneCheckBox.setChecked(focusedTask.isDone());
        isDoneCheckBox.setText(focusedTask.getDescription());
        return view;
    }

    public TaskListAdapter(Context context, int resource, List<Task> objects) {
        super(context, resource, objects);

        // Initialize instance variables
        mContext = context;
        mResourceId = resource;
        mAllTasks = objects;

        //Override the getView method

    }

}

