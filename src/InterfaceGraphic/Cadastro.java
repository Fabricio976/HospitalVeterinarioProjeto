package InterfaceGraphic;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import Animal.CadastroGeral;
import BD.BancoDados;
import listaAnestesias.AGrandesViews;
import listaAnestesias.APequenosViews;
import listaAnestesias.ASilvestresViews;
import listaCirurgia.CGrandesViews;
import listaCirurgia.CPequenosViews;
import listaCirurgia.CSilvestresViews;
import listaEndoscopia.EGrandesViews;
import listaEndoscopia.EPequenosViews;
import listaEndoscopia.ESilvestresViews;
import listaUltrasonografia.USGGrandesViews;
import listaUltrasonografia.USGPequenosViews;
import listaUltrasonografia.USGSilvestresViews;
import listasGerais.AtendimentosEXT;
import listasGerais.GeralViews;
import listasGerais.GrandesViews;
import listasGerais.PequenosViews;
import listasGerais.SilvestresViews;

public class Cadastro {

	private JFrame frame;
	private JTextField textRg;
	private JTextField textNomeAnimal;
	private JTextField textProprietario;
	private JTextField textEspecie;
	private JTextField textRaca;
	private JLabel lblRaca;
	private JTextField textIdade;
	private JLabel lblIdde;
	private JTextField textResponsavel;
	private JLabel label;
	private JLabel lblSexo;
	private JLabel lblCasosNovosSimples;
	private JLabel lblCasosNovosComplexos;
	private JLabel lblRetornoSimpres;
	private JMenu mnLista;
	private JMenuItem mntmGeral;
	private JMenuItem mntmPequenos;
	private JMenuItem mntmGrandes;
	private JMenuItem mntmSilvestes;
	private JMenu mnCirurgias;
	private JMenuItem mntmPequenos_1;
	private JMenuItem mntmGrandes_1;
	private JMenuItem mntmSilvestes_1;
	private JMenu mnAnestesias;
	private JMenuItem mntmPequenos_2;
	private JMenuItem mntmGrandes_2;
	private JMenuItem mntmSilvestres;
	private JMenu mnUltrassonografia;
	private JMenuItem mntmPequenos_3;
	private JMenuItem mntmGrandes_3;
	private JMenuItem mntmSilvestres_1;
	private JMenu mnEndoscopia;
	private JMenuItem mntmPequenos_4;
	private JMenuItem mntmGrandes_4;
	private JMenuItem mntmSilvestres_2;
	private JMenu mnAtendimentoExternos;
	private JMenuItem mntmListaDeAtendimento;
	private JLabel lblPrecedimentos;
	private JLabel lblSimples;
	private JLabel lblComplexos;
	private JLabel lblTcnicasAnestsicas;
	private JTextField textAnestesia;
	private JLabel lblPrecedimentos_1;
	private JLabel lblSimples_1;
	private JLabel lblComplexo;
	private JSpinner spinnerAnestesiaSimples;
	private JSpinner spinnerAnestesiaComplexos;
	private JPanel panelUltrasonografia;
	private JLabel lblExames;
	private JTextField textUSG;
	private JLabel lblEtudos;
	private JLabel label_1;
	private JLabel lblComplexos_1;
	private JSpinner spinnerUSGSimples;
	private JSpinner spinnerUSGComplexos;
	private JPanel panelEndoscopia;
	private JPanel panelAE;
	private JLabel label_3;
	private JTextField textEndoscopia;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JSpinner spinnerEdoscopiaSimples;
	private JSpinner spinnerEdoscopiaComplexos;
	private JTextField textAtendimentoEXT;
	private JRadioButton rdbtnMacho;
	private JRadioButton rdbtnFemea;
	private JComboBox<String> comboBoxArea;
	private JSpinner spinnerSimples;
	private JSpinner spinnerComplexos;
	private JSpinner spinnerRetornos;
	private JTextField textCirurgia;
	private JSpinner spinnerCirurgiaSimples;
	private JSpinner spinnerCirurgiaComplexos;
	private JRadioButton rdbtnAcimaDekm;
	private JRadioButton rdbtnAtkm;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JComboBox<String> comboBoxCategoria;

