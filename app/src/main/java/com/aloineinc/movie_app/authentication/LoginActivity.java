package com.aloineinc.movie_app.authentication;

import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.aloineinc.movie_app.R;
import com.aloineinc.movie_app.authentication.model.LoginHandler;
import com.aloineinc.movie_app.authentication.model.User;
import com.aloineinc.movie_app.databinding.LoginActivityBinding;

public class LoginActivity extends AppCompatActivity {
    //create an object of the generated class
    private LoginActivityBinding binding;
    private User user;
    private LoginHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflate the layout using the predefined DataBindingUtil class
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        //instantiate the created object
        user = new User();
        //parse the object to the handler constructor
        handler = new LoginHandler(user);
        //set the user model to the binding class
        binding.setUser(user);
        //set the handler object to the binding class
        binding.setHandler(handler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
}
