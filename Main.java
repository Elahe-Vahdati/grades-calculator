import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("نام دانشجو را وارد کنید: ");
        student.setName(scanner.nextLine());

        double[] nums = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("نمره " + (i + 1) + " را وارد کنید: ");
            nums[i] = scanner.nextDouble();
        }

        student.setNumbers(nums);

        System.out.println("نام دانشجو: " + student.getName());
        System.out.println("مجموع نمرات: " + student.sum());
        System.out.println("میانگین نمرات: " + student.average());
        System.out.println("بیشترین نمره: " + student.max());
        System.out.println("کمترین نمره: " + student.min());

        if (student.isPassed()) {
            System.out.println("وضعیت: قبول");
        } else {
            System.out.println("وضعیت: مردود");
        }
    }
}
