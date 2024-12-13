package com.xubop961.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<HistoricEventModel> historicEvents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView historicalRecycleView = findViewById(R.id.recycleViewHistoricEvents);
        setHistoricEvents();

        HistoricEventRVAdapter adapter = new HistoricEventRVAdapter(
                this , historicEvents
        );

        historicalRecycleView.setAdapter(adapter);
        historicalRecycleView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setHistoricEvents() {
        String [] eventNames = getResources().getStringArray(R.array.historic_event_names);
        String [] eventQuest1 = getResources().getStringArray(R.array.historic_event_quest1);
        String [] eventQuest2 = getResources().getStringArray(R.array.historic_event_quest2);
        String [] eventQuest3 = getResources().getStringArray(R.array.historic_event_quest3);

        for (int i = 0; i < eventNames.length; i++) {
            historicEvents.add(new HistoricEventModel(
                    eventNames[i],
                    eventQuest1[i],
                    eventQuest2[i],
                    eventQuest3[i]
                    )
            );
        }
    }
}