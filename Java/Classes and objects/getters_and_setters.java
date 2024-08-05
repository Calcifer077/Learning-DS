public class getters_and_setters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    // setter
    void setColor(String newColor) {
        color = newColor;
    }

    // setter
    void setTip(int newTip) {
        tip = newTip;
    }

    // getter
    String getColor() {
        return this.color;
    }

    // getter
    int getTip() {
        return this.tip;
    }
}