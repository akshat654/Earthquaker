  package codefundocom.akshat.earthquakeapp;


import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


  public class NewConnection extends AppCompatActivity {
      private RecyclerView mnewRecyclerView;
      private RecyclerView.Adapter mnewAdapter;
      private RecyclerView.LayoutManager mnewLayoutManager;
      private List<Contact> phoneList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_connection);

        mnewRecyclerView = (RecyclerView) findViewById(R.id.phoneBookRecyclerView);

        mnewRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mnewLayoutManager = new LinearLayoutManager(this);
        mnewRecyclerView.setLayoutManager(mnewLayoutManager);

        // specify an adapter (see also next example)
        mnewAdapter = new MyAdapter(phoneList);
        mnewRecyclerView.setAdapter(mnewAdapter);
    }
    Cursor phones = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null,null,null, null);
      while(phones){
        String Name = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
        String Number = phones.getString(phones.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));

        Contact phoneNew = new Contact(Name, Number ,"safe");
        phoneList.add(phoneNew);
        mnewAdapter.notifyDataSetChanged();
    }

  }