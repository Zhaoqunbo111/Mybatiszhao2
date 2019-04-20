package com.zhao.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Specli implements Serializable {
 private int sid;
 private int did;
 private String scode;
 private String sname;
 private String saim;
 private String sprodire;

 @Override
 public String toString() {
  return "Specli{" +
          "sid=" + sid +
          ", did=" + did +
          ", scode='" + scode + '\'' +
          ", sname='" + sname + '\'' +
          ", saim='" + saim + '\'' +
          ", sprodire='" + sprodire + '\'' +
          '}';
 }
}
