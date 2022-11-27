package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeControllerTest {
@Test
public void
shouldSetRecipeName() throws Exception {
    Recipe testRecipe = new Recipe();

    assertTrue(testRecipe.getName().contains("bibimbap"));
}
}