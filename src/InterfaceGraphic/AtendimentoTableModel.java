package InterfaceGraphic;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import Animal.CadastroGeral;

public class AtendimentoTableModel extends DefaultTableModel {
	private List<CadastroGeral> linhas = new ArrayList<CadastroGeral>();
	private String[] colunas = {"Data", "RG", "Nome do Animal", "Espécie", "Área de Atendimento",
			"Casos Novos Simples", "Casos Novos Complexos", "Retornos (Simples ou Complexos)" };

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas[column];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	}
