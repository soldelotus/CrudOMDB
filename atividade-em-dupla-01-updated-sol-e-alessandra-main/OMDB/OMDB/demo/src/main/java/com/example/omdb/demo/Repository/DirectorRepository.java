package com.example.omdb.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.omdb.demo.Model.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {

    void deleteByName (String director);
    Director findByAge(int age);
    Director findByName (String director);
    Director findByNacionality(String nacionality);
    
}

