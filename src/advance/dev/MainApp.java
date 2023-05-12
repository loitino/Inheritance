package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Person[] person = new Person[10];
		input(person);
		print(person);
		findTeacher(person);
		maxDTB(person);
	}

	private static void maxDTB(Person[] person) {
		// TODO Auto-generated method stub
		double max = 0;
		for (Person ps : person) {
			if (ps instanceof Student) {
				if (((Student) ps).diemTrungBinh() > max) {
					max = ((Student) ps).diemTrungBinh();
				}
			}
		}
		System.out.println("sinh vien co diem trung binh cao nhat" + max);
	}

	private static void findTeacher(Person[] person) {
		// TODO Auto-generated method stub
		double max = 0;
		for (Person ps : person) {
			if (ps instanceof Teacher) {
				if (((Teacher) ps).hamTinhLuong() > max) {
					max = ((Teacher) ps).hamTinhLuong();
				}
			}
		}
		System.out.println("giao vien co luong cao nhat" + max);
	}

	private static void print(Person[] person) {
		// TODO Auto-generated method stub
		for (Person ps : person) {
			System.out.println(ps.toString());
		}
	}

	private static void input(Person[] person) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < person.length; i++) {
			if (i < 4) {
				System.out.format("Teach[%d]", i);
				System.out.println("nhap ten");
				String ten = sc.next();
				System.out.println("nhap tuoi");
				int tuoi = sc.nextInt();
				System.out.println("nhap so dien thoai");
				String sdt = sc.next();
				System.out.println("nhap ma giao viên");
				String mgv = sc.next();
				System.out.println("nhap he so luong");
				double hsl = sc.nextDouble();

				person[i] = new Teacher(ten, tuoi, sdt, mgv, hsl);

			} else {
				System.out.format("Student[%d]", i);
				System.out.println("nhap ten");
				String ten = sc.next();
				System.out.println("nhap tuoi");
				int tuoi = sc.nextInt();
				System.out.println("nhap so dien thoai");
				String sdt = sc.next();
				System.out.println("nhap toan");
				float toan = sc.nextFloat();
				System.out.println("nhap ly");
				float ly = sc.nextFloat();
				System.out.println("nhap hoa");
				float hoa = sc.nextFloat();
				System.out.println("nhap ma sinh vien");
				String mxv = sc.next();
				System.out.println("nhap lop");
				String lop = sc.next();

				person[i] = new Student(sdt, tuoi, ten, toan, ly, hoa, mxv, lop);

			}
		}
	}

}
