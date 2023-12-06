//package com.sdjt.utils;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//public class MybatisUtils {
//    public static SqlSession getSqlSession(boolean flag) {
//        InputStream resourceAsStream = null;
//        SqlSession sqlSession = null;
//        try {
//            resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//        sqlSession = sessionFactory.openSession(flag);
//        return sqlSession;
//    }
//}
