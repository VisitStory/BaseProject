package com.company.appname.app.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserSimpleDTO {

    @ApiModelProperty(notes = "User identifier")
    private Long id;

    @ApiModelProperty(notes = "The name of the user")
    private String name;

}
