package com.example.demo_databinding;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.demo_databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User userModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userModel = new User("Duc", "Vinh");
        binding.setUser (userModel);
        userModel.setFirstName("Tran");
        userModel.setLastName("Vinh");

    }
}