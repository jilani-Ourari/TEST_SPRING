package ourariJilani.example.ourariJilani.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ourariJilani.example.ourariJilani.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
