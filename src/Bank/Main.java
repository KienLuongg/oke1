package Bank;

public class Main {
        public static void main(String[] args) {
            Account a =new Account("oke","33453",5);
            a.credit(5);
            System.out.println("tk a = "+a.balance);
            a.debit(3);
            System.out.println("tk a = "+a.balance);
            Account a2  = new Account("sad","sfdsf",5);
            a.transTo(a2,1);
            System.out.println("tk a = "+a.balance);
            System.out.println("tk a2 = "+a2.balance);


        }
}
