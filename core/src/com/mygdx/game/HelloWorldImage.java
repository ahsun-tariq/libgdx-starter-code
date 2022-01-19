package com.mygdx.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;

public class HelloWorldImage extends Game{

    private Texture texture;
    private SpriteBatch batch;

    public void create()
    {        FileHandle worldFile = Gdx.files.internal("world.jpeg");

        texture = new Texture(worldFile);
        batch = new SpriteBatch();
    }

    public void render(){
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(texture, 192,112);
        batch.end();
    }

}
