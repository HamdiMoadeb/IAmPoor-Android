package com.example.hamdimoadeb.iampoor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class PaymentsAdapter extends ArrayAdapter<Payment>{


    private Context ctx;
    private ArrayList<Payment> arrayList;
    //private RadioButton selected = null;

    public PaymentsAdapter(@NonNull Context context, ArrayList<Payment> payments) {
        super(context, R.layout.list_item_payment, payments);

        this.ctx = context;
        this.arrayList = payments;
    }





    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //super.getView(position, convertView, parent);

        convertView = LayoutInflater.from(ctx).inflate(R.layout.list_item_payment,parent,false);

        RadioButton radioButton = convertView.findViewById(R.id.radioPayment);
        ImageView imageView = convertView.findViewById(R.id.imagePayment);
        TextView textView = convertView.findViewById(R.id.methodName);

        Payment mypayment = getItem(position);
        textView.setText(mypayment.getMethod());
        imageView.setImageResource(mypayment.getImage());

        return convertView;




      //  convertView = LayoutInflater.from(ctx).inflate(R.layout.list_item_payment, parent, false);

//        TextView name = convertView.findViewById(R.id.methodName);
//        ImageView image = convertView.findViewById(R.id.imagePayment);
//        final RadioButton radioButton = convertView.findViewById(R.id.radioPayment);


//        radioButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (selected != null) {
//                    selected.setChecked(false);
//                }
//                radioButton.setChecked(true);
//                selected = radioButton;
//            }
//        });

    }
}
