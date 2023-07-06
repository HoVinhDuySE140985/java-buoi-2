import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BaiTap8 {
    public static class Student{
        String sbd;
        String ho;
        String ten;
        LocalDate ngaySinh;
        public String getSbd() {
            return sbd;
        }
        public void setSbd(String sbd) {
            this.sbd = sbd;
        }
        public String getHo() {
            return ho;
        }
        public void setHo(String ho) {
            this.ho = ho;
        }
        public String getTen() {
            return ten;
        }
        public void setTen(String ten) {
            this.ten = ten;
        }
        public LocalDate getNgaySinh() {
            return ngaySinh;
        }
        public void setNgaySinh(LocalDate ngaySinh) {
            this.ngaySinh = ngaySinh;
        }
        public Student(){}
        public Student(String sbd, String ho, String ten, LocalDate ngaySinh) {
            this.sbd = sbd;
            this.ho = ho;
            this.ten = ten;
            this.ngaySinh = ngaySinh;
        }
    }

    public static class Subject{
        String maMon;
        String tenMon;
        Float  dtb;
        Float diemThi;

        public Subject(){}
        public Subject(String maMon, String tenMon, Float dtb, Float diemThi) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.dtb = dtb;
            this.diemThi = diemThi;
        }

        public String getMaMon() {
            return maMon;
        }
        public void setMaMon(String maMon) {
            this.maMon = maMon;
        }
        public String getTenMon() {
            return tenMon;
        }
        public void setTenMon(String tenMon) {
            this.tenMon = tenMon;
        }
        public Float getDtb() {
            return dtb;
        }
        public void setDtb(Float dtb) {
            this.dtb = dtb;
        }
        public Float getDiemThi() {
            return diemThi;
        }
        public void setDiemThi(Float diemThi) {
            this.diemThi = diemThi;
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Map<Integer,List<Subject>> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        float totalScore = 0;
        float dtb = 0;
        for(int i=1;i<=3;i++ ){
            System.out.println("-----------------------Nhap Thong Tin Thi Sinh So " + i+"--------------------");
            Student st = new Student();
            System.out.println("Nhap So Bao Danh");
            st.setSbd(input.next());
            System.out.println("Nhap Ho");
            st.setHo(input.next());
            System.out.println("Nhap Ten");
            st.setTen(input.next());
            System.out.println("Nhap Ngay Sinh");
            st.setNgaySinh(LocalDate.parse(input.next()));
            students.add(st);
            List<Subject> sub = new ArrayList<>();
            for(int j =1;j<=3;j++){
                System.out.println("--------Nhap Thong Tin Mon So "+j+"--------");
                Subject s = new Subject();
                System.out.println("Nhap Ma Mon :");
                s.setMaMon(input.next());
                System.out.println("Nhap Ten Mon :");
                s.setTenMon(input.next());
                System.out.println("Nhap Diem Thi :");
                s.setDiemThi(input.nextFloat());
                sub.add(s);
                map.put(i, sub);
            }
        }
        input.close();
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-20s%-20s%-20s%-20s%-20s\n","SBD","Ho","Ten","Ngay Sinh","Ma Mon","Ten Mon", "Diem Thi");
        System.out.printf("\n");
        for(int i=0;i<=students.size()-1;i++){
            List<Subject> list = new ArrayList<>();
            list = map.get(i+1);
            for (Subject s : list) {
                dtb += s.diemThi;
                System.out.printf("%-10s%-10s%-20s%-20s%-20s%-20s%-20.2f\n",students.get(i).sbd,students.get(i).ho,students.get(i).ten,students.get(i).ngaySinh,s.maMon,s.tenMon,s.diemThi);
            }
            System.out.printf("\n");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("Tong Diem Trung Binh 3 Thi Sinh = %.2f",totalScore += dtb/3);
    }
}