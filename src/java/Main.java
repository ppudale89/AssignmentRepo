public class Main {

    public static void main(String args[]){

        Person p=new Person("Deepika",30,"Female");
        p.displayInfo();
        p.setAge(25);
        System.out.println("Newage:"+p.getAge());
        Person p1=new Person("Ramya",28);
        p1.setGender("NA");
        p1.displayInfo();

    }
}