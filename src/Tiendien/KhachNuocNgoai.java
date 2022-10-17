package Tiendien;

public class KhachNuocNgoai {

    public String qt;



    public KhachNuocNgoai(int customerId, String name, String date, String dt, double sl,String qt) {
        super(customerId, name, date, dt, sl);
        this.qt = qt;
    }

    @Override
    public double TT(){
        double tt = 0;
        tt = this.sl*2000;
        return tt;
    }

}
