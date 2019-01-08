package xunn;
import java.io.Serializable;
public class Person implements Serializable{
	public Person(String name, String sex,int age) {
        this.age = age;
        this.name = name;
        this.sex = sex;
	}
	 private static final long serialVersionUID = -5809782578272943999L;
	public String name;
	public int age;
	public String sex;
	public static void say(){
		System.out.println("练习中。。。。");
	} 
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
}