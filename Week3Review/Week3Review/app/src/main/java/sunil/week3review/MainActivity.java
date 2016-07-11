package sunil.week3review;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainActivityRecycler;
    List<ToDoItem> ToDoList1;
    listBook mBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a recyclerview reference and a layout manager
        //set the layout manager to the recyclerview
        mainActivityRecycler = (RecyclerView)findViewById(R.id.mainactivityrecycler);
        LinearLayoutManager mainLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mainActivityRecycler.setLayoutManager(mainLayoutManager);

        // create new ToDoList, but this isn't the best way to go about it i think.
        mBook = new listBook();
        mBook.add(new ToDoList);

        // create a RecyclerAdapter, passing a list as a parameter
        // use your recyclerview to set the adapter with the adapter as the argument
        ToDoParentRecyclerAdapter activity1Adapter = new ToDoParentRecyclerAdapter(mBook);
        mainActivityRecycler.setAdapter(activity1Adapter);


    }
}
