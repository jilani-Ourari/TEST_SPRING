package ourariJilani.example.ourariJilani.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ourariJilani.example.ourariJilani.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public int countByEmail(String email) {
        return userRepository.countByEmail(email);
    }
}
