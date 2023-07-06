import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap7 {
    public static class Employee{
        String name;
        LocalDate dob;
        Integer snlv;
        float sglt;

        public Employee(){
            
        }

        public Employee(String name, LocalDate dob, Integer snlv, float sglt) {
            this.name = name;
            this.dob = dob;
            this.snlv = snlv;
            this.sglt = sglt;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public LocalDate getDob() {
            return dob;
        }
        public void setDob(LocalDate dob) {
            this.dob = dob;
        }
        public Integer getSnlv() {
            return snlv;
        }
        public void setSnlv(Integer snlv) {
            this.snlv = snlv;
        }
        public float getSglt() {
            return sglt;
        }
        public void setSglt(float sglt) {
            this.sglt = sglt;
        }
    }
    public static void main(String[] args) {
        int no = 0;
        List<Employee> listEmployees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3; i++){
            Employee employee = new Employee();
            System.out.println("Nhap Ho Va Ten :");
            employee.setName(input.next());

            System.out.println("Nhap Ngay Sinh :");
            employee.setDob(LocalDate.parse(input.next())); 

            System.out.println("Nhap So Ngay Lam Viec :");
            employee.setSnlv(input.nextInt());

            System.out.println("Nhap So Gio Lam Them :");
            employee.setSglt(input.nextFloat());
            listEmployees.add(employee);
        }
        input.close();
        System.out.println("\n");
        System.out.printf("%-10s%-15s%-15s%-20s%-20s%-15s\n","STT ","Ho va Ten ","Ngay Sinh","So Ngay Lam Viec","So Gio Lam Them","Luong");
        for (Employee e : listEmployees) {
            no = no +1;
            System.out.printf("%-10d%-15s%-15s%-20d%-20.2f%-15.2f\n",no, e.name,e.dob.toString(),e.snlv,e.sglt,(e.snlv*350000+e.sglt*45000));
        }
        System.out.println("\n");
    }
}
