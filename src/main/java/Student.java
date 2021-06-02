
import java.io.Serializable;

public class Student implements Serializable{
    private int id , age,classNo;
    private String stuName,fName,phone,email;
    public Student(int id,String stuName,String fName,int age,String phone,String email,int classNo){
        this.id = id ;
        this.stuName = stuName;
        this.fName = fName;
        this.age = age ;
        this.phone = phone;
        this.email = email ;
        this.classNo = classNo;
    }
    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public int getClassno(){
        return this.classNo;
    }
    public String getName(){
        return this.stuName;
    }
    public String getFName(){
        return this.fName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    
    public void setId(int id){
        this.id = id ;
    }
    public void setClassno(int classno){
        this.classNo = classno ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public void setName(String name){
        this.stuName = name ;
    }
    public void setFName(String FName){
        this.fName = FName ;
    }
    public void setEmaill(String email){
        this.email = email ;
    }
    public void setPhone(String phone){
        this.phone = phone ;
    }
    
    
    
}
