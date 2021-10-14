package ai.ecma.apppaymesavingaccount.repository;

import ai.ecma.apppaymesavingaccount.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByPhoneNumber(String username);

    boolean existsByPhoneNumber(String username);
}
