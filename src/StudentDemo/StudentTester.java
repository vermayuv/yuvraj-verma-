/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDemo;

/**
 *
 * @author yuvra
 */
public class StudentTester {
    public static void main(String arg[]){
        StudentDemo s1 = new StudentDemo();
        s1.setName("yuvraj");
        System.out.println(s1.getName());
       /* StudentDemo s2 = new StudentDemo("verma");
        StudentDemo s3 = new StudentDemo("yuvraj");
        System.out.println(s2.getName());
        StudentDemo[] list = new StudentDemo[3];
        list[0] =s1;
        list[1]= s2;
        list[2] = s3;
        for(StudentDemo i:list){
            System.out.println(i.getName());
            
        }*/
        s1.setSid("991549287");
        System.out.print(s1.getSid());
        System.out.prinln("testing Fetch");
    }
}
