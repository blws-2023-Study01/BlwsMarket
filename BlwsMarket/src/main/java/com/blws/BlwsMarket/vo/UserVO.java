// package com.blws.vo;
package com.blws.BlwsMarket.vo; // Not sure which is the correct one.

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Collections;
// Above code is option. Not checked if they are needed
@AllArgsConstructor
@NoArgsConstructor
@Data

// public class UserVO {
//     private Long id;
//     private String email;
//     private String name;
//     private String address;
//     private String phoneNumber;

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getAddress() {
//         return address;
//     }

//     public void setAddress(String address) {
//         this.address = address;
//     }

//     public String getPhoneNumber() {
//         return phoneNumber;
//     }

//     public void setPhoneNumber(String phoneNumber) {
//         this.phoneNumber = phoneNumber;
//     }
// }
public class UserVo{
    private int userID;
    private String userName;
    private String userEmail;
    private Date userJoinDt;
    private String userPwd;
    private String userAuth;
    private String userPreferRegion;
}

{userId},#{userName},#{userEmail},#{userJoinDt},#{userPwd},#{userAuth},#{userPreferRegion}