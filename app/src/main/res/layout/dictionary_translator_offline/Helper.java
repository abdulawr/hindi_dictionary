package ss.technology.hindi_dictionary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Helper {

 private SQLiteOpenHelper openHelper;
 private SQLiteDatabase database;
 private static Helper instanse;

    public Helper(Context context) {
        this.openHelper=new SQLite_Helper(context);
    }

    public static Helper getInstance(Context context)
    {
        if (instanse==null)
        {
            instanse=new Helper(context);
        }

        return instanse;
    }

    public void  open()
    {
        database=openHelper.getWritableDatabase();
    }

    public void close()
    {
        if(database!=null)
        {
            database.close();
        }
    }

    boolean Add_Fovourite(String english,String meaning)
    {
        ContentValues values=new ContentValues();
        values.put("english",english);
        values.put("meaning",meaning);

        Long result=database.insert("fav",null,values);
        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    Cursor getHistory()
    {
        Cursor cursor=database.rawQuery("select * from history;",null);
        return cursor;
    }

    boolean history(String word,String mean)
    {
        ContentValues values=new ContentValues();
        values.put("word",word);
        values.put("mean",mean);

        Long result=database.insert("history",null,values);
        if(result == -1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }

    Cursor get_Favourite()
    {
        Cursor cursor=database.rawQuery("select * from fav;",null);
        return cursor;
    }

    void delete_Favourite()
    {
        database=openHelper.getReadableDatabase();
        database.execSQL("delete from fav;");
    }

    void deltee_history()
    {
        database=openHelper.getReadableDatabase();
        database.execSQL("delete from history;");
    }

    Cursor getRandomWord(int id)
    {
        Cursor cursor=database.rawQuery("select * from word where _id = "+id+";",null);
        return cursor;
    }

    Cursor getMeaning(String search,String language)
    {
        String query="select english,definition,synonyms,antonyms,"+language+" from word where english == upper("+"\'"+search+"\'"+");";
        Cursor cursor=database.rawQuery(query,null);
        return cursor;
    }

    Cursor getSuggestion(String search)
    {

           String query="select _id,english from word where english like '"+search+"%' limit 40;";
           Cursor cursor=database.rawQuery(query,null);
          if (cursor.getCount() > 0)
          {
              return cursor;
          }
          else
          {
              String querys="select _id,english from word where english like '"+search+"%' limit 40;";
              Cursor cursors=database.rawQuery(querys,null);
              return cursors;
          }
    }





}
