package hridoy.aiz.cardandrecylerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        //recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
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
}
