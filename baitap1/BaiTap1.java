import java.util.Scanner;

public class BaiTap1{
    public static void main(String[] args) {
        // Tính Diện Tích Hình Thang
        Scanner input = new Scanner(System.in);
        int a, b, h;
        do{
            System.out.println("Nhap Day a = ");
            a = input.nextInt();
        
            System.out.println("Nhap Day b = ");
            b = input.nextInt();

            System.out.println("Nhap Chieu Cao h = ");
            h = input.nextInt();
            
        }while( a <= 0 || b <= 0 || h <= 0);
        input.close();

        float S = (a+b)/2 * h;
        System.out.println("Dien Tich Hinh Thang S = " + S);
        
    }
}