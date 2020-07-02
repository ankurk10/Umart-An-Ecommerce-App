package com.example.umart3;

import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainHomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainHomeFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainHomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView categoryRecyclerView;
    private CategoryAdapter categoryAdapter;
    private RecyclerView testing;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainHomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainHomeFragment newInstance(String param1, String param2) {
        MainHomeFragment fragment = new MainHomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_home, container, false);

        categoryRecyclerView = view.findViewById(R.id.category_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        categoryRecyclerView.setLayoutManager(layoutManager);

        final List<CategoryModel> categoryModelList = new ArrayList<CategoryModel>();
        categoryModelList.add(new CategoryModel("link", "Home"));
        categoryModelList.add(new CategoryModel("link", "Electronics"));
        categoryModelList.add(new CategoryModel("link", "Appliances"));
        categoryModelList.add(new CategoryModel("link", "Furniture"));
        categoryModelList.add(new CategoryModel("link", "Fashion"));
        categoryModelList.add(new CategoryModel("link", "Toys"));
        categoryModelList.add(new CategoryModel("link", "Sports"));
        categoryModelList.add(new CategoryModel("link", "Wall Arts"));
        categoryModelList.add(new CategoryModel("link", "Books"));
        categoryModelList.add(new CategoryModel("link", "Shoes"));

        categoryAdapter = new CategoryAdapter(categoryModelList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

        //////////// Banner Slider

       List<SliderModel> sliderModelList = new ArrayList<SliderModel>();

        sliderModelList.add(new SliderModel(R.drawable.banner, "#077AE4"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad1, "#FFA624"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad2, "#F9B631"));

        sliderModelList.add(new SliderModel(R.drawable.bannerad3, "#84FFFC"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad4, "#84FCE1"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad5, "#194c9b"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad6, "#D4D4D4"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad7, "#0D2331"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad8, "#121314"));

        sliderModelList.add(new SliderModel(R.drawable.bannerad1, "#FFA624"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad2, "#F9B631"));
        sliderModelList.add(new SliderModel(R.drawable.bannerad3, "#84FFFC"));


        //////////// Banner Slider


        /////////// Horizontal Product Layout

        List<HorizontalProductScrollModel> horizontalProductScrollModelList = new ArrayList<>();
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad1,"boAt BassHeads Wired Headset", "With Mic", "Rs.379/-" ));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad2,"Crompton High Speed Fan", "1200 mm 3 Blade", "Rs.1547/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad3,"Redmi Note 8 Pro ", "MediaTek Helio G90T", "Rs.16999/-") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad4,"Microsoft Surface Go Pentium", "10 inch, Platinum, 0.522 kg", "Rs.34,999/-"));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad5,"Vivo V19", "Qualcomm Snapdragon 712 AIE", "Rs.27,990/-" ));
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad6,"Acer Nitro 5 Core i7 9th Gen ", "15.6 inch, Obsidian Black", "Rs.72,990/-") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad7,"Gionee 10000 mAh Power Bank", "Fast Charging, 15 W", "Rs.749/-") );
        horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.scrollad8,"Running Shoes For Men", "Grey Color", "Rs.799/-" ));


        /////////// Horizontal Product Layout

        //////////////////////////////////////
         testing = view.findViewById(R.id.home_page_recyclerview);
        LinearLayoutManager testingLayoutManager = new LinearLayoutManager(getContext());
        testingLayoutManager.setOrientation(RecyclerView.VERTICAL);
        testing.setLayoutManager(testingLayoutManager);

        List<HomePageModel> homePageModelList = new ArrayList<>();
        homePageModelList.add(new HomePageModel(0, sliderModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.stripadd, "#000000"));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.stripadd, "#000000"));
        homePageModelList.add(new HomePageModel(3, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(2, "Deals of the Day", horizontalProductScrollModelList));
        homePageModelList.add(new HomePageModel(1, R.drawable.banner, "#077AE4"));
        homePageModelList.add(new HomePageModel(0, sliderModelList));

        HomePageAdapter adapter = new HomePageAdapter(homePageModelList);
        testing.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //////////////////////////////////////

        return view;
    }

}
