import java.util.*;
public class Function {
    // to create methods we need to create out of public static void main()

    //1.Make  a function to print myName
    // public static String printMyName(String name){
    //     return name;
    // }



    //--->>>> 2. Make a function to add 2 numbers and return the sum
    // public static long calculateAdd(int num1,int num2){
    //     return num1+num2;
    // }






    //----->>>>> 3. Make a function to multiply 2 numbers and return the product
    // public static long multiply(int n1,int n2){
    //     return n1*n2;
    // }






    //----->>>>>> 4.Find the factorial of a number <<<<<-------
    // public static int factorial(int n1){
      
    //     //---1.Brute Force approach---
    //         // if(n1== 0 || n1==1){
    //         //     return 1;
    //         // }
    //         // int cal=1;
    //         // while(n1>1){
    //         //     cal*=n1;
    //         //     n1--;
    //         // }
    //         // return cal;

    //     //---2. optimal approach---
    //         // if(n1==0 || n1==1){
    //         //     return 1;
    //         // }
    //         // return n1*factorial(n1-1); 
        
    // }






    //========>>>>>>>>>>>>     Home Work Problems    <<<<<<<<<<<================
        //--------   1.Make  a function to check if a number is prime or not    --------
            //Brute Force Approach:-
            //Time complexity: O(n)
            //space complexity:O(1)

            // public static boolean checkPrime(int num) {
            //     if(num<=1){
            //         return false;
            //     };

            //      for(int i=2;i<num;i++){
            //         if(num%i ==0){
            //             return false;
            //         }
                
            //      }
            //      return true;

            // }

            //2.optimal approach
            //Time Complexity:- O(n);
            //Space Complexity:O(1);
            //Approach rather looping for n; we need to loop for n/2 only
            //    public static boolean checkPrime(int num) {
            //     if(num<=1){
            //         return false;
            //     };

            //      for(int i=2;i<num/2;i++){
            //         if(num%i ==0){
            //             return false;
            //         }
                
            //      }
            //      return true;

            // }

            // 3.Best optimal Approach
            //Time Complexity:- O(¬n);
            //space Complexity:- O(1)
            //here we loop for sqrt(n) only;
            // public static boolean checkPrime(int num) {
            //     if(num<=1){
            //         return false;
            //     };

            //      for(int i=2;i<Math.sqrt(num);i++){
            //         if(num%i ==0){
            //             return false;
            //         }
                
            //      }
            //      return true;

            // }

            //4.Most Optimized Method
            // 🌟Theory:- The algorithm can be improved further by observing that all primes are of the form 6k ± 1, with the exception of 2 and 3. 
            //          ✨This is because all integers can be expressed as (6k + i) for some integer k and for i = -1, 0, 1, 2, 3, or 4. 
            //          ✨Note:  👉2 divides (6k + 0), (6k + 2), (6k + 4).
            //                      👉3 divides (6k + 3).
            //          ✨So, a more efficient method is to test if n is divisible by 2 or 3, then to check through all the numbers of form 6k ± 1 ≤ √n. 
            //          ✨This approach is 3 times faster than testing all numbers up to √n.
            // Time Complexity:- O(¬n).
            // Space Complexity:- O(1).
            //code:-
            // public static boolean checkPrime(int num){
            //     //edge case:
            //     if(num<2){
            //         return false;
            //     }
            //     //for n=2 or n=3 it will check
            //     if(num==2 || num ==3){
            //         return true;
            //     }
            //     //For multiple of 2 or 3 this will check
            //     if(num%2==0 || num%3==0){
            //         return false;
            //     }

            //     //It will check all ohter Conditions
            //     for(int i=5;i<Math.sqrt(num);i=i+6){
            //         if(num%i ==0 || num%(i+2)==0){
            //             return false;
            //         }
            //     }
            //     return true;
            // }


            //5. optimal Approach:- similar to approaach:3
            //use count
            //Time complexity:-O(Math.sqrt(n));
            //Space Complexity:- O(1).
            public static boolean checkPrime(int num){
                if(num<2){
                    return false;
                }
                int count=0;
                for(int i=2;i<Math.sqrt(num);i++){
                    if(num%i==0){
                        count++;
                    }
                }
                if(count==0){
                    return true;
                }else{
                    return false;
                }
                
            }


        //-----------   2. Check a given number is Even or not-----
            public static String checkEven(int num){
                if(num %2==0){
                    return "Even";
                }else{
                    return "Odd";
                }
            } 






    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey Methods!!!");

        // //------>>>>>     1.getMyName()    <<<<<<-----
        // System.out.println("Name:::");
        // String name=sc.next();
        // String getName=printMyName(name);
        // System.out.println("My name is "+getName);


        // //----->>>>>>    2.  add()   <<<<<-----
        // System.out.println("Num1:::");
        // int num1=sc.nextInt();
        // System.out.println("num2:::");
        // int num2=sc.nextInt();
        // long add=calculateAdd(num1,num2);
        // System.out.println("The sum of numbers is:::");
        // System.out.println(add);


        // //---->>>>>>> 3. multiply()    <<<<<<-------
        // System.out.println("The product of two numbers is:::");
        // long multiply=multiply(num1, num2);
        // System.out.println(multiply);


        // //----->>>>>>> 4.factorial()   <<<<------
        // System.out.println("The factorial of a number is ::::");
        // int factorial=factorial(num2);
        // System.out.println(factorial);


        //======     Take Home   =======
        //1.Check prime
        System.out.println("Enter the number for prime::");
        int val=sc.nextInt();
        boolean isPrime=checkPrime(val);
        System.out.println(isPrime);


        //2.Check Even
        String isEven=checkEven(val);
        System.out.println(isEven);




    }
}
