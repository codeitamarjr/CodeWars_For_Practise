### Square
You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

Task
Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will always use some integral number, so don't worry about that in dynamic typed languages.

### Summation
Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.

For example:

summation(2) -> 3
1 + 2

summation(8) -> 36
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8

Answer:GrassHopper

### Sum
Given two integers a and b, which can be positive or negative, find the sum of all the integers between including them too and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples
GetSum(1, 0) == 1   // 1 + 0 = 1

GetSum(1, 2) == 3   // 1 + 2 = 3

GetSum(0, 1) == 1   // 0 + 1 = 1

GetSum(1, 1) == 1   // 1 Since both are same

GetSum(-1, 0) == -1 // -1 + 0 = -1

GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2

### IntEqualityPrinter

Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".


        EXAMPLES OF INPUT/OUTPUT:

* printEqual(1, 1, 1); should print text All numbers are equal

* printEqual(1, 1, 2); should print text Neither all are equal or different

* printEqual(-1, -1, -1); should print text Invalid Value

* printEqual(1, 2, 3); should print text All numbers are different


TIP: Be extremely careful about spaces in the printed message.


NOTES

* The solution will not be accepted if there are extra spaces.

* The method printEqual needs to be defined as public static like we have been doing so far in the course.

* Do not add main method to solution code.