import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double R, C, S ;
        do{
            System.out.println("Nhap Ban Kinh R = ");
            R = input.nextDouble();
        }while(R <= 0);
        input.close();

        C = R * 2 * Math.PI;
        System.out.println("Chu Vi Hinh Tron C = " + C);

        S = Math.PI * Math.pow(R, 2);
        System.out.println("Dien Tich Hinh Tron S = " + S);
    }
}
