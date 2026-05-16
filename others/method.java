public class method {

    public static String name(String name, String course) {
        return name + " " + course;
    }

    public static void main(String[] args) {

        String student = method.name("kuldeep", "btech");

        System.out.println(student);
    }
}
