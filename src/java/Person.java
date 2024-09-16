public class Person {

    String name;
    int age;
    String gender;

    Person(String name, int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

    Person(String name,int age){

        this.name=name;
        this.age=age;


    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getGender(){
        return gender;

    }

    void setAge(int newAge){
        this.age=newAge;
    }

    void setGender(String gender){

        this.gender=gender;
    }
    public void displayInfo(){

        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Gender:"+getGender());

    }
}