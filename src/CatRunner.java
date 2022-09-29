public class CatRunner {
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Bob", 2, 5.5);
        cat1.printCatInfo();

        Cat cat2 = new Cat("Fred", 8, 10.4);
        cat2.introduce();
        cat2.printCatInfo();


    }
}
