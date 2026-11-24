# Lab 6 – Homework

## A. Operation Complexity Analysis

**Question:** Complete the following table. Write the time complexity of each operation.

**Answer:**

| Operation | Singly Linked List | Doubly Linked List | Stack | Queue |
|---|---|---|---|---|
| Insert at beginning | O(1) | O(1) | O(1) | N/A |
| Insert at end | O(n) | O(1) | N/A | O(1) |
| Delete from beginning | O(1) | O(1) | O(1) | O(1) |
| Delete from end | O(n) | O(1) | N/A | N/A |
| Access the middle element | O(n) | O(n) | N/A | N/A |
| Search for a value | O(n) | O(n) | O(n)* | O(n)* |
| Peek at first/top element | O(1) | O(1) | O(1) | O(1) |

N/A = not a normal stack or queue operation.

\* Search is O(n) if we check the nodes one by one.

## B. Analyze the Following Scenarios

### Scenario 1

A system frequently inserts new elements at the beginning and deletes elements from the beginning.

**Question:** Which data structure would you choose?

**Answer:**

I would use a Singly Linked List. We can add and remove from the head.

**Question:** What is the complexity of both operations?

**Answer:**

Insertion is O(1) and deletion is O(1).

### Scenario 2

A music playlist allows users to move both forward and backward through songs. The system frequently removes the last song.

**Question:** Which data structure would you choose?

**Answer:**

Doubly Linked List.

**Question:** Why is a doubly linked list more suitable than a singly linked list?

**Answer:**

Because we have next and previous pointers. We can go forward and backward.

**Question:** What is the complexity of deleting the last element in each structure?

**Answer:**

Singly Linked List: O(n)

Doubly Linked List: O(1)

### Scenario 3

A printer receives printing requests. The first document submitted must be printed first.

**Question:** Which data structure should be used?

**Answer:**

Queue, because it uses FIFO.

**Question:** What are the complexities of insertion and deletion?

**Answer:**

Insertion is O(1) and deletion is O(1).

**Question:** Why would a stack be inappropriate?

**Answer:**

Because stack uses LIFO. The last document goes first.

## C. Analyze the Sequence

Consider a singly linked list:

`Head -> 10 -> 20 -> 30 -> 40 -> 50 -> null`

There is no tail pointer.

The following operations are performed sequentially:

1. Insert 5 at the beginning.
2. Insert 60 at the end.
3. Delete the node containing 30.
4. Search for 40.
5. Delete the last node.
6. Access the middle element.

**Question:** a. Determine the time complexity of each operation.

**Answer:**

| Operation | Time Complexity | Explanation |
|---|---|---|
| Insert 5 at the beginning | O(1) | We update the head. |
| Insert 60 at the end | O(n) | We find the last node. |
| Delete the node containing 30 | O(n) | We search for the node. |
| Search for 40 | O(n) | We check the nodes. |
| Delete the last node | O(n) | We find the node before the last node. |
| Access the middle element | O(n) | We go to the middle node. |

These are worst-case time complexities.

**Question:** b. Which operation requires traversing the list?

**Answer:**

All except operation 1.

**Question:** c. How would the complexity of deleting the last node change if this were a doubly linked list with both head and tail references?

**Answer:**

It becomes O(1) instead of O(n) because we have tail and prev.

**Question:** d. If the list contains 10,000 elements instead of 5, which operations become significantly more expensive?

**Answer:**

Operations 2, 3, 4, 5 and 6 take more time because they are O(n). Operation 1 is still O(1).
