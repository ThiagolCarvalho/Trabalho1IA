/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoromenia;

/**
 *
 * @author Thiago
 */
public class No {
	
	public Estado estado;
	public Estado acao;
	public No pai;
	public Integer profundidade;
	public Integer custoDePasso;
	
	public No(Estado estado) {
		super();
		this.estado = estado;
	}
}
