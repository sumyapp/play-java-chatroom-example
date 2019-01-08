package controllers;

import javax.inject.Inject;
import java.net.URI;
import java.util.concurrent.CompletableFuture;

import org.webjars.play.WebJarsUtil;

public class UsersController extends ApplicationController {
    public Result show() {
        Http.Request request = request();
        User user = getCurrentUser();
        return Results.ok(views.html.index.render(url, user), null);
    }

    public Result update() {
        Http.Request request = request();
        RequestBody body = request.body();

        User user = getCurrentUser();
        user.update(body);
        user.saveOrRaise();

        return Results.ok(views.html.index.render(url, user, "User updated"));
    }
}
