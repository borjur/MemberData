package springhibernate.model.dao;

import springhibernate.model.MemberTO;

import java.util.List;



public interface MemberDAO {
    public void addMember(MemberTO memberTO);

    public List<MemberTO> getAllMembers();
}
