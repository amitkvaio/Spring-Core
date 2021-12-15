import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImpUsingPreparedStmt;

public class Manager09 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpUsingPreparedStmt daoImp = (StudentDAOImpUsingPreparedStmt) context.getBean("StudentDAOImpUsingPreparedStmt");
		daoImp.update(1, 24);
	}
}
