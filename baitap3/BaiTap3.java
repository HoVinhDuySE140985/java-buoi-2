import java.util.Scanner;

public class BaiTap3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a , b, x, s;
        System.out.println("Nhap So Nguyen a =");
        a = input.nextInt();
        System.out.println("Nhap So Nguyen b = ");
        b = input.nextInt();
        System.out.println("Nhap So Thuc x = ");
        x = input.nextDouble();

        input.close();

        s = a/10 + Math.pow(a, b) 
                 - Math.sin(Math.PI*x/3)/Math.sqrt( Math.pow(a+b, 2)+5)
                 + Math.log(Math.pow(a, 2)+1)
                 - Math.log(4*Math.pow(x, 2*a)+3)/Math.log(3)/ 2.55;
        System.out.println("Gia Tri Bieu Thuc s = " + s );
    }
}