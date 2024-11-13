//----=======>>>>>>>>    METHODS    <<<<<<<<<========------
//to create methods first we create a class inside a class we create methods
class Computer{
    public void playMusic(){
        System.out.println("Play Music...!!!!");
    }

    public String getMePen(int cost){
        if(cost>=10)
            return "pen";
    
            return "Nothing";
        
        
    }
}




//----=======>>>>>>>> Method Overloading    <<<<<========-------
//1.Here we are calling same method with different  no.of parameters.
//2.here we are calling same method with different type of parameters.
class Calculaor{
    public int add(int n1,int n2){
        return n1+n2;
    }
    //Here we are calling same method with different  no.of parameters.
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    //Here we are calling same method with different type of parameters.
    public double add(double n1,int n2){
        return n1+n2;
    }
}
public class Methods {
    public static void main(String a[]){
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getMePen(2);
        System.out.println(str);
        Calculaor calc=new Calculaor();
       int r1= calc.add(6,20);
        int r2=calc.add(3,4 , 1);
        double r3=calc.add(3.4, 0);
        System.out.println(r1 + " " + r2 + " " + r3);


    }
}
