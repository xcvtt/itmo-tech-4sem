package is.tech.jdbc;

import is.tech.dao.CarManufacturerDao;
import is.tech.dao.CarModelDao;
import is.tech.models.CarModel;

import java.sql.SQLException;
import java.util.List;

public class CarModelDaoJdbc implements CarModelDao, AutoCloseable {

    @Override
    public CarModel save(CarModel entity) throws SQLException {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteByEntity(CarModel entity) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public CarModel update(CarModel entity) {
        return null;
    }

    @Override
    public CarModel getById(long id) {
        return null;
    }

    @Override
    public List<CarModel> getAll() {
        return null;
    }

    @Override
    public List<CarModel> getAllByVId(long id) {
        return null;
    }

    @Override
    public void close() throws Exception {

    }
}
