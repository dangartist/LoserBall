package loserpool.nghiadang.loserball;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nghia.dang on 3/19/2015.
 */
public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {
    private ItemData[]itemDatas;

    public MyListAdapter(ItemData[] itemDatas) {
        this.itemDatas = itemDatas;
    }

    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_teamlist_row, null);

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.txtTitle.setText(itemDatas[position].getTitle());
        viewHolder.imgIcon.setImageResource(itemDatas[position].getImageicon());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtTitle;
        public ImageView imgIcon;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            txtTitle = (TextView) itemLayoutView.findViewById(R.id.teamlistText);
            imgIcon = (ImageView) itemLayoutView.findViewById(R.id.teamlistIcon);

        }
    }

    @Override
    public int getItemCount() {

        return itemDatas.length;
    }

}

