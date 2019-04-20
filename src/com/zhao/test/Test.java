package com.zhao.test;

import com.zhao.mapper.SpecilMapper;
import com.zhao.po.Specli;
import com.zhao.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSessionA = MybatisUtils.getSqlSession(false);
        SpecilMapper specilMapper = sqlSessionA.getMapper(SpecilMapper.class);
        Specli specli = specilMapper.findSpecliByID(1);
        System.out.println(specli);
        System.out.println("*****************************");

        SqlSession sqlSessionB = MybatisUtils.getSqlSession(false);
        SpecilMapper specilMapperA = sqlSessionB.getMapper(SpecilMapper.class);
        Specli specliA = specilMapperA.findSpecliByID(1);
        System.out.println(specliA);
    }
}