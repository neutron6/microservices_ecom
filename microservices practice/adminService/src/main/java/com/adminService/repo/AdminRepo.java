package com.adminService.repo;

import com.adminService.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

    public Admin findByAdminId(int adminId);
}
