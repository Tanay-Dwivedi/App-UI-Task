package com.play.appui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView profilePic, files, recycleBin, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // To display app in full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // To remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        profilePic = findViewById(R.id.profile_anim);
        files = findViewById(R.id.file_anim);
        recycleBin = findViewById(R.id.bin_anim);
        logout = findViewById(R.id.logout_anim);

        profilePic.setOnClickListener(view -> Toast.makeText(MainActivity.this, "User Profile Section", Toast.LENGTH_SHORT).show());

        files.setOnClickListener(view -> Toast.makeText(MainActivity.this, "All Files Section", Toast.LENGTH_SHORT).show());

        recycleBin.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Deleted Files Section", Toast.LENGTH_SHORT).show());

        logout.setOnClickListener(view -> Toast.makeText(MainActivity.this, "User LogOut", Toast.LENGTH_SHORT).show());

    }
}