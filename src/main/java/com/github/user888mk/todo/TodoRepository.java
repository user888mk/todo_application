package com.github.user888mk.todo;

import com.github.user888mk.HibernateUtil;
import com.github.user888mk.lang.Lang;

import java.util.List;

public class TodoRepository {
    List<Lang> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();

        var result = session.createQuery("from Todo", Lang.class).list();

        transaction.commit();
        session.close();
        return result;
    }
}