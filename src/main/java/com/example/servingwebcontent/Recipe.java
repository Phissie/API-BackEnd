package com.example.servingwebcontent;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
@Document
public class Recipe {
    @Id //double check that it's upper or lower case
    private String id;

    private String pic;

    private String name;
    private String ingredients;
    private String instructions;
    private int servings;
    /*write a test that will create a recipe i.e. recipe equals new recipe. then ingredients equals new ingredients. return the ingredients that were
*/

    public Recipe() {

    }


    public String getPic() {return pic;}
    public void setPic(String pic) {this.pic = pic;}

    public String getId() {
        return id;
    }
    public void setId(String id)
    {
         this.id = id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }
    public int getServings() {
        return servings;

    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;

    }

    public String getInstructions() {
        return instructions;

    }
}