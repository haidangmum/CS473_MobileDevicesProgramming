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
public class MovieFragment extends Fragment {


    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        ListView listView = view.findViewById(R.id.favorite_web_listview);
        List<WebModel> webModels = new ArrayList<>();
        webModels.add(new WebModel(R.drawable.netflix_logo, "Netflix", "https://www.netflix.com"));
        webModels.add(new WebModel(R.drawable.youtube_icon, "YouTube", "https://www.youtube.com/"));
        webModels.add(new WebModel(R.drawable.amazon_logo, "Amazon - Best Seller Movies", "https://www.amazon.com/Best-Sellers-Movies-TV-Foreign-Films/zgbs/movies-tv/2959131011"));
        WebAdapter adapter = new WebAdapter(getActivity(), webModels);
        listView.setAdapter(adapter);
        return view;
    }

}
