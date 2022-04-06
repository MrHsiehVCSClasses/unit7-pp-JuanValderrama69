package u7pp;
import java.util.Scanner;
import java.util.ArrayList;
import u7pp.Deck;
import u7pp.Card;


public class War {
String player1;
  String player2;
  ArrayList<Card> deck1; 
  ArrayList<Card> deck2;
  Card card1;
  Card card2;
  public War (){
   deck1 = new ArrayList<Card>(); 
    deck2 = new ArrayList<Card>();
  
  }
  public void setPlayer1(String name){
    player1 = name;
  }
    public void setPlayer2(String name){  
     player2 = name;
    }
  public String getPlayer1(){
    return player1;
    }
  public String getPlayer2(){
    return player2;
    }
  public void play(){
   Scanner scan = new Scanner(System.in); 
    System.out.println("player1 enter name");
    player1 = scan.nextLine();
    System.out.println("player2 enter name");
    player2 = scan.nextLine();
    Deck deck = new Deck();
    while (deck.numLeft() > 0){
      deck1.add(deck.deal());
      deck2.add(deck.deal());
    
    }
    
    while(deck1.size() > 0 && deck2.size() > 0){
      System.out.println("player1 flips top card");
       card1 = deck1.remove(0);
      System.out.println("player1 card" + card1);
        System.out.println("player2 flips top card");
       card2 = deck2.remove(0);
      System.out.println("player2 card" + card2);
    
    if(card1.compareTo(card2) == 1){
      deck1.add(card2);
      deck1.add(card1);
      System.out.println("player1 takes card");
      
    }
    else if (card1.compareTo(card2) == -1){
      deck2.add(card1);
      deck2.add(card2);
      System.out.println("player2 takes card");
  }
      else if(card1.compareTo(card2) == 0){
        System.out.println("War!");
        Card war1 = deck1.remove(0);
        Card war2 = deck1.remove(0);
        Card war3 = deck1.remove(0);
        Card war4 = deck1.remove(0);
        System.out.println("player1 card" + war4);
         Card war5 = deck2.remove(0);
        Card war6 = deck2.remove(0);
        Card war7 = deck2.remove(0);
        Card war8 = deck2.remove(0);
        System.out.println("player1 card" + war8);
      
      if(war4.compareTo(war8) == 1){
      deck1.add(war1);
      deck1.add(war2);
        deck1.add(war3);
      deck1.add(war4);
        deck1.add(war5);
      deck1.add(war6);
        deck1.add(war7);
      deck1.add(war8);
      System.out.println("player1 takes card");
        }
        else if(war4.compareTo(war8) == -1){
          deck2.add(war1);
      deck2.add(war2);
        deck2.add(war3);
      deck2.add(war4);
        deck2.add(war5);
      deck2.add(war6);
        deck2.add(war7);
      deck2.add(war8);
      System.out.println("player1 takes card");
          }
        else if(war4.compareTo(war8) == 0){
          deck1.add(war1);
      deck1.add(war2);
        deck1.add(war3);
      deck1.add(war4);
        deck2.add(war5);
      deck2.add(war6);
        deck2.add(war7);
      deck2.add(war8);   
          System.out.println("players tie!");
          
      }  
    if(deck1.size() == 0){
      System.out.println(player2 + " wins!");
    }
    else if(deck2.size() == 0){
      System.out.println(player1 + " wins!");
      }
    
}
}
    }