package com.example.umart3;;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MyOrdersFragment extends Fragment {

    private RecyclerView myOrdersRecyclerView;



    public MyOrdersFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);
        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyOrdersModel> myOrdersModelList = new ArrayList<>();

        myOrdersModelList.add(new MyOrdersModel(R.drawable.product_image, "Pixel 2 XL (Black) 64 GB", "Delivered on July 28", "Return Policy Valid till August 5"));
        myOrdersModelList.add(new MyOrdersModel(R.drawable.scrollad3, "Redmi Note 8 Pro 128 GB (Blue)", "Delivered on January 4", "Return Policy Ended on January 15"));
        myOrdersModelList.add(new MyOrdersModel(R.drawable.scrollad8, "Puma Shoes Grey Size 8", "Delivered on March 9", "Return Policy Ended on April 9"));
        myOrdersModelList.add(new MyOrdersModel(R.drawable.scrollad7, "Gionee 10000Mah Power Bank", "Delivered on April 18", "Return Policy Valid till May 18"));

        MyOrdersAdapter myOrdersAdapter = new MyOrdersAdapter(myOrdersModelList);
        myOrdersRecyclerView.setAdapter(myOrdersAdapter);
        myOrdersAdapter.notifyDataSetChanged();
        return view;

    }
}