package Repository;

import Data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    public abstract E findByFio(String fio);
}