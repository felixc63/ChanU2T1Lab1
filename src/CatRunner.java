public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Felix",8,9.6);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Kei",2,8.9);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
