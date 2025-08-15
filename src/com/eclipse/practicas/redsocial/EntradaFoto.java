package com.eclipse.practicas.redsocial;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.Duration;

public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    public EntradaFoto(String autor, String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<>();
    }

    public void meGusta()
    {
        cantidadMeGusta++;
    }

    public void unLike()
    {
        cantidadMeGusta--;
    }

    public void addComentarios(String text) {
        comentarios.add(text);
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public String getTituloImagen() {
        return titulo;
    }

    public LocalDateTime getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public String toString() {
        String publicadoHaceStr = "";
        Duration publicadoHace = Duration.between(momentoPublicacion, LocalDateTime.now());
        long segundos = publicadoHace.toSeconds();
        long minutos = publicadoHace.toMinutes();
        long horas = publicadoHace.toHours();
        long dias = publicadoHace.toDays();

        if (segundos < 59) {
            publicadoHaceStr = "Escrito hace 10 segundos";
        }
        else if (minutos < 59) {
            publicadoHaceStr = "Escrito hace 10 segundos";
        }
        else if (horas < 23) {
            publicadoHaceStr = "Escrito hace 10 segundos";
        }
        else if (dias < 359) {
            publicadoHaceStr = "Escrito hace 10 segundos";
        }
        else {
            publicadoHaceStr = "Escrito hace 10 segundos";
        }
        String comentariosStr = "";
        if (comentarios.size() > 0) {
            for (String comentario : comentarios) {
                comentariosStr += comentario + "\n";
            }
        }
        else {
            comentariosStr = "No existen comentarios";
        }
        StringBuilder textoADevolver = new StringBuilder();
        
        return textoADevolver.append(usuario).append("\n").
            append(urlImagen).append("\n").append(titulo).append("\n").
            append(publicadoHaceStr).append("\n").
            append(cantidadMeGusta).append("\n").
            append(comentariosStr).append("\n").toString();
    }
}