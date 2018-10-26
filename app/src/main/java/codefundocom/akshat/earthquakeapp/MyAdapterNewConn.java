package codefundocom.akshat.earthquakeapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Akshat on 26-10-2018.
 */

public class MyAdapterNewConn extends RecyclerView.Adapter<MyAdapterNewConn.MyViewHolder> {
    private List<Contact> phoneList;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView name, number, status;
        public MyViewHolder(View view) {
            super(view);
            name = (TextView)view.findViewById(R.id.name);
            number = (TextView)view.findViewById(R.id.number);
            status = (TextView)view.findViewById(R.id.status);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapterNewConn(List<Contact> phoneList) {
        this.phoneList = phoneList;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapterNewConn.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_new_connection, parent, false);
        MyAdapterNewConn.MyViewHolder vh = new MyAdapterNewConn.MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contact phone = phoneList.get(position);
        holder.name.setText(phone.getName());
        holder.number.setText(phone.getNumber());
        holder.status.setText(phone.getStatus());

    }



    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return (int)phoneList.size();
    }
}
