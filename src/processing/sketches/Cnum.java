package processing.sketches;

//a + bi

public class Cnum {
    private float a;
    private float b;

    public Cnum(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Cnum() {
        a = 0.0f;
        b = 0.0f;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
