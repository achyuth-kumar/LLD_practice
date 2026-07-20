public enum Circle {

    A(5),
    B(4),
    C(3),
    D(2),
    E(1),
    F(0);

    private final int baseScore;

    Circle(int score) {
        this.baseScore = score;
    }

    public int getScore(int round) {
        if (this == F)
            return 0;

        return baseScore + (round - 1);
    }
}