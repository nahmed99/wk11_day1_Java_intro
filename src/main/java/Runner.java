public class Runner {
    public static void main(String[] args) {
        // java is an OO language
        // No code can be run in a Java that's not in a class
        // Java is statically typed

        Cat cat = new Cat();

        String message = cat.meow();

        System.out.println(message);
    }
}
