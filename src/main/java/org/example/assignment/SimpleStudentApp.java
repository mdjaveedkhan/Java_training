import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.print("Enter your height (in cm): ");
    double heightInCm = scanner.nextDouble();
    System.out.print("Enter your weight: ");
    float weight = scanner.nextFloat();
    System.out.print("Enter your gpa: ");
    double gpa = scanner.nextDouble();
    double heightInMeters = heightInCm / 100;
    double bmi = weight / (heightInMeters * heightInMeters);
    String bmiCategory;
    if (bmi < 18.5) {
        bmiCategory = "Underweight";
    } else if (bmi < 25) {
        bmiCategory = "Normal";
    } else if (bmi < 30) {
        bmiCategory = "Overweight";
    } else {
        bmiCategory = "Obese";
    }
    System.out.println("\nSample output:-");
    System.out.println("Your name is " + name);
    System.out.printf("Your BMI is %.2f (%s)%n", bmi, bmiCategory);
    if (age < 18) {
        System.out.println("You are a Minor");
    } else {
        System.out.println("Your are Adult");
    }
    String result = (gpa >= 2.5) ? "Pass" : "Fail";
    System.out.println("Result " + result);

    scanner.close();
}
