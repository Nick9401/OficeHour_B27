package day02_07_06_2022;

public class bmi {
    public static void main(String[] args) {


        	/*    ( Scanner Class can be used )


							BMI (Body Mass Index): Program will ask user to enter their mass (kilogram) and their height (meters).
							Calculate their BMI and then print the appropriate message based on the provided values:
								All numbers taken as doubles

								—> BMI Formula: BMI = mass / height^2
								—> Values:

									Less than 18.5 — Underweight
									From 18.5 to 25 — Normal weight
									From 25 to 30 — Overweight
									More than or equal to 30 — Obese

								 	Output :  Underweigth    or    Normal weight    or   etc.

        	 */

        double mass = 60;
        double height = 160;
        double BMI = (mass / height * height);

        if (BMI <= 18.5) {
            System.out.println("Underweight"+  BMI);

        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("Normal weight"+  BMI);

        } else if (BMI >= 25 && BMI <= 30) {
            System.out.println("Overweight"+  BMI);

        } else if (BMI >= 30){
            System.out.println("Obose" + " \n"+  BMI);
            {


            }

        }}}





