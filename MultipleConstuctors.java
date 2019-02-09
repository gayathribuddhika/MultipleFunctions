
package multipleconstuctors;


public class MultipleConstuctors {

    
    public static void main(String[] args) {
        NewClass obj1= new NewClass();
        NewClass obj2= new NewClass(4);
        NewClass obj3= new NewClass(4,26);
        NewClass obj4= new NewClass(4,26,48);
        
        System.out.printf("%s\n", obj1.toMilitory());
        System.out.printf("%s\n", obj2.toMilitory());
        System.out.printf("%s\n", obj3.toMilitory());
        System.out.printf("%s\n", obj4.toMilitory());
    }
    
}
