package site.metacoding.miniproject.domain.img_table;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ImgTable {
    private String imgPath;
    private String imgName;
}
