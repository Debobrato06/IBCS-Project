package com.ibcs.tnl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsFeignClientDto {

    private String userMessage;

    private LeaveAppDto LeaveAppDto;

    private EmpDto empDto;

}
