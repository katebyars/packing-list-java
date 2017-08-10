import models.PackingList;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import javax.servlet.*;
import javax.servlet.http.*;

import java.lang.reflect.Array;
import java.util.*;

import static spark.Spark.*;
import static spark.route.HttpMethod.post;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/packinglist/new", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/packinglist/new", (req, res) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String listName = req.queryParams("name");
            String[] packedInBag = req.queryParamsValues("listItem");
            List<String> actualPackedInBag = Arrays.asList(packedInBag);
            PackingList packlist = new PackingList(listName, actualPackedInBag);
            model.put("packinglist", packlist);
            res.redirect("/packinglist");
            return null;
        });

        get("/packinglist", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<PackingList> allLists = PackingList.getAll();
            model.put("allLists", allLists);
            return new ModelAndView(model, "test.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
