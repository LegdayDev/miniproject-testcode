package site.metacoding.miniproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.service.PersonService;

@RequiredArgsConstructor
@Controller
public class PersonController {

    private final PersonService personService;

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception {
        personService.write(file);
        return "redirect:/test";
    }
}