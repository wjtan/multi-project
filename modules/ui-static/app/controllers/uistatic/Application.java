package controllers.uistatic;

//import play.api.Play;
//import play.Application.*;
import play.mvc.*;
import multi.common.Service;

public class Application extends Controller {

    public static Result index() {
        //String value = play.Play.application().configuration().getString("application.router");
    	//return ok(views.html.uistatic.index.render(value));
    	
        return ok(views.html.uistatic.index.render(Service.getMessage()));
    }

}
