package com.zhao.test;

import com.zhao.mapper.SpecilMapper;
import com.zhao.po.Specli;
import com.zhao.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        SqlSession sqlSessionA = MybatisUtils.getSqlSession(false);
        int pageNum=1;
        int pageSize=5;
        int start=(pageNum-1)*pageSize;
        String colName="spilinfoname";
        String keyword="技术";

        Map<String, Object> map=new HashMap<>();
        map.put("start",start);
        map.put("pageSize",pageSize);
        map.put("keyword",keyword);

        SpecilMapper specilMapper=sqlSessionA.getMapper(SpecilMapper.class);
        List<Specli> specliList = specilMapper.findAllSplit4(map);
        for (Specli specli : specliList){
            System.out.println(specli);
        }
    }
}