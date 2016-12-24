package com.pallefire.b_34aptitask;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends DialogFragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=null;
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        View v=getActivity().getLayoutInflater().inflate(R.layout.fragment_first,null);
        ImageView img1= (ImageView) v.findViewById(R.id.im1);
        ImageView img2= (ImageView) v.findViewById(R.id.im2);
        ImageView img3= (ImageView) v.findViewById(R.id.im3);
        ImageView img4= (ImageView) v.findViewById(R.id.img4);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com"));
                startActivity(intent);
            }

        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
                startActivity(intent);
            }

        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
                startActivity(intent);
            }

        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(intent);
            }

        });
        builder.setView(v);
        d=builder.create();

        return d;
    }
}
