package com.example.search_recview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.search_recview.route.RingRoad150Feet;
import com.example.search_recview.route.SlamQuarter131;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private static final String TAG = MyAdapter.class.getSimpleName();

    private Context context;
    private List<Model>listitems;

    // Costructor
    public MyAdapter(Context context, List<Model> listitems) {
        this.context = context;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new ViewHolder(v);
    }

    // Called by RecyclerView to display the data at the specified position.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        //Get item from Model Class and bind it to recyclerview

             // final Model item =listitems.get(position);

            holder.textview.setText(listitems.get(position).getPickuppoints());

            holder.relativelayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 //   Toast.makeText(context,"Click on "+item.getPickuppoints(),Toast.LENGTH_SHORT).show();

                    Intent intent  = new Intent();
                    switch (listitems.get(position).getPickuppoints())
                    {
                        case "131 Slam Quarter" : intent = new Intent(view.getContext(), SlamQuarter131.class);
                                view.getContext().startActivity(intent);
                                    break;
                        case "150 Feet Ring Road - Morbi Road Crossing" : intent = new Intent(view.getContext(), RingRoad150Feet.class);
                            view.getContext().startActivity(intent);
                            break;
                    }
                }
            });
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textview;
        public RelativeLayout relativelayout;

        public ViewHolder(View itemView) {
           super(itemView);

           textview =(TextView) itemView.findViewById(R.id.pickuppoint);
           relativelayout = (RelativeLayout)itemView.findViewById(R.id.relativelayout);

        }
    }

    // Search Operation
    public void setSearchOperation(List<Model> newlist)
    {
        listitems = new ArrayList<>();
        listitems.addAll(newlist);
        notifyDataSetChanged();

    }
}
