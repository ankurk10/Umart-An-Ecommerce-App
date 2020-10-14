package com.example.umart3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MyWishListActivity extends AppCompatActivity {

    private RecyclerView myWishListRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wish_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("My Wishlist");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myWishListRecyclerView = findViewById(R.id.my_wish_list_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myWishListRecyclerView.setLayoutManager(layoutManager);

        List<MyWishlistModel> myWishlistModelList = new ArrayList<>();
        myWishlistModelList.add(new MyWishlistModel(R.drawable.product_image, "Pixel 3 XL (Black 64 GB)", "Seller : Starcom India", "Rs. 49,999/-", "RS.52,999/-"));
        myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad1, "boAt BassHeads Wired Headset", "Seller : CloudMail India", "Rs. 2,999/-", "RS.3,999/-"));
        myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad3, "Redmi Note 8 Pro (Blue 128 GB)", "Seller : CloudMail India", "Rs. 15,999/-", "RS.14,999/-"));
        myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad4, "Microsoft Surface Go Pentium", "Seller : Starcom India", "Rs. 34,999/-", "RS.41,999/-"));

        MyWishlistAdapter myWishlistAdapter = new MyWishlistAdapter(myWishlistModelList);
        myWishListRecyclerView.setAdapter(myWishlistAdapter);
        myWishlistAdapter.notifyDataSetChanged();



    }


}