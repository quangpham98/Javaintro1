
package fraction;


public class Fraction {
    public int numerator;
    public int denominator;
 
    
public Fraction(int n,int d){
    if(d==0){
        throw new ArithmeticException();}
  
    int a=n;
    int b=d;
   int r=1;
   
   if(a%b==0 || b%a==0){
       if(a>b){
           a=a/b;
           b=b/b;}
       else{
          b=b/a;
       a=a/a;}
       
       n=a;
       d=b;}
   
   
   else{
   if (a>b){
    while(a%b!=0){
    
         r=a%b;
        a=b;
        b=r;
   
    }
   }
    
    else{
        while(b%a!=0){
    
         r=b%a;
        b=a;
        a=r;
        
        
    }}}
    
    
        
    
  
    
   
    
   d=d/r;
    n=n/r;
    numerator=n;
    denominator=d;
}

public int getNum(){;
return numerator;}


public int getDenom(){
    return denominator;
}

public void setNum(int n){
    numerator=n;
}

public void setDenum(int d){
    if(d==0){
        throw new ArithmeticException();}
    denominator=d;
}
public void reduce(){
    int a=numerator;
    int b=denominator;
    int r=1;
    
    if(a%b==0 || b%a==0){
       if(a>b){
           a=a/b;
           b=b/b;
        r=b;}
       else{
          b=b/a;
       a=a/a;
       r=a;}
    numerator=a;
    denominator=b;
    } 
    else{ 
    
    if (a>b){
    while(a%b!=0){
    
         r=a%b;
        a=b;
        b=r;
   
    }}
    
    else{
        while(b%a!=0){
    
         r=b%a;
        b=a;
        a=r;}}
        
    numerator=numerator/r;
    denominator=denominator/r;
        }

}

 
public boolean equals(Fraction a){
    double sum1=numerator*a.denominator;
    double sum2=denominator*a.numerator;
    if(sum1==sum2){
        return true;
    }
    return false;
}

public String toString(){
    return (numerator+"/"+denominator);
}
    
    






public Fraction add(Fraction a){
    int num=numerator*a.denominator+a.numerator*denominator;
    int denum=denominator*a.denominator;
    Fraction b= new Fraction(num,denum);
    b.reduce();
   return b;
   
    
}

    
    public static void main(String[] args) {
         Fraction q1=new Fraction(108,232);
         System.out.println(q1.toString());
        System.out.println(q1.getNum());
        System.out.println(q1.getDenom());
    
        q1.setNum(12);
    q1.setDenum(104);
    q1.reduce();
    System.out.println(q1.toString());
    
    q1=q1.add(new Fraction(10,26));
    System.out.println(q1.toString());
    Fraction q2=new Fraction(1,2);
    System.out.println(q1.equals(q2));
 Fraction q3=new Fraction(3,2);
 System.out.println(q1.equals(q3));
 
    }}