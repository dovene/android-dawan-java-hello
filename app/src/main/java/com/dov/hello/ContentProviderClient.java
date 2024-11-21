package com.dov.hello;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.widget.Toast;

public class ContentProviderClient {

    private void readFromOtherApp(Context context) {
        // Define the URI of the ContentProvider
        Uri contentUri = Uri.parse("content://com.dov.calculator.provider/calculator");

        // Query example
        Cursor cursor = context.getContentResolver().query(
                contentUri,
                null,  // all columns
                null,  // no selection
                null,  // no selection args
                null   // no sort order
        );

// Process the results
        if (cursor != null) {
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String result = cursor.getString(cursor.getColumnIndexOrThrow("result"));

                Toast.makeText(context, "ID: " + id + ", Result: " + result, Toast.LENGTH_SHORT).show();

            }
            cursor.close();
        }
    }



    /*
    *
        Toast.makeText(this, "Bonjour", Toast.LENGTH_SHORT).show();

        Snackbar.make(greetButton, "Bonjour et aurevoir", Snackbar.LENGTH_LONG).setAction("Aurevoir", v -> {
            finish();
        }).show();

        Intent intent = getIntent();
        intent.putExtra("firstname", firstnameEdit.getText().toString());
        Log.d("OnCreate", "Bienvenue");

        startActivity(new Intent(MainActivity.this, SecondActivity.class));*/
}
