import java.util.*;
public class Function {
    // to create methods we need to create out of public static void main()

    //1.Make  a function to print myName
    public static String printMyName(String name){
        return name;
    }



    //--->>>> 2. Make a function to add 2 numbers and return the sum
    public static long calculateAdd(int num1,int num2){
        return num1+num2;
    }


    //----->>>>> 3. Make a function to multiply 2 numbers and return the product
    public static long multiply(int n1,int n2){
        return n1*n2;
    }



    //----->>>>>> 4.Find the factorial of a number <<<<<-------
    public static int factorial(int n1){
      
        //---1.Brute Force approach---
        if(n1== 0 || n1==1){
            return 1;
        }
        int cal=1;
        while(n1>1){
            cal*=n1;
            n1--;
        }
        return cal;
        
    }


    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey Methods!!!");

        //------>>>>>     1.getMyName()    <<<<<<-----
        System.out.println("Name:::");
        String name=sc.next();
        String getName=printMyName(name);
        System.out.println("My name is "+getName);


        //----->>>>>>    2.  add()   <<<<<-----
        System.out.println("Num1:::");
        int num1=sc.nextInt();
        System.out.println("num2:::");
        int num2=sc.nextInt();
        long add=calculateAdd(num1,num2);
        System.out.println("The sum of numbers is:::");
        System.out.println(add);


        //---->>>>>>> 3. multiply()    <<<<<<-------
        System.out.println("The product of two numbers is:::");
        long multiply=multiply(num1, num2);
        System.out.println(multiply);


        //----->>>>>>> 4.factorial()   <<<<------
        System.out.println("The factorial of a number is ::::");
        int factorial=factorial(num2);
        System.out.println(factorial);

    }
}
