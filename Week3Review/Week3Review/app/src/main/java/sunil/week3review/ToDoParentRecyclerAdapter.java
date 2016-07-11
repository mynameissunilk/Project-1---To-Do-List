package sunil.week3review;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunil on 7/9/16.
 */
public class ToDoParentRecyclerAdapter extends RecyclerView.Adapter<ToDoParentHolder> {

    ArrayList<ArrayList<ToDoItem>> mParent;
    public static final String PARENT_KEY = "PARENT_KEY";

    public ToDoParentRecyclerAdapter(ArrayList<ArrayList<ToDoItem>> book){
        mParent = book;
    }

    @Override
    public ToDoParentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentview = inflater.inflate(R.layout.activity_main_layout, parent,false);
        ToDoParentHolder tdParentHolder = new ToDoParentHolder(parentview);
        return tdParentHolder;
    }

    @Override
    public void onBindViewHolder(ToDoParentHolder holder, int position) {
        // we need a reference variable for an arraylist
        ArrayList<ToDoItem> parentRef = mParent.get(position);

        holder.mTitle.setText(parentRef.get(position).getTitle());
        holder.mDesc.setText(parentRef.get(position).getDesc());

        holder.mOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mParent.add(new ArrayList<ToDoItem>());
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
