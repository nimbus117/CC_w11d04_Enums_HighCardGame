import java.util.ArrayList;

public class Game {

    private int numberOfPlayers;
    private ArrayList<Card> players;
    private Deck deck;

    public Game(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
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
        if (this.players.size() < 1) {return 0;}
        int winner = 1;
        Card maxCard = getPlayerCard(1);
        System.out.println(getPlayerCard(1).getRank());
        System.out.println(getPlayerCard(1).getSuit());
        for (int i = 2; i <= numberOfPlayers; i++) {
            System.out.println(getPlayerCard(i).getRank());
            System.out.println(getPlayerCard(i).getSuit());
            if (getPlayerCard(i).getRank().getValue() > maxCard.getRank().getValue()) {
                winner = i;
                maxCard = getPlayerCard(i);
            } else if (getPlayerCard(i).getRank().getValue() == maxCard.getRank().getValue()) {
                if (getPlayerCard(i).getSuit().getValue() > maxCard.getSuit().getValue()) {
                    winner = i;
                    maxCard = getPlayerCard(i);
                }
            }
        }
        System.out.println(winner);
        return winner;
    }

}
