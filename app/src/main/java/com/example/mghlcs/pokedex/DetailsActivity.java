package com.example.mghlcs.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import stanford.androidlib.SimpleActivity;

public class DetailsActivity extends SimpleActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String pokemonName = intent.getStringExtra("pokemon_name");

        TextView nametextView = (TextView) findViewById(R.id.pokemon_name);
        nametextView.setText(pokemonName);

        ImageView imageView = (ImageView) findViewById(R.id.pokemon_image);
        int pokeId = getResources().getIdentifier(pokemonName.toLowerCase(), "drawable", getPackageName());
        imageView.setImageResource(pokeId);


        int fileId = getResources().getIdentifier(pokemonName.toLowerCase(), "raw", getPackageName());
        String fileText = readFileText(fileId);
        TextView pokeDetails = (TextView) findViewById(R.id.pokemon_details);
        pokeDetails.setText(fileText);

    }
}
