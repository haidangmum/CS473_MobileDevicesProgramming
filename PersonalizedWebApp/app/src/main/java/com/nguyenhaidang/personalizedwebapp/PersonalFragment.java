package com.nguyenhaidang.personalizedwebapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PersonalFragment extends Fragment {

    public PersonalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        ListView listView = view.findViewById(R.id.favorite_web_listview);
        List<WebModel> webModels = new ArrayList<>();
        webModels.add(new WebModel(R.drawable.bbc_logo, "Welcome to BBC.com", "http://www.bbc.com"));
        webModels.add(new WebModel(R.drawable.reuter_logo, "REUTERs", "http://reuters.com"));
        webModels.add(new WebModel(R.drawable.indiewire_logo, "IndieWire - Review Films", "http://www.indiewire.com"));
        WebAdapter adapter = new WebAdapter(getActivity(), webModels);
        listView.setAdapter(adapter);
        return view;
    }
}
