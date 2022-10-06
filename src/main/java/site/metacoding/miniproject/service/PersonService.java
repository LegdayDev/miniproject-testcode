package site.metacoding.miniproject.service;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.domain.img_table.ImgTableDao;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final ImgTableDao imgTableDao;

    public void write(MultipartFile file) throws Exception {
        String projectPath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\files"; // 이미지 저장하 ㄹ경로

        UUID uuid = UUID.randomUUID(); // 랜덤으로 식별자 생성
        String fileName = uuid + "_" + file.getOriginalFilename();
        File saveFile = new File(projectPath, fileName);

        file.transferTo(saveFile);
        imgTableDao.insert(projectPath, fileName);
    }
}
