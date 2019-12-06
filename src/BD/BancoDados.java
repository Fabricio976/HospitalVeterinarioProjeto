package BD;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Animal.CadastroGeral;
import InterfaceGraphic.AtendimentoTableModel;

public class BancoDados {

	private Connection con = null;

	public BancoDados() {

		con = Conexao.getConnection();

	}

	public boolean insere(CadastroGeral c) {

		String sqlGeral = "INSERT INTO public.tudo (	" +
				"	rg,"+ 
				"	data,"+ 
				"	nome,"+ 
				"	especie,"+ 
				"	proprietario," + 
				"	sexo,"  + 
				"	raca,"  + 
				"	idade,"+ 
				"	responsavel,"+ 
				"	area_atendimento," + 
				"	casos_simples," + 
				"	casos_complexos," + 
				"	retornos," + 
				"	exames_usg," + 
				"	exames_usgS," + 
				"	exames_usgC," + 
				"	exames_endo,"+ 
				"	estudos_endoS ," + 
				"	estudos_endoC ," + 
				"	tecnicas_anestesicas ," + 
				"	tecnicas_simplesA ," + 
				"	tecnicas_complexaA ," + 
				"	procedimento_cirurgico ," + 
				"	procedimento_cirurgicoS ," + 
				"	procedimento_cirurgicoC ," + 
				"	propriedade,"+ 
				"	individual_100km,"+ 
				"	individual_acima100km,"+ 
				"	rebanho_100km,"+ 
				"	rebanhoacima_100km,"+ 
				"	categoria ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = null;

		try {

			stmt = con.prepareStatement(sqlGeral);
			stmt.setString(1, c.getRg());
			stmt.setDate(2, new java.sql.Date((new java.util.Date()).getTime()));
			stmt.setString(3, c.getNome());
			stmt.setString(4, c.getEspecie());
			stmt.setString(5, c.getProprietario());
			stmt.setString(6, c.getSexo());
			stmt.setString(7, c.getRaca());
			stmt.setString(8, c.getIdade());
			stmt.setString(9, c.getResponsavel());

			stmt.setString(10, c.getAreaAtendimento());
			stmt.setInt(11, c.getCasosNovosSimples());
			stmt.setInt(12, c.getCasosNovosComplexos());
			stmt.setInt(13, c.getRetornosSC());

			stmt.setString(14, c.getExamesUSG());
			stmt.setInt(15, c.getEstudosUSGSimples());
			stmt.setInt(16, c.getEstudosUSGComplexos());

			stmt.setString(17, c.getExamesEndoscopia());
			stmt.setInt(18, c.getEstudosESimples());
			stmt.setInt(19, c.getEstudosEComplexos());

			stmt.setString(20, c.getTecnicasAnestesicas());
			stmt.setInt(21, c.getProcedimentosASimples());
			stmt.setInt(22, c.getProcedimentosAComplexos());

			stmt.setString(23, c.getProcedimentosCirurgicos());
			stmt.setInt(24, c.getProcedimentosCSimples());
			stmt.setInt(25, c.getProcedimentosCComplexos());

			stmt.setString(26, c.getPropriedade());
			stmt.setString(27, c.getIndividual100km());
			stmt.setString(28, c.getIndividualAcima100km());
			stmt.setString(29, c.getRebanho100km());
			stmt.setString(30, c.getRebanhoAcima100km());

			stmt.setString(31, c.getCategoria());

			stmt.executeUpdate();

			return true;

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

			return false;

		} finally {
			Conexao.closeConnection(con, stmt);
		}

	}
	
	
	public boolean delete(CadastroGeral d) {
		
		AtendimentoTableModel modelTable = new AtendimentoTableModel();
		
	String sqlDELETE = "DELETE FROM tudo WHERE ID =?";
		
		PreparedStatement stmt = null;

		try {

			stmt = con.prepareStatement(sqlDELETE);
			stmt.setInt(1, d.getId());
			
			stmt.executeUpdate();

			return true;

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

			return false;

		} finally {
			Conexao.closeConnection(con, stmt);
		}
		
	}

