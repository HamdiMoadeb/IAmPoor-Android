package com.example.hamdimoadeb.iampoor;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    ListView myListView;


    ArrayList<Payment> payments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myListView = findViewById(R.id.listview);

//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Hamdi");
//        arrayList.add("Mohammed");
//        arrayList.add("Badr");
//        arrayList.add("Firas");
//        arrayList.add("Ayoub");


//        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(
//                this, //1. Context
//                android.R.layout.simple_list_item_1, // 2.xml
//                arrayList //3. Données
//                );

        //myListView.setAdapter(myadapter);


        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new Payment("Kelwa", R.drawable.kidney));
        payments.add(new Payment("Kidney", R.drawable.kidney));
        payments.add(new Payment("Mastercard", R.drawable.mastercard));
        payments.add(new Payment("Visa", R.drawable.visa));
        payments.add(new Payment("PayPal", R.drawable.paypal));
        payments.add(new Payment("Shopify", R.drawable.shopify));
        payments.add(new Payment("Discover", R.drawable.discover));

        PaymentsAdapter adapter = new PaymentsAdapter(this,payments);
        myListView.setAdapter(adapter);


//        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                String phone = payments.get(position).getMethod();
//                // Toast.makeText(Main2Activity.this, name, Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));
//                if (ActivityCompat.checkSelfPermission(Main2Activity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
//
//
//                    startActivity(intent);
//                    return;
//                }else{
//                    ActivityCompat.requestPermissions(Main2Activity.this, new String[]{Manifest.permission.CALL_PHONE},1);
//
//                    // Toast.makeText(Main2Activity.this, "Sorry you don't have permession", Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.add_contact_menu, menu);

        return true;
    }
}
