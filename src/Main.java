public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i=0; i<5; i++){
            System.out.println("i= " +i);
        }
        menu();
    }
    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. C");
    }

}