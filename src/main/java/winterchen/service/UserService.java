package winterchen.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import winterchen.model.UserDomain;
@Service(value = "userService")
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
