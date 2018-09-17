package com.au.company;

public class Calculator {
	public static void main(String[] args) {
		String operator = null;
		double firstNum = 0;
		double secondNum = 0;

		try {
			
			//Case when 3 command line arg are provided for basic arithmetic operation
			if(args.length == 3) {
				
				//Validate if first operand satisfy the regex
				if(Utils.validateInput(args[0])) {
					firstNum = Double.parseDouble(args[0]);
				}else {
					System.out.println("The Left Operand  you specifed is not valid input");
					System.exit(1);
				}

				//Validate if second operand satisfy the regex
				if(Utils.validateInput(args[2])) {
					secondNum = Double.parseDouble(args[2]);
				}else {
					System.out.println("The Right Operand  you specifed is not valid input");
					System.exit(1);
				}

				//validate the operator is already implemented
				if (null != OperationEnum.get(args[1]) ) {
					operator = args[1];
					Expression exp = new Expression();
					System.out.println(exp.doCalculation(firstNum, secondNum, operator));
				}
				else{
					System.out.println("The operation you specifed is not yet available");
					System.exit(1);
				}
			}
			/*Case when trigonometric functions are used
			else if(args.length == 2){
				
			}*/
			else {
				System.out.println("Please specify correct input");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
