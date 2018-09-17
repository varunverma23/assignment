package com.au.company;

import java.util.HashMap;
import java.util.Map;

public enum OperationEnum {
    Add("+"),
	Subtract("-"),
	Divide("/"),
	Multiply("*");
	
	
	
	private String operation;
	
	OperationEnum(String operation){
		this.operation = operation;
	}
	
	public String getOperation() {
        return operation;
    }
	
    private static final Map<String, OperationEnum> lookup = new HashMap<>();
  
    static
    {
        for(OperationEnum env : OperationEnum.values())
        {
            lookup.put(env.getOperation(), env);
        }
    }
  
    public static OperationEnum get(String operation)
    {
        return lookup.get(operation);
    }
}
