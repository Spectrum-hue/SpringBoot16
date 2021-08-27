package com.aspringbootnow12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspringbootnow12.model.Favourites;
import com.aspringbootnow12.repository.FavouriteRepository;



@RestController
public class FavouritesController {

    @Autowired
    private FavouriteRepository repository;
    // Important! read this link as an example ---> https://medium.com/@bhavyagupta1203/posting-form-data-from-reactjs-to-mysql-database-via-spring-boot-application-ea0c947c4b82
    // The idee with the requestmapping methods is to retrieve and post data to the database with the table called ('favourites').
    // The endpoints for this "@requestmapping" is '/api3/favourites' (see the servlet in the properties file)
    // This endpoints will be used in the Stocks.js file in the react app. In this component the twelve data AP
    // throws the information directly and externally to the Stocks react page.
    // What now needs to happen is that a second api and fetch method (or/and through axios) - the first being to account for the mentioned
    // twelve api
    // Thus n second fetch method is needed (starting at the compounddidmount() method in the Stocks.js file) when the user click on the "add to favourites" button (see the react Stocks page". The
    // app currently doesnt have that functionality to see if the back-end and front-end as well as the database interact with eachother. The second fetch method will have the endpoints
    // "/api3/favourites" inside the fetch method - fetch('/api3/favourites'). We are going to use fetch methods and text since the buttons in stocks.js dont work. Following is a example link 
    // although we are not using forms information on the Stocks page but rather information thrown directly on the Stocks page from the twelve api.
    // We are going to try dummy text instead off-course. The idea is to learn more from this link to explain rest api's and the fetch method by posting data to the database.
    //
    @RequestMapping(value="/favourites",method=RequestMethod.GET)
    public List<Favourites> getFavourites(){

        return repository.findAll();
    }

  

    @RequestMapping(value="/favourites/",method=RequestMethod.POST)
    public Favourites createFavourites(@RequestBody Favourites favourites) {

        return repository.save(favourites);
    }


    
}
