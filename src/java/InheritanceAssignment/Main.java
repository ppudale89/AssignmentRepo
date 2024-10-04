public class Main {

    public static void main(String[] args)
    {
        Person p=new Person();
        Student s=new Student();
        Teacher t=new Teacher();


        p.name="Padmaja";
        p.age=30;
        p.display();

        s.name="Divya";
        s.age=25;
        s.grade=10;
        s.display();

        t.name="preeti";
        t.age=35;
        t.subject="Maths";
        t.display();

    }

}