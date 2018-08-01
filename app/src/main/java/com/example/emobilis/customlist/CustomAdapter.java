package com.example.emobilis.customlist;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by emobilis on 7/25/18.
 */

public class CustomAdapter extends ArrayAdapter<Custom> {
    Context context;
    int resource;
    List<Custom> listitems;

    public CustomAdapter(@NonNull Context context, int resource, List<Custom> listitems) {
        super(context, resource, listitems);
        this.context = context;
        this.resource = resource;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.trill,null);
        TextView name = view.findViewById(R.id.textView);
        TextView description = view.findViewById(R.id.textView2);
        ImageView pic = view.findViewById(R.id.imageView);

        Custom custom = listitems.get(position);
        name.setText(custom.getNames());
        description.setText(custom.getDescption());
        pic.setImageDrawable(context.getResources().getDrawable(custom.getImages()));

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                removeItem(position);
            }
        });
        return view;
    }

    private void removeItem(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Delete Item?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listitems.remove(position);
                notifyDataSetChanged();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context, "Not", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
