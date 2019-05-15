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
public class StudentDemo {
    private String name;
    private String sId;

    public StudentDemo(){
       name="";
       }
public StudentDemo(String n, String sId){
    this.name = n;
    this.sId = sId;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSid() {
        return sId;
    }
    public void setSid(String sId){
        this.sId = sId;
    }
    
}
