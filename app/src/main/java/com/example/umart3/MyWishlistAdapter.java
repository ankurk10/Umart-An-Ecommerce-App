package com.example.umart3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyWishlistAdapter extends RecyclerView.Adapter<MyWishlistAdapter.Viewholder> {

    private List<MyWishlistModel> myWishlistModelList;

    public MyWishlistAdapter(List<MyWishlistModel> myWishlistModelList) {
        this.myWishlistModelList = myWishlistModelList;
    }

    @NonNull
    @Override
    public MyWishlistAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_wishlist_item_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyWishlistAdapter.Viewholder holder, int position) {

        int imgResource = myWishlistModelList.get(position).getProductImage();
        String title = myWishlistModelList.get(position).getProductTitle();
        String seller = myWishlistModelList.get(position).getProductSeller();
        String price = myWishlistModelList.get(position).getProductPrice();
        String cutprice = myWishlistModelList.get(position).getProductCutPrice();

        holder.setData(imgResource, title,seller, price, cutprice);

    }

    @Override
    public int getItemCount() {
        return myWishlistModelList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder
    {
        private ImageView productImage;
        private TextView productTitle;
        private TextView productSeller;
        private TextView productPrice;
        private TextView productCutPrice;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.productImage);
            productTitle = itemView.findViewById(R.id.productTitle);
            productSeller = itemView.findViewById(R.id.productSeller);
            productPrice = itemView.findViewById(R.id.productPrice);
            productCutPrice = itemView.findViewById(R.id.productCutPrice);

        }

        private void setData(int resource, String title, String seller, String price, String cutprice)
        {
            productImage.setImageResource(resource);
            productTitle.setText(title);
            productSeller.setText(seller);
            productPrice.setText(price);
            productCutPrice.setText(cutprice);
        }
    }
}
