package site.metacoding.miniproject.domain.user;

import java.sql.Timestamp;

import lombok.Getter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class User {
	private Integer userId;
	private String username;
	private String password;
	private String role;
	private Timestamp createdAt;
}
