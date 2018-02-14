/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ham;

public class NewClass extends Ham {
   public static void main(String args[]){
    Ham[] food = { new Spam(),
 new Yam(),
 new Ham()};
for (int i = 0;
i < food.length; i++) {
 System.out.println(food[i]);
 food[i].a();
 food[i].b();
 System.out.println(food[i].a);
System.out.println(food[i].b);
} 

   }}
