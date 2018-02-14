package eightqueens;

import java.util.*;

public class Eightqueens {

public static int[][] chessbo(){
    int [][] chess= new int [8][8];
    
    for(int i=0;i<chess.length;i++){
       for(int j=0;j<chess[i].length;j++){
           if(j==0){
               chess[i][j]=0;
               
           }
           else{
               chess[i][j]=0;
           }
       }
    }
    return chess;
}     

public static boolean checkRule(int [][] a,int row,int column){
    //check row
    for(int i=0;i<column;i++){
        if(a[row][i]==8){
            return false;
        }
    }
//check diagonal from 00 to nn
    int i=row;
    int j=column;
while(i>=0&&j>=0){
    
    if(a[i][j]==8){
        return false;
    }
    i--;j--;
    
}
 i=row;
 j=column;

//check dia from 0,n to n,0
while(i<a.length&&j>=0){
    
    if(a[i][j]==8){
        return false;
    }
    i++;j--;
}

return true;
}



public static void toString(int[][] a){
     int[][] chess=a;
        for(int i=0;i<chess.length;i++){
       for(int j=0;j<chess[i].length;j++){
          System.out.print(chess[i][j]+"    ");
          
              }System.out.println();System.out.println();
}}

public static boolean putQueen(int queen,int [][]a){
    if(queen==8){
        return true;
    }
    
    for(int row=0;row<8;row++){
        if(checkRule(a,row,queen)){
            a[row][queen]=8;
        
    if (putQueen(queen+1,a)){
        return true;
    }

    a[row][queen]=0;
    }}


return false;}

    
       
    

    public static void main(String[] args) {
        int[][] chess=chessbo();
       
     
       if(putQueen(0,chess)){
          toString(chess);
       
        
    }
        else{
            System.out.println("Na");
     }

        }
    }

     
    

