package studio9;

import java.util.HashMap;
import java.util.Map;
import assignment7.Student;

public class UniversityDatabase {
    private final Map<String, Student> studentsMap;

    public UniversityDatabase() {
        studentsMap = new HashMap<>();
    }

    public void addStudent(String accountName, Student student) {
        studentsMap.put(accountName, student);
    }

    public int getStudentCount() {
        return studentsMap.size();
    }

    public String lookupFullName(String accountName) {
        Student student = studentsMap.get(accountName);
        return student == null ? null : student.getFullName();
    }

    public double getTotalBearBucks() {
        double totalBearBucks = 0.0;
        for (Student student : studentsMap.values()) {
            totalBearBucks += student.getBearBucksBalance();
        }
        return totalBearBucks;
    }
}
