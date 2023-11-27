package com.example.gestorpedidoshibernate.domain.order;

import com.example.gestorpedidoshibernate.HibernateUtil;
import com.example.gestorpedidoshibernate.domain.item.Item;
import com.example.gestorpedidoshibernate.domain.product.Product;
import lombok.Data;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
/**
 * Implementación de la interfaz OrderDAO para realizar operaciones relacionadas con la entidad Order en la base de datos.
 */
public class OrderDAOImplemen implements OrderDAO{
    /**
     * Guarda un pedido en la base de datos.
     *
     * @param data El pedido que se va a guardar.
     * @return El pedido guardado.
     */
    @Override
    public Order save(Order data) {


        Order exit = null;

        try (org.hibernate.Session s = HibernateUtil.getSessionFactory().openSession()) {

            Transaction t = s.beginTransaction(); // Inicio transaccion

            s.persist(data);//Persist hace que un juegoe ste sincroniado con la base de datos


            t.commit();

            exit = data;

        } catch (Exception ex) {

            System.out.println("Error saving Order");
        }
        return data;
    }

    /**
     * Actualiza un pedido en la base de datos.
     *
     * @param data El pedido que se va a actualizar.
     */
    public void update(Order data) {

        try (org.hibernate.Session s = HibernateUtil.getSessionFactory().openSession()) {

           Transaction t = s.beginTransaction(); // Inicio transaccion

          //  Order o = s.get(Order.class, data.getId());

           // Order.merge(data, o); //Hemos refactorizado en merge en la clase GAME

            s.merge(data);


            t.commit();


        }
    }

}

