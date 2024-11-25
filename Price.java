public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        // Lógica padrão para frequent renter points
        return 1;
    }
}
