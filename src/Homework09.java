/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

// ToDo 01:  Write an algorithm to solve the following problem
/*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?
    
*/

    public static int divisorCount(int n){
        int div = 1;
        for (int i = 2; i <= n; i++){
            if(n%i ==0 ){
                int exp = 0;
                while(n % i == 0){
                    exp++;
                    n/=i;
                }
                div *= exp +1;
            }
        }
        return div;
    }

    public static void main(String[] args) {
        int n =1;
        int triangle = 1;
        while(divisorCount(triangle) <= 100){
            n++;
            triangle += n;
        }
        System.out.println(triangle);
    }
}