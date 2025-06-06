package kr.ac.hansung.cse.hellospringdatajpa.controller;

import kr.ac.hansung.cse.hellospringdatajpa.entity.User;
import kr.ac.hansung.cse.hellospringdatajpa.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository; // UserRepository 사용

    // 관리자 페이지 (전체 사용자 목록)
    @GetMapping("/users")
    public String viewUserList(Model model) {
        List<User> users = userRepository.findAll(); // 모든 사용자 목록 가져오기
        model.addAttribute("users", users);
        return "user_list"; // 사용자 목록을 보여줄 HTML 페이지로 리턴
    }
}
