package com.adminService.controller;

import com.adminService.entity.Admin;
import com.adminService.service.AdminService;
import com.adminService.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<Admin> saveData(@RequestBody Admin admin) {
        return ResponseEntity.ok(adminServiceImpl.saveData(admin));
    }

    @GetMapping("/{adminId}/{adminName}")
    public ResponseEntity<Admin> validate(@PathVariable int adminId, String adminPass) {
        return ResponseEntity.ok(adminServiceImpl.validate(adminId, adminPass));
    }

    @GetMapping("/{adminId}")
    public ResponseEntity<RestTemplateVO> getDataByAdminId(@PathVariable int adminId) {
        return ResponseEntity.ok(adminServiceImpl.getDataByAdminId(adminId));
    }

}
