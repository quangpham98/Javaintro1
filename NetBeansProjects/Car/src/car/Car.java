package car;
public class Car{
    public String make;
    public String model;
    public int year;
    public double MPG;
    public double milesDriven;
    public double fuelCapacity;
    public double fuelRemaining;
    
    
    
    


public Car(String a,String b,int c,int d,int e,int f){
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
    milesDriven+=m;
    fuelRemaining=fuelRemaining-m/MPG;
}
public double getFuelRemaining(){
    return fuelRemaining;
}

public String toString(){
    String a=make+" "+model+" "+year+" ";
   String b="Mile per galon:"+MPG;
String c="total mile driven:"+milesDriven;
    String d="fuelcapacity:"+fuelCapacity;
return(a+"\n"+b+"\n"+c+"\n"+d);
}




    
    public static void main(String[] args) {
        Car  carlist=new Car("Ford","Taurus",1998,12,50,100),new Car("Toyota","Corolla",2004,13,24,99),new Car("Subru","OutBack",2002,15,20,80)};
    for(int i=0;i<carlist.length;i++){
        carlist[i].drive(3.0);
        carlist[i].fillTank(5.0);
        System.out.println(carlist[i].toString());
        System.out.println("fuel remaining of car "+i+ " is "+carlist[i].fuelRemaining);
    }
    }
    
}
