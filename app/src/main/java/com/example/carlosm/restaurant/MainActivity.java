package com.example.carlosm.restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {
    private static final int MENU_GET_REVIEWS = Menu.FIRST;
    private Spinner cocina;
    private Button grabReview;
    private EditText location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
