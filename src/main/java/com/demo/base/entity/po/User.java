package com.demo.base.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class User extends BaseEntity<Long> {

	private static final long serialVersionUID = -6525908145032868837L;

	private String username;
	private String password;
	@JsonIgnore
	private String salt;
	private String nickname;
	private String headImgUrl;
	private String phone;
	private String telephone;
	private String email;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private Integer sex;
	private Integer status;
	public interface Status {
		int DISABLED = 0;
		int VALID = 1;
		int LOCKED = 2;
	}

}
