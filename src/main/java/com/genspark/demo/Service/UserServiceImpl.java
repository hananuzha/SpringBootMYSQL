package com.genspark.demo.Service;
import com.genspark.demo.Entity.User;
import com.genspark.demo.Repositary.UserRepository;
import com.genspark.demo.ServiceInterface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        Optional<User> user =this.userRepository.findById(id);
        if(user.isPresent())
            return user.get();
        else {
            throw new IllegalStateException("user with id " + id + "does  not exist");
        }
    }

    public User getUserLikeEmail(String like) {
        Optional<User> user =this.userRepository.findUserByLike(like);
        System.out.println("heeeeeeeee"+like);
        if(user.isPresent())
            return user.get();
        else {
            throw new IllegalStateException("user with like " + like + "does  not exist");
        }
    }

    @Override
    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public String deleteUser(int id) {
        this.userRepository.deleteById(id);
        return "deleted Successfully";    }
}
