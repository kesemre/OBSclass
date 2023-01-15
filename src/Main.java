
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


        Student s1 = new Student("ENES",1,"111",mat,fizik,kimya);
        s1.addBulkExamNote(50,50,50);
        s1.addSozluNote(60,60,60);
        s1.calcAvarage();
        System.out.println(s1.avarage);
        s1.isPass();
    }
}