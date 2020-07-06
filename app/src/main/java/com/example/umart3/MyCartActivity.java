package com.example.umart3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MyCartActivity extends AppCompatActivity {

    private RecyclerView cartItemsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("My Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        cartItemsRecyclerView = findViewById(R.id.cart_items_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
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


    }
}