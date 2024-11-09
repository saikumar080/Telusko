// ----Learning about Classes and Object.
// TO create an Objects first we need to create a class name as Calculator
//A class can contain variables and methods

class Calculator{
    int a;//creating a Variable;
    public int add(int n1,int n2){//creating a  return method.
        int result=n1+n2;
        return result;
    }
}

public class Demo {
    public static void main(String a[]){
        System.out.println("Hello World");
        int num1=4;
        int num2=5;
    
        //creating an Object.
        //👉1. Calculaor--->>>>✨1.this is call u need to create object of it.
        //                      ✨2.THis is class Name
        
        //👉2.    clac----->>>>✨This is the reference Variable and it's similar like num1,and num2.

        //👉3.    new----->>>>>✨1.To create an object we need to use new Keyword for it.
        //                       ✨2. new keyword consume new space;
        
        //👉4.calculator()--->>> ✨How much Memory it consume it can be done by Calculator();  
        Calculator clac=new Calculator();
        //here I am calling method with .notation
        int result=clac.add(num1,num2);
        System.out.println(result);
       
    }
    
}
