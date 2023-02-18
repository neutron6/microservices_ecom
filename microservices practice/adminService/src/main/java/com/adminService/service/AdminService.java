package com.adminService.service;

import com.adminService.dao.AdminDao;
import com.adminService.entity.Admin;
import com.adminService.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    AdminDao adminDaoImpl;

    public Admin saveData(Admin admin) {
        return adminDaoImpl.saveData(admin);
    }

    public Admin validate(int adminId, String adminPass) {
        return adminDaoImpl.validate(adminId, adminPass);
    }


    public RestTemplateVO getDataByAdminId(int adminId) {
        return adminDaoImpl.getDataByAdminId(adminId);
    }
}
