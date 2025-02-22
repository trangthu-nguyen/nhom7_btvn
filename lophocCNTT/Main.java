package lophocCNTT;

public class Main {
	    public static void main(String[] args) {
	        School school = new School();

	        // Thêm các lớp học
	        school.addClass("CS101");
	        school.addClass("CS102");

	        // Thêm sinh viên vào các lớp
	        Student student1 = new Student("Nguyen", "Thi Trang", "2003-02-07", "Namdinh", "CS101");
	        student1.setGrade("Lap trinh huong doi tuong", 95);
	        student1.setGrade("Quan ly du an", 85);
	        student1.setGrade("Hoc may", 90);
	        student1.setGrade("CSDL", 92);
	        student1.setGrade("Lap trinh UD cho TBDD", 88);

	        Student student2 = new Student("Truong", "Thi Ngoc Anh", "2004-03-16", "Hanoi", "CS101");
	        student2.setGrade("Lap trinh huong doi tuong", 75);
	        student2.setGrade("Quan ly du an", 65);
	        student2.setGrade("Hoc may", 70);
	        student2.setGrade("CSDL", 72);
	        student2.setGrade("Lap trinh UD cho TBDD", 68);
	        
	        Student student3 = new Student("Nguyen", "Thi Ngoc Anh", "2004-03-10", "Bacninh", "CS102");
	        student2.setGrade("Lap trinh huong doi tuong", 80);
	        student2.setGrade("Quan ly du an", 55);
	        student2.setGrade("Hoc may", 90);
	        student2.setGrade("CSDL", 82);
	        student2.setGrade("Lap trinh UD cho TBDD", 78);

	        school.addStudentToClass("CS101", student1);
	        school.addStudentToClass("CS101", student2);
	        school.addStudentToClass("CS102", student3);


	        // Hien thi danh sach cac lop CS101
	        school.displayClasses();

	        // Hiển thị danh sách sinh viên trong lớp CS101
	        System.out.println("\nDanh sách sinh viên trong lớp CS101:");
	        school.displayStudentsInClass("CS101");

	        // Hiển thị tổng kết số người theo rank trong lớp CS101
	        System.out.println("\nTổng kết số người theo rank trong lớp CS101:");
	        school.displayRankSummary("CS101");
	        

	        // Hiển thị danh sách sinh viên trong lớp CS101
	        System.out.println("\nDanh sách sinh viên trong lớp CS102:");
	        school.displayStudentsInClass("CS102");

	        // Hiển thị tổng kết số người theo rank trong lớp CS101
	        System.out.println("\nTổng kết số người theo rank trong lớp CS102:");
	        school.displayRankSummary("CS102");
	    }
}
