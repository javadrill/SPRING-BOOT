package in.tecmentor.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.tecmentor.jpa.model.User;

/**
 * Created by rajeevkumarsingh on 20/11/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
