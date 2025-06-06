package kr.ac.hansung.cse.hellospringdatajpa.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToProducts(Model model, Authentication authentication) {
        // 현재 사용자의 역할 가져오기
        String role = authentication.getAuthorities().iterator().next().getAuthority();
        model.addAttribute("userRole", role);  // 로그인한 사용자의 역할을 모델에 추가

        // /products로 리디렉션
        return "index"; // index.html로 리턴
    }
}
