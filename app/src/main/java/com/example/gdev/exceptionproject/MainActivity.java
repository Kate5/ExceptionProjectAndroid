package com.example.gdev.exceptionproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.backendless.Backendless;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.gdev.exceptionproject.dataModel.Listing;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "foot_print";
    private String userId = "CFE5C697-0260-F7C3-FFF7-6C60B53D7800";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Backendless.initApp(this, "D8D9685E-D55A-01B2-FF18-00F927E66C00", "AC7FB683-64ED-E180-FF83-A8729EC0A700", "v1");
        Backendless.setUrl("http://10.0.1.91:9000");

        Backendless.Data.mapTableToClass("Listing", Listing.class);

        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testByFindingUser();
            }
        });

        testByFindingUser();
    }

    private void testByFindingUser() {
        Listing listing = new Listing();
        Backendless.Persistence.save(listing, new AsyncCallback<Listing>() {
            @Override
            public void handleResponse(Listing response) {
                Log.i(TAG, "New Listing instance has been saved");
            }
            @Override
            public void handleFault(BackendlessFault backendlessFault) {
                Log.e(TAG, "Error occurred : " + backendlessFault.toString());
            }
        });
    }
}
