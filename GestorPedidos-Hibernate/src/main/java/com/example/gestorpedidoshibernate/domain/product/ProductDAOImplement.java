package com.example.gestorpedidoshibernate.domain.product;

import com.example.gestorpedidoshibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
/**
 * Implementación de la interfaz ProductDAO para realizar operaciones relacionadas con la entidad Product en la base de datos.
 */
public class ProductDAOImplement implements ProductDAO{

    /**
     * Obtiene los nombres únicos de los productos.
     *
     * @return Lista de nombres de productos.
     */
    @Override
    public List<String> getNames() {
        ArrayList<String> results = new ArrayList<>(0);

        try (Session s = HibernateUtil.getSessionFactory().openSession()) {
            Query<String> q = s.createQuery("select distinct(p.productName) from Product p", String.class);
            results = (ArrayList<String>) q.getResultList();
        }
        return results;
    }

    /**
     * Obtiene los precios de los productos.
     *
     * @return Lista de precios de productos.
     */
    @Override
    public List<Integer> getPrices() {
        return null;
    }

    @Override
    public List<Integer> getAmmounts() {
        return null;
    }


    /**
     * Obtiene todos los productos almacenados en la base de datos.
     *
     * @return Lista de todos los productos almacenados en la base de datos.
     */
    public List<Product> getAllProducts() {

        var exit = new ArrayList<Product>(0);

        try (Session s = HibernateUtil.getSessionFactory().openSession()) {


            Query<Product> q = s.createQuery("from Product ", Product.class);
            exit = (ArrayList<Product>) q.getResultList();

        }

        return exit;
    }
}
