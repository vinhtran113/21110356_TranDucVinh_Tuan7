package com.example.demo_databinding_recyclerview;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.demo_databinding_recyclerview.databinding.ActivityHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    public ObservableField<String> title= new ObservableField<>();
    private ListUserAdapter listUserAdapter;
    private ActivityHomeBinding binding;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView( this, R.layout.activity_home);
        title.set("Vi dụ về DataBinding cho RecycleView");
        binding.setHome(this);
        setData();
        binding.rcView.setLayoutManager (new LinearLayoutManager(this));
        binding.rcView.setAdapter (listUserAdapter);
        listUserAdapter.setOnItemClickListener(user -> itemClick(user));
    }
    private void setData() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            User user = new User("Duc" + i, "Vinh" + i);
            userList.add(user);
        }
        listUserAdapter = new ListUserAdapter(userList);
    }

    public void itemClick(User user) {
        Toast.makeText(this, "bạnvừaclick", Toast.LENGTH_SHORT).show();
    }

}