public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        // Implementação genérica, pode ser sobrescrita nas subclasses
        return 0;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Valor padrão
    }
}
