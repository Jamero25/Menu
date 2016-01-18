package com.example.usuario.menu.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.menu.R;
import com.example.usuario.menu.adapters.MyAdapter;
import com.example.usuario.menu.data.Items;
import com.example.usuario.menu.process.ReadLocalJSON;

import java.util.ArrayList;


public class Tab2Fragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    final ReadLocalJSON readLocalJSON = new ReadLocalJSON();




    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        GridLayoutManager recycleLayoutManager = new GridLayoutManager(container.getContext(), 2, GridLayoutManager.VERTICAL, false);

        View v = inflater.inflate(R.layout.activity_tab2_fragment,container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(recycleLayoutManager);
        ArrayList<Items> itemses = null;
        itemses = readLocalJSON.getItemses(v.getContext(), 1);
        mAdapter = new MyAdapter(itemses);
        recyclerView.setAdapter(mAdapter);
        return v;
    }


}
