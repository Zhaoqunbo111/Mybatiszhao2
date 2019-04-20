package com.zhao.mapper;

import com.zhao.po.Specli;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecilMapper  {
     Specli findSpecliByID(int id);

     Specli findSpecliByID2(int id);

     List<Specli> findAllSplit2(@Param("start") int start,@Param("pageSize") int pageSize);

     List<Specli> findAllSplit3(Map<String,Object>map);

     List<Specli> findAllSplit4(Map<String,Object>map);
}
