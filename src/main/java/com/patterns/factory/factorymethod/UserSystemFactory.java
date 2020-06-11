package com.patterns.factory.factorymethod;

import com.patterns.factory.modelfactory.Client;
import com.patterns.factory.modelfactory.Driver;
import com.patterns.factory.modelfactory.UserEnum;
import com.patterns.factory.modelfactory.UserSystem;

public class UserSystemFactory {

    public static UserSystem getInstance(UserEnum userType) throws InstanseNotFoundException {
        switch (userType){
            case CLIENT: return new Client();
            case DRIVER: return new Driver();
            default:
                throw new InstanseNotFoundException("");
        }
    }

    public static UserSystem getInstance(String userType) throws InstanseNotFoundException {
        return getInstance(UserEnum.valueOf(userType));
    }

}

class InstanseNotFoundException extends Exception {
    public InstanseNotFoundException(String cause) {
        super(cause);
    }
}
