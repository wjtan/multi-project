package controllers.rest;

import play.libs.Json;
import play.mvc.*;
import multi.common.Service;

public class Application extends Controller {

    public static Result message() {
        return ok(Json.toJson(Service.getMessage()));
    }

}
