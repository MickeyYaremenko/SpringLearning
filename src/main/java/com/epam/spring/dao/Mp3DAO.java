package com.epam.spring.dao;

import com.epam.spring.bean.MP3;

import java.util.List;

public interface Mp3DAO {

    void insert(MP3 mp3);
    void delete(MP3 mp3);
    MP3 getByID(Integer id);
    List<MP3> getListByName(String name);
    List<MP3> getListByAuthor(String author);
}
