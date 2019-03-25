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
import java.util.LinkedList;

public interface Busca {

	public LinkedList<No> buscar(Problema problema, Estado estadoInicial);

	public LinkedList<No> expandir(No no);

	public void mostrarCaminho();

	public LinkedList<No> getBorda();

	public LinkedList<No> getHistorico();
}
