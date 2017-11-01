package com.epam.spring.dao;

import com.epam.spring.bean.MP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class Mp3DAOImpl implements Mp3DAO {

    @Value("INSERT INTO mp3 (name, author) VALUES (?, ?)")
    private String sqlInsertQuery;
    @Value("SELECT * FROM mp3 WHERE id=:id")
    private String sqlGetByIdQuery;

    private static final class MP3RowMapper implements RowMapper<MP3>{

        @Override
        public MP3 mapRow(ResultSet rs, int rowNum) throws SQLException {
            MP3 mp3 = new MP3();
            mp3.setId(rs.getInt("id"));
            mp3.setName(rs.getString("name"));
            mp3.setAuthor(rs.getString("author"));
            return mp3;
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(SQLConnectionPool.getDs());
//    }

    public void insert(MP3 mp3) {
//        try (Connection connection = SQLConnectionPool.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)){
//            preparedStatement.setString(1, mp3.getName());
//            preparedStatement.setString(2, mp3.getAuthor());
//            preparedStatement.executeUpdate();
//        } catch (SQLException | NamingException e) {
//            e.printStackTrace();
//        }
        jdbcTemplate.update(sqlInsertQuery, mp3.getName(), mp3.getAuthor());
    }

    public void delete(MP3 mp3) {

    }

    public MP3 getByID(Integer id) {

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();

        parameterSource.addValue("id", id);

        return namedParameterJdbcTemplate.queryForObject(sqlGetByIdQuery, parameterSource, new MP3RowMapper());
    }

    public List<MP3> getListByName(String name) {
        return null;
    }

    public List<MP3> getListByAuthor(String author) {
        return null;
    }
}
