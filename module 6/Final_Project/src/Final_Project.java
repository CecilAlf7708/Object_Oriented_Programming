import java.util.Scanner;
import java.util.Arrays;

public class Final_Project {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] deck = {"2 of Clubs ","3 of Clubs ","4 of Clubs ","5 of Clubs ","6 of Clubs ","7 of Clubs ","8 of Clubs ","9 of Clubs ","10 of Clubs ","Jack of Clubs ","Queen of Clubs ","King of Clubs ","Ace of Clubs ","2 of Spades ","3 of Spades ","4 of Spades ","5 of Spades ","6 of Spades ","7 of Spades ","8 of Spades ","9 of Spades ","10 of Spades ","Jack of Spades ","Queen of Spades ","King of Spades ","Ace of Spades ","2 of Hearts ","3 of Hearts ","4 of Hearts ","5 of Hearts ","6 of Hearts ","7 of Hearts ","8 of Hearts ","9 of Hearts ","10 of Hearts ","Jack of Hearts ","Queen of Hearts ","King of Hearts ","Ace of Hearts ","2 of Diamonds ","3 of Diamonds ","4 of Diamonds ","5 of Diamonds ","6 of Diamonds ","7 of Diamonds ","8 of Diamonds ","9 of Diamonds ","10 of Diamonds ","Jack of Diamonds ","Queen of Diamonds ","King of Diamonds ","Ace of Diamonds ",};
		boolean quit = false;
		boolean t = false;
		boolean f = false;
		char c = 'c';
		int draw = 0;
		int s = 0;
		int playerCount = 0;
		int dValue = 0;
		int p1Value = 0;
		int p2Value = 0;
		int p3Value = 0;
		int p4Value = 0;
		int bet1 = 0;
		int bet2 = 0;
		int bet3 = 0;
		int bet4 = 0;
		int p1Wallet = 250;
		int p2Wallet = 250;
		int p3Wallet = 250;
		int p4Wallet = 250;
		String choice = "";
		String p1 = "";
		String p2 = "";
		String p3 = "";
		String p4 = "";
		String handD = "";
		String hand1 = "";
		String hand2 = "";
		String hand3 = "";
		String hand4 = "";
		//for(int x = 0; x < deck2.getDeck().length;x++) {
		//System.out.print(deck2.getDeck()[x]);
		//}
		System.out.print("Hello, how many of you are playing today?(1 - 4): ");
		playerCount = input.nextInt();
		if(playerCount < 1 || playerCount > 4) {
			do {
				System.out.print("Please enter an acceptable amount of players(1 - 4):");
				playerCount = input.nextInt();
			}
			while(playerCount < 1 || playerCount > 4);
		}
		System.out.print("Player 1, What is your name?: ");
		p1 = input.next();
		if(playerCount > 1) {
			System.out.print("Player 2, What is your name?: ");
			p2 = input.next();
		}
		if(playerCount > 2) {
			System.out.print("Player 3, What is your name?: ");
			p3 = input.next();
		}
		if(playerCount == 4) {
			System.out.print("Player 4, What is your name?: ");
			p4 = input.next();
		}
		
		do {
			
		Dealer deck2 = new Dealer(deck);
		deck2.shuffleDeck(deck);
		//System.out.println("S");
		if(p1Wallet > 0) {
			System.out.print(p1 + ", You have " + p1Wallet + " in your Wallet, what will you bet?");
			bet1 = input.nextInt();
				if(bet1 > p1Wallet) {
					do {
						System.out.print("Please enter a value within your current amount");
						bet1 = input.nextInt();
						
					}
					while(bet1 > p1Wallet);
					p1Wallet = p1Wallet - bet1;
				}
				else {
					p1Wallet = p1Wallet - bet1;
				}
			}
			
			if(playerCount > 1 && p2Wallet > 0) {
				System.out.print(p2 + ", You have " + p2Wallet + " in your Wallet, what will you bet?");
				bet2 = input.nextInt();
					if(bet2 > p2Wallet) {
						do {
							System.out.print("Please enter a value within your current amount");
							bet2 = input.nextInt();
						}
						while(bet2 > p2Wallet);
						p2Wallet = p2Wallet - bet2;
						
					}
					else {
						p2Wallet = p2Wallet - bet2;
					}
				}
			if(playerCount > 2 && p3Wallet > 0) {
				System.out.print(p3 + ", You have " + p3Wallet + " in your Wallet, what will you bet?");
				bet3 = input.nextInt();
					if(bet3 > p3Wallet) {
						do {
							System.out.print("Please enter a value within your current amount");
							bet3 = input.nextInt();
						}
						while(bet3 > p3Wallet);
						p3Wallet = p3Wallet - bet3;
						
					}
					else {
						p3Wallet = p3Wallet - bet3;
					}
				}
			if(playerCount == 4 && p4Wallet > 0) {
				System.out.print(p4 + ", You have " + p4Wallet + " in your Wallet, what will you bet?");
				bet4 = input.nextInt();
					if(bet4 > p4Wallet) {
						do {
							System.out.print("Please enter a value within your current amount");
							bet4 = input.nextInt();
						}
						while(bet4 > p4Wallet);
						p4Wallet = p4Wallet - bet4;
					}
					else {
						p4Wallet = p4Wallet - bet4;
					}
				}
		//System.out.println("0");
		
		/*for(int x = 0; x < deck2.getDeck().length;x++) {
			System.out.print(deck2.getDeck()[x]);
		}*/
			
			while(draw != 2) {
				if(deck2.getDeck()[s] == "0") {
					//System.out.print("x");
					s++;
				}
				else if(deck2.getDeck()[s] != "0") {
					hand1 = hand1 + deck2.getDeck()[s] + " ";
					//deck2.setDeck("0", s);
					deck2.getDeck()[s] = "0";
					draw++;
					s++;
					//System.out.println(hand1);
				}
				
			}
			//hand1 = " A of Clubs , A of Spades ,";
		
		//System.out.println("1");
		if(playerCount > 1) {
			//System.out.println("hand2");
			//s = 0;
			draw = 0;
			while(draw != 2) {
				if(deck2.getDeck()[s] == "0") {
					//System.out.print("x");
					s++;
				}
				else if(deck2.getDeck()[s] != "0") {
					hand2 = hand2 + deck2.getDeck()[s] + " ";
					deck2.getDeck()[s] = "0";
					draw++;
					s++;
					//System.out.print(hand2);
				}
				
			}
		}
		//System.out.println("2");
		if(playerCount > 2) {
			//System.out.println("hand3");
			//s = 0;
			draw = 0;
			while(draw != 2) {
				if(deck2.getDeck()[s] == "0") {
					//System.out.print("x");
					s++;
				}
				else if(deck2.getDeck()[s] != "0") {
					hand3 = hand3 + deck2.getDeck()[s] + " ";
					deck2.getDeck()[s] = "0";
					draw++;
					s++;
					//System.out.print(hand3);
				}
				
			}
		}
		//System.out.println("3");
		if(playerCount == 4) {
			draw = 0;
			//System.out.println("hand4");
			//s = 0;
			while(draw != 2) {
				if(deck2.getDeck()[s] == "0") {
					//System.out.print("x");
					s++;
				}
				else if(deck2.getDeck()[s] != "0") {
					hand4 = hand4 + deck2.getDeck()[s] + " ";
					deck2.getDeck()[s] = "0";
					draw++;
					//System.out.print(hand4);
				}
				
			}
		}
		//System.out.println("4");
		//System.out.println("handD");
		//s = 0;
		draw = 0;
		while(draw != 2) {
			if(deck2.getDeck()[s].equals("0")) {
				//System.out.print("x");
				s++;
			}
			else if(!deck2.getDeck()[s].equals("0")) {
				handD = handD + deck2.getDeck()[s] + " ";
				deck2.setDeck("0", s);
				draw++;
				s++;
				//System.out.print(handD);
			}
			
		}
		//System.out.println("D");
		for (int x = 0; x < hand1.length();x++) {
			if(hand1.charAt(x) == '2') {
				p1Value = p1Value + 2;
			}
			if(hand1.charAt(x) == '3') {
				p1Value = p1Value + 3;
			}
			if(hand1.charAt(x) == '4') {
				p1Value = p1Value + 4;
			}	
			if(hand1.charAt(x) == '5') {
				p1Value = p1Value + 5;
			}
			if(hand1.charAt(x) == '6') {
				p1Value = p1Value + 6;
			}
			if(hand1.charAt(x) == '7') {
				p1Value = p1Value + 7;
			}
			if(hand1.charAt(x) == '8') {
				p1Value = p1Value + 8;
			}
			if(hand1.charAt(x) == '9') {
				p1Value = p1Value + 9;
			}
			if(hand1.charAt(x) == '1') {
				p1Value = p1Value + 10;
			}
			if(hand1.charAt(x) == 'J') {
				p1Value = p1Value + 10;
			}
			if(hand1.charAt(x) == 'Q') {
				p1Value = p1Value + 10;
			}
			if(hand1.charAt(x) == 'K') {
				p1Value = p1Value + 10;
			}
			if(hand1.contains("A")&& p1Value <= 11) {
				p1Value = p1Value + 11;
			}
			if(hand1.contains("A")&& p1Value > 21) {
				p1Value = p1Value - 10;
			}
		}
			System.out.println(p1 + " has " + hand1 + "at " + p1Value);
			
			if (playerCount > 1) {
				for (int x = 0; x < hand2.length();x++) {
					if(hand2.charAt(x) == '2') {
						p2Value = p2Value + 2;
					}
					if(hand2.charAt(x) == '3') {
						p2Value = p2Value + 3;
					}
					if(hand2.charAt(x) == '4') {
						p2Value = p2Value + 4;
					}	
					if(hand2.charAt(x) == '5') {
						p2Value = p2Value + 5;
					}
					if(hand2.charAt(x) == '6') {
						p2Value = p2Value + 6;
					}
					if(hand2.charAt(x) == '7') {
						p2Value = p2Value + 7;
					}
					if(hand2.charAt(x) == '8') {
						p2Value = p2Value + 8;
					}
					if(hand2.charAt(x) == '9') {
						p2Value = p2Value + 9;
					}
					if(hand2.charAt(x) == '1') {
						p2Value = p2Value + 10;
					}
					if(hand2.charAt(x) == 'J') {
						p2Value = p2Value + 10;
					}
					if(hand2.charAt(x) == 'Q') {
						p2Value = p2Value + 10;
					}
					if(hand2.charAt(x) == 'K') {
						p2Value = p2Value + 10;
					}
					if(hand2.contains("A")&& p2Value <= 11) {
						p2Value = p2Value + 11;
					}
					if(hand2.contains("A")&& p2Value > 21) {
						p2Value = p2Value - 10;
					}
				}
				System.out.println(p2 + " has " + hand2 + "at " + p2Value);

			}
			
			
			if (playerCount > 2) {
				for (int x = 0; x < hand3.length();x++) {
					if(hand3.charAt(x) == '2') {
						p3Value = p3Value + 2;
					}
					if(hand3.charAt(x) == '3') {
						p3Value = p3Value + 3;
					}
					if(hand3.charAt(x) == '4') {
						p3Value = p3Value + 4;
					}	
					if(hand3.charAt(x) == '5') {
						p3Value = p3Value + 5;
					}
					if(hand3.charAt(x) == '6') {
						p3Value = p3Value + 6;
					}
					if(hand3.charAt(x) == '7') {
						p3Value = p3Value + 7;
					}
					if(hand3.charAt(x) == '8') {
						p3Value = p3Value + 8;
					}
					if(hand3.charAt(x) == '9') {
						p3Value = p3Value + 9;
					}
					if(hand3.charAt(x) == '1') {
						p3Value = p3Value + 10;
					}
					if(hand3.charAt(x) == 'J') {
						p3Value = p3Value + 10;
					}
					if(hand3.charAt(x) == 'Q') {
						p3Value = p3Value + 10;
					}
					if(hand3.charAt(x) == 'K') {
						p3Value = p3Value + 10;
					}
					if(hand3.contains("A")&& p3Value <= 11) {
						p3Value = p3Value + 11;
					}
					if(hand3.contains("A")&& p3Value > 21) {
						p3Value = p3Value - 10;
					}
				}
				System.out.println(p3 + " has " + hand3 + "at " + p3Value);

			}
			
			if (playerCount == 4) {
				for (int x = 0; x < hand4.length();x++) {
					if(hand4.charAt(x) == '2') {
						p4Value = p4Value + 2;
					}
					if(hand4.charAt(x) == '3') {
						p4Value = p4Value + 3;
					}
					if(hand4.charAt(x) == '4') {
						p4Value = p4Value + 4;
					}	
					if(hand4.charAt(x) == '5') {
						p4Value = p4Value + 5;
					}
					if(hand4.charAt(x) == '6') {
						p4Value = p4Value + 6;
					}
					if(hand4.charAt(x) == '7') {
						p4Value = p4Value + 7;
					}
					if(hand4.charAt(x) == '8') {
						p4Value = p4Value + 8;
					}
					if(hand4.charAt(x) == '9') {
						p4Value = p4Value + 9;
					}
					if(hand4.charAt(x) == '1') {
						p4Value = p4Value + 10;
					}
					if(hand4.charAt(x) == 'J') {
						p4Value = p4Value + 10;
					}
					if(hand4.charAt(x) == 'Q') {
						p4Value = p4Value + 10;
					}
					if(hand4.charAt(x) == 'K') {
						p4Value = p4Value + 10;
					}
					if(hand4.contains("A")&& p4Value <= 11) {
						p4Value = p4Value + 11;
					}
					if(hand4.contains("A")&& p4Value > 21) {
						p4Value = p4Value - 10;
					}
				}
				System.out.println(p4 + " has " + hand4 + "at " + p4Value);

			}
			
			
				for (int x = 0; x < handD.length();x++) {
					if(handD.charAt(x) == '2') {
						dValue = dValue + 2;
					}
					if(handD.charAt(x) == '3') {
						dValue = dValue + 3;
					}
					if(handD.charAt(x) == '4') {
						dValue = dValue + 4;
					}	
					if(handD.charAt(x) == '5') {
						dValue = dValue + 5;
					}
					if(handD.charAt(x) == '6') {
						dValue = dValue + 6;
					}
					if(handD.charAt(x) == '7') {
						dValue = dValue + 7;
					}
					if(handD.charAt(x) == '8') {
						dValue = dValue + 8;
					}
					if(handD.charAt(x) == '9') {
						dValue = dValue + 9;
					}
					if(handD.charAt(x) == '1') {
						dValue = dValue + 10;
					}
					if(handD.charAt(x) == 'J') {
						dValue = dValue + 10;
					}
					if(handD.charAt(x) == 'Q') {
						dValue = dValue + 10;
					}
					if(handD.charAt(x) == 'K') {
						dValue = dValue + 10;
					}
					if(handD.contains("A")&& dValue <= 11) {
						dValue = dValue + 11;
					}
					if(handD.contains("A")&& dValue > 21) {
						dValue = dValue - 10;
					}
				}
			do {
				choice = "";
				draw = 0;
				System.out.print(p1 +", wanna Hit or Stay?(Enter H or S)");
				choice = input.next();
				t = choice.equalsIgnoreCase("H");
				f = choice.equalsIgnoreCase("S");
				System.out.println(t);
				//choice = choice.toUpperCase();
				//System.out.print(choice);
				if( t == false && f == false) {
					do {
					System.out.print("Please enter a given option(H / S)");
					choice = input.next();
					t = choice.equalsIgnoreCase("H");
					f = choice.equalsIgnoreCase("S");
					}
					while(t != true || f != true);
				}
						if(t == true) {
							while(draw != 1) {
								
								if(deck2.getDeck()[s] == "0") {
									s++;
								}
								else if(deck2.getDeck()[s] != "0") {
									hand1 = hand1 + deck2.getDeck()[s] + " ";
									deck2.getDeck()[s] = "0";
									draw++;
									s++;
									t = false;
									System.out.print(hand1);
								}
								
							}
						}
				
			}
			while(f == false);
			if(playerCount > 1) {
				do {
					choice = "";
					draw = 0;
					System.out.print(p2 +", wanna Hit or Stay?(Enter H or S)");
					choice = input.next();
					t = choice.equalsIgnoreCase("H");
					f = choice.equalsIgnoreCase("S");
					System.out.println(t);
					//choice = choice.toUpperCase();
					
					if( t == false && f == false) {
						do {
						System.out.print("Please enter a given option(H / S)");
						choice = input.next();
						t = choice.equalsIgnoreCase("H");
						f = choice.equalsIgnoreCase("S");
						}
						while(t != true || f != true);
					}
							if(t == true) {
								while(draw != 1) {
									
									if(deck2.getDeck()[s] == "0") {
										s++;
									}
									else if(deck2.getDeck()[s] != "0") {
										hand2 = hand2 + deck2.getDeck()[s] + " ";
										deck2.getDeck()[s] = "0";
										draw++;
										s++;
										t = false;
										System.out.print(hand2);
									}
									
								}
							}
					
				}
				while(f == false);
			}
			
			if(playerCount > 2) {
				do {
					choice = "";
					draw = 0;
					System.out.print(p3 +", wanna Hit or Stay?(Enter H or S)");
					choice = input.next();
					t = choice.equalsIgnoreCase("H");
					f = choice.equalsIgnoreCase("S");
					System.out.println(t);
					//choice = choice.toUpperCase();
					
					if( t == false && f == false) {
						do {
						System.out.print("Please enter a given option(H / S)");
						choice = input.next();
						t = choice.equalsIgnoreCase("H");
						f = choice.equalsIgnoreCase("S");
						}
						while(t != true || f != true);
					}
							if(t == true) {
								while(draw != 1) {
									
									if(deck2.getDeck()[s] == "0") {
										s++;
									}
									else if(deck2.getDeck()[s] != "0") {
										hand3 = hand3 + deck2.getDeck()[s] + " ";
										deck2.getDeck()[s] = "0";
										draw++;
										s++;
										t = false;
										System.out.print(hand3);
									}
									
								}
							}
					
				}
				while(f == false);
			}
			
			if(playerCount == 4) {
				do {
					choice = "";
					draw = 0;
					System.out.print(p4 +", wanna Hit or Stay?(Enter H or S)");
					choice = input.next();
					t = choice.equalsIgnoreCase("H");
					f = choice.equalsIgnoreCase("S");
					System.out.println(t);
					//choice = choice.toUpperCase();
					
					if( t == false && f == false) {
						do {
						System.out.print("Please enter a given option(H / S)");
						choice = input.next();
						t = choice.equalsIgnoreCase("H");
						f = choice.equalsIgnoreCase("S");
						}
						while(t != true || f != true);
					}
							if(t == true) {
								while(draw != 1) {
									
									if(deck2.getDeck()[s] == "0") {
										s++;
									}
									else if(deck2.getDeck()[s] != "0") {
										hand4 = hand4 + deck2.getDeck()[s] + " ";
										deck2.getDeck()[s] = "0";
										draw++;
										s++;
										t = false;
										System.out.print(hand4);
									}
									
								}
							}
					
				}
				while(f == false);
			}
			p1Value = 0;
			p2Value = 0;
			p3Value = 0;
			p4Value = 0;
			for (int x = 0; x < hand1.length();x++) {
				if(hand1.charAt(x) == '2') {
					p1Value = p1Value + 2;
				}
				if(hand1.charAt(x) == '3') {
					p1Value = p1Value + 3;
				}
				if(hand1.charAt(x) == '4') {
					p1Value = p1Value + 4;
				}	
				if(hand1.charAt(x) == '5') {
					p1Value = p1Value + 5;
				}
				if(hand1.charAt(x) == '6') {
					p1Value = p1Value + 6;
				}
				if(hand1.charAt(x) == '7') {
					p1Value = p1Value + 7;
				}
				if(hand1.charAt(x) == '8') {
					p1Value = p1Value + 8;
				}
				if(hand1.charAt(x) == '9') {
					p1Value = p1Value + 9;
				}
				if(hand1.charAt(x) == '1') {
					p1Value = p1Value + 10;
				}
				if(hand1.charAt(x) == 'J') {
					p1Value = p1Value + 10;
				}
				if(hand1.charAt(x) == 'Q') {
					p1Value = p1Value + 10;
				}
				if(hand1.charAt(x) == 'K') {
					p1Value = p1Value + 10;
				}
				if(hand1.contains("A")&& p1Value <= 11) {
					p1Value = p1Value + 11;
				}
				if(hand1.contains("A")&& p1Value > 21) {
					p1Value = p1Value - 10;
				}
			}
			
			if(p1Value > 21) {
				System.out.println(p1 + " has busted");
				p1Value = 0;
			}
			else {
				System.out.print(p1 + " has " + hand1 + "at " + p1Value);
			}
				if (playerCount > 1) {
					for (int x = 0; x < hand2.length();x++) {
						if(hand2.charAt(x) == '2') {
							p2Value = p2Value + 2;
						}
						if(hand2.charAt(x) == '3') {
							p2Value = p2Value + 3;
						}
						if(hand2.charAt(x) == '4') {
							p2Value = p2Value + 4;
						}	
						if(hand2.charAt(x) == '5') {
							p2Value = p2Value + 5;
						}
						if(hand2.charAt(x) == '6') {
							p2Value = p2Value + 6;
						}
						if(hand2.charAt(x) == '7') {
							p2Value = p2Value + 7;
						}
						if(hand2.charAt(x) == '8') {
							p2Value = p2Value + 8;
						}
						if(hand2.charAt(x) == '9') {
							p2Value = p2Value + 9;
						}
						if(hand2.charAt(x) == '1') {
							p2Value = p2Value + 10;
						}
						if(hand2.charAt(x) == 'J') {
							p2Value = p2Value + 10;
						}
						if(hand2.charAt(x) == 'Q') {
							p2Value = p2Value + 10;
						}
						if(hand2.charAt(x) == 'K') {
							p2Value = p2Value + 10;
						}
						if(hand2.contains("A")&& p2Value <= 11) {
							p2Value = p2Value + 11;
						}
						if(hand2.contains("A")&& p2Value > 21) {
							p2Value = p2Value - 10;
						}
					}
					if(p2Value > 21) {
						System.out.println(p2 + " has busted");
						p2Value = 0;
					}
					else {
						System.out.print(p2 + " has " + hand2 + "at " + p2Value);
					}
				}
				
				
				if (playerCount > 2) {
					for (int x = 0; x < hand3.length();x++) {
						if(hand3.charAt(x) == '2') {
							p3Value = p3Value + 2;
						}
						if(hand3.charAt(x) == '3') {
							p3Value = p3Value + 3;
						}
						if(hand3.charAt(x) == '4') {
							p3Value = p3Value + 4;
						}	
						if(hand3.charAt(x) == '5') {
							p3Value = p3Value + 5;
						}
						if(hand3.charAt(x) == '6') {
							p3Value = p3Value + 6;
						}
						if(hand3.charAt(x) == '7') {
							p3Value = p3Value + 7;
						}
						if(hand3.charAt(x) == '8') {
							p3Value = p3Value + 8;
						}
						if(hand3.charAt(x) == '9') {
							p3Value = p3Value + 9;
						}
						if(hand3.charAt(x) == '1') {
							p3Value = p3Value + 10;
						}
						if(hand3.charAt(x) == 'J') {
							p3Value = p3Value + 10;
						}
						if(hand3.charAt(x) == 'Q') {
							p3Value = p3Value + 10;
						}
						if(hand3.charAt(x) == 'K') {
							p3Value = p3Value + 10;
						}
						if(hand3.contains("A")&& p3Value <= 11) {
							p3Value = p3Value + 11;
						}
						if(hand3.contains("A")&& p3Value > 21) {
							p3Value = p3Value - 10;
						}
					}
					if(p3Value > 21) {
						System.out.println(p3 + " has busted");
						p3Value = 0;
					}
					else {
						System.out.print(p3 + " has " + hand3 + "at " + p3Value);
					}
				}
				
				if (playerCount == 4) {
					for (int x = 0; x < hand4.length();x++) {
						if(hand4.charAt(x) == '2') {
							p4Value = p4Value + 2;
						}
						if(hand4.charAt(x) == '3') {
							p4Value = p4Value + 3;
						}
						if(hand4.charAt(x) == '4') {
							p4Value = p4Value + 4;
						}	
						if(hand4.charAt(x) == '5') {
							p4Value = p4Value + 5;
						}
						if(hand4.charAt(x) == '6') {
							p4Value = p4Value + 6;
						}
						if(hand4.charAt(x) == '7') {
							p4Value = p4Value + 7;
						}
						if(hand4.charAt(x) == '8') {
							p4Value = p4Value + 8;
						}
						if(hand4.charAt(x) == '9') {
							p4Value = p4Value + 9;
						}
						if(hand4.charAt(x) == '1') {
							p4Value = p4Value + 10;
						}
						if(hand4.charAt(x) == 'J') {
							p4Value = p4Value + 10;
						}
						if(hand4.charAt(x) == 'Q') {
							p4Value = p4Value + 10;
						}
						if(hand4.charAt(x) == 'K') {
							p4Value = p4Value + 10;
						}
						if(hand4.contains("A")&& p4Value <= 11) {
							p4Value = p4Value + 11;
						}
						if(hand4.contains("A")&& p4Value > 21) {
							p4Value = p4Value - 10;
						}
					}
					if(p4Value > 21) {
						System.out.println(p4 + " has busted");
						p4Value = 0;
					}
					else {
						System.out.print(p4 + " has " + hand4 + "at " + p4Value);
					}
				}
				System.out.println("\n\nD " + handD + "\n\n");
				if(dValue < 16) {
					s = 0;
					
					do {
						
						dValue = 0;
						draw = 0;
						while(draw != 1) {
							if(deck2.getDeck()[s].equals("0")) {
								//System.out.print("x");
								s++;
							}
							else if(!deck2.getDeck()[s].equals("0")) {
								handD = handD + deck2.getDeck()[s] + " ";
								deck2.setDeck("0", s);
								draw++;
								s++;
								//System.out.print(handD);
							}
							
						}
						for (int x = 0; x < handD.length();x++) {
							if(handD.charAt(x) == '2') {
								dValue = dValue + 2;
							}
							if(handD.charAt(x) == '3') {
								dValue = dValue + 3;
							}
							if(handD.charAt(x) == '4') {
								dValue = dValue + 4;
							}	
							if(handD.charAt(x) == '5') {
								dValue = dValue + 5;
							}
							if(handD.charAt(x) == '6') {
								dValue = dValue + 6;
							}
							if(handD.charAt(x) == '7') {
								dValue = dValue + 7;
							}
							if(handD.charAt(x) == '8') {
								dValue = dValue + 8;
							}
							if(handD.charAt(x) == '9') {
								dValue = dValue + 9;
							}
							if(handD.charAt(x) == '1') {
								dValue = dValue + 10;
							}
							if(handD.charAt(x) == 'J') {
								dValue = dValue + 10;
							}
							if(handD.charAt(x) == 'Q') {
								dValue = dValue + 10;
							}
							if(handD.charAt(x) == 'K') {
								dValue = dValue + 10;
							}
							if(handD.contains("A")) {
								dValue = dValue + 11;
							}
							if(handD.contains("A")&& dValue > 21) {
								dValue = dValue - 10;
							}
						}
					}
					while(dValue < 16);
				}
				if(dValue > 21) {
					System.out.println("The Dealer Busted");
					dValue = 0;
				}
				else {
				System.out.println("The Dealer holds: " + handD + " at " + dValue);
				}
				if(p1Value > dValue) {
					p1Wallet = p1Wallet + (bet1 * 2);
					System.out.println(p1 + " you won this round, and now have " + p1Wallet + " in your wallet.");
				}
				if(p2Value > dValue && playerCount > 1) {
					p2Wallet = p2Wallet + (bet2 * 2);
					System.out.println(p2 + " you won this round, and now have " + p2Wallet + " in your wallet.");
				}
				if(p3Value > dValue && playerCount > 2) {
					p3Wallet = p3Wallet + (bet3 * 2);
					System.out.println(p3 + " you won this round, and now have " + p3Wallet + " in your wallet.");
				}
				if(p4Value > dValue && playerCount == 4) {
					p4Wallet = p4Wallet + (bet4 * 2);
					System.out.println(p4 + " you won this round, and now have " + p4Wallet + " in your wallet.");
				}
				if(p1Value < dValue) {
					p1Wallet = p1Wallet - bet1  ;
					System.out.println(p1 + " you lost this round, and now have " + p1Wallet + " in your wallet.");
				}
				if(p2Value < dValue && playerCount > 1) {
					p2Wallet = p2Wallet - bet2;
					System.out.println(p2 + " you lost this round, and now have " + p2Wallet + " in your wallet.");
				}
				if(p3Value < dValue && playerCount > 2) {
					p3Wallet = p3Wallet - bet3;
					System.out.println(p3 + " you lost this round, and now have " + p3Wallet + " in your wallet.");
				}
				if(p4Value > dValue && playerCount == 4) {
					p4Wallet = p4Wallet - bet4;
					System.out.println(p4 + " you won this round, and now have " + p4Wallet + " in your wallet.");
				}
				if(p1Value == dValue) {
					p1Wallet = p1Wallet + bet1;
					System.out.println(p1 + " you tied this round, and now have " + p1Wallet + " in your wallet.");
				}
				if(p2Value == dValue && playerCount > 1) {
					p2Wallet = p2Wallet + bet2;
					System.out.println(p2 + " you tied this round, and now have " + p2Wallet + " in your wallet.");
				}
				if(p3Value == dValue && playerCount > 2) {
					p3Wallet = p3Wallet + bet3;
					System.out.println(p3 + " you tied this round, and now have " + p3Wallet + " in your wallet.");
				}
				if(p4Value == dValue && playerCount == 4) {
					p4Wallet = p4Wallet + bet4;
					System.out.println(p4 + " you tied this round, and now have " + p4Wallet + " in your wallet.");
				}
				
			System.out.print("Will you play again?(Y / N): ");
			choice = input.next();
			t = choice.equalsIgnoreCase("Y");
			f = choice.equalsIgnoreCase("N");
			if(t != true && f != true) {
				do {
					System.out.print("Please enter a valid input: ");
					choice = input.next();
					t = choice.equalsIgnoreCase("Y");
					f = choice.equalsIgnoreCase("N");
				}
				while(t == false && f == false);
			}
			if (f == true) {
				quit = true;
				//System.out.println("QUIT");
			}
			
		}
		while(quit == false && (p1Wallet > 0 && p2Wallet > 0 && p3Wallet > 0 && p4Wallet > 0));
		System.out.println("Thanks for Playing!");
	}
}