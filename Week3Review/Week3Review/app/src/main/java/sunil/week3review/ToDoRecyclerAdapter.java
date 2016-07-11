package sunil.week3review;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by sunil on 7/9/16.
 */
public class ToDoRecyclerAdapter extends RecyclerView.Adapter<ToDoHolder> {

    List<ToDoItem> mToDoList;
    public static final String LIST_KEY ="LIST_KEY";

    public ToDoRecyclerAdapter(List <ToDoItem> todolist){
        mToDoList = todolist;
    }

    @Override
    // this method takes a viewgroup, gets its context, and inflates it
    // the inflated view is assigned to a view variable
    // this view is passed to the holder's constructor
    // finally, the constructed holder is returned
    public ToDoHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //create a layoutinflater that gets the context of the viewgroup passed to it
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        //use the inflater to inflate your custom layout into the parent viewgroup
        //assign this inflated parent to the View parentview (or whatever you want to call it)
        View parentview = inflater.inflate(R.layout.activity_2_layout,parent, false);

        // now that you have assigned the inflated layout to a view,
        // you can can use this new view as a parameter to construct a ToDoHolder
        ToDoHolder tdHolder = new ToDoHolder(parentview);

        //... and return it!
        return tdHolder;
    }

    @Override
    // This method takes the holder created from the onCreate Method
    public void onBindViewHolder(ToDoHolder holder, final int position) {

        // a reference is declared and assigned to a given position in
        // the list of objects
        ToDoItem itemReference = mToDoList.get(position);

        // the textbar reference in the holder is set to the referenced mTitle
        // in the list
        holder.mTitle.setText(itemReference.getTitle());
        holder.mDesc.setText(itemReference.getDesc());

        holder.mOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(),Activity2.class);
                //intent.putExtra(LIST_KEY, String.valueOf(mToDoList.get(position)));
                //view.getContext().startActivity(intent);
            }
        });

        holder.mOpen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mToDoList.add(new ToDoItem());
                notifyDataSetChanged();
                return false;
            }
        });

        holder.mDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mToDoList.size() > 0 ) { // add dialog
                    mToDoList.remove(mToDoList.get(position));
                    notifyDataSetChanged();
                }
                Toast.makeText(view.getContext(),
                        "Deleted",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mToDoList.size();
    }

}
