package main.java;

import java.util.ArrayList;
import java.util.Random;


public class MatureGame {

  private ArrayList<String> players;

  public MatureGame(){
    setupGame();
    gameLoop();
  }

  private void gameLoop(){
    Random r = new Random();

    for(int i=0; i< 20; i++){
      System.out.println("Game Round + " + i);

      int player = r.nextInt(players.size());
      if(players.get(player).contains("Teenager")){
        System.out.println("Kicking teenager " + player + " from the game");
        players.remove(player);
      }else{
        System.out.println("Player " + player + " has a brain and can stay");
      }
    }
  }

  private void setupGame(){
    players = new ArrayList<String>();
    Random r = new Random();
    for(int i=0; i< 20; i++){
      if(r.nextBoolean()){
        players.add("Mature, Intelligent and Sophisticated Player");
      }else{
        players.add("Angsty, Egotistical Teenager");
      }
    }


  }


  public static void main(String[] args){
    new MatureGame();
  }
}
