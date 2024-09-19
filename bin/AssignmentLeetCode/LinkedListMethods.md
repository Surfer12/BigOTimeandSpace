 # Leet Code 206

## 206. Reverse Linked List

**Difficulty:** Easy

### Topics
- Linked List
- Recursion
- Iteration

### Companies
- [List of companies that ask this question]

### Problem Statement
Given the head of a singly linked list, reverse the list, and return the reversed list.

### Examples

#### Example 1:
**Input:** `head = [1,2,3,4,5]`  
**Output:** `[5,4,3,2,1]`

#### Example 2:
**Input:** `head = [1,2]`  
**Output:** `[2,1]`

#### Example 3:
**Input:** `head = []`  
**Output:** `[]`

### Constraints:
- The number of nodes in the list is in the range `[0, 5000]`.
- `-5000 <= Node.val <= 5000`

// LinkedList Methods and Descriptions

/**
 * Adds the specified element to the end of the list.
 * @param e the element to be added
 */
/* public boolean add(E e);

/**
 * Inserts the specified element at the specified position in the list.
 * @param index index at which the specified element is to be inserted
 * @param element element to be inserted
 */
public void add(int index, E element);

/**
 * Removes the first occurrence of the specified element from this list, if it is present.
 * @param e element to be removed from this list, if present
 * @return true if this list contained the specified element
 */
public boolean remove(Object e);

/**
 * Removes the element at the specified position in this list.
 * @param index the index of the element to be removed
 * @return the element that was removed from the list
 */
public E remove(int index);

/**
 * Returns the element at the specified position in this list.
 * @param index index of the element to return
 * @return the element at the specified position in this list
 */
public E get(int index);

/**
 * Returns the number of elements in this list.
 * @return the number of elements in this list
 */
public int size();

/**
 * Checks if the list is empty.
 * @return true if the list contains no elements
 */
public boolean isEmpty();

/**
 * Clears the list, removing all elements.
 */
public void clear();

/**
 * Returns a string representation of the list.
 * @return a string representation of the list
 */
public String toString();
```


### Follow Up:
A linked list can be reversed either iteratively or recursively. Could you implement both?