package com.pallefire.b_34aptitask;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends DialogFragment {


    public SecondFragment() {
        // Required empty public constructor
    }
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //AlertDialog.Builder(this, new AlertDialog().THEME_DEVICE_DEFAULT_LIGHT());
        builder.setTitle(" For User Rating ");
        builder.setMessage("* * * * *");
        builder.setPositiveButton("Click Here", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.tdevaux.googleurlshortener&hl=en"));
                startActivity(intent);
            }
        });
        d = builder.create();
        return d;
    }
}
