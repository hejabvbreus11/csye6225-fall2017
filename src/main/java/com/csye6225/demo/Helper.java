package com.csye6225.demo;

import com.csye6225.demo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
>>>>>>> 146dc1cef02c29a0c0e32f34331f296f81540df4
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> upstream/master
import org.springframework.stereotype.Service;

@Service
public class Helper {

<<<<<<< HEAD
=======
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
>>>>>>> upstream/master

    @Autowired
    // This means to get the bean called userRepository which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;


    public User validateUserEmail(String email)
    {
        for(User user:userRepository.findAll())
        {
            if(user.getEmail().equals(email))
                return user;

        }
        return null;
    }



    public User validateUser(String email, String password)
    {
        for(User user:userRepository.findAll())
        {
<<<<<<< HEAD
<<<<<<< HEAD
            if((user.getEmail().equals(email)) && (user.getPassword().equals(password)))
=======
            if((user.getEmail().equals(email)) && (bCryptPasswordEncoder.matches(password,user.getPassword())))
>>>>>>> upstream/master
=======
            if((user.getEmail().equals(email)) && (bCryptPasswordEncoder.matches(password,user.getPassword())|| user.getPassword().equals(password)) )
>>>>>>> 146dc1cef02c29a0c0e32f34331f296f81540df4
                return user;

        }
        return null;
    }


}
