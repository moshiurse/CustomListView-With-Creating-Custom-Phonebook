package com.example.moshiur.sofolabphonebook.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.moshiur.sofolabphonebook.R;
import com.example.moshiur.sofolabphonebook.model.Person;
import java.util.List;

/**
 * Created by Moshiur on 6/10/2016.
 */

public class PhoneBookAdapter  extends BaseAdapter {

    private Context context;
    private List<Person> personList;

    public PhoneBookAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.personList = personList;
    }


    @Override
    public int getCount() {
        return personList.size();

    }

    @Override
    public Object getItem(int i) {
        return personList.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rootView = view;

        if (rootView == null) {
            rootView = LayoutInflater.from(context).inflate(R.layout.contact_row, viewGroup, false);
        }

        TextView contactName = (TextView) rootView.findViewById(R.id.contactName);
        TextView contactEmail = (TextView) rootView.findViewById(R.id.contactEmail);
        TextView contactNumber = (TextView) rootView.findViewById(R.id.contactNumber);

        contactName.setText(personList.get(position).getName());
        contactEmail.setText(personList.get(position).getEmail());
        contactNumber.setText(personList.get(position).getPhone());

        return rootView;
    }

}