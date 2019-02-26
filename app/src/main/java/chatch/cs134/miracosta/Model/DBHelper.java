package chatch.cs134.miracosta.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final String TAG = DBHelper.class.getSimpleName();

    // Step 1) Define all database info in CONSTANTS
    public static final String DATABASE_NAME = "ToDo2Day";
    public static final String DATABASE_TABLE = "Tasks";
    public static final String FIELD_PRIMARY_KEY = "_id";
    public static final String FIELD_DESCRIPTION = "description";
    public static final String FIELD_IS_DONE = "is_done";

    public DBHelper(Context context){
        // factory is if it's based off another database
        super(context, DATABASE_NAME, null, 1);
    }

    // Constructor for DBHelper
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create all of database tables
        // 1) Determine whether to read or write the database (CREATE = write)
        // Opens a writable connection to the ToDo2Day database
        db = getWritableDatabase();

        // Execute the create table statement
        String sql = "CREATE TABLE IF NOT EXISTS " + DATABASE_TABLE + "("
                +FIELD_PRIMARY_KEY + " INTEGER PRIMARY KEY, "
                +FIELD_DESCRIPTION + " TEXT, "
                + FIELD_IS_DONE + " INTEGER" + ")";

        // Log the SQL String
        Log.i(TAG, sql);

        db.execSQL(sql);

        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
