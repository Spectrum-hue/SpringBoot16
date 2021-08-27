package com.aspringbootnow12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspringbootnow12.model.Favourites;



public interface FavouriteRepository extends JpaRepository<Favourites, Integer> {

	Favourites save(Favourites favourites);
	
}