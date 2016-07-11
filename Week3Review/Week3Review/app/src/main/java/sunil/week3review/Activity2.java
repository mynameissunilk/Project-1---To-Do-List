package sunil.week3review;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {

    RecyclerView activity2Recycler;

    ArrayList<ToDoItem> ToDoList1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        activity2Recycler = (RecyclerView)findViewById(R.id.activity2recycler);
        LinearLayoutManager activity2LayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        activity2Recycler.setLayoutManager(activity2LayoutManager);

        ToDoList1 = new ArrayList<>();
        ToDoList1.add(new ToDoItem("Title", "Description"));

        ToDoRecyclerAdapter activity2Adapter = new ToDoRecyclerAdapter(ToDoList1);
        activity2Recycler.setAdapter(activity2Adapter);
    }
}
