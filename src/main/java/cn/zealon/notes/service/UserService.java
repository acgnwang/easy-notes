package cn.zealon.notes.service;

import cn.zealon.notes.security.DefaultPasswordEncoder;
import cn.zealon.notes.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author: tangyl
 * @since: 2020/11/17
 */
@Service
public class UserService {

    @Autowired
    private DefaultPasswordEncoder defaultPasswordEncoder;

    public UserVO getUserByUserId(String userId){
        if (userId.equals("zealon")) {
            UserVO user = new UserVO();
            user.setUserId(userId);
            user.setPwdLock(0);
            user.setEnable(1);
            user.setUserName("便携笔记");
            user.setPassword(defaultPasswordEncoder.encode("pass"));
            return user;
        } else if (userId.equals("zealon2")) {
            UserVO user = new UserVO();
            user.setUserId(userId);
            user.setPwdLock(1);
            user.setEnable(1);
            user.setUserName("便携笔记2");
            user.setPassword(defaultPasswordEncoder.encode("pass"));
            return user;
        }
        return null;
    }
}