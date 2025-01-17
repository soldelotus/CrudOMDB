package com.example.omdb.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.omdb.demo.Model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film,Long> {

    Film findByTitleAndGener(String title, String gener);

}

