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
public class Especialidade {
    private int idespecialidade;
    private String especialidade;

    /**
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * @param especialidade the especialidade to set
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * @return the idespecialidade
     */
    public int getIdespecialidade() {
        return idespecialidade;
    }

    /**
     * @param idespecialidade the idespecialidade to set
     */
    public void setIdespecialidade(int idespecialidade) {
        this.idespecialidade = idespecialidade;
    }
}
