# Chapter-4-Lab-1

**Lab Goal :** This lab was designed to teach you more about recursion.  

 

**Lab Description :** Take a number and recursively determine how many of its digits are even. Return the count of the even digits in each number. 

% might prove useful to take the number apart digit by digit

**Sample Data :**

4532

11145322

224532714 

2468 

13579 

**Sample Output :**

2

3

5

4

0

**_algorithm     help_**

if ( num is greater than zero )

if the digit is even

return     1 plus a call with remaining digits

return 0 plus a call with remaining     digits
