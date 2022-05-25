package com.example.mad_p02_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("Isabelle Pak", "NP IT Year 2 Student", 1, false);

        TextView userName = findViewById(R.id.name);
        userName.setText(user1.Name);

        TextView userDescription = findViewById(R.id.description);
        userDescription.setText(user1.Description);

        Button userFollowed = findViewById(R.id.followed);

        if (user1.Followed = true){
            userFollowed.setText("Unfollow");
        }

        userFollowed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user1.Followed){
                    userFollowed.setText("Follow");
                    user1.Followed = false;
                }
                else {
                    userFollowed.setText("Unfollow");
                    user1.Followed = true;
                }
            }
        });
    }
}
