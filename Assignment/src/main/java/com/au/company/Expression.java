package com.au.company;

import java.util.HashMap;
import java.util.Map;

import com.au.company.Add;
import com.au.company.Divide;
import com.au.company.Multiply;
import com.au.company.OperationEnum;
import com.au.company.Subtract;

/**
 * @author varun.f.verma
 *
 */
public class Expression {
	private Map<String, Operation> operationMap = new HashMap<>();
	Expression() {
		   operationMap.put(OperationEnum.Add.getOperation(), new Add());
	        operationMap.put(OperationEnum.Subtract.getOperation(), new Subtract());
	        operationMap.put(OperationEnum.Multiply.getOperation(), new Multiply());
	        operationMap.put(OperationEnum.Divide.getOperation(), new Divide());
	      }

    double doCalculation(double operand1, double operand2, String operation) {
            Operation operationMapValue = null;
            if (operationMap.containsKey(operation)) {
                operationMapValue = operationMap.get(operation);
                
            } else {
                System.out.println("Invalid Operation");
                System.exit(1);
            }
            return operationMapValue.doOperation(operand1, operand2);

    }

}