	public List<CadastroGeral> listAll() {

		String sql = "SELECT * FROM tudo where categoria <> 'Atendimentos Externos'";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> animals = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral animal = new CadastroGeral();

				animal.setData(rs.getDate("DATA"));
				animal.setRg(rs.getString("RG"));
				animal.setNome(rs.getString("NOME"));
				animal.setProprietario(rs.getString("PROPRIETARIO"));
				animal.setEspecie(rs.getString("ESPECIE"));
				animal.setSexo(rs.getString("SEXO"));
				animal.setRaca(rs.getString("RACA"));
				animal.setIdade(rs.getString("IDADE"));

				animals.add(animal);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return animals;
	}

	public List<CadastroGeral> listaAnimaisPequenos() {

		String sql = "SELECT * FROM tudo where categoria = 'Pequenos'";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("area_atendimento"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("casos_simples"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("casos_complexos"));
				cadastroGeral.setRetornosSC(rs.getInt("retornos"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaAnimaisGrandes() {

		String sql = "SELECT * FROM tudo where categoria = 'Grandes'";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("area_atendimento"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("casos_simples"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("casos_complexos"));
				cadastroGeral.setRetornosSC(rs.getInt("retornos"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaAnimaisSilvestres() {

		String sql = "SELECT * FROM tudo where categoria = 'Silvestres'";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("area_atendimento"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("casos_simples"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("casos_complexos"));
				cadastroGeral.setRetornosSC(rs.getInt("retornos"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaCirurgiasP() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setEspecie(rs.getString("sexo"));
				cadastroGeral.setAreaAtendimento(rs.getString("procedimento_cirurgico"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("procedimento_simplesC"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("procendimento_complexoC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaCirurgiasG() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setEspecie(rs.getString("sexo"));
				cadastroGeral.setAreaAtendimento(rs.getString("procedimento_cirurgico"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("procedimento_simplesC"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("procendimento_complexoC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaCirurgiasS() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setEspecie(rs.getString("sexo"));
				cadastroGeral.setAreaAtendimento(rs.getString("procedimento_cirurgico"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("procedimento_simplesC"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("procendimento_complexoC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}

	public List<CadastroGeral> listaAnestesiaP() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("tecnicas_anestesicas"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("tecnicas_simplesA"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("tecnicas_complexoA"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaEndoG() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_endo"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("estudos_endoS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("estudos_endoC"));
				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaEndoS() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setEspecie(rs.getString("sexo"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_endo"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("estudos_endoS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("estudos_endoC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaUSGP() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_usg"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("exames_usgS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("exames_usgC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaUSGG() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_usg"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("exames_usgS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("exames_usgC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaUSGS() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_usg"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("exames_usgS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("exames_usgC"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaAnestesiaG() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("tecnicas_anestesicas"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("tecnicas_simplesA"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("tecnicas_complexoA"));
				
				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaAnestesiaS() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("tecnicas_anestesicas"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("tecnicas_simplesA"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("tecnicas_complexoA"));

				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	public List<CadastroGeral> listaEndoP() {

		String sql = "SELECT * FROM tudo ";

		PreparedStatement stmt = null;
		ResultSet rs = null;

		List<CadastroGeral> cadastroGerais = new ArrayList<CadastroGeral>();

		try {

			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {

				CadastroGeral cadastroGeral = new CadastroGeral();

				cadastroGeral.setData(rs.getDate("data"));
				cadastroGeral.setRg(rs.getString("rg"));
				cadastroGeral.setNome(rs.getString("nome"));
				cadastroGeral.setEspecie(rs.getString("especie"));
				cadastroGeral.setAreaAtendimento(rs.getString("exames_endo"));
				cadastroGeral.setCasosNovosSimples(rs.getInt("estudos_endoS"));
				cadastroGeral.setCasosNovosComplexos(rs.getInt("estudos_endoC"));
				
				cadastroGerais.add(cadastroGeral);

			}

		} catch (SQLException ex) {

			Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);

		} finally {
			Conexao.closeConnection(con, stmt, rs);
		}
		return cadastroGerais;
	}
	
}
