public class multiple_inheritance {
    public static void main(String[] args) {
        Omnivore o = new Omnivore();
        o.eatsGrass();
        o.eatsMeat();
    }
}

interface Herbivore {
    void eatsGrass();
}

interface Carnivore {
    void eatsMeat();
}

class Omnivore implements Herbivore, Carnivore {
    public void eatsGrass() {
        System.out.println("Eats grass");
    }

    public void eatsMeat() {
        System.out.println("Eats meat");
    }
}