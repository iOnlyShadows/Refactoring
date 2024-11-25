public abstract class Price {
    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    // Versão genérica e concreta para pontos de locação frequente
    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão
    }
}
