package lk.ijse.javafxla.dao;

import lk.ijse.javafxla.dao.custom.impl.ItemDaoImpl;

public class DaoFactory {
    public static <T>T getDao(DaoType type) {
        switch (type) {
            case ITEM:
                return (T) new ItemDaoImpl();
            default:
                return null;
        }
    }
}
