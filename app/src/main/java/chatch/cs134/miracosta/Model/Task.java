package chatch.cs134.miracosta.Model;

public class Task {

    // Declare the instance variables
    private long mID;
    private String mDescription;
    private boolean mIsDone;

    public Task(long ID, String description, boolean isDone) {
        mID = ID;
        mDescription = description;
        mIsDone = isDone;
    }

    public Task(String description, boolean isDone) {
        mID = -1;
        mDescription = description;
        mIsDone = isDone;
    }

    public Task(String description) {
        mID = -1;
        mDescription = description;
        mIsDone = false;
    }

    public long getID() {
        return mID;
    }

    public void setID(long ID) {
        mID = ID;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isDone() {
        return mIsDone;
    }

    public void setDone(boolean done) {
        mIsDone = done;
    }
}
