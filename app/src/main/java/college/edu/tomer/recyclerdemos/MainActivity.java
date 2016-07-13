package college.edu.tomer.recyclerdemos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import college.edu.tomer.recyclerdemos.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements MovieList.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new MovieList()).commit();
/*
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setAdapter(new SongAdapter(getSongs(), this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/

    }

    private ArrayList<SongItem> getSongs() {
        ArrayList<SongItem> songs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            songs.add(new SongItem("View without", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
            songs.add(new SongItem("Going to anymore than shaping creates pictorial beauty.", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
            songs.add(new SongItem("With chicken drink condensed milk. ", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
            songs.add(new SongItem("Where is the real", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
            songs.add(new SongItem("The tribble reliable proton.", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
            songs.add(new SongItem("Boreas, imber, et coordinatae.", "Cum tabes unda, omnes silvaes examinare fatalis, teres coordinataees.", "Indictio faveres, tanquam festus scutum.Bubos sunt cottas de gratis bursa.Nunquam dignus accola.Audax, barbatus animaliss foris pugna de grandis, secundus ionicis tormento.Cum tumultumque ortum, omnes aususes imperium velox, mirabilis repressores.Axona, acipenser, et abactus.", R.mipmap.ic_launcher));
        }


        return songs;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
