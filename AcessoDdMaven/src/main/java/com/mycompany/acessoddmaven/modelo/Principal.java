package com.mycompany.acessoddmaven.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_AcessoDdMaven_jar_1.0-SNAPSHOTPU");

        EntityManager em = emf.createEntityManager();

        Analista Analista = new Analista();
        Analista Analista1 = new Analista();
        ArrayList<String> lista = new ArrayList<String>();

        Analista.setNome_analista("pedro henrique");
        Analista1.setNome_analista("drop table teste");

        em.getTransaction().begin();
        try {
            ////            em.merge(cliente);
            //            em.merge(cliente1);// inert ou update

            for (int x = 1; x < 3; x++) {
                lista.set(x, em.find(Analista.class, x));
                
            }
            
            Analista = em.find(Analista.class, 1);
            System.out.println();
            System.out.println("Analista-> " + Analista);
            System.out.println();

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }

    }
}
