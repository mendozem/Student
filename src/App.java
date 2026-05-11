import content.Student;

public class App {
    public static void main(String[] args) {
        Student one = new Student();

        one.setName("Peter");
        one.setId(1);

        Student two = new Student();
        two.setName("John");
        two.setId(2);

        Student [] list = new Student[2];
        list[0] = one;
        list[1] = two;

        for(int i = 0;i<list.length;i++){
            System.out.println(list[i].getName() + ", " + list[i].getId());
        }

    }
}
