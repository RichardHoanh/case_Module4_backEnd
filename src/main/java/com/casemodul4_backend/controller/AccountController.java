package com.casemodul4_backend.controller;

import com.casemodul4_backend.model.Account;
import com.casemodul4_backend.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    //Hiển thị tất cả user
    @GetMapping
    public List<Account> showAllUser() {
        return accountService.findAll();
    }

    //    Thêm user
    @PostMapping
    public void create(@RequestBody Account account) {
        accountService.save(account);
    }

    //    Hiển thị user muốn sửa
    @GetMapping("/{id}")
    public Account showEdit(@PathVariable int id) {
        return accountService.findById(id).get();
    }

    //    Sửa user
    @PutMapping("/{id}")
    public void saveEdit(@RequestBody Account account) {
        accountService.save(account);

    }

    //    Xóa user
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        accountService.delete(id);
    }


    @PostMapping("/upImg")
    public String upImg(@RequestParam MultipartFile fileImg) {
        String nameImg = fileImg.getOriginalFilename();
        try {
            FileCopyUtils.copy(fileImg.getBytes(), new File("I:\\CodeGym\\Module4\\CaseModule_4_Nhap\\FrontEnd\\Ban_Noi_That_FE\\Ban_Noi_That_FE\\images/" + nameImg));
            return "/images/" + nameImg;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
