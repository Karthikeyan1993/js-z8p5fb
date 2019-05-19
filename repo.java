package com.db.TreeDemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface GovernanceRepository extends JpaRepository<Governance, Long> {

}
