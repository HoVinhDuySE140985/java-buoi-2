import java.util.Scanner;

public class BaiTap5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double a , b , h, v , sXQ , sTP, sDay;
        do{
            System.out.println("Nhap Chieu rong a = ");
            a = input.nextDouble();
            System.out.println("Nhap Chieu dai b = ");
            b = input.nextDouble();
            System.out.println("Nhap Chieu Cao h");
            h = input.nextDouble();
        }while(a<=0 || b<= 0 || h <= 0);
        input.close();
        v = a * b * h;
        System.out.println("The Tich HHCN v =" + v);

        sXQ = 2 * h * (a + b) ;
        System.out.println("Dien Tich Xung Quanh sXQ = " + sXQ);
        sDay = a * b;
        sTP = sXQ + 2*sDay; // 2*h*(a+b)+2*a*b
        System.out.println("Dien Tich Toan Phan HHCN sTP = " + sTP);
    }
}