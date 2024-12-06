package com.company;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = new int [] {2, 3, 4, 6, 3, 2, 7};

        for (int i=0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++) {
                if (arr[i]==arr[j] ) {
                    System.out.println("duplicates elements are: " + arr[j]);
                }
            }
        }
    }


}

   /* public static void main(String[] args) {
        // Declare and initialize a string array 'my_array'.
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        // Iterate through the elements of the string array.
        for (int i = 0; i < my_array.length; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                // Check if two string elements are equal and not the same element.
                if ((my_array[i]==(my_array[j])) && (i!=j)) {
                    // If a duplicate is found, print the duplicate element.
                    System.out.println("Duplicate Element is : " + my_array[j]);
                }
            }
        }
    }
}
*/
