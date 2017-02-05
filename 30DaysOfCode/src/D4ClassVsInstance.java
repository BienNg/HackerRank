<<<<<<< HEAD
import java.util.Scanner;

/**
 * Created by bien on 04.02.2017.
 */
public class D4ClassVsInstance {
    static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if(initialAge <0){
                System.out.println("Age is not valid, setting age to 0.");
            }else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            String answer = "";
            if(age < 13){
                answer = "You are young.";
            }else if( age >= 13 && age < 18){
                answer = "You are a teenager.";
            }else{
                answer = "You are old.";
            }
            System.out.println(answer);
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
=======
import java.util.Scanner;

/**
 * Created by bien on 04.02.2017.
 */
public class D4ClassVsInstance {
    static class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if(initialAge <0){
                System.out.println("Age is not valid, setting age to 0.");
            }else {
                age = initialAge;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            String answer = "";
            if(age < 13){
                answer = "You are young.";
            }else if( age >= 13 && age < 18){
                answer = "You are a teenager.";
            }else{
                answer = "You are old.";
            }
            System.out.println(answer);
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
>>>>>>> de67835432738b223a60ed52ea68212cc2094e5e