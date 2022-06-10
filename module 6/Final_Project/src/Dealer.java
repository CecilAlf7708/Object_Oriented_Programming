
public class Dealer {
	String[] deckS = {"2 of Clubs ","3 of Clubs ","4 of Clubs ","5 of Clubs ","6 of Clubs ","7 of Clubs ","8 of Clubs ","9 of Clubs ","10 of Clubs ","Jack of Clubs ","Queen of Clubs ","King of Clubs ","Ace of Clubs ","2 of Spades ","3 of Spades ","4 of Spades ","5 of Spades ","6 of Spades ","7 of Spades ","8 of Spades ","9 of Spades ","10 of Spades ","Jack of Spades ","Queen of Spades ","King of Spades ","Ace of Spades ","2 of Hearts ","3 of Hearts ","4 of Hearts ","5 of Hearts ","6 of Hearts ","7 of Hearts ","8 of Hearts ","9 of Hearts ","10 of Hearts ","Jack of Hearts ","Queen of Hearts ","King of Hearts ","Ace of Hearts ","2 of Diamonds ","3 of Diamonds ","4 of Diamonds ","5 of Diamonds ","6 of Diamonds ","7 of Diamonds ","8 of Diamonds ","9 of Diamonds ","10 of Diamonds ","Jack of Diamonds ","Queen of Diamonds ","King of Diamonds ","Ace of Diamonds ",};
	String[] shuffle = new String[52];
	public Dealer() {
		
	}
	
	public Dealer(String[] deckS) {
		this.deckS = deckS;
		
	}
	
	public void shuffleDeck( String[] deckS) {
		
		int t;
		for (int x = 0;x<deckS.length;x++) {
			t = (int)(Math.random() * deckS.length);
			if(deckS[t] != "0") {
				shuffle[x] = deckS[t];
				deckS[t] = "0";
			}
			else if (deckS[t] == "0"){
				x--;
			}
		}
		//return shuffle;
	}
	
	public void setDeck(String deckS,int y) {
		
		this.deckS[y] = deckS;
	}
	
	
	public String[] getDeck() {
		return shuffle;
	}
	
	
}