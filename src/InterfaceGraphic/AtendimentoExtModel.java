package InterfaceGraphic;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


import Animal.CadastroGeral;

public class AtendimentoExtModel extends DefaultTableModel {

	private List<CadastroGeral> linhas = new ArrayList<CadastroGeral>();
	private String[] colunas = {"Data","RG","Propriedade","Individula até de 100kg","Individula Acima de 100kg","Rebanho até de 100kg","Rebanho Acima de 100kg"};
	
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas[column];
	}

	/*
	 * @Override public int getRowCount() { // TODO Auto-generated method stub
	 * return linhas.size(); }
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public Object getValueAt(int linha, int coluna) {
		
		switch(coluna) {
		
		
		case  0:
			return linhas.get(linha).getId();
		case 1:
			return linhas.get(linha).getData();

		case 2:
			return linhas.get(linha).getRg();

		case 3:
			return linhas.get(linha).getPropriedade();

		case 4:
			return linhas.get(linha).getIndividual100km();

		case 5:
			return linhas.get(linha).getIndividualAcima100km();

		case 6:
			return linhas.get(linha).getRebanho100km();

		case 7:
			return linhas.get(linha).getRebanhoAcima100km();
		
		} return null;
	}

}
