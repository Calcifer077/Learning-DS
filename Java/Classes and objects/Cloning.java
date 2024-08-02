class Cloning implements Cloneable{
    int rollno;
    String name;

    Cloning(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try{
            Cloning s1 = new Cloning(123, "Student 1");

            Cloning s2 = (Cloning)s1.clone();

            System.out.println(s1.rollno + " " + s1.name);
            System.out.println(s2.rollno + " " + s2.name);

        }
        catch(CloneNotSupportedException c){}
    }
}
