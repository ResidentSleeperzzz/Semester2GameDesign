package com.michaelgames.state;

import com.michaelgames.entity.Player;
import com.michaelgames.main.LevelPanel;
import com.michaelgames.tilemap.TileMapManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Level1 extends LevelState
{
// declare characters and objects
private Player p;

public Level1(LevelManager lm)
{
super(lm);
p = new Player(); // this line will change when we define a character class
}

private void init()
{

}

@Override
public void keyPressed(int keyCode)
{
if(keyCode == KeyEvent.VK_A)
p.moveLeft(true);

if(keyCode == KeyEvent.VK_D)
p.moveRight(true);
}

@Override
public void keyReleased(int keyCode)
{
if(keyCode == KeyEvent.VK_A)
p.moveLeft(false);

if(keyCode == KeyEvent.VK_D)
p.moveRight(false);
}

@Override
public void update()
{
p.update();
//Update Computer moves

//Check collisions

//Other updates
}

@Override
public void draw(Graphics2D g)
{
g.setColor(Color.BLUE);
g.fillRect(0, 0, LevelPanel.PANEL_WIDTH, LevelPanel.PANEL_HEIGHT);
//draw player

p.draw(g);

//draw enemies

}
}
