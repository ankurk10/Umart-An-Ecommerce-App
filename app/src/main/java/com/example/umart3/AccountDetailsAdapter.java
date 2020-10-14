package com.example.umart3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class AccountDetailsAdapter extends RecyclerView.Adapter<AccountDetailsAdapter.Viewholder> {

    private List<AccountDetailsModel> accountDetailsModelList;

    public AccountDetailsAdapter(List<AccountDetailsModel> accountDetailsModelList) {
        this.accountDetailsModelList = accountDetailsModelList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_details_item_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        String title = accountDetailsModelList.get(position).getTitle();
        String address = accountDetailsModelList.get(position).getAddress();

        holder.setData(title,address);

    }

    @Override
    public int getItemCount() {
        return accountDetailsModelList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder
    {
        private TextView title;
        private TextView address;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.account_details_title);
            address = itemView.findViewById(R.id.account_details_address);
        }

        private void setData(String accountTitle, String accountAddress)
        {
            title.setText(accountTitle);
            address.setText(accountAddress);

        }
    }


}
