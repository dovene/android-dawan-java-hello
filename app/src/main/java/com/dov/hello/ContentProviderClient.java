package com.dov.hello;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;

public class ContentProviderClient {

    private void readFromOtherApp(Context context) {
        Uri contentUri = Uri.parse("content://com.dov.calculator.provider/calculator");

        Cursor cursor = context.getContentResolver().query(
                contentUri,
                null,  // all columns
                null,  // no selection
                null,  // no selection args
                null   // no sort order
        );

        if (cursor != null) {
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String result = cursor.getString(cursor.getColumnIndexOrThrow("result"));

                Toast.makeText(context, "ID: " + id + ", Result: " + result, Toast.LENGTH_SHORT).show();

            }
            cursor.close();
        }
    }

}
