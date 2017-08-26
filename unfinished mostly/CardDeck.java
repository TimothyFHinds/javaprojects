
public class CardDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int[] deck = new int[52];
		
		
		
		initialize(deck);
		shuffle(deck);
		display(deck, 6);
		
		
	}

	private static void display(int[] deck, int n) 
	{
		// TODO Auto-generated method stub
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		//Display first four cards
		for(int i = 0; i< n; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
			
		}
	}

	private static void shuffle(int[] deck) 
	{
		// TODO Auto-generated method stub
		//Shuffle Deck
		for(int i = deck.length -1; i>= 0; i--) {
			int j = (int) (Math.random() * (i+1));
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}

	private static void initialize(int[] deck) 
	{
		//Initialize Deck
		//0....12 = spades
		//13....25 = hearts
		//26....38 = diamonds
		//39...51 = clubs
		for(int i=0; i<deck.length;i++) {
			deck[i] = i;
		}
		
	}

}
