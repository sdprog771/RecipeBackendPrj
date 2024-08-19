package com.cookingrecipes.recipeappbackend.web;

import com.cookingrecipes.recipeappbackend.domain.Recipe;
import com.cookingrecipes.recipeappbackend.mapping.WebDTOMappingService;
import com.cookingrecipes.recipeappbackend.repository.RecipeRepository;
import com.cookingrecipes.recipeappbackend.service.RecipeService;
import com.cookingrecipes.recipeappbackend.web.dto.RecipeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.stream.Collectors;



@RestController
@EnableWebMvc
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    private final WebDTOMappingService webDTOMappingService;

    private final RecipeRepository recipeRepository;


    /**
     * @param recipeService
     * @param webDTOMappingService
     * @param recipeRepository
     */
    @Autowired
    public RecipeController(RecipeService recipeService,
                            WebDTOMappingService webDTOMappingService,
                            RecipeRepository recipeRepository) {
        this.recipeService = recipeService;
        this.webDTOMappingService = webDTOMappingService;
        this.recipeRepository = recipeRepository;
    }

    /**
     * @return
     */
    @GetMapping("/recipes")
    public List<RecipeDTO> getAll() {
        return recipeRepository.findAll().stream().map(webDTOMappingService::toRecipeDTO).collect(Collectors.toList());
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/recipes/{id}")
    public RecipeDTO getRecipe(@PathVariable long id) {
        return webDTOMappingService.toRecipeDTO(recipeService.getRecipe(id));
    }

    @PostMapping("/get")///ti paizei edw???
    public RecipeDTO getRecipe1(@RequestParam long id) {
        return webDTOMappingService.toRecipeDTO(recipeService.getRecipe(id));
    }

    @PostMapping("/create")
    public RecipeDTO createRecipe(@RequestBody RecipeDTO recipeDTO) {
        return recipeService.createRecipe(recipeDTO);
    }

    @GetMapping("/delete/{id}")
    public void deleteRecipe(@PathVariable long id) {
        recipeService.deleteRecipe(id);
    }

    @PutMapping("/recipes/{id}")
    public RecipeDTO updateRecipe(@PathVariable long id, @RequestBody RecipeDTO recipeDTO) {
      Recipe recipe=recipeService.getRecipe(id);
      webDTOMappingService.updateRecipe(recipe,recipeDTO);
        return webDTOMappingService.toRecipeDTO(recipeService.save(recipe));
    }

}
