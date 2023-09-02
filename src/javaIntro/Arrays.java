package javaIntro;

public class Arrays {
    /*
    Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
To declare an array, define the variable type with square brackets:
 String[] cars;

We have now declared a variable that holds an array of strings.
To insert values to it, you can place the values in a comma-separated list, inside curly braces:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

To create an array of integers, you could write:
int[] myNum = {10, 20, 30, 40};

You can access an array element by referring to the index number.
This statement accesses the value of the first element in cars:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars[0]);
// Outputs Volvo

 to find out the length:
System.out.println(cars.length);

to change the element in array:
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
cars[0] = "Opel";
System.out.println(cars[0]);
     */


    public static void main(String[] args) {

        String [] cars = {"Toyota", "Camry", "BMW", "Mazda", "Mercedes", "Ford"};

        //loop thru the array with for loop:
        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        //loop thru the array with for-each loop:
        for (String car: cars
             ) {
            System.out.println(car + " FOR EACH LOOP");
        }

        //MULTIDIMENSIONAL ARRAY
        //It is an array of arrays.
        /* Multidimensional arrays are useful when you want to store data as a tabular form,
        like a table with rows and columns.
        To create a two-dimensional array, add each array within its own set of curly braces:
      int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
         myNumbers is now an array with two arrays as its elements.
         To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array.
         This example accesses the third element (2) in the second array (1) of myNumbers:
         */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][0]);
        //to change the value of an element:
        myNumbers[1][2] = 9;

        //loop thru the multidimensional array:
        //We can also use a for loop inside another for loop
        // to get the elements of a two-dimensional array (we still have to point to the two indexes):

        System.out.println(myNumbers.length + " is number of arrays in  multi dim array");

        for (int i = 0; i < myNumbers.length; ++i){ //it will iterate until the number of arrays in multi-array will finish
            for (int j = 0; j < myNumbers[i].length; ++j){ //this one will go inside each array under index i
                System.out.println(myNumbers[i][j]); // this will print the first array's first element, etc
            }
        }


    }



}
