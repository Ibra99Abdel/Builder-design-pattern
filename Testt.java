/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;


public class Testt {

    public static void main(String[] args) {
        Student std1=new Student();
        std1.setId(10);
        std1.setName("Ibrahim");
        std1.setGpa(3.2);
        
        Student std2 = new Student(20,"ibrahim",5,"ibra@");
        
        Student std3 = new Student();
        std3.withid(50).withname("ABE").withgpa(3.5).withEmail("A@ABE");
    }
      
    
}
