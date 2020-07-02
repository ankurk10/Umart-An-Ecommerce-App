package com.example.umart3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsActivity extends AppCompatActivity {

    private ViewPager productImagesViewPager;
    private TabLayout viewpagerIndicator;

    private ViewPager productDetailsViewpager;
    private TabLayout productDetailsTablayout;

    private FloatingActionButton addToWishlistButton;
    private static boolean ALREADY_ADDED_TO_WISHLIST = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        productImagesViewPager = findViewById(R.id.product_images_viewpager);
        viewpagerIndicator = findViewById(R.id.viewpager_indicator);
        addToWishlistButton = findViewById(R.id.add_to_wishlist_button);
        productDetailsViewpager = findViewById(R.id.product_details_viewpager);
        productDetailsTablayout = findViewById(R.id.product_details_tablayout);

        List<Integer> productImages = new ArrayList<>();
        productImages.add(R.drawable.product_image);
        productImages.add(R.drawable.cart_black);
        productImages.add(R.drawable.stripadd);
        productImages.add(R.drawable.banner);

        ProductImagesAdapter productImagesAdapter = new ProductImagesAdapter(productImages);
        productImagesViewPager.setAdapter(productImagesAdapter);

        viewpagerIndicator.setupWithViewPager(productImagesViewPager, true);

        addToWishlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ALREADY_ADDED_TO_WISHLIST)
                {
                    ALREADY_ADDED_TO_WISHLIST = false;
                    addToWishlistButton.setSupportImageTintList(ColorStateList.valueOf(Color.parseColor("#9e9e9e")));
                }
                else
                {
                    ALREADY_ADDED_TO_WISHLIST = true;
                    addToWishlistButton.setSupportImageTintList(getResources().getColorStateList(R.color.colorPrimary));

                }
            }
        });

        productDetailsViewpager.setAdapter(new ProductDetailsAdapter(getSupportFragmentManager(), productDetailsTablayout.getTabCount()));
        productDetailsViewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(productDetailsTablayout));
        productDetailsTablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                productDetailsViewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_and_cart_icon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id== android.R.id.home)
        {
            finish();
            //todo search
        }
        else if(id== R.id.main_search_icon)
        {
            return true;
            //todo: notification
        }
        else if(id== R.id.main_cart_icon)
        {
            return true;
            //todo: cart
        }
        return super.onOptionsItemSelected(item);
    }

}
