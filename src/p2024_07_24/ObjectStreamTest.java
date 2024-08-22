package p2024_07_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class PersonInformation implements Serializable {
	private String name;
	private int age;
	private String address;
	private String telephone;
	
	public PersonInformation(String name, int age, String address, String telephone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}
}

public class ObjectStreamTest {
	
	PersonInformation gemini;
	PersonInformation johnharu;
	Date d;
	
	public ObjectStreamTest() {		// 3개의 객체를 생성
		gemini = new PersonInformation("gemini", 10, "seoul", "02-321-3234");
		johnharu = new PersonInformation("johnharu", 20, "seoul", "02-473-4232");
		d = new Date();
	}
	
	public void writeObjectFile() {
		try {
			FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(gemini);
			oos.writeObject(johnharu);
			oos.writeObject(d);
			
			fos.close();
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void readObjectFile() {
		try {
			FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = null;
			while((o = ois.readObject()) != null) {
//				if(변수 instanceof 클래스명)
//				: 변수가 이 클래스의 instance인지 아닌지를 체크함
				if(o instanceof PersonInformation) {
					System.out.print(((PersonInformation)o).getName() + " : ");
					System.out.print(((PersonInformation)o).getAge() + " : ");
					System.out.print(((PersonInformation)o).getAddress() + " : ");
					System.out.print(((PersonInformation)o).getTelephone());
					System.out.println();
				}else {
					System.out.println(o.toString());
					}
				}
				fis.close();
				ois.close();
			}catch(Exception e) {
				e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
			ObjectStreamTest ost = new ObjectStreamTest();
			ost.writeObjectFile();
			ost.readObjectFile();
	}

}
