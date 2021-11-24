enum Allergen {
    EGGS(1),
    PEANUTS(2),
    SHELLFISH(4),
    STRAWBERRIES(8),
    TOMATOES(16),
    CHOCOLATE(32),
    POLLEN(64),
    CATS(128);

    private final int num;

    Allergen(int num) {
        this.num = num;
    }

    int getNum() {
        return num;
    }
}