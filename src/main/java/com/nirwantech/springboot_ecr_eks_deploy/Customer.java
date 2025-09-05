package com.nirwantech.springboot_ecr_eks_deploy;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String email;

    private String gender;
}
