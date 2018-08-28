package testDataEstructures;

import dataEstructures.*;

public class TestStabilityString {
	
	public boolean stabilityString(String arg) {
		StackList<String> stack = new StackList<String>();
		if(arg == null) return false;
		if(arg == "") return true;
		for(int i = 0; i < arg.length(); i++) {
			if(arg.charAt(i) == '{' || arg.charAt(i) == '[' || arg.charAt(i) == '(') {
				stack.push(String.valueOf(arg.charAt(i)));
			}else if(arg.charAt(i) == '}' || arg.charAt(i) == ']' || arg.charAt(i) == ')') {
				String closer = String.valueOf(arg.charAt(i));
				String oppener = stack.pop();
				if((oppener != "(" && closer == ")") || oppener == null) {
					return false;
				}else if((oppener != "{" && closer == "}") || oppener == null) {
					return false;
				}else if((oppener != "[" && closer == "]") || oppener == null) {
					return false;
				}
			}
		}
		if(stack.getSize() != 0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		TestStabilityString test = new TestStabilityString();
		System.out.println(test.stabilityString("{[(a)]}"));
		System.out.println(test.stabilityString("{[(a)}"));
		System.out.println(test.stabilityString("[(a)]}"));
		System.out.println(test.stabilityString("{[(a]}"));
		System.out.println(test.stabilityString("{[a)]}"));
		System.out.println(test.stabilityString("{(a)]}"));
		System.out.println(test.stabilityString("{{[[(())]]}}"));
		System.out.println(test.stabilityString("[2fg9vbns((fab+b)*2)"));
		System.out.println(test.stabilityString("{[(])}"));
	}
}
