package com.spring.springboot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FaceId : 8753304290262515713
 * FaceIdtype : 0
 * FaceCardid : 411111111111111111
 * AlarmType : 1
 * FaceGender : 1
 * GuardType :
 * SnapTime : 2018-01-03 16:12:41
 * SnapPicurl : http://192.168.10.15:8084/9222603332198072321/2018/01/03/16/0/IahrDir/1612418284001.jpg?fid=2176
 * FaceSamevalue : 8794
 * AlarmTime : 2018-01-03 16:12:41
 * FaceName : 胡阵波
 * FaceAge : 0
 * FacePlaction :
 * GuardReason :
 * FaceCountry : 中国
 * FaceBirthday : 2018-01-03
 * FacePicurl : http://192.168.10.15:8084/9222603332198072321/2018/01/03/16/1/IahrDir/1611485853501.jpg
 * GuardtaskId : 8753304290262515713
 * FaceCity : 未知
 * FacecamCode : HIC16_1
 * SnapfacePicurl : http://192.168.10.15:8084/9222603332198072321/2018/01/03/16/0/IahrDir/1612417584101.jpg?fid=2176
 * FaceProvince : 未知
 * FacelibId : 8753304290262515713
 * Id : 8753304290262515713
 * SnappicId : 8753304290262515732
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Info {
    private String FaceId;
    private int FaceIdtype;
    private String FaceCardid;
    private String AlarmType;
    private int FaceGender;
    private String GuardType;
    private String SnapTime;
    private String SnapPicurl;
    private int FaceSamevalue;
    private String AlarmTime;
    private String FaceName;
    private int FaceAge;
    private String FacePlaction;
    private String GuardReason;
    private String FaceCountry;
    private String FaceBirthday;
    private String FacePicurl;
    private String GuardtaskId;
    private String FaceCity;
    private String FacecamCode;
    private String SnapfacePicurl;
    private String FaceProvince;
    private String FacelibId;
    private String Id;
    private String SnappicId;
}
