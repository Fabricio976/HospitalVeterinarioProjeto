package Meses;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;

import InterfaceGraphic.TableModelGeral;

public class Janeiro extends JFrame {

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
					Janeiro frame = new Janeiro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	TableModelGeral modelTable = new TableModelGeral();
	private JTextField textField;
	private JTable table;
	
	/**
	 * Create the frame.
	 */
	public Janeiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//setExtendedState(MAXIMIZED_BOTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Pequenos"));
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnEditar = new JButton("Editar");
		
		textField = new JTextField();
		textField.setColumns(10);
		setExtendedState(MAXIMIZED_BOTH);
		
		JButton btnProcurar = new JButton("Procurar");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnProcurar)
					.addPreferredGap(ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
					.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnExcluir, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnProcurar))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
		);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(modelTable);
		panel.setLayout(gl_panel);
		
		
		contentPane.setLayout(gl_contentPane);
		
		
		/* carregaAnimaisPequenos(scrollPane); */
	}

	}

