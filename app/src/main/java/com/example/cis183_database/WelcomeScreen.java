package com.example.cis183_database;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WelcomeScreen extends AppCompatActivity
{
    DatabaseHelper dbHelper;

    TextView tv_j_session_id;
    TextView tv_j_name;
    TextView tv_j_numposts;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome_screen);
        dbHelper = new DatabaseHelper(this);
        tv_j_session_id = findViewById(R.id.tv_v_session_id);
        tv_j_name = findViewById(R.id.tv_v_name);
        tv_j_numposts = findViewById(R.id.tv_v_numposts);

        tv_j_session_id.setText("User ID: " + SessionData.getLoggedInUser().getUser_id());
        tv_j_name.setText("Name: " + SessionData.getLoggedInUser().getFname() + " " + SessionData.getLoggedInUser().getLname());
        tv_j_numposts.setText("# of Posts: " + dbHelper.getUserPostsGivenId(SessionData.getLoggedInUser().getUser_id()));

    }
}