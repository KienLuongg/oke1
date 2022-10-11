package P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Nam";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 20;

        s.showInfo();
        s2.showInfo();

        Scanner sc = new Scanner(System.in);

        Tamgiac t = new Tamgiac();
        System.out.println("Nhap canh 1:");
        t.a = sc.nextInt();
        System.out.println("Nhap canh 2:");
        t.b = sc.nextInt();
        System.out.println("Nhap canh 3:");
        t.c = sc.nextInt();

        t.chuvi();
        t.dientich();
    }
}
