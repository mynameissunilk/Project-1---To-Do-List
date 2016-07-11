package sunil.week3review;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by sunil on 7/9/16.
 */
public class ToDoParentHolder extends RecyclerView.ViewHolder {

    TextView mTitle, mDesc;
    Button mOpen, mDel;

    public ToDoParentHolder(View itemView) {
        super(itemView);

        mTitle = (TextView)itemView.findViewById(R.id.activity1_title);
        mDesc  = (TextView)itemView.findViewById(R.id.activity1_desc);
        mOpen  = (Button)itemView.findViewById(R.id.activity1_button1);
        mDel   = (Button)itemView.findViewById(R.id.activity1_button2);

    }
}
