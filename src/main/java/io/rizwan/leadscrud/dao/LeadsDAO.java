package io.rizwan.leadscrud.dao;

import io.rizwan.leadscrud.entity.Leads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeadsDAO extends JpaRepository<Leads, Integer> {
    List<Leads> findAllByMobileNumber(String mobileNumber);
}
