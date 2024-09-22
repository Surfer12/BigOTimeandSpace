Potential changes to the comments of selection sort

Comments needing refinement

// throws an exception if the array is null or empty

While correct, it might be beneficial to elaborate slightly:
Suggested refinement: // Throws an IllegalArgumentException if the input array is null or empty, ensuring valid input for the sorting process.
The loop initialization and condition comments (// sets i as zero..., // sets j as i+1...)

These are a bit verbose and could be streamlined
Suggested refinement for i loop: // Outer loop: Iterates from the first element to the second-to-last element
Suggested refinement for j loop: // Inner loop: Iterates from the element after 'i' to the last element
Comments within the j loop

While generally accurate, they can be made more concise and focused
Suggested refinement for if (array[j] < array[minIndex]) { ... }:
// Update minIndex if a smaller element is found
// only triggers if a swap has occurred

This is accurate but could be more descriptive
Suggested refinement: // If a smaller element was found, swap it with the element at the current 'i' position
Comments within the swap block

These are a bit wordy and can be simplified
Suggested refinement for the three lines within the if (swapped) block
// Perform the swap using a temporary variable

Potential changes to the comments

// throws an exception if the array is null
This is accurate but could be expanded slightly for better context
Suggested refinement: // Throws an IllegalArgumentException if the input array is null or empty, ensuring valid input for sorting
Loop initialization and condition comments (// sets i as 1...)
These can be made more focused on the loop's purpose
Suggested refinement: // Outer loop: Iterates from the second element to the last, considering each as the 'key' to insert
Comments within the while loop
The existing comments are quite descriptive, but we can strive for even more clarity and brevity.
Suggested refinement for // A while loop is to run that will continue to run as long as...:
// Shift elements greater than 'key' one position to the right
// decrements j by 1, this serves to...
This comment is a bit verbose and can be simplified
Suggested refinement: // Move 'j' one position to the left
// The while continues until...
This comment is accurate but could be rephrased for better flow
Suggested refinement: // Continue shifting until the correct insertion point for 'key' is found

```java
public static void insertionSort(int[] anArray) {
    if (anArray == null || anArray.length == 0) {
        throw new IllegalArgumentException("Input array must not be null or empty"); 
    }

    int n = anArray.length; 

    // Outer loop: Iterates from the second element to the last, considering each as the 'key' to insert
    for (int i = 1; i < n; i++) { 
        int key = anArray[i]; 
        int j = i - 1; 

        // This code segment selects the current element to be inserted into the sorted subarray
        System.out.println("Insertion Sort - Key selected: " + key);

        // Shift elements greater than 'key' one position to the right
        while (j >= 0 && anArray[j] > key) { 
            anArray[j + 1] = anArray[j]; 
            // Move 'j' one position to the left
            j = j - 1; 

            System.out.println("Insertion Sort - Array after shifting: " + Arrays.toString(anArray));
        }

        // Continue shifting until the correct insertion point for 'key' is found
        anArray[j + 1] = key; 
        System.out.println("Insertion Sort - Array after inserting key: " + Arrays.toString(anArray));
    }
}
```

```java
public static void selectionSort(int[] array) {
    if (array == null || array.length == 0) {
        throw new IllegalArgumentException("Input array must not be null or empty"); 
    }

    int n = array.length; 

    // Outer loop: Iterates from the first element to the second-to-last element
    for (int i = 0; i < n - 1; i++) { 
        int minIndex = i;
        boolean swapped = false; 

        System.out.println("Selection Sort - Starting index: " + i);

        // Inner loop: Iterates from the element after 'i' to the last element
        for (int j = i + 1; j < n; j++) { 
            // Update minIndex if a smaller element is found
            if (array[j] < array[minIndex]) { 
                minIndex = j;
                swapped = true; 
            }

            System.out.println(
                    "Selection Sort - Current j: " + j + ", Current minIndex: " + minIndex + ", Current array: "
                            + Arrays.toString(array));
        }

        // If a smaller element was found, swap it with the element at the current 'i' position
        if (swapped) { 
            // Perform the swap using a temporary variable
            int temp = array[minIndex]; 
            array[minIndex] = array[i]; 
            array[i] = temp;

            System.out.println("Selection Sort - Swapped elements at indices " + i + " and " + minIndex + ": "
                    + Arrays.toString(array));
        }
    }
}
```