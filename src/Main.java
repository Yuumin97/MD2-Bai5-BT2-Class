public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Trước khi gán " + student);
        student.setName("Yuu");
        student.setClasses("hihi");
        System.out.println("Sau khi gán" +student);
    }
}