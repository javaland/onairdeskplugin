package nl.caliope.onairdesk.provider;

import java.io.IOException;
import java.util.List;

import nl.caliope.onairdesk.model.Category;

public abstract class CategoryProvider extends ServiceProvider
{

    /**
     * @param args
     */
    public abstract List<Category> getAllCategories() throws IOException;
}
