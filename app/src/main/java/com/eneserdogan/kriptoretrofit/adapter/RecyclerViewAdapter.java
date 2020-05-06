package com.eneserdogan.kriptoretrofit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eneserdogan.kriptoretrofit.R;
import com.eneserdogan.kriptoretrofit.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {
    private ArrayList<CryptoModel> cryptoList;

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }


    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),position);

    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder {
        TextView textName,textPrice;
        public RowHolder(@NonNull View itemView) {
            super(itemView);


        }
        public void bind(CryptoModel cryptoModel,Integer position){
            textName=itemView.findViewById(R.id.text_name);
            textPrice=itemView.findViewById(R.id.text_price);

            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);
        }
    }
}
