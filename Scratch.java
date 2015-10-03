public class Scratch {
	public static void main(String[] args) {
		System.out.println("There are "+args.length+" names");
		for(String nameArg : args) {
			String greeting = getGreeting(nameArg);					// getGreeting is a method that takes a String as an argument and returns a String
			System.out.println(greeting);
		}
		
		long sum = add(2, 3);										// methods can have more than one parameter, here we pass two ints and return their sum						
		System.out.println("2 + 3 == "+sum);
		
		int product = doubleIt(10, false);							// parameters to a method can be of different types
		System.out.println(product);
		product = doubleIt(10, true);
		System.out.println(product);
		
		System.out.println("9 + 1 == "+add(9, 1));					// method calls can be used "inline" rather than assigning their result to a variable
		
		long result = doubleIt(5, false) + add(2, 2);				// another example of using method calls where we might have used variables previously
		System.out.println("result is "+result);
		
		printGreeting("Bob");										// a method that has return type "void" does not have a return value
		
		System.out.println(isFive(3));								// a method's parameter types are independent of it's return type.
		System.out.println(isFive(5);								// the isFive method takes ints as parameters and returns a String
	}
	
	static String getGreeting(String name) {						// RETURN TYPE: String  |  NAME: getGreeting  |  PARAMETERS: name (type: String) 
		return "Hello "+name+"!";
	}
	
	static long add(int a, int b) {									// RETURN TYPE: long  |  NAME: add  |  PARAMETERS: a (type: int), b (type: int)
		int result = a + b;											// note that "result" is of type int and the return type of the method is of type long,
		return result;												// this is allowed because int is a compatible return type for long (see the section
	}																//"Type Conversion in Assignments" from Chapter 2 of "Java A Beginners Guide" for more on compatible types)
																	
																														
	static int doubleIt(int x, boolean makeNegative) {				// RETURN TYPE: int  |  NAME: doubleIt  |  PARAMETERS: x (type: int), makeNegative (type: boolean)
		int result = x * 2;
		if(makeNegative) {
			result *= -1;
		}
		return result;
	}
	
	static void printGreeting(String name) {						// RETURN TYPE: void  |  NAME: printGreeting  |  PARAMETERS: name (type: String)
		String greeting = getGreeting(name);						// Some methods are meant to do something other than return a value, in which case their return type is "void"
		System.out.println(greeting);
	}
	
	static String isFive(int x) {									// RETURN TYPE: String  |  NAME: isFive  |  PARAMETERS: x (type: int)
		if(x == 5) {
			return "is Five!";
		} else {
			return "is NOT Five.";
		}
	}
}