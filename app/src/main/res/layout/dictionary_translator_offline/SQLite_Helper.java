package ss.technology.hindi_dictionary;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class SQLite_Helper extends SQLiteAssetHelper {

    private static final String DATABASE_NAME = "dictionary.db";
    private static final int DATABASE_VERSION = 1;
    private Context context;

    public SQLite_Helper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

}
