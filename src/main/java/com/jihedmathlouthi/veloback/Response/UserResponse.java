package com.jihedmathlouthi.veloback.Response;

import com.jihedmathlouthi.veloback.Entity.User;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private User user;
    private Boolean followedByAuthUser;
}