public class Teacher extends Person{


    String subject;

    public void setSubject(String subject) {


        this.subject = subject;
    }

    public void display()
    {
        System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Subject:"+subject);

    }

}