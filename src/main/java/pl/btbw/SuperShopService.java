package pl.btbw;

import javax.enterprise.inject.Specializes;

@Specializes
public class SuperShopService extends ShopService {

    // @Override business logic

    @Override
    public String getName() {
        return "Super: " + super.getName();
    }
}
