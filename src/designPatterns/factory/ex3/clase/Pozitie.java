package designPatterns.factory.ex3.clase;

public class Pozitie {
    private int x;
    private int y;

    public Pozitie(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pozitie setX(int x) {
        this.x = x;
        return this;
    }

    public Pozitie setY(int y) {
        this.y = y;
        return this;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isInProximityToOtherPosition(Pozitie pozitie, int proximityRate) {
        int infX = pozitie.getX() - proximityRate;
        int supX = pozitie.getX() + proximityRate;
        int infY = pozitie.getY() - proximityRate;
        int supY = pozitie.getY() + proximityRate;

        if(this.x < infX || this.x > supX ) {
            return false;
        }

        if(this.y < infY || this.y > supY) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pozitie{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }
}
