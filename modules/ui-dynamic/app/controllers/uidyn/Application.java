package controllers.uidyn;

import play.mvc.*;

public class Application extends Controller {

    public static Result index() {
        return ok(views.html.uidyn.index.render());
    }

}
