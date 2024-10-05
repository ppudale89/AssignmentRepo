public class MainAnimal {

    public static void main(String[] args) {
        Animal[] a = {new Dog(), new Cat(), new Lion()};
        for (int i = 0; i <= a.length - 1; i++)
        {
            a[i].sound();

        }

    }
}