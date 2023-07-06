import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap6 {
    public static class Student{
        String hoVaTen;
        LocalDate ngaySinh;
        String gioiTinh;
        float diemTB;
        String xldd;
        
        public Student(){

        }
        public Student(String hoVaTen, LocalDate ngaySinh, String gioiTinh, float diemTB, String xldd) {
            this.hoVaTen = hoVaTen;
            this.ngaySinh = ngaySinh;
            this.gioiTinh = gioiTinh;
            this.diemTB = diemTB;
            this.xldd = xldd;
        }

        public String getHoVaTen() {
            return hoVaTen;
        }
        public void setHoVaTen(String hoVaTen) {
            this.hoVaTen = hoVaTen;
        }
        public LocalDate getNgaySinh() {
            return ngaySinh;
        }
        public void setNgaySinh(LocalDate ngaySinh) {
            this.ngaySinh = ngaySinh;
        }
        public String getGioiTinh() {
            return gioiTinh;
        }
        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }
        public float getDiemTB() {
            return diemTB;
        }
        public void setDiemTB(float diemTB) {
            this.diemTB = diemTB;
        }
        public String getXldd() {
            return xldd;
        }
        public void setXldd(String xldd) {
            this.xldd = xldd;
        }
    }
    public static void main(String[] args) {
        int no = 0;
        Scanner input = new Scanner(System.in);
        List<Student> listStudents = new ArrayList<>();
        for(int i = 1; i<=3; i++){
            Student student = new Student();
            System.out.println("Nhap Ho Va Ten :");
            student.setHoVaTen(input.next());
            System.out.println("Nhap Ngay Sinh :");
            student.setNgaySinh(LocalDate.parse(input.next()));
            System.out.println("Nhap Gioi Tinh :");
            student.setGioiTinh(input.next());
            System.out.println("Nhap Diem Trung Binh :");
            student.setDiemTB(input.nextFloat());
            System.out.println("Nhap Xep Loai Dao Duc :");
            student.setXldd(input.next());
            listStudents.add(student);
        }
        input.close(); 
        System.out.printf("\n");
        System.out.printf("%-10s%-15s%-15s%-15s%-15s%s\n","STT ","Ho va Ten ","Ngay Sinh","Gioi TInh","DTB","XLDD");
        for (Student st : listStudents) {
            no = no +1;
            System.out.printf("%-10d%-15s%-15s%-15s%-15.2f%-15s\n", no, st.getHoVaTen(), st.getNgaySinh().toString(),st.getGioiTinh(),st.getDiemTB(),st.getXldd());
        }
        System.out.printf("\n");

    }
}
