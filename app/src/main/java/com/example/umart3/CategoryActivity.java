package com.example.umart3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    private RecyclerView categoryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         String title = getIntent().getStringExtra("CategoryName");
         getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        categoryRecyclerView = findViewById(R.id.category_recyclerview);

        //////////// Banner Slider

        List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.my_wishlist, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.cart_black, "#077AE4"));

        sliderModelList.add(new SliderModel(R.drawable.home_icon, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.ic_mail_outline_24px, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.greenmail, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.my_account, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.my_orders, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.my_wishlist, "#077AE4"));

        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.cart_black, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.home_icon, "#077AE4"));


        //////////// Banner Slider


        /////////// Horizontal Product Layout

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.cart_black,"Poco F1", "SD 820 Processor", "Rs.14999" ));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.my_rewards,"Poco F1", "SD 820 Processor", "Rs.14999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.greenmail,"Poco F1", "SD 820 Processor", "Rs.14999") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.ic_check_24px,"Poco F1", "SD 820 Processor", "Rs.14999"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.ic_launcher_foreground,"Poco F1", "SD 820 Processor", "Rs.14999" ));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.profile_placeholder,"Poco F1", "SD 820 Processor", "Rs.14999") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.ic_mail_outline_24px,"Poco F1", "SD 820 Processor", "Rs.14999") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.photo3,"Poco F1", "SD 820 Processor", "Rs.14999" ));


        /////////// Horizontal Product Layout

        //////////////////////////////////////
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(this);
        testingLayoutManager.setOrientation(RecyclerView.VERTICAL);
        categoryRecyclerView.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.stripadd, "#ff0000"));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.stripadd, "#000000"));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.banner, "#ffff00"));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        categoryRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id== R.id.main_search_icon)
        {
            return true;
            //todo search
        }

        return super.onOptionsItemSelected(item);
    }

}
