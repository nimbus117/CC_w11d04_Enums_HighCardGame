public enum Suit {

    HEARTS(3),
    DIAMONDS(1),
    SPADES(4),
    CLUBS(2);

    private final int value;

    Suit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
