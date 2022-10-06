package site.metacoding.miniproject.domain.resume;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Resume {
	private Integer resumeId;
	private Integer personId;
	private MultipartFile photo;
	private String introduction;
	private String myCloud;
	private Timestamp createdAt;
}
