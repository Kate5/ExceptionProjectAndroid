package com.example.gdev.exceptionproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.example.gdev.exceptionproject.dataModel.NudgeLocationHistory;
import com.example.gdev.exceptionproject.dataModel.UserFriend;
import com.example.gdev.exceptionproject.dataModel.UserLocation;
import com.example.gdev.exceptionproject.dataModel.UserMatchProfile;
import com.example.gdev.exceptionproject.dataModel.UserNudge;
import com.example.gdev.exceptionproject.dataModel.UserProfile;
import com.example.gdev.exceptionproject.dataModel.UserTalkPoint;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "foot_print";
    private BackendlessUser loggedInUser;
    private BackendlessUser testUser;
    private boolean found;
    private String userId= "DD3B89DB-BC80-D5EE-FF87-774CAC299100";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Backendless.initApp(this, "8CB1C847-8A33-094C-FF15-B297E1B59600", "D6751AAD-46CF-57D5-FF09-A8E26DF2B300", "v1");
        Backendless.setUrl( "http://10.0.1.91:9000" );

        Backendless.Data.mapTableToClass("UserProfile", UserProfile.class);
        Backendless.Data.mapTableToClass("UserMatchProfile", UserMatchProfile.class);
        Backendless.Data.mapTableToClass("UserLocation", UserLocation.class);
        Backendless.Data.mapTableToClass("UserTalkPoint", UserTalkPoint.class);
        Backendless.Data.mapTableToClass("UserNudge", UserNudge.class);
        Backendless.Data.mapTableToClass("UserFriend", UserFriend.class);
        Backendless.Data.mapTableToClass("NudgeLocationHistory", NudgeLocationHistory.class);

        setContentView(R.layout.activity_main);


        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testByFindingUser();
            }
        });

        getTestLoggedInUser();
    }

    private void getTestLoggedInUser() {

        Backendless.UserService.findById( userId, new AsyncCallback<BackendlessUser>() {
            @Override
            public void handleResponse(BackendlessUser result) {
                loggedInUser = result;
                Log.d(TAG, "found loggedInUser");
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {

            }
        });

    }


    private void saveOnServer(BackendlessUser user, BackendlessUser user1) {

        // add relation from UserNudge to User object
        UserNudge nudge = new UserNudge();
        nudge.setSender(user);
        nudge.setRecipient(user1);

        nudge.saveAsync(new AsyncCallback<UserNudge>() {
            @Override
            public void handleResponse(UserNudge userNudge) {
                Log.d(TAG, "saved!");
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {
                Log.e(TAG, backendlessFault.getMessage());
            }
        });
    }

    private void testByFindingUser(){

        Backendless.UserService.findById( userId, new AsyncCallback<BackendlessUser>() {
            @Override
            public void handleResponse(BackendlessUser user) {

                saveOnServer(loggedInUser, user);
            }

            @Override
            public void handleFault(BackendlessFault backendlessFault) {

            }
        });
    }
}
