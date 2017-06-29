package com.example.jordan.proyectofinal_perezandrade;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jordan on 22/06/2017.
 */

public class ArticleListFragment extends Fragment{

    private RecyclerView rvMain;
    private RVMainAdapter rvMainAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        rvMainAdapter = new RVMainAdapter();

        rvMain = (RecyclerView) view.findViewById(R.id.rvMain);
        rvMain.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvMain.setAdapter(rvMainAdapter);
        return view;
    }

    public void add(Persona persona){
        rvMainAdapter.add(persona);
    }
}
