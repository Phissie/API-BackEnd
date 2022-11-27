package com.example.servingwebcontent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
/*this is how springboot annotates tests and is specific to springboot not java. @Test
give it a name that reflects what your test does.
recipe = new recipe
assert that recipe get.instructions equals */

class ServingWebContentApplicationTests {

	@Test
	void contextLoads() {
	}


    @Test
	public void shouldSetRecipeName() throws Exception {
		Recipe testRecipe = new Recipe();
		testRecipe.setName("any old name");
		//assertThat(testRecipe.getName().equals("any old name"));
	}

}
