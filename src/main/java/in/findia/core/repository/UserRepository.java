package in.findia.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.findia.core.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
