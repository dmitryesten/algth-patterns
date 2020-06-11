package com.patterns.factories.factorymethod;

import com.patterns.factories.InstanseNotFoundException;
import com.patterns.factories.modelfactory.*;

public class UserSystemFactory {

    private UserSystemFactory(){};

    public static UserSystem getInstance(UserEnum userType) throws InstanseNotFoundException {
        switch (userType){
            case CLIENT: return new Client();
            case DRIVER: return new Driver();
            default:
                throw new InstanseNotFoundException("");
        }
    }

    public static IUserSystem getInstance(String userType) throws InstanseNotFoundException {
        return (IUserSystem) UserSystemFactory.getInstance(UserEnum.valueOf(userType));
    }

}


