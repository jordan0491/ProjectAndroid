package com.example.jordan.proyectofinal_perezandrade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ArticleReaderFragment.Callback {

    ArticleListFragment oneFragment;
    ArticleReaderFragment twoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle arg = new Bundle();

        oneFragment = (ArticleListFragment) ArticleListFragment.instantiate(MainActivity.this,ArticleListFragment.class.getName());
        getFragmentManager().beginTransaction().replace(R.id.flOne,oneFragment).commit();

        twoFragment = (ArticleReaderFragment) ArticleReaderFragment.instantiate(MainActivity.this,ArticleReaderFragment.class.getName());
        twoFragment.setmCallback(MainActivity.this);
        getFragmentManager().beginTransaction().replace(R.id.flTwo,twoFragment).commit();
    }

    @Override
    public void onOneFragmentClick(Persona persona) {
        oneFragment.add(persona);
    }
}
