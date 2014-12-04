package com.example.student7.maciej.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.student7.maciej.data.Person;
import com.example.student7.maciej.itemView.PersonItemView;
import com.example.student7.maciej.itemView.PersonItemView_;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student7 on 2014-12-04.
 */
@EBean
public class PersonListAdapter extends BaseAdapter{

    @RootContext
    Context context;

    List<Person> persons = new ArrayList<Person>();

    public PersonListAdapter(){
        persons.add(new Person("Ala Dupala","Drutex"));
        persons.add(new Person("Tadeusz Drozd", "Kancelaria Prezydente"));
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Person getItem(int i) {
        return persons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PersonItemView personItemView;
        if (convertView==null){
            personItemView = PersonItemView_.build(context);
        } else {
            personItemView = (PersonItemView) convertView;

        }
        personItemView.bind(getItem(position));
        return personItemView;
    }
}
