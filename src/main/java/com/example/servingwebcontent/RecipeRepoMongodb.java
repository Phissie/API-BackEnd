package com.example.servingwebcontent;

import org.springframework.data.mongodb.repository.MongoRepository;



/*you would only ever implement an interface. It is a description of many methods. it is a specification of a set of methods and properties.
extends has both methods and classes*/

//we are telling mongo what kind of info we are storing and it is just recipe and string
public interface RecipeRepoMongodb extends MongoRepository <Recipe, String> {
}
