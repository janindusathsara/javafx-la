package lk.ijse.javafxla.service.custom.impl;

import lk.ijse.javafxla.dao.DaoFactory;
import lk.ijse.javafxla.dao.DaoType;
import lk.ijse.javafxla.dao.custom.ItemDao;
import lk.ijse.javafxla.dto.ItemDto;
import lk.ijse.javafxla.entity.ItemEntity;
import lk.ijse.javafxla.service.custom.ItemService;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDao = DaoFactory.getDao(DaoType.ITEM);

    @Override
    public boolean saveItem(ItemDto dto) throws Exception {
        var itemEntity = new ItemEntity(
                dto.getCode(),
                dto.getDescription(),
                dto.getUnitPrice(),
                dto.getQtyOnHand()
        );

        return itemDao.save(itemEntity);
    }
}
