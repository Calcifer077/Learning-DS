public class about_interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Chess {
    void moves();
}

class Queen implements Chess {
    public void moves() {
        System.out.println("Moves in every direction");
    }
}

class Elephant implements Chess {
    public void moves() {
        System.out.println("Only moves in straight direction");
    }
}

class Camel implements Chess {
    public void moves() {
        System.out.println("Moves vertically");
    }
}