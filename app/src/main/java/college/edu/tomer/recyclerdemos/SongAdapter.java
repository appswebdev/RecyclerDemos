package college.edu.tomer.recyclerdemos;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by master on 13/07/16.
 */
public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder>{
    private  LayoutInflater inflater;
    private ArrayList<SongItem> data;
    private Context context;

    //constructor
    public SongAdapter(ArrayList<SongItem> data, Context context) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }



    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_item, parent, false);
        return new SongViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SongViewHolder holder, int position) {
        final SongItem song = data.get(position);
        holder.ivImage.setImageResource(song.getImageResID());
        holder.tvTitle.setText(song.getTitle());
        holder.tvDescription.setText(song.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, song.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //findViewByID
    public class SongViewHolder extends RecyclerView.ViewHolder{
        View itemView;
        ImageView ivImage;
        TextView tvTitle;
        TextView tvDescription;
        public SongViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDetails);
        }
    }
}
