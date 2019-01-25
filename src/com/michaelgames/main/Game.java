
package com.michaelgames.main;

import javax.swing.JFrame;

public class Game
{
 public static final int WINDOW_WIDTH = 800; // Make this public so that other parts of the game can access
 public static final int WINDOW_HEIGHT = 384; // Make this public so that other parts of the game can access
 private static final String TITLE = "New and Improved Game";

 private JFrame mainWindow;
 private LevelPanel lp;

public Game()
{
 initGame();
 initComponents();
 initWindow();

 lp.startGame();
}


/**
32. * Initialise the game related objects
33. */
private void initGame()
{
 lp = new LevelPanel();
 mainWindow = new JFrame();
}

/**
41. * Initialise any other GUI components such as buttons or menus
42. */
private void initComponents()
{
 mainWindow.add(lp);
}

private void initWindow()
{
 mainWindow.setTitle(Game.TITLE);
 mainWindow.setSize(Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT);
 mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 mainWindow.setVisible(true);
}

public static void main(String[] args)
 {
  Game g = new Game();
 }
}