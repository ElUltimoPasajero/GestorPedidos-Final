package com.example.gestorpedidoshibernate;

import com.example.gestorpedidoshibernate.domain.user.User;
import com.example.gestorpedidoshibernate.domain.order.Order;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase de sesión que almacena el usuario actual y el pedido actual.
 */
public class Session {
    @Getter
    @Setter
    private static User currentUser;//Guardamos el usuario en la sesion

    @Getter
    @Setter
    private static Order currentOrder;//Guardamos el pedido en la sesion

}
