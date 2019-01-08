package xunn;
import java.io.*;
import java.lang.reflect.*;
public class TestObj{
	public static void xlh(String xxx)throws FileNotFoundException, IOException,Exception{
		Class<?> a=Class.forName(xxx);
		Constructor constructor=a.getConstructor(String.class,String.class,int.class);
		Person person=(Person)constructor.newInstance("许鸿志","男",20);
		Method say=a.getDeclaredMethod("say",String.class);
		say.invoke(person,"许鸿志");
		File file=new File("D:/person.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oot=new ObjectOutputStream(fos);
		oot.writeObject(person);
		oot.close();
	}
	public static Person fxlh()throws  Exception, IOException{
		FileInputStream fis=new FileInputStream("D:/person.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Person person=(Person) ois.readObject();
		ois.close();
		return person;
	}
	public static void main(String[] ages)throws  Exception{
		// xlh("xunn.Person");
	 	Person p=fxlh();
		System.out.println(p.toString());
	}

}
class Person implements Serializable{
	public Person(String name, String sex,int age) {
        this.age = age;
        this.name = name;
        this.sex = sex;
	}
	 private static final long serialVersionUID = -580978257827294399L;
	public String name;
	public int age;
	public String sex;
	public String city;
	public static void say(String aa){
		System.out.println(aa+":练习中。。。。");
	} 
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city=city;
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

	 @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                "age=" + age +
                '}';
    }
}