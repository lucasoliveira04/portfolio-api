package org.portfolio.portfolioapi.domain.repository;

import org.portfolio.portfolioapi.domain.model.UserModal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModal, UUID> {
}
