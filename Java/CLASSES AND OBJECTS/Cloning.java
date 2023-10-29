class Main implements Cloneable{
    int rollno;
    String name;

    Main(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            Main s1 = new Main(123, "Student 1");

            Main s2 = (Main)s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        }
        catch(CloneNotSupportedException c){}
    }
}
