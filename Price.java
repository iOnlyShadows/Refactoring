public abstract class Price {
    public abstract int getPriceCode();

    // Tornando o método getCharge abstrato
    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão
    }
}
