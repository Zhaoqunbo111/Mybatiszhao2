package com.zhao.test;

import com.zhao.mapper.SpecilMapper;
import com.zhao.po.Specli;
import com.zhao.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        SqlSession sqlSessionA = MybatisUtils.getSqlSession(false);
        int pageNum=1;
        int pageSize=5;
        int start=(pageNum-1)*pageSize;



        SpecilMapper specilMapper=sqlSessionA.getMapper(SpecilMapper.class);
        List<Specli> specliList = specilMapper.findAllSplit2(start, pageSize);
        for (Specli specli : specliList){
            System.out.println(specli);
        }
    }
}