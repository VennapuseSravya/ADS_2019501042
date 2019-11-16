import java.util.Arrays;
class Student implements Comparable <Student>{
    int name;
    int age;
    Student(int a,int b){
        this.name=a;
        this.age=b;
    }

    public int compareTo(Student a){
        if(this.name > a.name){
            return 1;
        }else if(this.name<a.name){
            return -1;
        }else{
            if(this.age < a.age){
                return 1;
            }else if(this.age > a.age){
                return -1;
            }
            else{
                return 0;
            }
        }
        
    }
}   
public class comparable {    
    

    public static void main(String args[]) {
        Student obj1=new Student(1,9);
        Student obj2=new Student(1,10);
        Student obj3=new Student(6,9);
        Student[] a ={obj1,obj2,obj3};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].name+" ,"+a[i].age);

        }
       
        
    
        
        }   
        
        
        
      
    
      
    
}
// public  Card[] shuffle( Card[] cards) 
    // { 
          
    //     Random rand = new Random(); 
          
    //     for (int i = 0; i <cards.length; i++) 
    //     { 
    //         // Random for remaining positions. 
    //         int r = i + rand.nextInt(cards.length - i); 
              
    //          //swapping the elements 
    //          Card temp = cards[r]; 
    //          cards[r] = cards[i]; 
    //          cards[i] = temp; 
               
    //     } 
    //     return cards;
    // } 
