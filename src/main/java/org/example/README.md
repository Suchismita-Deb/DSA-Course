### Codeforces.

Practice - Generally target to solve A, B, C.

https://codeforces.com/contest/2125/problem/B

Max answer can be 2 = (1,1) and (1,0) or (0,1) any possible way one can reach 0,0.
The thing when it is 12, 18, 8 then directly I cant write 2 (0,6 and then all 1,1 to reach 0,0) as the max value can be 8. The number of times the value are taken not imp. Here 4,6 can be taken multiple times and the count of unique value is 1.

This example my first throught should be using gcd and if (12/2 = 4, 18/3 = 6) less than 8 then only 1 value. Teh point is coming to 0 by dividing then only 1.

https://codeforces.com/contest/2125/problem/A

Simple sort order does not matter. Proof by contradiction FFT and NTT I was thinking if there is FFT and NTT then just add T before the char. It will not work NTTT then swap TNTT and also another way for every NTT I can make TNT then it will not work for NTTA then TNTT. Simple reverse Sort.
