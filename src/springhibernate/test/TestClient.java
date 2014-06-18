package springhibernate.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springhibernate.model.MemberTO;
import springhibernate.model.dao.MemberDAO;

import java.util.Date;
import java.util.List;



public class TestClient {
    public static void main(String args[]) {
        TestClient testClient = new TestClient();
        testClient.test();
    }

    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:context.xml");
        MemberDAO dao = (MemberDAO) context.getBean("MemberDAO");

        String username = "user" + System.currentTimeMillis();
        System.out.println("Created dummy user: '" + username + "'");

        MemberTO testMember = new MemberTO(username);
        testMember.setActive(true);
        testMember.setCity("Miami");
        testMember.setCountry("U.S.A");
        testMember.setEmail(username + "@something.com");
        testMember.setMemberSinceDate(new Date());
        testMember.setRegion("Region-1");
        testMember.setStreet("13th Street");
        testMember.setZipCode("55442");
        dao.addMember(testMember);
        System.out.println("Member added with ID: " + testMember.getId());

        List<MemberTO> allMembers = dao.getAllMembers();
        for (MemberTO memberTO : allMembers) {
            System.out.println(memberTO);
        }

    }

}
