package com.dtnghia.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dtnghia.database.databases.DatabaseHelper;
import com.dtnghia.database.databases.models.Data;

import java.io.IOException;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txtSentence;
    EditText txtShape;
    Button btnStart;
    private DatabaseHelper db;
    private Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSentence = (TextView)findViewById(R.id.txtSentence);
        txtShape = (EditText)findViewById(R.id.txtShape);

        btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);

        db = new DatabaseHelper(MainActivity.this);
        try {
            db.createDataBase();
            db.openDataBase();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnStart) {
            String datatest = "L;00000;R1;";
            String[] strings = datatest.split(";");
            data = db.getData(strings[1]+strings[2]);
            txtSentence.setText(data.getSentence());
        }
    }
}
