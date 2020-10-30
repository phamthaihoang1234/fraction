public class Fraction {
    private int ms;
    private int ts;


    public Fraction(int ms, int ts) {
        this.ms = ms;
        this.ts = ts;
    }

    public Fraction() {
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    @Override
    public String toString() {
        return this.ts + "/" + this.ms;
    }
}
