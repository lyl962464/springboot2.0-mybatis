package winterchen.dao;

import winterchen.model.UserDomain;

import java.util.List;

public interface UserDao {
    /**
     * 添加用户的方法
     * @param record
     * @return
     */
    int insert(UserDomain record);

    /**
     * 查询用户的方法
     * @return
     */
    List<UserDomain> selectUsers();
}
