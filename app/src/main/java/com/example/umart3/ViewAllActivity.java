package com.example.umart3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class ViewAllActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Deals of the Day");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler_view);
        gridView = findViewById(R.id.gird_view);

        int layout_code = getIntent().getIntExtra("layout_code", -1);

        if(layout_code == 0) {
            recyclerView.setVisibility(View.VISIBLE);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);

            List<MyWishlistModel> myWishlistModelList = new ArrayList<>();
            myWishlistModelList.add(new MyWishlistModel(R.drawable.product_image, "Pixel 3 XL (Black 64 GB)", "Seller : Starcom India", "Rs. 49,999/-", "RS.52,999/-"));
            myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad1, "boAt BassHeads Wired Headset", "Seller : CloudMail India", "Rs. 2,999/-", "RS.3,999/-"));
            myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad3, "Redmi Note 8 Pro (Blue 128 GB)", "Seller : CloudMail India", "Rs. 15,999/-", "RS.14,999/-"));
            myWishlistModelList.add(new MyWishlistModel(R.drawable.scrollad4, "Microsoft Surface Go Pentium", "Seller : Starcom India", "Rs. 34,999/-", "RS.41,999/-"));

            MyWishlistAdapter adapter = new MyWishlistAdapter(myWishlistModelList);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }

        else if(layout_code == 1) {

            gridView.setVisibility(View.VISIBLE);

            List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad1, "boAt BassHeads Wired Headset", "With Mic", "Rs.379/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad2, "Crompton High Speed Fan", "1200 mm 3 Blade", "Rs.1547/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad3, "Redmi Note 8 Pro ", "MediaTek Helio G90T", "Rs.16999/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad4, "Microsoft Surface Go Pentium", "10 inch, Platinum, 0.522 kg", "Rs.34,999/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad5, "Vivo V19", "Qualcomm Snapdragon 712 AIE", "Rs.27,990/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad6, "Acer Nitro 5 Core i7 9th Gen ", "15.6 inch, Obsidian Black", "Rs.72,990/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad7, "Gionee 10000 mAh Power Bank", "Fast Charging, 15 W", "Rs.749/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad8, "Running Shoes For Men", "Grey Color", "Rs.799/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad2, "Crompton High Speed Fan", "1200 mm 3 Blade", "Rs.1547/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad3, "Redmi Note 8 Pro ", "MediaTek Helio G90T", "Rs.16999/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad4, "Microsoft Surface Go Pentium", "10 inch, Platinum, 0.522 kg", "Rs.34,999/-"));
            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad5, "Vivo V19", "Qualcomm Snapdragon 712 AIE", "Rs.27,990/-"));


            GridProductLayoutAdapter gridProductLayoutAdapter = new GridProductLayoutAdapter(horizontalProductScrollModelList);
            gridView.setAdapter(gridProductLayoutAdapter);

        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}