package com.example.umart3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static com.example.umart3.CartItemModel.CART_ITEM_LAYOUT;
import static com.example.umart3.CartItemModel.TOTAL_AMOUNT_LAYOUT;

public class CartItemAdapter extends RecyclerView.Adapter {

    private List<CartItemModel> cartItemModelList;

    public CartItemAdapter(List<CartItemModel> cartItemModelList) {
        this.cartItemModelList = cartItemModelList;
    }

    @Override
    public int getItemViewType(int position) {
        switch (cartItemModelList.get(position).getViewType())
        {
            case 0:
                return CartItemModel.CART_ITEM_LAYOUT;
            case 1 :
                return CartItemModel.TOTAL_AMOUNT_LAYOUT;
            default:
                return -1;
        }

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType)
        {
            case CartItemModel.CART_ITEM_LAYOUT:
                View cartItemLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout, parent, false);
                return new CartItemLayout(cartItemLayout);
            case CartItemModel.TOTAL_AMOUNT_LAYOUT:
                View totalAmountLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_total_amount_layout, parent, false);
                return new TotalAmountLayout(totalAmountLayout);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (cartItemModelList.get(position).getViewType())
        {
            case CartItemModel.CART_ITEM_LAYOUT:
                int imageResource = cartItemModelList.get(position).getImageResource();
                String productTitle = cartItemModelList.get(position).getTitle();
                String productSeller = cartItemModelList.get(position).getSeller();
                String productPrice = cartItemModelList.get(position).getPrice();
                String productCutPrice = cartItemModelList.get(position).getCutPrice();
                String productOffersApplied = cartItemModelList.get(position).getOffersApplied();
                String productDeliveryTime = cartItemModelList.get(position).getDeliveryTime();

                ((CartItemLayout)holder).setCartItemData(imageResource, productTitle, productSeller, productPrice, productCutPrice, productOffersApplied, productDeliveryTime);
                break;

            case CartItemModel.TOTAL_AMOUNT_LAYOUT:
                String totalItems = cartItemModelList.get(position).getTotalItems();
                String totalItemsPrice = cartItemModelList.get(position).getTotalItemsPrice();
                String deliveryFee = cartItemModelList.get(position).getDeliveryFee();
                String totalPrice = cartItemModelList.get(position).getTotalPrice();
                String savedAmount = cartItemModelList.get(position).getSavedAmount();

                ((TotalAmountLayout)holder).setTotalAmountData(totalItems, totalItemsPrice, deliveryFee, totalPrice, savedAmount);
                break;

            default:
                return;

        }

    }

    @Override
    public int getItemCount() {
        return cartItemModelList.size();
    }

    class CartItemLayout extends RecyclerView.ViewHolder
    {

        private ImageView productImage;
        private TextView productTitle;
        private TextView productSeller;
        private TextView productPrice;
        private TextView productCutPrice;
        private TextView productOffersApplied;
        private TextView productDeliveryTime;

        public CartItemLayout(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_title);
            productSeller = itemView.findViewById(R.id.product_seller);
            productPrice = itemView.findViewById(R.id.product_price);
            productCutPrice = itemView.findViewById(R.id.product_cut_price);
            productOffersApplied = itemView.findViewById(R.id.offers_applied);
            productDeliveryTime = itemView.findViewById(R.id.product_delivery_time);
        }

        private void setCartItemData(int resource, String title, String seller, String price, String cutprice, String offersApplied, String deliveryTime)
        {
            productImage.setImageResource(resource);
            productTitle.setText(title);
            productSeller.setText(seller);
            productPrice.setText(price);
            productCutPrice.setText(cutprice);
            productOffersApplied.setText(offersApplied);
            productDeliveryTime.setText(deliveryTime);

        }
    }

    class TotalAmountLayout extends RecyclerView.ViewHolder
    {
        private TextView totalItems;
        private TextView totalItemsPrice;
        private TextView deliveryFee;
        private TextView totalPrice;
        private TextView savedAmount;

        public TotalAmountLayout(@NonNull View itemView) {
            super(itemView);

            totalItems = itemView.findViewById(R.id.total_items);
            totalItemsPrice = itemView.findViewById(R.id.total_items_price);
            deliveryFee = itemView.findViewById(R.id.delivery_price);
            totalPrice = itemView.findViewById(R.id.total_price);
            savedAmount = itemView.findViewById(R.id.saved_amount);
        }

        private void setTotalAmountData(String items,String itemsPrice, String deliveryPrice, String finalPrice, String amountSaved )
        {
            totalItems.setText(items);
            totalItemsPrice.setText(itemsPrice);
            deliveryFee.setText(deliveryPrice);
            totalPrice.setText(finalPrice);
            savedAmount.setText(amountSaved);
        }
    }
}
