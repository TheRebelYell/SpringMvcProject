package app.dao;

import app.entity.User;
import app.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class MySqlUserDao implements UserDao {
    private JdbcTemplate jdbcTemplate;

    private static final String SELECT_ALL_USERS =
            "SELECT * FROM users";
    private static final String SELECT_USER_BY_ID =
            "SELECT * FROM users WHERE id = ?";
        private static final String INSERT_USER =
            "INSERT INTO users (name, age, email) VALUES(?, ?, ?)";
    private static final String UPDATE_USER =
            "UPDATE users SET name = ?, age = ?, email = ? WHERE id = ?";
    private static final String DELETE_USER_BY_ID =
            "DELETE FROM users WHERE id = ?";

    @Autowired
    public MySqlUserDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query(SELECT_ALL_USERS,
                new UserMapper());
    }

    @Override
    public User getUserById(int id) {
        return jdbcTemplate.queryForObject(SELECT_USER_BY_ID,
                new UserMapper(),
                id);
    }

    @Override
    public void insertUser(User user) {
        jdbcTemplate.update(INSERT_USER,
                user.getName(),
                user.getAge(),
                user.getEmail());
    }

    @Override
    public void updateUser(User user) {
        jdbcTemplate.update(UPDATE_USER,
                user.getName(),
                user.getAge(),
                user.getEmail(),
                user.getId());
    }

    @Override
    public void deleteUserById(int id) {
        jdbcTemplate.update(DELETE_USER_BY_ID, id);
    }
}
