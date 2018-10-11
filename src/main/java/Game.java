import java.util.ArrayList;

public class Game {

    private int numberOfPlayers;
    private ArrayList<Card> players;
    private Deck deck;

    public Game(){
        this.numberOfPlayers = 2;
        this.players = new ArrayList<>();
        this.deck = new Deck();
        this.deck.populate();
        this.deck.shuffleCards();
    }

    public Card getPlayerCard(int playerNumber) {
        if (this.players.size() >= playerNumber) {
            return this.players.get(playerNumber - 1);
        } else {
            return null;
        }
    }

    public int countCardsLeftInDeck() {
        return this.deck.countCardsInDeck();
    }

    public void dealCards() {
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(deck.dealCard());
        }
    }

    public int checkWinner() {
        int winner = 0;
        int maxCard = 0;
        for (int i = 1; i <= numberOfPlayers; i++) {
            System.out.println(getPlayerCard(i).getRank());
            System.out.println(getPlayerCard(i).getSuit());
            if (getPlayerCard(i).getRank().getValue() > maxCard) {
                winner = i;
                maxCard = getPlayerCard(i).getRank().getValue();
            }
        }
        System.out.println(winner);
        return winner;
    }

}
