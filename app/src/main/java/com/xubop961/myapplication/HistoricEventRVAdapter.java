package com.xubop961.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class HistoricEventRVAdapter extends RecyclerView.Adapter<HistoricEventRVAdapter.MyViewHolder> {

    Context context;
    ArrayList<HistoricEventModel> historicEventModels;

    public HistoricEventRVAdapter(Context context, ArrayList<HistoricEventModel> historicEventModels) {
        this.historicEventModels = historicEventModels;
        this.context = context;
    }

    @NonNull
    @Override
    public HistoricEventRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.cv_row, parent, false);
        return new  HistoricEventRVAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoricEventRVAdapter.MyViewHolder holder, int position) {

        String eventName = historicEventModels.get(position).getEventName();
        String eventQuest1 = historicEventModels.get(position).geteventQuest1();
        String eventQuest2 = historicEventModels.get(position).geteventQuest2();
        String eventQuest3 = historicEventModels.get(position).getEventQuest3();

        holder.tvEventName.setText(eventName);
        holder.tvQuest1.setText(eventQuest1);
        holder.tvQuest2.setText(eventQuest2);
        holder.tvQuest3.setText(eventQuest3);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(context)
                        .setIcon(R.drawable.book_logo)
                        .setTitle(eventName)
                        .setMessage("Este evento sucedió en el año " + ".\n ¿Es correcto?")
                        .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .setNegativeButton("Incorrecto", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        ;
                materialAlertDialogBuilder.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return historicEventModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvEventName, tvQuest1, tvQuest2, tvQuest3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEventName = itemView.findViewById(R.id.eventName);
            tvQuest1 = itemView.findViewById(R.id.eventQuest1);
            tvQuest2 = itemView.findViewById(R.id.eventQuest2);
            tvQuest3 = itemView.findViewById(R.id.eventQuest3);
        }
    }

}
