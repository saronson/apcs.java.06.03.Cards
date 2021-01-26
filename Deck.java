/**
 * Deck represents 52 standard playing cards (no jokers) and allows you to use it to play games.
 * NOTE:
 *    You should not have a method that returns the cards array because then somebody could 
 *    modify the array without you knowing
 */

public class Deck
{

   public Deck() {
   }
   
   /** 
    * return a String of all existing cards in the deck
    * HINT:  Call the toString method for each card
    */
   public String toString() {
       return "";
   }
   
   /**
    * return true if the deck has no cards left,
    * otherwise return false
    */
   public boolean isEmpty() {
       return true;
   }
   
   /**
    * return the number of cards left in the deck
    */
   public int numCards() {
       return 0;
   }
    
    /**
     * deal a card from the "top" of the deck
     * (you decide where the top is...)
     * If there are no cards left, return null
     */
    public Card dealCard() {
        return null;
    }
    
    /**
     * shuffle the deck so that all cards still left
     * are rearranged in some random order
     */
    public void shuffle() {
    }
    
    /**
     *  add the given card back into the deck
     */
    public void addCard(Card card) {
    }
}
