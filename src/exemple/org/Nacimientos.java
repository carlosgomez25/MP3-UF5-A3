package exemple.org;

public class Nacimientos {

    @CsvBindByName
    String Codi_Districte;
    String Nom_Districte;
    String Codi_Barri;
    String Nom_Barri;
    String Lloc_de_naixement;
    String nombre;

    @Override
    public String toString() {
        return "Naixement{" +
                "Codi_Districte='" + Codi_Districte + '\'' +
                ", Nom_Districte='" + Nom_Districte + '\'' +
                ", Codi_Barri='" + Codi_Barri + '\'' +
                ", Nom_Barri='" + Nom_Barri + '\'' +
                ", Lloc_de_naixement='" + Lloc_de_naixement + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getCodi_Districte() {
        return Codi_Districte;
    }

    public void setCodi_Districte(String codi_Districte) {
        Codi_Districte = codi_Districte;
    }

    public String getNom_Districte() {
        return Nom_Districte;
    }

    public void setNom_Districte(String nom_Districte) {
        Nom_Districte = nom_Districte;
    }

    public String getCodi_Barri() {
        return Codi_Barri;
    }

    public void setCodi_Barri(String codi_Barri) {
        Codi_Barri = codi_Barri;
    }

    public String getNom_Barri() {
        return Nom_Barri;
    }

    public void setNom_Barri(String nom_Barri) {
        Nom_Barri = nom_Barri;
    }

    public String getLloc_de_naixement() {
        return Lloc_de_naixement;
    }

    public void setLloc_de_naixement(String lloc_de_naixement) {
        Lloc_de_naixement = lloc_de_naixement;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
