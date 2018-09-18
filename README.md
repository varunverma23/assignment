<h1>Calculator</h1>

About the Project


The main class in the project is Calculator.java which accepts command line arguments in the form of  Operand Operation Operand.

There is a test file called ExpressionTest.java which covers the test cases for the basic arithmetic operations.

Download the project and go to Assignment Folder

a) If you don’t have maven then follow the below steps. 

From the Assignment folder

    1. mkdir target
    2. mkdir target/classes
    3.  javac -d target/classes src/main/java/com/au/company/*.java
    4.  cd target/classes/
    5.  Run using below commands 
        1. java com.au.company.Calculator 900 - 120
        2. java com.au.company.Calculator 900 - 20
        3. java com.au.company.Calculator 900 "*" 20
        4. java com.au.company.Calculator 900 / 20

b) If you have maven then follow the below steps to run the program.

	From the Assignment folder
    1.  mvn clean install
    2. cd target/classes/
    3. Run using below commands
        1. java com.au.company.Calculator 900 + 22
        2. java com.au.company.Calculator 900 - 120
        3. java com.au.company.Calculator 900 / 20
        4. java com.au.company.Calculator 900 "*" 20

Assumptions -
1. The program accepts only 3 arguments at present. If the arguments are not equal to 3 then it will provide the Error message to the user to provide the correct input.
2. The program can be extended in future to accepts 2 arguments for trigonometric function.
3. The program check the operand against regex [0-9]+[.]?[0-9]* 
4. Only 4 functions are allowed at present (+,-,*,/)
5. The JDK version used for the program is 1.8
6. For * operation to work in shell env, pass the operation as ' * ' or " * " as shell will perform file name expansion if you pass * directly.
7. Divide by zero returns Infinity. This can be handled in Divide.java if the requirement ask for a proper error message.

		if ( rightOperand == 0 ) {
			System.out.println("You can't divide by zero");
			System.exit(0);
		}

	
