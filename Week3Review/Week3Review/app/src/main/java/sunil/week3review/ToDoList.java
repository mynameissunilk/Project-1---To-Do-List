package sunil.week3review;

import java.util.ArrayList;

/**
 * Created by sunil on 7/10/16.
 */
public class ToDoList extends ArrayList {

    private String mTitle;

    ArrayList<ToDoItem> mToDoList;

    public ToDoList(){
        mTitle = "Untitled";
    }

    public ToDoList(String t){
        mTitle = t;
    }

}
