public class Student extends Person{


    int grade;

   public void setGrade(int grade) {


       this.grade = grade;
    }


    public void display(){

        System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Grade:"+grade);

    }

}