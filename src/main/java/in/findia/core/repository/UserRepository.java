package in.findia.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.findia.core.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

 List<UserEntity> findByMobileNum(String mobileNum);
}
