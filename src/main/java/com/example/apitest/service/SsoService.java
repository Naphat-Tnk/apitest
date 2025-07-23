package com.example.apitest.service;

import com.example.apitest.Entity.SsoUser;
import com.example.apitest.Repository.SsoUserRepo;
import com.example.apitest.model.SsoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.View;
import java.time.LocalDateTime;
import java.util.Date;

@Service
public class SsoService {
    @Autowired
    private SsoUserRepo ssoRepo;

    public ResponseEntity <SsoResponse> post(SsoUser user) {
//        return ssoRepo.save(user);
        try {
            if (user.getRequestDate() == null) { //เช็คเพื่อไม่มี
                user.setRequestDate(new Date());
            }
            SsoUser saved = ssoRepo.save(user);

            SsoResponse.ResponseData data = new SsoResponse.ResponseData();
            data.setUserId(saved.getUserId());     // Userid()
            data.setToken(saved.getTokenId());     //Tokenid()

            if (data.getUserId() == null || data.getToken() == null) {
                SsoResponse error = new SsoResponse();
                error.setResponseMessage("ข้อมูลไม่ครบถ้วน");
                error.setResponseData(null);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
            }
            SsoResponse succes = new SsoResponse();
            succes.setResponseCode("I07000");
            succes.setResponseMessage("ทำรายการเรียบร้อย");
            succes.setResponseData(data);

            return ResponseEntity.ok(succes);

        } catch (Exception e) {
            SsoResponse response = new SsoResponse();
            response.setResponseCode("E50000");
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
            response.setResponseData(null);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}
