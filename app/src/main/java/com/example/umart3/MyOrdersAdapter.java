package com.example.umart3;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyOrdersAdapter extends RecyclerView.Adapter<MyOrdersAdapter.ViewHolder> {

    private List<MyOrdersModel> myOrdersModelList;

    public MyOrdersAdapter(List<MyOrdersModel> myOrdersModelList) {
        this.myOrdersModelList = myOrdersModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_orders_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int resource = myOrdersModelList.get(position).getProductImage();
        String title = myOrdersModelList.get(position).getProductTitle();
        String deliveryStatus = myOrdersModelList.get(position).getProductDeliveryStatus();
        String returnStatus = myOrdersModelList.get(position).getProductReturnStatus();

        holder.setData(resource, title, deliveryStatus, returnStatus);

    }

    @Override
    public int getItemCount() {
        return myOrdersModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView productImage;
        private TextView productTitle;
        private TextView productDeliveryStatus;
        private TextView productReturnStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productImage = itemView.findViewById(R.id.product_image);
            productTitle = itemView.findViewById(R.id.product_title);
            productDeliveryStatus = itemView.findViewById(R.id.product_delivery_status);
            productReturnStatus = itemView.findViewById(R.id.product_return_status);
        }

        private void setData(int resource, String title, String deliveryStatus, String returnStatus)
        {
            productImage.setImageResource(resource);
            productTitle.setText(title);
            productDeliveryStatus.setText(deliveryStatus);
            productReturnStatus.setText(returnStatus);
        }
    }
}
