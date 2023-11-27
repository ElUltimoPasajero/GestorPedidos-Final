package com.example.gestorpedidoshibernate.domain.item;

import com.example.gestorpedidoshibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
/**
 * Implementación de la interfaz ItemDAO para operaciones relacionadas con la entidad Item en la base de datos.
 */
public class ItemDAOImplement implements ItemDAO{

    /**
     * Obtiene todos los ítems almacenados en la base de datos.
     *
     * @return Lista de ítems almacenados en la base de datos.
     */
    @Override
    public List<Item> getAllItems() {

        var exit = new ArrayList<Item>(0);

        try (Session s = HibernateUtil.getSessionFactory().openSession()) {


            Query<Item> q = s.createQuery("from Item", Item.class);
            exit = (ArrayList<Item>) q.getResultList();

        }

        return exit;
    }
}
