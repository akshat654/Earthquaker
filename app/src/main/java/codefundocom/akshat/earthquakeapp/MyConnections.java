package codefundocom.akshat.earthquakeapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyConnections extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Contact> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_connections);
        mRecyclerView = (RecyclerView) findViewById(R.id.connRecyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new MyAdapter(contactList);
        mRecyclerView.setAdapter(mAdapter);

        prepareContactData();
    }

    private void prepareContactData() {

        Contact contact = new Contact("Akshat Baranwal", "1234567890" ,"safe");
        contactList.add(contact);

        contact = new Contact("Naman Deep Sri", "0987654321" ,"unsafe");
        contactList.add(contact);

        contact = new Contact("Prashant", "1234509876" ,"unsafe");
        contactList.add(contact);

        mAdapter.notifyDataSetChanged();

    }

    // ...
}

