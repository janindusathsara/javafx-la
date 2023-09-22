package lk.ijse.javafxla.service;

import lk.ijse.javafxla.service.custom.impl.ItemServiceImpl;

public class ServiceFactory {
    public static <T>T getService(ServiceType type){
        switch (type) {
            case ITEM:
                return (T) new ItemServiceImpl();
            default:
                return null;
        }
    }
}
