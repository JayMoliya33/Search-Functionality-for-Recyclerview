package com.example.search_recview.route;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.search_recview.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapters extends RecyclerView.Adapter<MyAdapters.ViewHolder> {

    private Context context;
    private List<MyModel> listitems;

    // Constructor
    public MyAdapters(Context context, List<MyModel> listitems) {
        this.context = context;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public MyAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitems_routes_common, parent, false);
        return new MyAdapters.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapters.ViewHolder holder, int position) {
        final MyModel item = listitems.get(position);

        holder.textview1.setText(item.getRouteNo());
        holder.textview2.setText(item.getRouteName());

        holder.relativelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, item.getRouteName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textview1, textview2;
        public RelativeLayout relativelayout;

        public ViewHolder(View itemView) {
            super(itemView);

            textview1 = (TextView) itemView.findViewById(R.id.routeno);
            textview2 = (TextView) itemView.findViewById(R.id.routename);
            relativelayout = (RelativeLayout) itemView.findViewById(R.id.singleRow1);

        }
    }
}