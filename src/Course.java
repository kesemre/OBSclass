public class Course {
    Teacher courseTeacher;
    String name;
    String prefix;
    String code;
    int note;
    public Course(String name,String prefix,String code){
        this.name = name;
        this. prefix = prefix;
        this.code = code;
        this.note = 0;

    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        }
        else {
            System.out.println(t.name+" Akademisyen bu dersi veremez");
        }
    }

    public void printTeacher(){
        if (courseTeacher!=null){
            System.out.println(this.name+"Dersin akademisyeni"+this.courseTeacher);
        }
        else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
