package InterfaceGraphic;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Animal.CadastroGeral;

public class TableModelGeral extends DefaultTableModel  {

	private List<CadastroGeral> linhas = new ArrayList<CadastroGeral>();
	private String[] colunas = {"Data","RG", "Nome do Animal", "Proprietario", "Espécie", "Sexo", "Raça", "Idade", "Responsavel"};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas[column];
	}
	
	/*@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return linhas.size();
	}*/

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	
	
	public void removeRow(int linha) {
		this.linhas.remove(linha);
		this.fireTableRowsDeleted(linha, linha);
	}
	
	
	
	
	
	
	
	
	
	/*@Override
	public Object getValueAt(int linha, int coluna) {
	
		switch (coluna) {
		case  0:
			return linhas.get(linha).getId();
		
		case 1:
			return	linhas.get(linha).getData();
			 
		
		case 2:
			return linhas.get(linha).getRg();
			
		case 3:
			return linhas.get(linha).getNome();
		
		case 4:
			return linhas.get(linha).getProprietario();
			
		case 5:
			return linhas.get(linha).getEspecie();
			 
		case 6:
			return linhas.get(linha).getNome();
			
		case 7:
			return linhas.get(linha).getSexo();

		case 8:
			return linhas.get(linha).getRaca();
			
		case 9:
			return linhas.get(linha).getIdade();
			
		case 10:
			return linhas.get(linha).getResponsavel();
			}

		return null;
	}*/

}