	private void limparCampos() {

		textRg.setText("");
		textNomeAnimal.setText("");
		textProprietario.setText("");
		textEspecie.setText("");
		textRaca.setText("");
		textIdade.setText("");
		textResponsavel.setText("");

		rdbtnMacho.setSelected(false);
		rdbtnFemea.setSelected(false);

		comboBoxArea.setSelectedIndex(0);
		spinnerSimples.setValue(0);
		spinnerComplexos.setValue(0);
		spinnerRetornos.setValue(0);

		textCirurgia.setText("");
		spinnerCirurgiaSimples.getValue();
		spinnerCirurgiaComplexos.getValue();

		textAnestesia.setText("");
		spinnerAnestesiaSimples.getValue();
		spinnerAnestesiaComplexos.getValue();

		textUSG.setText("");
		spinnerUSGSimples.getValue();
		spinnerUSGComplexos.getValue();

		textEndoscopia.setText("");
		spinnerEdoscopiaSimples.getValue();
		spinnerEdoscopiaComplexos.getValue();

		textAtendimentoEXT.setText("");

		rdbtnAcimaDekm.setSelected(false);

		rdbtnAtkm.setSelected(false);

		radioButton_1.setSelected(false);

		radioButton.setSelected(false);

		comboBoxCategoria.setSelectedIndex(0);

		

	}

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
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Cadastro de Registro Geral dos animais atendidos no Hosputal Veterinário-CCA-UFPB-Areia");
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		frame.setResizable(false);

		mnLista = new JMenu("Lista de Animais");
		menuBar.add(mnLista);

