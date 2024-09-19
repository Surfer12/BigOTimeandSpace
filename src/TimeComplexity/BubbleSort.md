## Quadratic Time Complexity (O(n^2))

### Definition and Examples

Quadratic time complexity, denoted as O(n^2), occurs when the time required to complete an algorithm is proportional to the square of the size of the input data set. This typically happens in algorithms that involve nested loops where each loop iterates over the input data.

#### Example: Bubble Sort

Bubble Sort is a classic example of an algorithm with O(n^2) time complexity. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

```python
def bubble_sort(array):
    n = len(array)
    for i in range(n):
        for j in range(0, n-i-1):
            if array[j] > array[j+1]:
                array[j], array[j+1] = array[j+1], array[j]  # Swap elements
    return array
```

In this example:
- The outer loop runs `n` times.
- The inner loop runs `n-i-1` times for each iteration of the outer loop.
- Therefore, the total number of comparisons is proportional to `n * (n-1) / 2`, which simplifies to O(n^2).

### Use Cases

Quadratic time complexity is often seen in algorithms that involve nested loops, where each loop iterates over the input data. Some common scenarios include:

1. **Sorting Algorithms**: Besides Bubble Sort, other sorting algorithms like Insertion Sort and Selection Sort also have O(n^2) time complexity in their worst-case scenarios.
2. **Matrix Operations**: Operations involving matrices, such as matrix multiplication, can exhibit quadratic time complexity.
3. **Graph Algorithms**: Certain graph algorithms, especially those involving adjacency matrices, can have quadratic time complexity.

### Practical Considerations

While O(n^2) algorithms are straightforward to implement and understand, they are generally inefficient for large data sets. In real-world applications, more efficient algorithms (e.g., O(n log n) sorting algorithms like Quick Sort or Merge Sort) are preferred for handling large inputs.

### Conclusion

Understanding quadratic time complexity is crucial for recognizing the limitations of certain algorithms and making informed decisions about which algorithms to use in different scenarios. While O(n^2) algorithms are often simple and easy to implement, they may not be suitable for large data sets due to their inefficiency.