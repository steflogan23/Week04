import java.util.ArrayList;
import java.util.List;

public class week04 {

	public static void main(String[] args) {


//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8); 
		ages.add(28);
		ages.add(93);
		

//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println("#1A " + (ages.get(ages.size()-1) - ages.get(0)));
		
//b. Create a new array with 9 elements (one more than the ages array)  Repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		List<Integer> differentAges = new ArrayList<Integer>();
		differentAges.add(12);
		differentAges.add(25);
		differentAges.add(16);
		differentAges.add(35);
		differentAges.add(46);
		differentAges.add(19);
		differentAges.add(6);
		differentAges.add(91);
		differentAges.add(100);
			System.out.println("#1b " + (differentAges.get(differentAges.size()-1) - differentAges.get(0)));
			//copy and pasted sysout line and changed "ages" to "differentAges" from #1a
		
//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
int total = 0;
	for (Integer age : differentAges) {
		total += age;
	}
	System.out.println("#1c " + total / differentAges.size());
		
/*2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, 
	“Bob”.*/
	List<String> names = new ArrayList<String>();
	names.add("Sam");
	names.add("Tommy");
	names.add("Tim");
	names.add("Sally");
	names.add("Buck");
	names.add("Bob");
	
//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
int count = 0;
	for (String name : names) {
		count += name.length();
	}
	System.out.println("#2a " + count / names.size());
		//I tested this one a lot before I got it right. I got it to work first with just calculating the count on the characters before I added in the division to get the average
	
	
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
for (int i = 0; i < names.size(); i++) {
	String.join(names.get(0), names);
}
System.out.println("#2b " + names);
	


//3. How do you access the last element of any array?
  //		arrayName.get(arrayName.size()-1);

//4. How do you access the first element of any array?
  //		arrayName.get(0);


//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
ArrayList<Integer> nameLengths = new ArrayList<Integer>();
	for (String name : names) {
	nameLengths.add(name.length());
	}
	
	// just testing to make sure the arrayList populated System.out.println(nameLengths.get(1));
	System.out.println("#5 " + nameLengths);
	

	
	
	
//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
int sum = 0;
	for (Integer length1 : nameLengths) {
	sum += length1;
}
	System.out.println("#6 " + sum);
	
	
	
	
	//Testing out the methods written down below outside of main method
	System.out.println("#7 " + newWord("Hello", 5));
	System.out.println("#8 " + fullName("Dustin", "Logan"));
	System.out.println("#9 " + isGreaterThan(ages));
	
	
	
	//#10
	double[] array2 = new double[] {11.55, 15.55, 25.55, 80.22};;
	System.out.println("#10 " + average(array2));
	

	
	
	//#11
	
	double[] array3 = new double[] {52.33, 65.57, 72.25, 55.50, 65.75};
	System.out.println("#11 " + isAverageGreater(array2, array3));
	
	//#12
	System.out.println("#12 " + willBuyDrink(true, 11.50));
	
	
	//#13
	System.out.println("#13 " + concreteYardage(150, 85, .5));
	
	
	
	
	
	} //end main
	
	
//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
public static String newWord(String word, int n) {
	String newWord1 = "";	
	for (int i = 0; i <= n; i++) {
		newWord1 += word;
	}
		return newWord1; 
}

	
//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
public static String fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}

	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean isGreaterThan(List<Integer>ages)	{
	int sum =0;
	for (int i : ages) {
		sum += i;
	}
	if (sum  < 100)
		return true;
		else return false;
	}
				
			
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
public static double average(double array2[]) {
	 
	double newSum = 0;
	for (int i = 0; i < array2.length; i++) {
	 newSum += array2[i];
	
	}
	return newSum / array2.length;
}




	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

public static boolean isAverageGreater(double array2[], double array3[]) {
	double newSum1 = 0;
	double newSum2 = 0;

	{
	for (int i = 0; i < array2.length; i++) {
	newSum1 += array2[i];
	}
	
	for (int j = 0; j < array3.length; j++) {
		newSum2 += array3[j];}
	}
	if ((newSum1 / array2.length) > (newSum2 / array3.length)) 
		return true;
		else return false;

}		





	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
if (isHotOutside = true && moneyInPocket > 10.50)
	return true;
else return false;
}

	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		/*I have always worked in the construction industry and one of the biggest pain in the rear calculations is calculating
		 * square yards of concrete. I created a method that will do those calculations given the length, width, depth (basically the volume
		 * and then divide by 27 to get the square yards of concrete. I know this is a simple one but I couldn't think of anything creative 
		 * that actually solves a problem. 
		 */
public static double concreteYardage(double length, double width, double depth) {
	double cubicYards = (length*width*depth)/27;	
	return cubicYards;
	} {
	
}
	




}