## Quadratic Time Complexity (O(n^2))

### Definition and Examples

Quadratic time complexity, denoted as O(n^2), occurs when the time required to complete an algorithm is proportional to the square of the size of the input data set. This typically happens in algorithms that involve nested loops where each loop iterates over the input data.

#### Example: Bubble Sort

Bubble Sort is a classic example of an algorithm with O(n^2) time complexity. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

```java
public void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

In this example:
- The outer loop runs [`n`](command:_github.copilot.openSymbolFromReferences?%5B%22%22%2C%5B%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FE%3A%2FCis232Decoupled%2FBigOTimeandSpace%2Fsrc%2FTimeComplexity%2FBubbleSort.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A32%7D%7D%2C%7B%22uri%22%3A%7B%22scheme%22%3A%22file%22%2C%22authority%22%3A%22%22%2C%22path%22%3A%22%2FE%3A%2FCis232Decoupled%2FBigOTimeandSpace%2Fsrc%2FTimeComplexity%2FBubbleSort.md%22%2C%22query%22%3A%22%22%2C%22fragment%22%3A%22%22%7D%2C%22pos%22%3A%7B%22line%22%3A0%2C%22character%22%3A32%7D%7D%5D%2C%22a242cf70-81c7-487d-ac05-e62b5006608a%22%5D "Go to definition") times.
- The inner loop runs `n-i-1` times for each iteration of the outer loop.
- Therefore, the total number of comparisons is proportional to `n * (n-1) / 2`, which simplifies to O(n^2).

To illustrate the concept of Bubble Sort and its quadratic time complexity, we can create a step-by-step diagram showing how the algorithm processes a small array. Here is a simple diagram in Markdown using text-based representation:

### Bubble Sort Diagram

```
Initial Array: [5, 3, 8, 4, 2]

Pass 1:
[5, 3, 8, 4, 2] -> Compare 5 and 3, swap -> [3, 5, 8, 4, 2]
[3, 5, 8, 4, 2] -> Compare 5 and 8, no swap -> [3, 5, 8, 4, 2]
[3, 5, 8, 4, 2] -> Compare 8 and 4, swap -> [3, 5, 4, 8, 2]
[3, 5, 4, 8, 2] -> Compare 8 and 2, swap -> [3, 5, 4, 2, 8]

Pass 2:
[3, 5, 4, 2, 8] -> Compare 3 and 5, no swap -> [3, 5, 4, 2, 8]
[3, 5, 4, 2, 8] -> Compare 5 and 4, swap -> [3, 4, 5, 2, 8]
[3, 4, 5, 2, 8] -> Compare 5 and 2, swap -> [3, 4, 2, 5, 8]
[3, 4, 2, 5, 8] -> Compare 5 and 8, no swap -> [3, 4, 2, 5, 8]

Pass 3:
[3, 4, 2, 5, 8] -> Compare 3 and 4, no swap -> [3, 4, 2, 5, 8]
[3, 4, 2, 5, 8] -> Compare 4 and 2, swap -> [3, 2, 4, 5, 8]
[3, 2, 4, 5, 8] -> Compare 4 and 5, no swap -> [3, 2, 4, 5, 8]
[3, 2, 4, 5, 8] -> Compare 5 and 8, no swap -> [3, 2, 4, 5, 8]

Pass 4:
[3, 2, 4, 5, 8] -> Compare 3 and 2, swap -> [2, 3, 4, 5, 8]
[2, 3, 4, 5, 8] -> Compare 3 and 4, no swap -> [2, 3, 4, 5, 8]
[2, 3, 4, 5, 8] -> Compare 4 and 5, no swap -> [2, 3, 4, 5, 8]
[2, 3, 4, 5, 8] -> Compare 5 and 8, no swap -> [2, 3, 4, 5, 8]

Sorted Array: [2, 3, 4, 5, 8]
```

### Explanation

- **Pass 1**: The largest element (8) "bubbles" to the end of the array.
- **Pass 2**: The second largest element (5) "bubbles" to the second last position.
- **Pass 3**: The third largest element (4) "bubbles" to the third last position.
- **Pass 4**: The fourth largest element (3) "bubbles" to the fourth last position.

Each pass involves fewer comparisons as the largest elements are already sorted towards the end of the array. This demonstrates the quadratic time complexity O(n^2) due to the nested loops.

### Use Cases

Quadratic time complexity is often seen in algorithms that involve nested loops, where each loop iterates over the input data. Some common scenarios include:

1. **Sorting Algorithms**: Besides Bubble Sort, other sorting algorithms like Insertion Sort and Selection Sort also have O(n^2) time complexity in their worst-case scenarios.
2. **Matrix Operations**: Operations involving matrices, such as matrix multiplication, can exhibit quadratic time complexity.
3. **Graph Algorithms**: Certain graph algorithms, especially those involving adjacency matrices, can have quadratic time complexity.

### Practical Considerations

While O(n^2) algorithms are straightforward to implement and understand, they are generally inefficient for large data sets. In real-world applications, more efficient algorithms (e.g., O(n log n) sorting algorithms like Quick Sort or Merge Sort) are preferred for handling large inputs.

### Conclusion

Understanding quadratic time complexity is crucial for recognizing the limitations of certain algorithms and making informed decisions about which algorithms to use in different scenarios. While O(n^2) algorithms are often simple and easy to implement, they may not be suitable for large data sets due to their inefficiency.