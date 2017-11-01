//package com.epam.spring.dao;
//
//import org.springframework.mock.jndi.SimpleNamingContextBuilder;
//import org.springframework.stereotype.Component;
//
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.SQLException;
//
//public class SQLConnectionPool {
//
//    private static InitialContext initialContext;
//    private static DataSource ds;
//
//    /**
//     * Provides connection to a database from connection pool
//     * @return {@link Connection} object
//     */
//    public static Connection getConnection() throws NamingException, SQLException {
//        SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
//        builder.bind("jdbc/studybase", ods);
//        builder.activate();
//
////        initialContext = new InitialContext();
////        ds = (DataSource) initialContext.lookup("classpath:db.properties");
////        Connection connection = ds.getConnection();
////        return connection;
//    }
//
//}
