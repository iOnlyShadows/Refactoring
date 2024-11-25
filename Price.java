public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        return 0;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão para frequent renter points
    }
}
