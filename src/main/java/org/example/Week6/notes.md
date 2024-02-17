Time - 5th Feb - 11th Feb.

Topic 
- Time Complexity.
- ArrayList.
- Array Practice 1.
- Array Practice 2.
- Doubt Clearing Classes.



### Time Complexity.

When we do any program time complexity does not signofies the time taken for the program to run as it depends on the os, language and the input given.

- Time complexity is measured as the number of instruction performed. 
- Example. Sum of first 5 natural number. One way of doing it is `$\frac{n*(n+1)}{2}$` anotehr wauis using for loop and adding the value. 
- For n=5 the formula will work for one time and the loop will work for 5 time. So the first one is optimized. With for loop with more value of n time will grow more O(n) mean linear time complexity.
- The formula method is O(1) constant time.

| Notation | Value                                            |
|----------|--------------------------------------------------|
| Big O    | Upper Bound. Function cannot go more than this.  |
| Omega    | Lower Bound. Function cannot go less than this.  |
| Theta    | Exact.                                           |

In 1 sec nearly $2*10^{8}$ instruction can be done.

### Array Practice 1.

When we create and array of size 10 then when we insert the 11 element then the entire array get copied in an array of size 20. 

- When tha size of the array is 8 and the capacity if the array is 8 adding new element then copy the entire array to a new array. Time is O(N). So the time is O(16).

- We creaeda a new array of 2*cap size + cap (to add the element) = 3*cap. We have to do 3*N steps.

![img.png](img.png)

When there is a cap size we just insert element O(1) else it is $2^{i}$

{1+1+1+1+1+...1} + 3($2^{0} + 2^{1} + 2^{2} + 2^{3}...$)

The 3() val <= logN. 1+1...+1 <=N

= N + 3($2^{0}$ * $\frac{2^{logN}-1}{2-1}$)