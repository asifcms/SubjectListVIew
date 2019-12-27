package com.example.subjectlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewAutoScrollHelper;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG ="MainActivity";

    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate : Started.");
        ListView mListView = (ListView)findViewById(R.id.listView);
        mListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, OPTIONactivity.class);
                startActivity(intent);
            }
        });

        Subjects OOPM = new Subjects("oopm","BE/SEM7/THEORY");
        Subjects OOPMa = new Subjects("oopm-a","BE/SEM7/PRA-A");
        Subjects OOPMb = new Subjects("oopm-b","BE/SEM7/PRA-B");
        Subjects OOPMc = new Subjects("oopm-c","BE/SEM7/PRA-C");

        ArrayList<Subjects> subjectlist= new ArrayList<>();
        subjectlist.add(OOPM);
        subjectlist.add(OOPMa);
        subjectlist.add(OOPMb);
        subjectlist.add(OOPMc);

        SubjectsListAdapter adapter = new SubjectsListAdapter(this, R.layout.adapter_layout, subjectlist);
        mListView.setAdapter(adapter);
    }
}
