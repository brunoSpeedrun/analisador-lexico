/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

/**
 * Classe que descreve o programa.
 * @author BrunoXavier
 */
class About {
    private final String   name;
    private final String   version;
    private final String   description;
    private final String[] autors;

    public About() {
        name        = "Lexical analyzer Action Script";
        version     = "1.0";
        description = "Parser lexicon that recognizes tokens of the Action Script language";
        autors      = new String[]{"Bruno Xavier de Moura", "Maycon Leandro"};
    }
    
    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the autors
     */
    public String[] getAutors() {
        return autors;
    }
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(getName()).append("\n\n");
        str.append(getDescription()).append("\n\n");
        str.append("Version: ").append(getVersion()).append("\n\n");
        str.append("Autors: ").append(java.util.Arrays.toString(autors)).append("\n");
        return str.toString();
    }
}
