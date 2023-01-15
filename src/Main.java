
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emre Hoca", "505", "MAT");
        Teacher t2 = new Teacher("Enes Hoca", "312", "FZK");
        Teacher t3 = new Teacher("Hoca", "555", "KMY");

        Course mat = new Course("Matematik", "MAT", "MAT101");
        Course fizik = new Course("Fizik", "FZK", "FZK101");
        Course kimya = new Course("Kimya", "KMY", "KMY101");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        mat.printTeacher();
    }
}