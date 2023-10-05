
public class PrinterApp {

	public static void main(String[] args) {
		// Print "Printer App"
		System.out.println("Printer App");

		//Provide the name of the creator of the Printer App.
		String creator = "Hongqian Li";
		
		//Move Variable Declarations to the Top
		int number1 = 5;
		int number2 = 2;
		int multiplication = number1 * number2;
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int division = number1/number2; 
		
        //Print the creator name of the App
		System.out.println("This app is made by: " + creator);
		//Print "The value of number1 is 5"
		System.out.println("The value of number1 is " + number1);
		
		//Print "The value of number2 is 2"
		System.out.println("The value of number2 is " + number2);
		
		//Print "[number1] * [number2] = [multiplication]".
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        
        //Repeat multiplication for addition, division and substraction.
        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " / " + number2 + " = " + division);
        
		
	}

}
