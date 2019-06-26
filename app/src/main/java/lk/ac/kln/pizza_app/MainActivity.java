package lk.ac.kln.pizza_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String URL_DATA = "http://192.168.43.18:8080/demo/all";

    RecyclerView recyclerView;
    PizzaAdapter adapter;

    List<Pizza> productslist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
