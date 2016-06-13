package com.example.moshiur.sofolabphonebook.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.moshiur.sofolabphonebook.R;
import com.example.moshiur.sofolabphonebook.adapter.PhoneBookAdapter;
import com.example.moshiur.sofolabphonebook.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = (ListView) findViewById(R.id.contact_list);
        PhoneBookAdapter adapter = new PhoneBookAdapter(getApplicationContext(), getList());
        contactList.setAdapter(adapter);
    }

    private List<Person> getList(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Alia Bhatt", "0987654321", "a@b", "mumbai"));
        personList.add(new Person("kjhg", "896551", "a@b", "mumbai"));
        personList.add(new Person("ghdhdj", "44963126", "a@b", "mumbai"));
        personList.add(new Person("bbhju", "0987654321", "a@b", "mumbai"));
        personList.add(new Person("iwjhbsbjhbh", "1549849456", "a@b", "mumbai"));
        personList.add(new Person("zbzhsissb", "8741658", "a@b", "mumbai"));
        personList.add(new Person("whjaoasnsk", "331232476", "a@b", "mumbai"));
        personList.add(new Person("oiuytrcm", "78521252356", "a@b", "mumbai"));
        personList.add(new Person("udshawo", "7896321445", "a@b", "mumbai"));
        return personList;
    }
}
