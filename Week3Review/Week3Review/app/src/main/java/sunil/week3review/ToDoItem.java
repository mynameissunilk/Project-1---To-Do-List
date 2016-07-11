package sunil.week3review;

/**
 * Created by sunil on 7/9/16.
 */
public class ToDoItem {
    private String mTitle;
    private String mDesc;

    public ToDoItem(){
        mTitle = "Untitled";
        mDesc = "Please enter a Description";
    }

    public ToDoItem(String t, String d){
        mTitle = t;
        mDesc = d;
    }

    public void setTitle(String t){mTitle = t;}
    public void setDesc(String d){mDesc = d;}
    public String getTitle(){return mTitle;}
    public String getDesc(){return mDesc;}

}
