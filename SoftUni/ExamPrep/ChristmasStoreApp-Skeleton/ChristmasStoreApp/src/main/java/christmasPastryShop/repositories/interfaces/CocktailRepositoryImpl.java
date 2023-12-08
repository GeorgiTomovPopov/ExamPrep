package christmasPastryShop.repositories.interfaces;


import christmasPastryShop.entities.cocktails.interfaces.Cocktail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CocktailRepositoryImpl implements CocktailRepository<Cocktail> {

    protected Collection<Cocktail> models;

    public CocktailRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public Cocktail getByName(String name) {
        return models.stream().filter(cocktail -> cocktail.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Collection<Cocktail> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Cocktail cocktail) {
        models.add(cocktail);
    }
}
