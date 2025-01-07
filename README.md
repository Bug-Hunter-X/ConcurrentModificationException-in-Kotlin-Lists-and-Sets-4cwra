# ConcurrentModificationException in Kotlin Collections
This example showcases the ConcurrentModificationException that can occur when modifying a mutable list or set while iterating over it using a traditional for loop.  The `removeIf` function provides a safe alternative.

## Bug
The `bug.kt` file demonstrates the issue.  Attempting to remove elements from `list2` while iterating causes the exception.

## Solution
The `bugSolution.kt` file shows how to safely remove elements using the `removeIf` function. This approach avoids the ConcurrentModificationException.

## How to Run
1. Save the code in `bug.kt` and `bugSolution.kt` files.
2. Compile and run using a Kotlin compiler (e.g., Kotlin/JVM).
