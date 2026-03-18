public class uc5 {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } 
        // Using enhanced for loop
        else {
            for (String name : args) {
                System.out.println("Hello, " + name);
            }
        }
    }
}