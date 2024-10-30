package codeforall.fantastics;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[] { "Ze" };

        try { // try to run this

            System.out.println("Hello " + names[1].toUpperCase());

        } catch (Exception e) { // but if it fails run this code instead

            System.out.println("Ze is not here");

        } finally { // and this will always run

            System.out.println("Either way I will run whatever is in here...");
        }
    }
}
