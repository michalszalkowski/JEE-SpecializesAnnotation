package pl.btbw;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {

    @Inject
    private ShopService shopService;

    @GET
    public String showCarName() {
        return shopService.getName();
    }

}
