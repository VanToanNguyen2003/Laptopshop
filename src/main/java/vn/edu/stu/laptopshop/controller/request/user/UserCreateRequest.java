package vn.edu.stu.laptopshop.controller.request.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import vn.edu.stu.laptopshop.common.UserStatus;
import vn.edu.stu.laptopshop.common.UserType;

@Getter
@Setter
public class UserCreateRequest {
    @Email
    @NotBlank(message = "Email must be not blank")
    private String email;

    @NotBlank(message = "Password must be not blank")
    @Size(min = 6, message = "Password minimum 6 characters")
    private String password;

    @NotBlank(message = "FullName must be not blank")
    @Size(min = 3, message = "FullName minimum 3 characters")
    private String fullName;

    @Size(min = 10, message = "Phone minimum 10 characters")
    private String phone;

    @Size(min = 10, message = "Address minimum 10 characters")
    private String address;

    @NotNull(message = "UserStatus must not be null")
    private UserStatus status;

    @NotNull(message = "UserType must not be null")
    private UserType type;
}
