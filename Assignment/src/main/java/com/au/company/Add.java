/**
 * 
 */
package com.au.company;

/**
 * @author varun.f.verma
 *
 */
public class Add implements Operation {

	@Override
	public double doOperation(double leftOperand, double rightOperand) {
		return leftOperand + rightOperand;
	}

}
