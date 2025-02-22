package lophocCNTT;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Student {
	private String firstName;
    private String lastName;
    private String birthdate;
    private String address;
    private String className;
    private Map<String, Integer> grades;
    public Student(String firstName, String lastName, String birthdate, String address, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.className = className;
        this.grades = new HashMap<>();
        grades.put("Lap trinh huong doi tuong", 0);
        grades.put("Quan ly du an", 0);
        grades.put("Hoa may", 0);
        grades.put("CSDL", 0);
        grades.put("Lap trinh UD cho TBDD", 0);
}


public void setGrade(String subject, int grade) {
    if (grades.containsKey(subject)) {
        grades.put(subject, grade);
    }
}

public Map<String, Integer> getGrades() {
    return grades;
}

public String getFullName() {
    return firstName + " " + lastName;
}

@Override
public String toString() {
    return firstName + " " + lastName + ", " + birthdate + ", " + address + ", " + className + ", " + grades.toString();
}
}
