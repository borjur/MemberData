package springhibernate.model.dao.hibernate;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import springhibernate.model.MemberTO;
import springhibernate.model.dao.MemberDAO;




public class MemberDAOImpl implements MemberDAO {
    private HibernateTemplate hibernateTemplate;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    public void addMember(MemberTO memberTO) {
        hibernateTemplate.saveOrUpdate(memberTO);
    }


    @SuppressWarnings("unchecked")
    public List<MemberTO> getAllMembers() {
        return hibernateTemplate.find("From MemberTO");
    }
}


