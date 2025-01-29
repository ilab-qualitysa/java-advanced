package Chapter8.UserExceptions;

public class StudentRunner {
    public static void main(String[] args) {
        try {
            Student st = new Student("38323648", "Tumelo", 74, 65, 88, 75);
            System.out.println(st.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
