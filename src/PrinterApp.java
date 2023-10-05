
public class PrinterApp {

	public static void main(String[] args) {
		// Print "Printer App"
		System.out.println("Printer App");

		//Provide the name of the creator of the Printer App.
		String creator = "Hongqian Li";
		System.out.println("This app is made by: " + creator);
		
		//Declare two numeric variables named number1 and number2
		int number1 = 5;
		int number2 = 2;
		
		//Print the Value of number1
		System.out.println(number1);
		
		//Print "The value of number1 is 5"
		System.out.println("The value of number1 is " + number1);
		
		//Print "The value of number2 is 2"
		System.out.println("The value of number2 is " + number2);
		
		//Declare an integer variable called multiplication
		int multiplication;
		
		//Multiply number1 and number2 and assign the result to the multiplication variable.
		multiplication = number1 * number2;
		
		//Print "[number1] * [number2] = [multiplication]".
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        
        //Repeat multiplication for addition, division and substraction.
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int division = number1/number2; 
        
        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " / " + number2 + " = " + division);
        
		
	}

}
