import java.util.Scanner;

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a , b, c, h, P, S;
        do{
            System.out.println("Nhap Canh Ben a = ");
            a = input.nextDouble();
            System.out.println("Nhap Canh Ben b = ");
            b = input.nextDouble();
            System.out.println("Nhap Canh Day c = ");
            c = input.nextDouble();
            System.out.println("Nhap Chieu Cao h = ");
            h = input.nextDouble();
        }while(a <= 0 || b <= 0 || c <= 0 || h<= 0 );
        input.close();
        if(a<b+c && b<a+c && c<a+b){
            P = a + b + c;
            System.out.println("Chu Vi Hinh Tam Giac P = " + P );

             S = h * c / 2;
            System.out.println("Dien Tich Tam Giac Thuong S = " + S);
        }else{
            System.out.println("a b c khong phai canh cua 1 tam giac");
        }
    }
}
