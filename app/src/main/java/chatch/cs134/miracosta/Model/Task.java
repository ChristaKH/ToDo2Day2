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
