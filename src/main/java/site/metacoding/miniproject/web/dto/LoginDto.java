package site.metacoding.miniproject.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class LoginDto {
    private String username;
    private String password;
}

