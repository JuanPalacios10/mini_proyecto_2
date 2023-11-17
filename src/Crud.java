import java.util.ArrayList;

public class Crud {
    public static boolean insertarCandidato(ArrayList<Candidato> candidatos, Candidato candidato){
        if(!candidato.getNombre().equals("") && !candidato.getCedula().equals("") && !candidato.getPromesas().equals("")) {
            if(Crud.estaCandidato(candidatos, candidato.getNombre())) {
                return false;
            } else {
                candidatos.add(candidato);
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean actualizarCandidato(ArrayList<Candidato> candidatos, String busqueda, Candidato candidatoNuevo) {
        if(!candidatoNuevo.getNombre().equals("") && !candidatoNuevo.getCedula().equals("") && !candidatoNuevo.getPromesas().equals("")) {
            Candidato candidatoActual = Crud.buscarCandidato(candidatos, busqueda);
            candidatos.set(candidatos.indexOf(candidatoActual), candidatoNuevo);
            return true;
        } else {
            return false;
        }
    }

    public static boolean estaCandidato(ArrayList<Candidato> candidatos, String busqueda) {
        if(busqueda.equals("")) return false;

        for(Candidato candidato : candidatos) {
            if(candidato.getNombre().equals(busqueda)) {
                return true;
            }
        }

        return false;
    }

    public static Candidato buscarCandidato(ArrayList<Candidato> candidatos, String busqueda) {
        Candidato candidatoSeleccionado = new Candidato("", "", Ciudades.Alcala, Ideologia.Izquierda, Partidos.AICO, "");

        for(Candidato candidato : candidatos) {
            if(candidato.getNombre().equals(busqueda)) {
                candidatoSeleccionado = candidato;
                return candidatoSeleccionado;
            }
        }

        return candidatoSeleccionado;
    }

    public static void eliminarCandidato(ArrayList<Candidato> candidatos, String busqueda){
        Candidato candidatoSeleccionado = Crud.buscarCandidato(candidatos, busqueda);
        candidatos.remove(candidatoSeleccionado);
    }       
    
    public static String listarCandidatos(ArrayList<Candidato> candidatos){
        String listaCandidatos = "";

        if(candidatos.size() > 0) {
            for(Candidato candidato : candidatos) {
                listaCandidatos += "Nombre: " + candidato.getNombre() + "\n";
                listaCandidatos += "Cedula: " + candidato.getCedula() + "\n";
                listaCandidatos += "Ciudad: " + candidato.getCiudad().toString().replace("_", " ") + "\n";
                listaCandidatos += "Ideologia: " + candidato.getIdeologia() + "\n";
                listaCandidatos += "Partido: " + candidato.getPartido().toString().replace("_", " ") + "\n";
                listaCandidatos += "Promesas: " + candidato.getPromesas() + "\n";
                listaCandidatos += "\n";
            }
        } else {
            listaCandidatos = "Aun no hay ningun candidato";
        }

        return listaCandidatos;
    }
    public static String encontrarPartido(ArrayList<Candidato> candidatos) {
        ArrayList<Short> numPartidos = new ArrayList<Short>();
        ArrayList<Partidos> partidoCandidatos = new ArrayList<Partidos>();
        Partidos partidosRepetidos[] = new Partidos[candidatos.size()];
        short contadorPartidos = 0;

        for(Candidato candidato : candidatos) {
            partidosRepetidos[candidatos.indexOf(candidato)] = candidato.getPartido();
        }
        
        for(Partidos partido : Partidos.values()) {
            contadorPartidos = 0;

            for(Partidos partidoRepetido : partidosRepetidos) {
                if(partido.equals(partidoRepetido)) contadorPartidos++;
            }

            if(contadorPartidos > 0) {
                numPartidos.add(contadorPartidos);
                partidoCandidatos.add(partido);
            }
        }

        short maxPartido = numPartidos.get(0);
        int indicePartido = 0;

        for(short i = 0; i < numPartidos.size(); i++) {
            if(maxPartido < numPartidos.get(i)) {
                maxPartido = numPartidos.get(i);
                indicePartido = numPartidos.indexOf(numPartidos.get(i));
            }
        }

        return partidoCandidatos.get(indicePartido).toString().replace("_", " ");
    }

    public static String encontrarTopCiudades(ArrayList<Candidato> candidatos) {
        ArrayList<Short> numCiudades = new ArrayList<Short>();
        ArrayList<Ciudades> ciudadCandidatos = new ArrayList<Ciudades>();
        Ciudades ciudadRepetidas[] = new Ciudades[candidatos.size()];
        short contadorCiudades = 0;
        
        for(Candidato candidato : candidatos) {
            ciudadRepetidas[candidatos.indexOf(candidato)] = candidato.getCiudad();
        }
        for(Ciudades ciudad : Ciudades.values()) {
            contadorCiudades = 0;

            for(Ciudades ciudadRepetida : ciudadRepetidas) {
                if(ciudad.equals(ciudadRepetida)) {
                    contadorCiudades++;
                }
            }

            if(contadorCiudades > 0) {
                numCiudades.add(contadorCiudades);
                ciudadCandidatos.add(ciudad);
            }
        }

        short menorNumCiudades[] = new short[3];
        String topCiudades[] = new String[3];
        int indiceCiudades;

        if(numCiudades.size() == 1) {
            topCiudades[0] = ciudadCandidatos.get(0).toString();
            topCiudades[1] = "";
            topCiudades[2] = "";
        } else if(numCiudades.size() == 2) {
            menorNumCiudades[0] = numCiudades.get(0);
            
            if(menorNumCiudades[0] > numCiudades.get(1)) {
                topCiudades[0] = ciudadCandidatos.get(1).toString();
                topCiudades[1] = ciudadCandidatos.get(0).toString();
            } else {
                topCiudades[0] = ciudadCandidatos.get(0).toString();
                topCiudades[1] = ciudadCandidatos.get(1).toString();
            }

            topCiudades[2] = "";
        } else {
            for(short i = 0; i < menorNumCiudades.length; i++) {
                indiceCiudades = 0;
                menorNumCiudades[i] = numCiudades.get(0);

                for(short j = 0; j < numCiudades.size(); j++) {
                    if(menorNumCiudades[i] > numCiudades.get(j)) {
                        menorNumCiudades[i] = numCiudades.get(j);
                        indiceCiudades = numCiudades.indexOf(numCiudades.get(j));
                    }
                }

                topCiudades[i] = ciudadCandidatos.get(indiceCiudades).toString();
                if(numCiudades.size() > 1 && ciudadCandidatos.size() > 1) {
                    numCiudades.remove(indiceCiudades);
                    ciudadCandidatos.remove(indiceCiudades);
                }
            }
        }
        
        return String.join("\n", topCiudades);
    }
    
}