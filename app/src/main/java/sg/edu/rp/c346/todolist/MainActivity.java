package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvActions;
    ArrayList<actionList> toDoList = new ArrayList<actionList>();
    ArrayAdapter<String> aaDate;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvActions = findViewById(R.id.listViewAction);

        toDoList.add(new actionList("MSA", "01/07/2019"));
        toDoList.add(new actionList("Go for haircut", "22/09/2019"));

        //aaVersion = new ArrayAdapter(this,android.R.layout.simple_list_item_1,androidVersionArrayList);
        adapter = new CustomAdapter(this, R.layout.row,toDoList);
        //lvAndroidList.setAdapter(aaVersion);
        lvActions.setAdapter(adapter);



    }
}