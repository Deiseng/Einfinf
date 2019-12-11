public abstract class Present {
    static int counter = 0;

    protected Present() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    abstract double surface();

    double computePaperSize() {
        double o= surface()*1.6;
        o=(double)(Math.round(o)*2);
        o=o/2;
        return o;
        // Oberfläche des Grundkörpers + 60% Verschnitt,
        // aufgerundet auf den nächsten halben Quadratmeter
    }
}
