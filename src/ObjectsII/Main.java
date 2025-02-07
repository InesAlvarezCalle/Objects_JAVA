package ObjectsII;

public class Main {
    public static void main (String[] args){
        Concursante c1 = new Concursante();
        Concursante c2 = new Concursante();
        Concursante c3 = new Concursante();

        c1.nombreCompleto.nombre = "Laura";
        c1.nombreCompleto.primerApellido = "del Amo";
        c1.nombreCompleto.segundoApellido = "Calle";
        c1.nombreArtistico = "Laudel";
        c1.domicilio.calle = "del Palleter";
        c1.domicilio.numPiso = 1;
        c1.domicilio.puerta = 3;
        c1.domicilio.numPostal = 46220;
        c1.domicilio.poblacion = "Picassent";
        c1.domicilio.provincia = "Valencia";
        c1.anioNacimiento = 2007;
        c1.concurso.titulo = "Palabras Encadenadas";
        c1.concurso.fecha.anio = 2025;
        c1.concurso.fecha.mes = 1;
        c1.concurso.fecha.dia = 13;
        c1.concurso.tiempo.horas = 3;
        c1.concurso.tiempo.minutos = 12;
        c1.concurso.tiempo.segundos = 57;
        c1.concurso.tiempo.centesimas = 100;

        c2.nombreCompleto.nombre = "Jesús";
        c2.nombreCompleto.primerApellido = "Álvarez";
        c2.nombreCompleto.segundoApellido = "Olmo";
        c2.nombreArtistico = "ElJesu";
        c2.domicilio.calle = "La Sequia";
        c2.domicilio.numPiso = 2;
        c2.domicilio.puerta = 5;
        c2.domicilio.numPostal = 46290;
        c2.domicilio.poblacion = "Alcàsser";
        c2.domicilio.provincia = "Valencia";
        c2.anioNacimiento = 1977;
        c2.concurso.titulo = "Minecraft Extremo";
        c2.concurso.fecha.anio = 2025;
        c2.concurso.fecha.mes = 2;
        c2.concurso.fecha.dia = 7;
        c2.concurso.tiempo.horas = 15;
        c2.concurso.tiempo.minutos = 30;
        c2.concurso.tiempo.segundos = 29;
        c2.concurso.tiempo.centesimas = 200;

        c3.nombreCompleto.nombre = "Sergi";
        c3.nombreCompleto.primerApellido = "Molina";
        c3.nombreCompleto.segundoApellido = "Barberà";
        c3.nombreArtistico = "Rayitoser13";
        c3.domicilio.calle = "Major";
        c3.domicilio.numPiso = 3;
        c3.domicilio.puerta = 7;
        c3.domicilio.numPostal = 46410;
        c3.domicilio.poblacion = "Sueca";
        c3.domicilio.provincia = "Valencia";
        c3.anioNacimiento = 2006;
        c3.concurso.titulo = "Liga Pokémon";
        c3.concurso.fecha.anio = 2025;
        c3.concurso.fecha.mes = 2;
        c3.concurso.fecha.dia = 14;
        c3.concurso.tiempo.horas = 25;
        c3.concurso.tiempo.minutos = 48;
        c3.concurso.tiempo.segundos = 32;
        c3.concurso.tiempo.centesimas = 300;
    }
}