		mntmGeral = new JMenuItem("Geral");
		mntmGeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GeralViews().setVisible(true);
			}
		});
		mnLista.add(mntmGeral);

		mntmPequenos = new JMenuItem("Pequenos");
		mntmPequenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PequenosViews().setVisible(true);
			}
		});
		mnLista.add(mntmPequenos);

		mntmGrandes = new JMenuItem("Grandes");
		mntmGrandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GrandesViews().setVisible(true);
			}
		});
		mnLista.add(mntmGrandes);

		mntmSilvestes = new JMenuItem("Silvestres");
		mntmSilvestes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SilvestresViews().setVisible(true);
			}
		});
		mnLista.add(mntmSilvestes);

		mnCirurgias = new JMenu("Cirurgias");
		menuBar.add(mnCirurgias);

		mntmPequenos_1 = new JMenuItem("Pequenos");
		mntmPequenos_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CPequenosViews().setVisible(true);
			}
		});
		mnCirurgias.add(mntmPequenos_1);

		mntmGrandes_1 = new JMenuItem("Grandes");
		mntmGrandes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CGrandesViews().setVisible(true);
			}
		});
		mnCirurgias.add(mntmGrandes_1);

		mntmSilvestes_1 = new JMenuItem("Silvesrtes");
		mntmSilvestes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CSilvestresViews().setVisible(true);
			}
		});

		mnCirurgias.add(mntmSilvestes_1);

		mnAnestesias = new JMenu("Anestesias");
		menuBar.add(mnAnestesias);

		mntmPequenos_2 = new JMenuItem("Pequenos ");
		mntmPequenos_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new APequenosViews().setVisible(true);
			}
		});
		mnAnestesias.add(mntmPequenos_2);

		mntmGrandes_2 = new JMenuItem("Grandes");
		mntmGrandes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AGrandesViews().setVisible(true);
			}
		});
		mnAnestesias.add(mntmGrandes_2);

		mntmSilvestres = new JMenuItem("Silvestres");
		mntmSilvestres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ASilvestresViews().setVisible(true);
			}
		});
		mnAnestesias.add(mntmSilvestres);

		mnUltrassonografia = new JMenu("Ultrassonografia");

		menuBar.add(mnUltrassonografia);

		mntmPequenos_3 = new JMenuItem("Pequenos");
		mntmPequenos_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new USGPequenosViews().setVisible(true);
			}
		});
		mnUltrassonografia.add(mntmPequenos_3);

		mntmGrandes_3 = new JMenuItem("Grandes");
		mntmGrandes_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new USGGrandesViews().setVisible(true);
			}
		});
		mnUltrassonografia.add(mntmGrandes_3);

		mntmSilvestres_1 = new JMenuItem("Silvestres");
		mntmSilvestres_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new USGSilvestresViews().setVisible(true);
			}
		});
		mnUltrassonografia.add(mntmSilvestres_1);

		mnEndoscopia = new JMenu("Endoscopia");
		menuBar.add(mnEndoscopia);

		mntmPequenos_4 = new JMenuItem("Pequenos");
		mntmPequenos_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EPequenosViews().setVisible(true);
			}
		});
		mnEndoscopia.add(mntmPequenos_4);

		mntmGrandes_4 = new JMenuItem("Grandes");
		mntmGrandes_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EGrandesViews().setVisible(true);
			}
		});

		mnEndoscopia.add(mntmGrandes_4);

		mntmSilvestres_2 = new JMenuItem("Silvestres");
		mntmSilvestres_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ESilvestresViews().setVisible(true);
			}
		});
		mnEndoscopia.add(mntmSilvestres_2);

		mnAtendimentoExternos = new JMenu("Atendimento Externos");
		menuBar.add(mnAtendimentoExternos);

		mntmListaDeAtendimento = new JMenuItem("Lista de Atendimento");
		mntmListaDeAtendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AtendimentosEXT().setVisible(true);
			}
		});
		mnAtendimentoExternos.add(mntmListaDeAtendimento);

		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 763, 220);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder("<html><b>Cadastro Geral</html></b>"));

		JLabel lblNewLabel = new JLabel("<html><b>RG:</b></html>");
		lblNewLabel.setBounds(14, 88, 50, 14);
		panel.add(lblNewLabel);

		textRg = new JTextField();
		textRg.setBounds(14, 102, 50, 20);
		panel.add(textRg);
		textRg.setColumns(10);

		JLabel lblNomeDoAnimal = new JLabel("<html><b>Nome do animal:</b></html>");
		lblNomeDoAnimal.setBounds(74, 88, 96, 14);
		panel.add(lblNomeDoAnimal);

		textNomeAnimal = new JTextField();
		textNomeAnimal.setBounds(74, 102, 96, 20);
		panel.add(textNomeAnimal);
		textNomeAnimal.setColumns(10);

		JLabel lblProprietario = new JLabel("<html><b>Proprietario:</b></html>");
		lblProprietario.setBounds(179, 88, 96, 14);
		panel.add(lblProprietario);

		textProprietario = new JTextField();
		textProprietario.setBounds(179, 102, 96, 20);
		panel.add(textProprietario);
		textProprietario.setColumns(10);

		JLabel lblEspcie = new JLabel("<html><b>Espécie:</b></html>");
		lblEspcie.setBounds(284, 88, 48, 14);
		panel.add(lblEspcie);

		textEspecie = new JTextField();
		textEspecie.setBounds(284, 102, 96, 20);
		panel.add(textEspecie);
		textEspecie.setColumns(10);

		textRaca = new JTextField();
		textRaca.setBounds(390, 102, 96, 20);
		panel.add(textRaca);
		textRaca.setColumns(10);

		lblRaca = new JLabel("<html><b>Raça:</b></html>");
		lblRaca.setBounds(390, 88, 48, 14);
		panel.add(lblRaca);

		textIdade = new JTextField();
		textIdade.setBounds(496, 102, 96, 20);
		panel.add(textIdade);
		textIdade.setColumns(10);

		lblIdde = new JLabel("<html><b>Idade:</b></html>");
		lblIdde.setBounds(496, 88, 48, 14);
		panel.add(lblIdde);

		textResponsavel = new JTextField();
		textResponsavel.setBounds(602, 102, 120, 20);
		panel.add(textResponsavel);
		textResponsavel.setColumns(10);

		label = new JLabel("<html><b>Responsavel:</b></html>");
		label.setBounds(602, 88, 74, 14);
		panel.add(label);

		lblSexo = new JLabel("<html><b>Sexo:</b></html>");
		lblSexo.setBounds(14, 145, 48, 14);
		panel.add(lblSexo);

		JRadioButton rdbtnMacho = new JRadioButton("Macho");
		rdbtnMacho.setBounds(10, 166, 66, 14);
		panel.add(rdbtnMacho);

		this.rdbtnMacho = rdbtnMacho;

		JRadioButton rdbtnFemea = new JRadioButton("Fêmea");
		rdbtnFemea.setBounds(10, 183, 66, 14);
		panel.add(rdbtnFemea);

		this.rdbtnFemea = rdbtnFemea;

		lblCasosNovosSimples = new JLabel("<html><b>Casos novos simples:</b></html>");
		lblCasosNovosSimples.setBounds(241, 145, 127, 14);
		panel.add(lblCasosNovosSimples);

		lblCasosNovosComplexos = new JLabel("<html><b>Casos novos complexos:</b></html>");
		lblCasosNovosComplexos.setBounds(399, 145, 145, 14);
		panel.add(lblCasosNovosComplexos);

		lblRetornoSimpres = new JLabel("<html><b>Retornos (Simples e complexos):</b></html>");
		lblRetornoSimpres.setBounds(561, 145, 192, 14);
		panel.add(lblRetornoSimpres);

		JSpinner spinnerSimples = new JSpinner();
		spinnerSimples.setBounds(251, 163, 45, 20);
		panel.add(spinnerSimples);

		this.spinnerSimples = spinnerSimples;

		JSpinner spinnerComplexos = new JSpinner();
		spinnerComplexos.setBounds(409, 163, 45, 20);
		panel.add(spinnerComplexos);

		this.spinnerComplexos = spinnerComplexos;

		JSpinner spinnerRetornos = new JSpinner();
		spinnerRetornos.setBounds(571, 163, 48, 20);
		panel.add(spinnerRetornos);

		this.spinnerRetornos = spinnerRetornos;

		JLabel lblreaDeAtendimento = new JLabel("<html><b>Área de Atendimento:</b></html>");
		lblreaDeAtendimento.setBounds(74, 145, 146, 14);
		panel.add(lblreaDeAtendimento);

		JComboBox<String> comboBoxArea = new JComboBox<String>();
		comboBoxArea.setBounds(76, 162, 142, 22);
		panel.add(comboBoxArea);
		comboBoxArea.addItem("Clinica Médica");
		comboBoxArea.addItem("Clinica Cirúrgica");
		comboBoxArea.addItem("Oftalmologia");
		comboBoxArea.addItem("Dermatologia");
		comboBoxArea.addItem("Acupuntura");
		comboBoxArea.addItem("Neurologia");
		comboBoxArea.addItem("Odontologia");
		comboBoxArea.addItem("Clinica M./ Odontologia");
		comboBoxArea.addItem("Clinica M./ Neurologia");
		comboBoxArea.addItem("Clinica M./ Oftalmologia");
		comboBoxArea.addItem("Clinica M./ Dermatologia");
		comboBoxArea.addItem("Dermatologia/ Neurologia");
		comboBoxArea.addItem("Oftalmologia/ Dermatologia");
		comboBoxArea.addItem("Atendimento Externo");

		this.comboBoxArea = comboBoxArea;

		JLabel lblTipoDeEspcie = new JLabel("<html><b>Categoria do Animal:</html></b>");
		lblTipoDeEspcie.setBounds(14, 25, 135, 14);
		panel.add(lblTipoDeEspcie);

		JComboBox<String> comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.setBounds(14, 43, 166, 22);
		panel.add(comboBoxCategoria);
		comboBoxCategoria.addItem("Pequenos");
		comboBoxCategoria.addItem("Grandes");
		comboBoxCategoria.addItem("Silvestres");
		comboBoxCategoria.addItem("Atendimentos Externos");
		this.comboBoxCategoria = comboBoxCategoria;

		JPanel panelCirurgia = new JPanel();
		panelCirurgia.setBounds(14, 242, 240, 150);
		frame.getContentPane().add(panelCirurgia);
		panelCirurgia.setBorder(BorderFactory.createTitledBorder("Cirgurgia"));
		panelCirurgia.setLayout(null);

		JLabel lblProcedimentoCirurgico = new JLabel("<html><b>Procedimento Cirúrgico:</html></b>");
		lblProcedimentoCirurgico.setBounds(10, 28, 156, 14);
		panelCirurgia.add(lblProcedimentoCirurgico);

		JTextField textCirurgia = new JTextField();
		textCirurgia.setBounds(10, 45, 200, 20);
		panelCirurgia.add(textCirurgia);
		textCirurgia.setColumns(10);
		this.textCirurgia = textCirurgia;

		lblPrecedimentos = new JLabel("<html><b>Procedimentos:</html></b>");
		lblPrecedimentos.setBounds(10, 76, 137, 14);
		panelCirurgia.add(lblPrecedimentos);

		lblSimples = new JLabel("Simples:");
		lblSimples.setBounds(10, 92, 57, 14);
		panelCirurgia.add(lblSimples);

		lblComplexos = new JLabel("Complexos:");
		lblComplexos.setBounds(112, 92, 81, 14);
		panelCirurgia.add(lblComplexos);

		JSpinner spinnerCirurgiaSimples = new JSpinner();
		spinnerCirurgiaSimples.setBounds(10, 110, 35, 20);
		panelCirurgia.add(spinnerCirurgiaSimples);
		this.spinnerCirurgiaSimples = spinnerCirurgiaSimples;

		JSpinner spinnerCirurgiaComplexos = new JSpinner();
		spinnerCirurgiaComplexos.setBounds(112, 110, 35, 20);
		panelCirurgia.add(spinnerCirurgiaComplexos);
		this.spinnerCirurgiaComplexos = spinnerCirurgiaComplexos;

		JPanel panelAnestesia = new JPanel();
		panelAnestesia.setBounds(275, 242, 240, 150);
		frame.getContentPane().add(panelAnestesia);
		panelAnestesia.setBorder(BorderFactory.createTitledBorder("Anestesia"));
		panelAnestesia.setLayout(null);

		lblTcnicasAnestsicas = new JLabel("<html><b>Técnicas Anestésicas:</html></b>");
		lblTcnicasAnestsicas.setBounds(12, 28, 138, 14);
		panelAnestesia.add(lblTcnicasAnestsicas);

		textAnestesia = new JTextField();
		textAnestesia.setBounds(12, 45, 200, 20);
		panelAnestesia.add(textAnestesia);
		textAnestesia.setColumns(10);

		lblPrecedimentos_1 = new JLabel("<html><b>Procedimentos:</html></b>");
		lblPrecedimentos_1.setBounds(12, 76, 91, 14);
		panelAnestesia.add(lblPrecedimentos_1);

		lblSimples_1 = new JLabel("Simples:");
		lblSimples_1.setBounds(12, 92, 58, 14);
		panelAnestesia.add(lblSimples_1);

		lblComplexo = new JLabel("Complexos:");
		lblComplexo.setBounds(102, 92, 74, 14);
		panelAnestesia.add(lblComplexo);

		spinnerAnestesiaSimples = new JSpinner();
		spinnerAnestesiaSimples.setBounds(12, 110, 35, 20);
		panelAnestesia.add(spinnerAnestesiaSimples);

		spinnerAnestesiaComplexos = new JSpinner();
		spinnerAnestesiaComplexos.setBounds(102, 110, 35, 20);
		panelAnestesia.add(spinnerAnestesiaComplexos);

		panelUltrasonografia = new JPanel();
		panelUltrasonografia.setBounds(530, 242, 243, 150);
		frame.getContentPane().add(panelUltrasonografia);
		panelUltrasonografia.setBorder(BorderFactory.createTitledBorder("Utrasonografia"));
		panelUltrasonografia.setLayout(null);

		lblExames = new JLabel("<html><b>Exames:</html></b>");
		lblExames.setBounds(10, 25, 62, 14);
		panelUltrasonografia.add(lblExames);

		textUSG = new JTextField();
		textUSG.setBounds(10, 41, 200, 20);
		panelUltrasonografia.add(textUSG);
		textUSG.setColumns(10);

		lblEtudos = new JLabel("<html><b>Estudos:</html></b>");
		lblEtudos.setBounds(10, 72, 48, 14);
		panelUltrasonografia.add(lblEtudos);

		label_1 = new JLabel("Simples:");
		label_1.setBounds(10, 92, 62, 14);
		panelUltrasonografia.add(label_1);

		lblComplexos_1 = new JLabel("Complexos:");
		lblComplexos_1.setBounds(100, 92, 74, 14);
		panelUltrasonografia.add(lblComplexos_1);

		spinnerUSGSimples = new JSpinner();
		spinnerUSGSimples.setBounds(10, 110, 35, 20);
		panelUltrasonografia.add(spinnerUSGSimples);

		spinnerUSGComplexos = new JSpinner();
		spinnerUSGComplexos.setBounds(100, 110, 35, 20);
		panelUltrasonografia.add(spinnerUSGComplexos);

		panelEndoscopia = new JPanel();
		panelEndoscopia.setBounds(14, 400, 240, 132);
		frame.getContentPane().add(panelEndoscopia);
		panelEndoscopia.setLayout(null);
		panelEndoscopia.setBorder(BorderFactory.createTitledBorder("Endoscopia"));
		panelEndoscopia.setLayout(null);

		label_3 = new JLabel("<html><b>Exames:</html></b>");
		label_3.setBounds(10, 20, 48, 14);
		panelEndoscopia.add(label_3);

		textEndoscopia = new JTextField();
		textEndoscopia.setColumns(10);
		textEndoscopia.setBounds(10, 38, 200, 20);
		panelEndoscopia.add(textEndoscopia);

		label_4 = new JLabel("<html><b>Estudos:</html></b>");
		label_4.setBounds(10, 70, 48, 14);
		panelEndoscopia.add(label_4);

		label_5 = new JLabel("Simples:");
		label_5.setBounds(10, 86, 59, 14);
		panelEndoscopia.add(label_5);

		label_6 = new JLabel("Complexo:");
		label_6.setBounds(100, 86, 74, 14);
		panelEndoscopia.add(label_6);

		spinnerEdoscopiaSimples = new JSpinner();
		spinnerEdoscopiaSimples.setBounds(10, 103, 35, 20);
		panelEndoscopia.add(spinnerEdoscopiaSimples);

		spinnerEdoscopiaComplexos = new JSpinner();
		spinnerEdoscopiaComplexos.setBounds(100, 103, 35, 20);
		panelEndoscopia.add(spinnerEdoscopiaComplexos);

		panelAE = new JPanel();
		panelAE.setBounds(275, 403, 345, 129);
		frame.getContentPane().add(panelAE);
		panelAE.setBorder(BorderFactory.createTitledBorder("Atendimentos Externos"));
		panelAE.setLayout(null);

		JLabel lblPropriedade = new JLabel("<html><b>Propriedade:</html></b>");
		lblPropriedade.setBounds(15, 21, 96, 14);
		panelAE.add(lblPropriedade);

		textAtendimentoEXT = new JTextField();
		textAtendimentoEXT.setBounds(15, 40, 260, 20);
		panelAE.add(textAtendimentoEXT);
		textAtendimentoEXT.setColumns(10);

		JRadioButton rdbtnAcimaDekm = new JRadioButton("Acima de 100km");
		rdbtnAcimaDekm.setBounds(15, 105, 109, 14);
		panelAE.add(rdbtnAcimaDekm);
		this.rdbtnAcimaDekm = rdbtnAcimaDekm;

		JRadioButton rdbtnAtkm = new JRadioButton("At\u00E9 100km");
		rdbtnAtkm.setBounds(15, 88, 109, 13);
		panelAE.add(rdbtnAtkm);
		this.rdbtnAtkm = rdbtnAtkm;

		JLabel lblIndividual = new JLabel("<html><b>Individual:</html></b>");
		lblIndividual.setBounds(15, 70, 67, 14);
		panelAE.add(lblIndividual);

		JRadioButton radioButton = new JRadioButton("Acima de 100km");
		radioButton.setBounds(177, 105, 109, 14);
		radioButton.setSelected(false);
		panelAE.add(radioButton);
		this.radioButton = radioButton;

		JRadioButton radioButton_1 = new JRadioButton("At\u00E9 100km");
		radioButton_1.setBounds(177, 88, 109, 13);
		panelAE.add(radioButton_1);
		this.radioButton_1 = radioButton_1;

		JLabel lblRebanho = new JLabel("<html><b>Rebanho:</html></b>");
		lblRebanho.setBounds(177, 70, 67, 14);
		panelAE.add(lblRebanho);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CadastroGeral cadastro = new CadastroGeral();

				cadastro.setRg(textRg.getText());
				cadastro.setNome(textNomeAnimal.getText());
				cadastro.setProprietario(textProprietario.getText());
				cadastro.setEspecie(textEspecie.getText());
				cadastro.setRaca(textRaca.getText());
				cadastro.setIdade(textIdade.getText());
				cadastro.setResponsavel(textResponsavel.getText());

				if (rdbtnMacho.isSelected()) {
					cadastro.setSexo(rdbtnMacho.getActionCommand());
				} else {
					cadastro.setSexo(rdbtnFemea.getActionCommand());
				}

				cadastro.setAreaAtendimento(comboBoxArea.getItemAt(comboBoxArea.getSelectedIndex()));
				cadastro.setCasosNovosSimples((int) spinnerSimples.getValue());
				cadastro.setCasosNovosComplexos((int) spinnerComplexos.getValue());
				cadastro.setRetornosSC((int) spinnerRetornos.getValue());

				cadastro.setProcedimentosCirurgicos(textCirurgia.getText());
				cadastro.setProcedimentosCSimples((int) spinnerCirurgiaSimples.getValue());
				cadastro.setProcedimentosCComplexos((int) spinnerCirurgiaComplexos.getValue());

				cadastro.setTecnicasAnestesicas(textAnestesia.getText());
				cadastro.setProcedimentosASimples((int) spinnerAnestesiaSimples.getValue());
				cadastro.setProcedimentosAComplexos((int) spinnerAnestesiaComplexos.getValue());

				cadastro.setExamesUSG(textUSG.getText());
				cadastro.setEstudosUSGSimples((int) spinnerUSGSimples.getValue());
				cadastro.setEstudosUSGComplexos((int) spinnerUSGComplexos.getValue());

				cadastro.setExamesEndoscopia(textEndoscopia.getText());
				cadastro.setEstudosESimples((int) spinnerEdoscopiaSimples.getValue());
				cadastro.setEstudosEComplexos((int) spinnerEdoscopiaComplexos.getValue());

				cadastro.setPropriedade(textAtendimentoEXT.getText());

				if (rdbtnAcimaDekm.isSelected()) {
					cadastro.setIndividual100km(rdbtnAcimaDekm.getActionCommand());

				} else if (rdbtnAtkm.isSelected()) {
					cadastro.setIndividualAcima100km(rdbtnAtkm.getActionCommand());

				} else if (radioButton_1.isSelected()) {
					cadastro.setRebanho100km(radioButton_1.getActionCommand());

				} else if(radioButton.isSelected()) {
					cadastro.setRebanhoAcima100km(radioButton.getActionCommand());
				}

				cadastro.setCategoria(comboBoxCategoria.getItemAt(comboBoxCategoria.getSelectedIndex()));

				BancoDados geral = new BancoDados();

				geral.insere(cadastro);
				
				JOptionPane.showMessageDialog(null, "Salvo com sucesso!", null, 1);

				limparCampos();

			}
		});
		btnSalvar.setBounds(663, 450, 89, 23);
		frame.getContentPane().add(btnSalvar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnCancelar.setBounds(663, 484, 89, 23);
		frame.getContentPane().add(btnCancelar);

	}
}
