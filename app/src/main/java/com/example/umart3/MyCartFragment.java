package com.example.umart3;

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

import static com.example.umart3.CartItemModel.CART_ITEM_LAYOUT;
import static com.example.umart3.CartItemModel.TOTAL_AMOUNT_LAYOUT;

public class MyCartFragment extends Fragment {

    public MyCartFragment()
    {

    }

    private RecyclerView cartItemsRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        cartItemsRecyclerView = view.findViewById(R.id.cart_items_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel> cartItemModelList = new ArrayList<>();
        cartItemModelList.add(new CartItemModel(0, R.drawable.product_image, "Pixel 2 XL (128 GB)", "Seller : SuperStar India", "Rs. 45,999/-", "Rs. 51,999/-", "2 Offers Applied", "Delivery expected in 5-7 Days"));
        cartItemModelList.add(new CartItemModel(0, R.drawable.scrollad3, "Redmi Note 8 Pro (64 GB)", "Seller : BigRock India", "Rs. 13,999/-", "Rs. 15,999/-", "3 Offers Applied", "Delivery expected in 3-4 Days"));
        cartItemModelList.add(new CartItemModel(0, R.drawable.scrollad8, "Puma Shoes Size 8 (Grey)", "Seller : Puma Shoes", "Rs. 2,999/-", "Rs. 3,599/-", "1 Offer Applied", "Delivery expected in 7-10 Days"));
        cartItemModelList.add(new CartItemModel(1, "Price (3 items) ", "Rs. 62,997/-", "FREE", "RS. 62,997/-", "You will save Rs. 8,600 on this Order"));

        CartItemAdapter cartItemAdapter = new CartItemAdapter(cartItemModelList);
        cartItemsRecyclerView.setAdapter(cartItemAdapter);
        cartItemAdapter.notifyDataSetChanged();
        return view;
    }
}