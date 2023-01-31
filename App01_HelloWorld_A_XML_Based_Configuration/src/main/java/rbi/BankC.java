
package rbi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BankC {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("beans.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		RBI sbi =  bf.getBean("bankId",RBI.class);
		sbi.rbiRules();
		System.out.println("===========================");

		 
		System.out.println("done");
	}
}

/*

Here Spring frame work as per requirement it create the object for our class.
supplying the data to the SFW , Storing the data to the object and it itself manage the
life of the bean object very effectively.

*/