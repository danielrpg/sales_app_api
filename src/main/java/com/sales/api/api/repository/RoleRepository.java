package com.sales.api.api.repository;


import com.sales.api.api.domain.Role;
import com.sales.api.api.domain.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName (RoleName roleName);
}
