package site.metacoding.miniproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.service.PersonService;

@RequiredArgsConstructor
@Controller
public class PersonController {

    private final PersonService personService;

    // 이미지 업로드 페이지
    @GetMapping("/test")
    public String imgInPut() {
        return "test";
    }

    // 이미지 불러와서 출력할 페이지
    @GetMapping("/test2")
    public String imgOutput(Model model) {
        String fileName = personService.download("main2.jpg");
        model.addAttribute("name", fileName);
        return "test2";
    }

    // 이미지 로컬에 업로드할 메서드
    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception {
        personService.upload(file);
        return "redirect:/test";
    }
}