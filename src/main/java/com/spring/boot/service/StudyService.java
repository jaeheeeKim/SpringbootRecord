package com.spring.boot.service;

import com.spring.boot.dao.StudyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudyService {
    @Autowired
    StudyDao studyDao;

    public List<Map<Object, Object>> doStudyList() {
        List<Map<Object, Object>> list = new ArrayList<>();
        list = studyDao.doStudyList();
//        System.out.println(list.get(Integer.parseInt("KEY_ID")));
        return list;
    }
}
