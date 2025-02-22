package lophocCNTT;
import java.util.HashMap;
import java.util.Map;
public class School {
		    private Map<String, SchoolClass> classes;

		    public School() {
		        classes = new HashMap<>();
		    }

		    public void addClass(String classCode) {
		        if (!classes.containsKey(classCode)) {
		            classes.put(classCode, new SchoolClass(classCode));
		        }
		    }

		    public void addStudentToClass(String classCode, Student student) {
		        if (classes.containsKey(classCode)) {
		            classes.get(classCode).addStudent(student);
		        }
		    }

		    public void displayClasses() {
		        classes.values().forEach(System.out::println);
		    }

		    public void displayStudentsInClass(String classCode) {
		        if (classes.containsKey(classCode)) {
		            classes.get(classCode).getStudents().forEach(System.out::println);
		        }
		    }

		    public void displayRankSummary(String classCode) {
		        if (classes.containsKey(classCode)) {
		            Map<String, Integer> ranks = classes.get(classCode).rankStudents();
		            ranks.forEach((rank, count) -> System.out.println("Rank " + rank + ": " + count + " students"));
		        }
		    }
}
