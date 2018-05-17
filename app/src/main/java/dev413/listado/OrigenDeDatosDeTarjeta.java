package dev413.listado;

import java.util.ArrayList;

/**
 * Created by Usuario on 24/04/2018.
 */

public class OrigenDeDatosDeTarjeta {
    public OrigenDeDatosDeTarjeta(){
    }

    public ArrayList<String> obtenerImagenes()
    {
        ArrayList<String> images = new ArrayList<String>();

        String currentLink = new String();
        currentLink = "http://ksassets.timeincuk.net/wp/uploads/sites/55/2015/05/IanCurtis01Getty88429765_160180.hero_-1-920x515.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://ia.media-imdb.com/images/M/MV5BMTI2NTY0NzA4MF5BMl5BanBnXkFtZTYwMjE1MDE0._V1_UX214_CR0,0,214,317_AL_.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "http://cdn.gq.com.mx/uploads/images/thumbs/mx/gq/2/s/2017/31/arte_cobain_256_620x413.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://eventosmexico.files.wordpress.com/2017/09/jimmi_2.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://upload.wikimedia.org/wikipedia/commons/7/7f/Jim_Morrison_1969.JPG";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://cdn3.uvnimg.com/73/24/352de6624a3ab58db9d37b242a1c/valentinelizalde12.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://s3.amazonaws.com/lifesite/Miscellaneous/Robin_Williams_Dead_Poets.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://upload.wikimedia.org/wikipedia/ru/archive/7/73/20170529162635%21David_Bowie_%27%27Heroes%27%27_cover.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "https://estaticos.muyinteresante.es/media/cache/760x570_thumb/uploads/images/article/564db9bf5bafe8206239af92/frases-mercury_0.jpg";
        images.add(currentLink);

        currentLink = new String();
        currentLink = "http://www.crazyminds.es/wp-content/uploads/amy-winehouse-1050x701.jpg";
        images.add(currentLink);

        return images;
    }

    public ArrayList<Card> obtenerDatos()
    {
        ArrayList<Card> datos = new ArrayList<Card>();

        Card tarjeta = new Card();
        tarjeta.setNombre("Roberto");
        tarjeta.setDescripcion("Mido un metro ochenta y uno, tengo un sillón azul\n");
        tarjeta.setEdad("18");
        tarjeta.setImagen(0);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Dario");
        tarjeta.setDescripcion("En mi cuarto hay un baúl y me gusta el almendrado\n");
        tarjeta.setEdad("69");
        tarjeta.setImagen(1);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Emmanuel");
        tarjeta.setDescripcion("Me despierto alunado, mi madre es medio terca\n");
        tarjeta.setEdad("15");
        tarjeta.setImagen(2);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Alan");
        tarjeta.setDescripcion("Aunque nunca estuve preso, anduve cerca\n");
        tarjeta.setEdad("5142");
        tarjeta.setImagen(3);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Edgar");
        tarjeta.setDescripcion("Soy de Aries, pelo castaño, algo tacaño y no colecciono nada\n");
        tarjeta.setEdad("420");
        tarjeta.setImagen(4);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Edson");
        tarjeta.setDescripcion("Guardo la ropa ordenada, me aburro en noche buena\n");
        tarjeta.setEdad("20");
        tarjeta.setImagen(5);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Bruno");
        tarjeta.setDescripcion("Si estornudo no hago ruido y no hablo con la boca llena\n");
        tarjeta.setEdad("19");
        tarjeta.setImagen(6);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Emilio");
        tarjeta.setDescripcion("Puedo decir que soy de pocos amigos, pero de mis enemigos, no sé cuantos cosecho\n");
        tarjeta.setEdad("2");
        tarjeta.setImagen(8);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Andrés");
        tarjeta.setDescripcion("Tengo el ojo, derecho, desviado\n");
        tarjeta.setEdad("18");
        tarjeta.setImagen(7);
        datos.add(tarjeta);

        tarjeta = new Card();
        tarjeta.setNombre("Mariana");
        tarjeta.setDescripcion("Dicen que soy bueno, aunque no sea bautizado\n");
        tarjeta.setEdad("18");
        tarjeta.setImagen(9);
        datos.add(tarjeta);

        return datos;
    }
}
