package lophocCNTT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class SchoolClass {
	private String classCode;
    private List<Student> students;

    public SchoolClass(String classCode) {
        this.classCode = classCode;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public Map<String, Integer> rankStudents() {
        Map<String, Integer> ranks = new HashMap<>();
        ranks.put("A", 0);
        ranks.put("B", 0);
        ranks.put("C", 0);
        ranks.put("D", 0);
        ranks.put("<D", 0);

        for (Student student : students) {
            double avgGrade = student.getGrades().values().stream().mapToInt(Integer::intValue).average().orElse(0);
            if (avgGrade >= 90) {
                ranks.put("A", ranks.get("A") + 1);
            } else if (avgGrade >= 80) {
                ranks.put("B", ranks.get("B") + 1);
            } else if (avgGrade >= 70) {
                ranks.put("C", ranks.get("C") + 1);
            } else if (avgGrade >= 60) {
                ranks.put("D", ranks.get("D") + 1);
            } else {
                ranks.put("<D", ranks.get("<D") + 1);
            }
        }
        return ranks;
    }
    @Override
    public String toString() {
        return classCode + " - " + students.size() + " students";
    }

    public List<Student> getStudents() {
        return students;
    }
}