package hridoy.aiz.cardandrecylerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    Button btnAdd;
    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person p  = new Person("Steve", "Austin", "bus");
                personList.add(p);
                Toast.makeText(getApplicationContext(),p.getName() + p.getSurname() + " is added",Toast.LENGTH_SHORT).show();
                myAdapter.notifyDataSetChanged();
            }
        });
        //recyclerView.setHasFixedSize(true);

        //layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        //layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        layoutManager = new GridLayoutManager(this,2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        personList = new ArrayList<Person>();
        personList.add(new Person("John", "Adams", "bus"));
        personList.add(new Person("George", "Washington", "plane"));
        personList.add(new Person("Hamilton", "Masakadza", "bus"));
        personList.add(new Person("John", "Adams", "bus"));
        personList.add(new Person("George", "Washington", "plane"));
        personList.add(new Person("Hamilton", "Masakadza", "bus"));
        personList.add(new Person("John", "Adams", "bus"));
        personList.add(new Person("George", "Washington", "plane"));
        personList.add(new Person("Hamilton", "Masakadza", "bus"));
        personList.add(new Person("John", "Adams", "bus"));
        personList.add(new Person("George", "Washington", "plane"));
        personList.add(new Person("Hamilton", "Masakadza", "bus"));
        personList.add(new Person("John", "Adams", "bus"));
        personList.add(new Person("George", "Washington", "plane"));
        personList.add(new Person("Hamilton", "Masakadza", "bus"));

        myAdapter = new PersonAdapter(this, personList);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int i) {
        Toast.makeText(this,"Surname:"+ personList.get(i).getSurname(),Toast.LENGTH_SHORT).show();
    }
}
