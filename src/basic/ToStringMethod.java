package basic;

public class ToStringMethod {
    static class Student {
        String name;
        int rollNo;
        float cgpa;

        public Student(String name, int rollNo, float cgpa) {
            this.name = name;
            this.rollNo = rollNo;
            this.cgpa = cgpa;
        }

        @Override
        public String toString() {

            return "Student Details: { name: " + name
                    + ", roll no: " + rollNo
                    + ", cgpa: " + cgpa
                    + " }";
        }

    }

    public static void main(String[] args) {
        Student st1 = new Student("Yash", 69, 9.27f);

        System.out.println(st1.toString());
    }
}