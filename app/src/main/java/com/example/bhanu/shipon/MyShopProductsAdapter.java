package com.example.bhanu.shipon;
 import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
 import android.widget.TextView;

 import java.util.List;

public class MyShopProductsAdapter extends RecyclerView.Adapter<MyShopProductsAdapter.MyViewHolder> {

    private List<ShopProduct> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView title;
        public TextView price;

        public MyViewHolder(View view) {
            super(view);
            title = (ImageView) view.findViewById(R.id.shoping_product);
            price = (TextView) view.findViewById(R.id.price);

        }
    }



    public MyShopProductsAdapter(List<ShopProduct> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_main, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ShopProduct movie = moviesList.get(position);
        holder.title.setImageBitmap(movie.getImg());
        holder.price.setText(movie.getPrice());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}