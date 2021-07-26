package sg.edu.rp.c346.id19011785.demotodolist;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.versionedparcelable.CustomVersionedParcelable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_contxt;
    int layout_id;
    ArrayList<ToDoItem> vsList;

    public CustomAdapter (Context context, int res, ArrayList<ToDoItem> objs) {
        super (context, res, objs);

        parent_contxt = context;
        layout_id = res;
        vsList = objs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_contxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowV = inflater.inflate(layout_id, parent, false);

        TextView title = rowV.findViewById(R.id.textViewTitle);
        TextView date = rowV.findViewById(R.id.textViewDate);

        title.setText(vsList.get(position).getTitle());
        date.setText(vsList.get(position).toString()); // Not sure why but the day returned is wrong
         // e.g. 26/7/2021 (Saturday) is shown but it should be 26/7/2021 (Monday)

        return rowV;
    }
}
