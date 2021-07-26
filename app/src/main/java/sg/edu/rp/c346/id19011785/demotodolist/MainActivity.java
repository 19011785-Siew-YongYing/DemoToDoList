package sg.edu.rp.c346.id19011785.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView header;
    ListView todoListV;
    ArrayList<ToDoItem> al;
    CustomAdapter adpt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        header = findViewById(R.id.heading);
        todoListV = findViewById(R.id.todoLV);
        al = new ArrayList<ToDoItem>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2021, 7, 26);

        Calendar date2 = Calendar.getInstance();
        date2.set(2021, 8, 1);

        Calendar date3 = Calendar.getInstance();
        date3.set(2021, 7, 27);

        // From WS ; but different variable name
        Calendar date4 = Calendar.getInstance();
        date4.set(2021,8,1);

        Calendar date5 = Calendar.getInstance();
        date5.set(2021, 8, 2);

        // Own To D0
        ToDoItem item1 = new ToDoItem("Complete C346 WS", date1);
        ToDoItem item2 = new ToDoItem("Watch latest One Piece Episode", date2);
        ToDoItem item3 = new ToDoItem("Complete FYP codes", date3);
        // From WS
        ToDoItem item4 = new ToDoItem("Go For Movie", date4);
        ToDoItem item5 = new ToDoItem("Go For Haircut", date5);

        al.add(item1);
        al.add(item2);
        al.add(item3);
        al.add(item4);
        al.add(item5);

        adpt = new CustomAdapter(this, R.layout.row, al);

        todoListV.setAdapter(adpt);

    }
}