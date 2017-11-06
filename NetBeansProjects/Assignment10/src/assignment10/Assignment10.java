
package assignment10;
public class Car{
    public String make;
    public String model;
    public int year;
    public double MPG;
    public double milesDriven;
    public double fuelCapacity;
    public double fuelRemaining;
    
    public double miledriven;
    
    


public Car(String a,String b,int c,double d,double e,double f){
     make=a;
     model=b;
     year=c;
     MPG=d;
    milesDriven=e;
    fuelCapacity=f;
   }

public void fillTank(double g){
    if((fuelRemaining+g)<fuelCapacity){
    fuelRemaining+=g;}
}

public void drive(double m){
    miledriven+=m;
    fuelRemaining=fuelRemaining-m/MPG;
}
public double getFuelRemaining(){
    return fuelRemaining;
}

public String toString(){
    String a=make+""+model+""+year+"";
   String b="Mile per galon:"+MPG;
String c="total mile driven:"+miledriven;
    String d="fuelcapacity:"+fuelCapacity+",fuelRemaining:"+fuelRemaining;
return(a+"\n"+b+"\n"+c+"\n"+d);
}


}
public class Assignment10 {


 
public static void main(String[] args) {
        
    }
    
}
