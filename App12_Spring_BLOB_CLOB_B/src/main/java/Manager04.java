import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImp;

public class Manager04 {
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentDAOImp = (StudentDAOImp)ctx.getBean("studentJDBCTemplate");
		byte[] image = studentDAOImp.getImage("D:\\git\\Spring-Core\\App12_Spring_BLOB_CLOB_B\\drawing.jpg");
		
		System.out.println("image::"+image.length);
		studentDAOImp.updateImage(12, image);
		System.out.println("Done");
	}
}
