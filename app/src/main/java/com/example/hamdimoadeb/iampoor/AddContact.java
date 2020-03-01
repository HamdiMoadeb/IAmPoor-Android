package com.example.hamdimoadeb.iampoor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {

    EditText number, name;
    Button addbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        number = findViewById(R.id.editnumber);
        name = findViewById(R.id.editnom);
        addbtn = findViewById(R.id.btnadd);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nuero = number.getText().toString();
                String esm = name.getText().toString();
            }
        });
    }
}
