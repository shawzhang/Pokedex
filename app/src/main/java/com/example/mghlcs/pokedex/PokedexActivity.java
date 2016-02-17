package com.example.mghlcs.pokedex;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import stanford.androidlib.SimpleActivity;

public class PokedexActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
    }

    public void pokemonClick(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);

        ImageButton imageButton = (ImageButton) view;
        String tag = imageButton.getTag().toString();

        intent.putExtra("pokemon_name",tag);
        startActivity(intent);

    }
}
