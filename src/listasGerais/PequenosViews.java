package listasGerais;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Animal.CadastroGeral;
import BD.BancoDados;
import InterfaceGraphic.AtendimentoTableModel;
import InterfaceGraphic.TableModelGeral;

public class PequenosViews extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PequenosViews frame = new PequenosViews();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	AtendimentoTableModel modelTable = new AtendimentoTableModel();
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public PequenosViews() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenuItem mntmJaneiro = new JMenuItem("Janeiro");
		mntmJaneiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mntmJaneiro);

		JMenuItem mntmFevereiro = new JMenuItem("Fevereiro");
		mntmFevereiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mntmFevereiro);

		JMenuItem mntmMaro = new JMenuItem("Mar\u00E7o");
		menuBar.add(mntmMaro);

		JMenuItem mntmAbril = new JMenuItem("Abril");
		menuBar.add(mntmAbril);

		JMenuItem mntmMaio = new JMenuItem("Maio");
		menuBar.add(mntmMaio);

		JMenuItem mntmJunho = new JMenuItem("Junho");
		menuBar.add(mntmJunho);

		JMenuItem mntmJulho = new JMenuItem("Julho");
		menuBar.add(mntmJulho);

		JMenuItem mntmAgosto = new JMenuItem("Agosto");
		menuBar.add(mntmAgosto);

		JMenuItem mntmSetembro = new JMenuItem("Setembro");
		menuBar.add(mntmSetembro);

		JMenuItem mntmOutubro = new JMenuItem("Outubro");
		menuBar.add(mntmOutubro);

		JMenuItem mntmNovembro = new JMenuItem("Novembro");
		menuBar.add(mntmNovembro);

		JMenuItem mntmDezembro = new JMenuItem("Dezembro");
		menuBar.add(mntmDezembro);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("<html><b>Pequenos</b></html>"));

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			CadastroGeral cadastro = new CadastroGeral();
			
			int opcEscolhida = JOptionPane.showConfirmDialog(btnExcluir, "Deseja realmente excluir?", null, JOptionPane.YES_NO_OPTION);
					if (opcEscolhida ==JOptionPane.YES_OPTION) {
						if(table.getSelectedRow() != -1) {
							
							modelTable.removeRow(table.getSelectedRow());
							
							cadastro.setId();
							
							BancoDados del = new BancoDados();
							
							del.delete(cadastro);
							
						}
					}
					
			}
		});

		JButton btnImprimir = new JButton("Imprimir");

		textField = new JTextField();
		textField.setColumns(10);
		setExtendedState(MAXIMIZED_BOTH);

		JButton btnProcurar = new JButton("Procurar");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnAno = new JButton("Ano");

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnProcurar)
					.addPreferredGap(ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(btnAno, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnImprimir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnProcurar))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnAno)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
		);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);

		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE));

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(modelTable);
		panel.setLayout(gl_panel);

		contentPane.setLayout(gl_contentPane);

		BancoDados bd = new BancoDados();
		List<CadastroGeral> cadastros = bd.listaAnimaisPequenos();

		for (CadastroGeral cadastro : cadastros) {
			modelTable.addRow(new Object[] { cadastro.getData(), cadastro.getRg(), cadastro.getNome(),
					cadastro.getEspecie(), cadastro.getAreaAtendimento(), cadastro.getCasosNovosSimples(),
					cadastro.getCasosNovosComplexos(), cadastro.getRetornosSC() });
		}

		scrollPane.setViewportView(table);
		table.setModel(modelTable);
		panel.setLayout(gl_panel);

		contentPane.setLayout(gl_contentPane);

	}
}
