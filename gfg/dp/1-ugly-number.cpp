/*
 * naive brute force for ugly numbers
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. 
 * By convention, 1 is included.
 * Given a number n, the task is to find n’th Ugly number.
 * */

/* approach 1*/

// include libraries
#include <stdio.h>
#include <stdlib.h>

/* This function divides a by greatest divisible power of b*/
int maxDivide(int a, int b)
{
    // function to help divide by
    // 2,3 and 5
    while ( a%b == 0 )
        a = a/b;
    return a;
}


int isUgly(int no)
{
    no = maxDivide(no,2);
    no = maxDivide(no,3);
    no = maxDivide(no,4);

    // if number divides perfectly,
    // then we can send back true boolean
    return (no == 0) ? 1 : 0;
}

int getNthUglyNo(int n)
{
    int i = 1;
    int count = 1;

    while (n > count)
    {
        i++;
        if (isUgly(i))
            count++;
    }
    return i;
}

int main()
{
    // unsigned without any specifications means integer
    unsigned no = getNthUglyNo(150);
    printf("150th ugly no. is %d");
    getchar();
    return 0;
}

/*** approach 2 ****/

#include <bits/stdc++.h>
using namespace std;
/*
    using dynamic programming we can generate 
    a sequence of ugly numbers so using the 
    factors that are to be taken into account
    2,3,5
*/

unsigned getNthUglyNo(unsigned n)
{
    // table to store sequence of ugly numbers
    unsigned ugly[n];
    
    // important variables for the program
    unsigned i2 = 0, i3 = 0, i5 = 0;
    
    unsigned next_multiple_of_2 = 2;
    unsigned next_multiple_of_3 = 3;
    unsigned next_multiple_of_5 = 5;
    
    unsigned next_ugly_no = 1;
    
    ugly[0] = 1;
    
    for ( int i = 1; i < n; i++)
    {
        next_ugly_no = min(next_multiple_of_2,
                        min(next_multiple_of_3,
                        next_multiple_of_5));
        ugly[i] = next_ugly_no;
        
        if (next_ugly_no == next_multiple_of_2)
        {
            i2 = i2+1;
            next_multiple_of_2 = ugly[i2]*2;
        }
        
        if (next_ugly_no == next_multiple_of_3)
        {
            i3 = i3+1;
            next_multiple_of_3 = ugly[i3]*3;
        }
        
        if (next_ugly_no == next_multiple_of_5)
        {
            i5 = i5+1;
            next_multiple_of_5 = ugly[i5]*5;
        }
    }
    return next_ugly_no;
}


int main()
{
    unsigned n;
    cin >> n;
    cout << getNthUglyNo(n);
    return 0;
}
