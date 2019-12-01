/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Projeto da disciplina Programacao WEB 
 *     UFABC - 3o quadrimestre 2019
 *     Desenvolvido por Erika Yahata
 *     Professor Francisco Isidro
 *
 * @author eyahata
 */
public class UserAgenda {
    private int iduser;
    private int idagenda;

    /**
     * @return the iduser
     */
    public int getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    /**
     * @return the idagenda
     */
    public int getIdagenda() {
        return idagenda;
    }

    /**
     * @param idagenda the idagenda to set
     */
    public void setIdagenda(int idagenda) {
        this.idagenda = idagenda;
    }
}
