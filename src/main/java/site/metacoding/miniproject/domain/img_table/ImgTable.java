package site.metacoding.miniproject.domain.img_table;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ImgTable {
    private String imgPath;
    private String imgName;
    private String name;
}
