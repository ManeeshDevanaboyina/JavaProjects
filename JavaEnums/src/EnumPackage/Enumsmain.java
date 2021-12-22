/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumPackage;

/**
 *
 * @author Maneesh Devanaboyina
 */
public class Enumsmain {

        enum Cost{
            SWEET(182),RICE(451),YOGHURT(112),MEAT(278);
            
            private int cost;

        private Cost(int cost) {
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
           
        }
    
        
    public static void main(String[] args) {
        
        int a=0;
        float count=0;
        int b=0;
        int c=1000;
        for(Cost i:Cost.values()){
            
            a=a+i.getCost();
            
            
           count++;
           
           if(b<i.getCost()){
               b=i.getCost();}    
           if(c>i.getCost())
               c=i.getCost();
        }
        
        System.out.println(a);
       
        double avg;
        avg=(a/count);
              
        System.out.println(avg);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}
