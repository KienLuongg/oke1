package P1;

public class Tamgiac {
    int a;
    int b;
    int c;


    public void chuvi(){
        int p = a+b+c;
        System.out.println("Chu vi tam giac: "+p);
    }
    public void dientich(){
        float np = (a+b+c)/2;
        double S = Math.sqrt(np*(np-a)*(np-b)*(np-c));
        System.out.println("Dien tich tam giac: "+S);
    }
}
