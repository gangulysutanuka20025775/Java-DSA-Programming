import java.util.Scanner;

class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your address:");
        String address = scanner.nextLine();

        System.out.println("Enter your phone number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your email address:");
        String email = scanner.nextLine();

        System.out.println("Enter your work experience (e.g. \"Software Engineer at Google, 2018-present\"):");
        String workExperience = scanner.nextLine();

        System.out.println("Enter your education (e.g. \"Bachelor of Science in Computer Science, University of XYZ, 2014-2018\"):");
        String education = scanner.nextLine();

        System.out.println("Enter your skills (e.g. \"Java, Python, C++, SQL\"):");
        String skills = scanner.nextLine();

        System.out.println("\nHere is your resume:");
        System.out.println(name);
        System.out.println(address);
        System.out.println(phoneNumber);
        System.out.println(email);
        System.out.println("Work Experience:");
        System.out.println(workExperience);
        System.out.println("Education:");
        System.out.println(education);
        System.out.println("Skills:");
        System.out.println(skills);
    }
}