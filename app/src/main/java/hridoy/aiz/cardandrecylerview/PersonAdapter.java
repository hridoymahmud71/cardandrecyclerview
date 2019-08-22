package hridoy.aiz.cardandrecylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>{
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Person> personList;

    public PersonAdapter(Context context, List<Person> personList){
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.personList = personList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View view = (View) layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //viewHolder.bind(this.personList.get(i));
        viewHolder.itemView.setTag(this.personList.get(i));

        viewHolder.tvName.setText(this.personList.get(i).getName());
        viewHolder.tvSurname.setText(this.personList.get(i).getSurname());

        if(this.personList.get(i).getPreference().equals("bus")){
            viewHolder.ivPref.setImageResource(R.drawable.bus);
        }else{
            viewHolder.ivPref.setImageResource(R.drawable.plane);
        }
    }

    @Override
    public int getItemCount() {
        return this.personList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivPref;
        private TextView tvName;
        private TextView tvSurname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPref = itemView.findViewById(R.id.ivPref);
            tvName = itemView.findViewById(R.id.tvName);
            tvSurname = itemView.findViewById(R.id.tvSurname);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
        public  void bind(Person person){
            tvName.setText("gg");
            tvSurname.setText("bb");
        }
    }

}
